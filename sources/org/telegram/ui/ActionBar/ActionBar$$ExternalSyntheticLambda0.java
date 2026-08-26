package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity$9$$ExternalSyntheticLambda1;

public final class ActionBar$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ActionBar f$0;

    public ActionBar$$ExternalSyntheticLambda0(ActionBar actionBar, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ActionBarMenu actionBarMenu;
        switch (this.$r8$classId) {
            case 0:
                ActionBar actionBar = this.f$0;
                actionBar.searchFieldVisibleAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (actionBar.glassDrawable != null && actionBar.glassModeIsForum) {
                    float fDp = AndroidUtilities.dp(23.0f);
                    float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), actionBar.searchFieldVisibleAlpha);
                    actionBar.glassDrawable.setRadius(fLerp, fDp, fDp, fLerp);
                    actionBar.invalidate();
                }
                if (actionBar.glassMode && (actionBarMenu = actionBar.menu) != null) {
                    actionBarMenu.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), actionBar.searchFieldVisibleAlpha));
                }
                ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda1 = actionBar.backgroundUpdateListener;
                if (profileActivity$9$$ExternalSyntheticLambda1 != null) {
                    profileActivity$9$$ExternalSyntheticLambda1.run();
                }
                break;
            case 1:
                ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda2 = this.f$0.backgroundUpdateListener;
                if (profileActivity$9$$ExternalSyntheticLambda2 != null) {
                    profileActivity$9$$ExternalSyntheticLambda2.run();
                }
                break;
            case 2:
                ActionBar actionBar2 = this.f$0;
                actionBar2.getClass();
                actionBar2.onTopAnimated = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                actionBar2.adaptive_updateColor();
                break;
            case 3:
                ActionBar actionBar3 = this.f$0;
                actionBar3.getClass();
                actionBar3.onTopAnimated = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                actionBar3.adaptive_updateColor();
                break;
            default:
                ProfileActivity$9$$ExternalSyntheticLambda1 profileActivity$9$$ExternalSyntheticLambda3 = this.f$0.backgroundUpdateListener;
                if (profileActivity$9$$ExternalSyntheticLambda3 != null) {
                    profileActivity$9$$ExternalSyntheticLambda3.run();
                }
                break;
        }
    }
}
