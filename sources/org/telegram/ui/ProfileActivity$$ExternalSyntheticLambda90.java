package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ProfileActivity$$ExternalSyntheticLambda90 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ProfileActivity f$0;

    public ProfileActivity$$ExternalSyntheticLambda90(ProfileActivity profileActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$41(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$onCustomTransitionAnimation$99(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$dimBehindView$116(valueAnimator);
                break;
            default:
                this.f$0.lambda$setMediaHeaderVisible$89(valueAnimator);
                break;
        }
    }
}
