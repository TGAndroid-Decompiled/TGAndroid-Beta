package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import j$.util.Comparator$CC;
import j$.util.Comparator$EL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AndroidUtilities;

public class AnimatedLinearLayout extends LinearLayout {
    private static final Comparator<Holder> comparator = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new MarkdownParser$$ExternalSyntheticLambda0(1)), new MarkdownParser$$ExternalSyntheticLambda0(2));
    private final ListAnimator.Callback callback;
    private float lastAnimatedHeight;
    private final ListAnimator listAnimator;
    private Runnable onAnimatedHeightChanged;
    private boolean skipNextAnimation;
    private int totalHeight;
    private int totalWidth;
    private final HashMap<View, Holder> viewHolders;
    private final ArrayList<Holder> visibleHolders;

    public static class Holder implements ListAnimator.Measurable, Destroyable {
        private boolean hasInAnimator;
        private boolean isVisible;
        private int order;
        private int priority;
        private String tag;
        public final View view;

        public Holder(View view) {
            this.view = view;
        }

        public static int access$100(Holder holder) {
            return holder.priority;
        }

        public static int access$400(Holder holder) {
            return holder.order;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Holder) {
                return this.view.equals(((Holder) obj).view);
            }
            return false;
        }

        @Override
        public int getHeight() {
            return this.view.getMeasuredHeight();
        }

        @Override
        public int getSpacingEnd(boolean z) {
            return 0;
        }

        @Override
        public int getSpacingStart(boolean z) {
            return 0;
        }

        @Override
        public int getWidth() {
            return this.view.getMeasuredWidth();
        }

        public int hashCode() {
            return this.view.hashCode();
        }

        @Override
        public void performDestroy() {
            if (!this.isVisible) {
                this.view.setVisibility(8);
            }
            this.hasInAnimator = false;
        }
    }

    public AnimatedLinearLayout(Context context) {
        super(context);
        this.viewHolders = new HashMap<>();
        this.visibleHolders = new ArrayList<>();
        EmojiView$$ExternalSyntheticLambda21 emojiView$$ExternalSyntheticLambda21 = new EmojiView$$ExternalSyntheticLambda21(this, 23);
        this.callback = emojiView$$ExternalSyntheticLambda21;
        this.listAnimator = new ListAnimator(emojiView$$ExternalSyntheticLambda21, CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
    }

    private void checkViewsVisibility() {
        ArrayList arrayList = this.listAnimator.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            View view = ((Holder) entry.item).view;
            RectF rectF = entry.getRectF();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + rectF.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + rectF.left) - view.getLeft());
            }
            setChildVisibilityFactor(view, entry.getVisibility());
        }
        float f = getMetadata().totalHeight.now;
        if (this.lastAnimatedHeight != f) {
            this.lastAnimatedHeight = f;
            Runnable runnable = this.onAnimatedHeightChanged;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void lambda$new$0(ListAnimator listAnimator) {
        checkViewsVisibility();
        onItemsChanged();
    }

    public final void calculateTotalSizesAfterMeasure() {
        this.totalHeight = 0;
        this.totalWidth = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Holder holder = this.viewHolders.get(childAt);
            if (childAt.getVisibility() == 0 && holder != null && holder.isVisible) {
                this.totalWidth = childAt.getMeasuredWidth() + this.totalWidth;
                this.totalHeight = childAt.getMeasuredHeight() + this.totalHeight;
            }
        }
    }

    public float getAnimatedHeightWithPadding(float f) {
        return (f * getMetadata().totalVisibility.now) + getMetadata().totalHeight.now;
    }

    public int getEntriesCount() {
        return this.listAnimator.entries.size();
    }

    public ListAnimator.Entry getEntry(int i) {
        return (ListAnimator.Entry) this.listAnimator.entries.get(i);
    }

    public ListAnimator.Metadata getMetadata() {
        return this.listAnimator.metadata;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.totalHeight;
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.totalWidth;
    }

    public boolean isViewVisible(View view) {
        Holder holder = this.viewHolders.get(view);
        return holder != null && holder.isVisible;
    }

    public void onItemsChanged() {
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.visibleHolders.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            Holder holder = this.viewHolders.get(childAt);
            if (holder != null) {
                holder.order = i5;
                if (childAt.getVisibility() == 0 && holder.isVisible) {
                    this.visibleHolders.add(holder);
                }
            }
        }
        Collections.sort(this.visibleHolders, comparator);
        this.listAnimator.reset(this.visibleHolders, !this.skipNextAnimation);
        ArrayList<Holder> arrayList = this.visibleHolders;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Holder holder2 = arrayList.get(i6);
            i6++;
            holder2.hasInAnimator = true;
        }
        this.skipNextAnimation = false;
        checkViewsVisibility();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        calculateTotalSizesAfterMeasure();
    }

    @Override
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.viewHolders.put(view, new Holder(view));
    }

    @Override
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.viewHolders.remove(view);
    }

    public void setChildVisibilityFactor(View view, float f) {
        float fLerp = AndroidUtilities.lerp(0.95f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
    }

    public void setDebugName(View view, String str) {
        Holder holder = this.viewHolders.get(view);
        if (holder != null) {
            holder.tag = str;
        }
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.onAnimatedHeightChanged = runnable;
    }

    public void setPriority(View view, int i) {
        Holder holder = this.viewHolders.get(view);
        if (holder != null) {
            holder.priority = i;
        }
    }

    public void setViewVisible(View view, boolean z) {
        setViewVisible(view, z, true);
    }

    public void setViewVisible(View view, boolean z, boolean z2) {
        Holder holder;
        if (view == null || (holder = this.viewHolders.get(view)) == null || holder.isVisible == z) {
            return;
        }
        holder.isVisible = z;
        if (z) {
            holder.view.setVisibility(0);
        }
        if (!z && !holder.hasInAnimator) {
            holder.view.setVisibility(8);
        }
        if (!z2) {
            this.skipNextAnimation = true;
        }
        requestLayout();
    }

    public float getAnimatedHeightWithPadding() {
        return getAnimatedHeightWithPadding(getPaddingBottom() + getPaddingTop());
    }
}
