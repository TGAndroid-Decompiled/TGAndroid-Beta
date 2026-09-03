package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gd implements ValueAnimator.AnimatorUpdateListener {
    public final int f27143a;
    public final ChatActivityEnterView f27144b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27143a = i10;
        this.f27144b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27143a;
        ChatActivityEnterView chatActivityEnterView = this.f27144b;
        switch (i10) {
            case 0:
                qe qeVar = chatActivityEnterView.F1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.f30391a);
                    return;
                }
                return;
            case 1:
                qe qeVar2 = chatActivityEnterView.F1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.f30391a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f24623i1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f24623i1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f24570j5;
                chatActivityEnterView.f24679t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    ufVar.a0();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.F1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f24570j5;
                chatActivityEnterView.J1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Z0) {
                    chatActivityEnterView.f24598e1.setAlpha(chatActivityEnterView.J1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f24598e1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f24570j5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f24675s1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24675s1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24675s1.setAlpha(floatValue);
                return;
        }
    }
}
