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
import java.util.Iterator;
import java.util.function.ToIntFunction;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedLinearLayout;

public abstract class AnimatedLinearLayout extends LinearLayout {
    private static final Comparator comparator = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new ToIntFunction() {
        @Override
        public final int applyAsInt(Object obj) {
            return AnimatedLinearLayout.Holder.access$100((AnimatedLinearLayout.Holder) obj);
        }
    }), new ToIntFunction() {
        @Override
        public final int applyAsInt(Object obj) {
            return AnimatedLinearLayout.Holder.access$400((AnimatedLinearLayout.Holder) obj);
        }
    });
    private final ListAnimator.Callback callback;
    private float lastAnimatedHeight;
    private final ListAnimator listAnimator;
    private Runnable onAnimatedHeightChanged;
    private boolean skipNextAnimation;
    private int totalHeight;
    private int totalWidth;
    private final HashMap viewHolders;
    private final ArrayList visibleHolders;

    protected void onItemsChanged() {
    }

    public void lambda$new$0(ListAnimator listAnimator) {
        checkViewsVisibility();
        onItemsChanged();
    }

    public AnimatedLinearLayout(Context context) {
        super(context);
        this.viewHolders = new HashMap();
        this.visibleHolders = new ArrayList();
        ListAnimator.Callback callback = new ListAnimator.Callback() {
            @Override
            public boolean hasChanges(ListAnimator listAnimator) {
                return ListAnimator.MetadataCallback.CC.$default$hasChanges(this, listAnimator);
            }

            @Override
            public boolean onApplyMetadataAnimation(ListAnimator listAnimator, float f) {
                return ListAnimator.MetadataCallback.CC.$default$onApplyMetadataAnimation(this, listAnimator, f);
            }

            @Override
            public void onFinishMetadataAnimation(ListAnimator listAnimator, boolean z) {
                ListAnimator.MetadataCallback.CC.$default$onFinishMetadataAnimation(this, listAnimator, z);
            }

            @Override
            public void onForceApplyChanges(ListAnimator listAnimator) {
                ListAnimator.MetadataCallback.CC.$default$onForceApplyChanges(this, listAnimator);
            }

            @Override
            public final void onItemsChanged(ListAnimator listAnimator) {
                this.f$0.lambda$new$0(listAnimator);
            }

            @Override
            public void onPrepareMetadataAnimation(ListAnimator listAnimator) {
                ListAnimator.MetadataCallback.CC.$default$onPrepareMetadataAnimation(this, listAnimator);
            }
        };
        this.callback = callback;
        this.listAnimator = new ListAnimator(callback, CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
    }

    public boolean isViewVisible(View view) {
        Holder holder = (Holder) this.viewHolders.get(view);
        return holder != null && holder.isVisible;
    }

    public void setPriority(View view, int i) {
        Holder holder = (Holder) this.viewHolders.get(view);
        if (holder != null) {
            holder.priority = i;
        }
    }

    public void setDebugName(View view, String str) {
        Holder holder = (Holder) this.viewHolders.get(view);
        if (holder != null) {
            holder.tag = str;
        }
    }

    public void setViewVisible(View view, boolean z) {
        setViewVisible(view, z, true);
    }

    public void setViewVisible(View view, boolean z, boolean z2) {
        Holder holder;
        if (view == null || (holder = (Holder) this.viewHolders.get(view)) == null || holder.isVisible == z) {
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

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        calculateTotalSizesAfterMeasure();
    }

    protected final void calculateTotalSizesAfterMeasure() {
        this.totalHeight = 0;
        this.totalWidth = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Holder holder = (Holder) this.viewHolders.get(childAt);
            if (childAt.getVisibility() == 0 && holder != null && holder.isVisible) {
                this.totalWidth += childAt.getMeasuredWidth();
                this.totalHeight += childAt.getMeasuredHeight();
            }
        }
    }

    public int getSumWidthOfAllVisibleChild() {
        return this.totalWidth;
    }

    public int getSumHeightOfAllVisibleChild() {
        return this.totalHeight;
    }

    public float getAnimatedHeightWithPadding(float f) {
        return getMetadata().getTotalHeight() + (f * getMetadata().getTotalVisibility());
    }

    public float getAnimatedHeightWithPadding() {
        return getAnimatedHeightWithPadding(getPaddingTop() + getPaddingBottom());
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.visibleHolders.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            Holder holder = (Holder) this.viewHolders.get(childAt);
            if (holder != null) {
                holder.order = i5;
                if (childAt.getVisibility() == 0 && holder.isVisible) {
                    this.visibleHolders.add(holder);
                }
            }
        }
        Collections.sort(this.visibleHolders, comparator);
        this.listAnimator.reset(this.visibleHolders, !this.skipNextAnimation);
        Iterator it = this.visibleHolders.iterator();
        while (it.hasNext()) {
            ((Holder) it.next()).hasInAnimator = true;
        }
        this.skipNextAnimation = false;
        checkViewsVisibility();
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

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.onAnimatedHeightChanged = runnable;
    }

    private void checkViewsVisibility() {
        Iterator it = this.listAnimator.iterator();
        while (it.hasNext()) {
            ListAnimator.Entry entry = (ListAnimator.Entry) it.next();
            View view = ((Holder) entry.item).view;
            RectF rectF = entry.getRectF();
            if (getOrientation() == 1) {
                view.setTranslationY((getPaddingTop() + rectF.top) - view.getTop());
            } else {
                view.setTranslationX((getPaddingLeft() + rectF.left) - view.getLeft());
            }
            setChildVisibilityFactor(view, entry.getVisibility());
        }
        float totalHeight = getMetadata().getTotalHeight();
        if (this.lastAnimatedHeight != totalHeight) {
            this.lastAnimatedHeight = totalHeight;
            Runnable runnable = this.onAnimatedHeightChanged;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    protected void setChildVisibilityFactor(View view, float f) {
        float fLerp = AndroidUtilities.lerp(0.95f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
    }

    public ListAnimator.Metadata getMetadata() {
        return this.listAnimator.getMetadata();
    }

    protected int getEntriesCount() {
        return this.listAnimator.size();
    }

    protected ListAnimator.Entry getEntry(int i) {
        return this.listAnimator.getEntry(i);
    }

    protected static class Holder implements ListAnimator.Measurable, Destroyable {
        private boolean hasInAnimator;
        private boolean isVisible;
        private int order;
        private int priority;
        private String tag;
        public final View view;

        @Override
        public int getSpacingEnd(boolean z) {
            return ListAnimator.Measurable.CC.$default$getSpacingEnd(this, z);
        }

        @Override
        public int getSpacingStart(boolean z) {
            return ListAnimator.Measurable.CC.$default$getSpacingStart(this, z);
        }

        public static int access$100(Holder holder) {
            return holder.priority;
        }

        public static int access$400(Holder holder) {
            return holder.order;
        }

        public Holder(View view) {
            this.view = view;
        }

        @Override
        public void performDestroy() {
            if (!this.isVisible) {
                this.view.setVisibility(8);
            }
            this.hasInAnimator = false;
        }

        public int hashCode() {
            return this.view.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof Holder) {
                return this.view.equals(((Holder) obj).view);
            }
            return false;
        }

        @Override
        public int getWidth() {
            return this.view.getMeasuredWidth();
        }

        @Override
        public int getHeight() {
            return this.view.getMeasuredHeight();
        }
    }
}
