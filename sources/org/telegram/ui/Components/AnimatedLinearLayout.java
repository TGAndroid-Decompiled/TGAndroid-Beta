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
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda1;

public abstract class AnimatedLinearLayout extends LinearLayout {
    public static final Comparator comparator = Comparator$EL.thenComparingInt(Comparator$CC.comparingInt(new TableModel$$ExternalSyntheticLambda1(6)), new TableModel$$ExternalSyntheticLambda1(7));
    public float lastAnimatedHeight;
    public final ListAnimator listAnimator;
    public Runnable onAnimatedHeightChanged;
    public boolean skipNextAnimation;
    public int totalHeight;
    public int totalWidth;
    public final HashMap viewHolders;
    public final ArrayList visibleHolders;

    public final class Holder implements ListAnimator.Measurable, Destroyable {
        public boolean hasInAnimator;
        public boolean isVisible;
        public int order;
        public int priority;
        public final View view;

        public Holder(View view) {
            this.view = view;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Holder)) {
                return false;
            }
            return this.view.equals(((Holder) obj).view);
        }

        @Override
        public final int getHeight() {
            return this.view.getMeasuredHeight();
        }

        @Override
        public final int getSpacingStart(boolean z) {
            return 0;
        }

        @Override
        public final int getWidth() {
            return this.view.getMeasuredWidth();
        }

        public final int hashCode() {
            return this.view.hashCode();
        }

        @Override
        public final void performDestroy() {
            if (!this.isVisible) {
                this.view.setVisibility(8);
            }
            this.hasInAnimator = false;
        }
    }

    public AnimatedLinearLayout(Context context) {
        super(context);
        this.viewHolders = new HashMap();
        this.visibleHolders = new ArrayList();
        this.listAnimator = new ListAnimator(new ColorPicker$$ExternalSyntheticLambda6(this, 5), CubicBezierInterpolator.EASE_OUT_QUINT, 420L);
    }

    public final void calculateTotalSizesAfterMeasure() {
        this.totalHeight = 0;
        this.totalWidth = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Holder holder = (Holder) this.viewHolders.get(childAt);
            if (childAt.getVisibility() == 0 && holder != null && holder.isVisible) {
                this.totalWidth = childAt.getMeasuredWidth() + this.totalWidth;
                this.totalHeight = childAt.getMeasuredHeight() + this.totalHeight;
            }
        }
    }

    public final void checkViewsVisibility() {
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

    public final float getAnimatedHeightWithPadding(float f) {
        return (f * getMetadata().totalVisibility.now) + getMetadata().totalHeight.now;
    }

    public int getEntriesCount() {
        return this.listAnimator.entries.size();
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

    public final boolean isViewVisible(View view) {
        Holder holder = (Holder) this.viewHolders.get(view);
        return holder != null && holder.isVisible;
    }

    public abstract void onItemsChanged();

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ArrayList arrayList = this.visibleHolders;
        arrayList.clear();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            Holder holder = (Holder) this.viewHolders.get(childAt);
            if (holder != null) {
                holder.order = i5;
                if (childAt.getVisibility() == 0 && holder.isVisible) {
                    arrayList.add(holder);
                }
            }
        }
        Collections.sort(arrayList, comparator);
        this.listAnimator.reset(arrayList, !this.skipNextAnimation);
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            ((Holder) obj).hasInAnimator = true;
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
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        view.setVisibility(8);
        this.viewHolders.put(view, new Holder(view));
    }

    @Override
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.viewHolders.remove(view);
    }

    public void setChildVisibilityFactor(View view, float f) {
        float fLerp = AndroidUtilities.lerp(0.95f, 1.0f, f);
        view.setAlpha(f);
        view.setScaleX(fLerp);
        view.setScaleY(fLerp);
    }

    public final void setDebugName(View view) {
    }

    public void setOnAnimatedHeightChangedListener(Runnable runnable) {
        this.onAnimatedHeightChanged = runnable;
    }

    public final void setPriority(int i, View view) {
        Holder holder = (Holder) this.viewHolders.get(view);
        if (holder != null) {
            holder.priority = i;
        }
    }

    public final void setViewVisible(View view, boolean z, boolean z2) {
        Holder holder;
        if (view == null || (holder = (Holder) this.viewHolders.get(view)) == null || holder.isVisible == z) {
            return;
        }
        holder.isVisible = z;
        View view2 = holder.view;
        if (z) {
            view2.setVisibility(0);
        }
        if (!z && !holder.hasInAnimator) {
            view2.setVisibility(8);
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
