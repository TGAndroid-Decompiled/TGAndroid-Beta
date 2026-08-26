package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.ui.ActionBar.BottomSheetTabs;

public final class LaunchActivity$$ExternalSyntheticLambda19 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda19(LaunchActivity launchActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = launchActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.frameLayout.invalidate();
                break;
            default:
                LaunchActivity launchActivity = this.f$0;
                launchActivity.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                launchActivity.drawerLayoutContainer.setInternalNavigationBarColor(iIntValue);
                BottomSheetTabs bottomSheetTabs = launchActivity.getBottomSheetTabs();
                if (bottomSheetTabs != null) {
                    bottomSheetTabs.setNavigationBarColor(iIntValue);
                }
                break;
        }
    }
}
