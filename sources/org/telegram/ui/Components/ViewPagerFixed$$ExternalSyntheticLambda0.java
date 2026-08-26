package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.view.View;

public final class ViewPagerFixed$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ViewPagerFixed f$0;

    public ViewPagerFixed$$ExternalSyntheticLambda0(ViewPagerFixed viewPagerFixed, int i) {
        this.$r8$classId = i;
        this.f$0 = viewPagerFixed;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ViewPagerFixed viewPagerFixed = this.f$0;
                viewPagerFixed.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View[] viewArr = viewPagerFixed.viewPages;
                View view = viewArr[1];
                if (view != null) {
                    if (viewPagerFixed.animatingForward) {
                        viewPagerFixed.setTranslationX(view, (1.0f - fFloatValue) * viewArr[0].getMeasuredWidth());
                        View view2 = viewArr[0];
                        viewPagerFixed.setTranslationX(view2, (-view2.getMeasuredWidth()) * fFloatValue);
                    } else {
                        viewPagerFixed.setTranslationX(view, (1.0f - fFloatValue) * (-viewArr[0].getMeasuredWidth()));
                        View view3 = viewArr[0];
                        viewPagerFixed.setTranslationX(view3, view3.getMeasuredWidth() * fFloatValue);
                    }
                    viewPagerFixed.currentProgress = fFloatValue;
                    viewPagerFixed.onTabAnimationUpdate(true);
                    ViewPagerFixed.AnonymousClass3 anonymousClass3 = viewPagerFixed.tabsView;
                    if (anonymousClass3 != null) {
                        anonymousClass3.listView.invalidate();
                        viewPagerFixed.tabsView.listView.invalidateViews();
                        viewPagerFixed.tabsView.invalidate();
                    }
                    break;
                }
                break;
            case 1:
                ViewPagerFixed viewPagerFixed2 = this.f$0;
                viewPagerFixed2.getClass();
                viewPagerFixed2.backProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 2:
                ViewPagerFixed viewPagerFixed3 = this.f$0;
                viewPagerFixed3.updateTabProgress.onAnimationUpdate(valueAnimator);
                viewPagerFixed3.tabsView.indicatorProgress2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                viewPagerFixed3.tabsView.listView.invalidateViews();
                viewPagerFixed3.tabsView.invalidate();
                break;
            default:
                ViewPagerFixed viewPagerFixed4 = this.f$0;
                viewPagerFixed4.getClass();
                viewPagerFixed4.backProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
        }
    }
}
