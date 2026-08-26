package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class VoipCoverEmoji$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final VoipCoverEmoji f$0;

    public VoipCoverEmoji$$ExternalSyntheticLambda1(VoipCoverEmoji voipCoverEmoji, int i) {
        this.$r8$classId = i;
        this.f$0 = voipCoverEmoji;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                VoipCoverEmoji voipCoverEmoji = this.f$0;
                voipCoverEmoji.getClass();
                voipCoverEmoji.scale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                voipCoverEmoji.parent.invalidate();
                if (voipCoverEmoji.scale > 1.0f && voipCoverEmoji.diffXAnimator == null) {
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(AndroidUtilities.dp(12), 0);
                    voipCoverEmoji.diffXAnimator = valueAnimatorOfInt;
                    valueAnimatorOfInt.addUpdateListener(new VoipCoverEmoji$$ExternalSyntheticLambda1(voipCoverEmoji, 2));
                    voipCoverEmoji.diffXAnimator.setDuration(((long) 350) - valueAnimator.getCurrentPlayTime());
                    voipCoverEmoji.diffXAnimator.start();
                    break;
                }
                break;
            case 1:
                VoipCoverEmoji voipCoverEmoji2 = this.f$0;
                voipCoverEmoji2.getClass();
                voipCoverEmoji2.alpha = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                voipCoverEmoji2.parent.invalidate();
                break;
            default:
                VoipCoverEmoji voipCoverEmoji3 = this.f$0;
                voipCoverEmoji3.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (voipCoverEmoji3.posX <= voipCoverEmoji3.width / 2) {
                    iIntValue = -iIntValue;
                }
                voipCoverEmoji3.diffX = iIntValue;
                voipCoverEmoji3.parent.invalidate();
                break;
        }
    }
}
