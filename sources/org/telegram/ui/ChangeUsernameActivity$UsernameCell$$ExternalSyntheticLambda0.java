package org.telegram.ui;

import android.animation.ValueAnimator;

public final class ChangeUsernameActivity$UsernameCell$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ChangeUsernameActivity.UsernameCell f$0;

    public ChangeUsernameActivity$UsernameCell$$ExternalSyntheticLambda0(ChangeUsernameActivity.UsernameCell usernameCell, int i) {
        this.$r8$classId = i;
        this.f$0 = usernameCell;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setLoading$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$animateValueTextColor$1(valueAnimator);
                break;
        }
    }
}
