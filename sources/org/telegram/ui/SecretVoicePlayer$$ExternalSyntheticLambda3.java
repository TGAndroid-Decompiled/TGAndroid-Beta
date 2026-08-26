package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;

public final class SecretVoicePlayer$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Dialog f$0;
    public final boolean f$1;

    public SecretVoicePlayer$$ExternalSyntheticLambda3(Dialog dialog, int i, boolean z) {
        this.$r8$classId = i;
        this.f$0 = dialog;
        this.f$1 = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                ((SecretVoicePlayer) this.f$0).lambda$animateOpenTo$9(this.f$1, valueAnimator);
                break;
            default:
                ((MessageSendPreview) this.f$0).lambda$animateOpenTo$11(this.f$1, valueAnimator);
                break;
        }
    }
}
