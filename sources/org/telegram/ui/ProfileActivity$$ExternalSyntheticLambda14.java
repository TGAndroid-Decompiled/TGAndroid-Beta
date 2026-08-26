package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;

public final class ProfileActivity$$ExternalSyntheticLambda14 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda14(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = this.f$0;
                profileActivity.getClass();
                profileActivity.setAvatarExpandProgress(valueAnimator.getAnimatedFraction());
                break;
            case 1:
                ProfileActivity profileActivity2 = this.f$0;
                profileActivity2.getClass();
                profileActivity2.scrimPaint.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                break;
            case 2:
                ProfileActivity profileActivity3 = this.f$0;
                View view = profileActivity3.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity3.updateStoriesViewBounds(true);
                break;
            default:
                this.f$0.updateStoriesViewBounds(true);
                break;
        }
    }
}
