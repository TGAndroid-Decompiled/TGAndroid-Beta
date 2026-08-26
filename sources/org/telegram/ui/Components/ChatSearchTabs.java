package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ChatActivity;

public abstract class ChatSearchTabs extends FrameLayout {
    public ValueAnimator actionBarTagsAnimator;
    public float actionBarTagsT;
    public boolean shown;
    public float shownT;
    public ViewPagerFixed.TabsView tabs;

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.shownT);
    }

    @Override
    public final boolean isShown() {
        return this.shown;
    }

    public abstract void onShownUpdate(boolean z);

    public void setShown(float f) {
        this.shownT = f;
        ViewPagerFixed.TabsView tabsView = this.tabs;
        if (tabsView != null) {
            tabsView.setPivotX(tabsView.getWidth() / 2.0f);
            this.tabs.setPivotY(0.0f);
            this.tabs.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f));
            this.tabs.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f));
        }
        setAlpha(f);
        invalidate();
    }

    public void setTabs(ViewPagerFixed.TabsView tabsView) {
        this.tabs = tabsView;
        addView(tabsView, LayoutHelper.createFrame(-1.0f, -1));
    }

    public final void show(boolean z) {
        this.shown = z;
        ValueAnimator valueAnimator = this.actionBarTagsAnimator;
        if (valueAnimator != null) {
            this.actionBarTagsAnimator = null;
            valueAnimator.cancel();
        }
        if (z) {
            setVisibility(0);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.actionBarTagsT, z ? 1.0f : 0.0f);
        this.actionBarTagsAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 1));
        this.actionBarTagsAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.actionBarTagsAnimator.setDuration(320L);
        this.actionBarTagsAnimator.addListener(new ChatActivity.AnonymousClass77(17, this, z));
        this.actionBarTagsAnimator.start();
    }
}
