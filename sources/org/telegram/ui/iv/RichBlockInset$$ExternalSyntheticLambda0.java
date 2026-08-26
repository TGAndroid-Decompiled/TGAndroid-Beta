package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import org.telegram.ui.Cells.ChatActionCell;

public final class RichBlockInset$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public RichBlockInset$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                RichBlockInset richBlockInset = (RichBlockInset) this.f$0;
                richBlockInset.getClass();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                richBlockInset.currentPx = iIntValue;
                ((RichBlockCell$$ExternalSyntheticLambda0) this.f$1).apply(iIntValue);
                break;
            default:
                ((ChatActionCell.TransitionParams) this.f$0).animateChangeProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((ChatActionCell) this.f$1).invalidate();
                break;
        }
    }
}
