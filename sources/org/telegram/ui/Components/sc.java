package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class sc implements ValueAnimator.AnimatorUpdateListener {
    public final int f30217a;
    public final ChatActivityEnterView f30218b;

    public sc(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30217a = i10;
        this.f30218b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30217a;
        ChatActivityEnterView chatActivityEnterView = this.f30218b;
        switch (i10) {
            case 0:
                de deVar = chatActivityEnterView.J1;
                if (deVar != null) {
                    deVar.setTranslationX(deVar.f25395a);
                    return;
                }
                return;
            case 1:
                de deVar2 = chatActivityEnterView.J1;
                if (deVar2 != null) {
                    deVar2.setTranslationX(deVar2.f25395a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f23746m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f23746m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.f23804w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gf gfVar = chatActivityEnterView.U0;
                if (gfVar != null) {
                    gfVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23688c1) {
                    chatActivityEnterView.f23719h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23719h1.invalidate();
                }
                chatActivityEnterView.u0();
                return;
            default:
                int i13 = ChatActivityEnterView.f23672s5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f23805w1.setScaleX(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23805w1.setScaleY(org.telegram.messenger.i0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23805w1.setAlpha(floatValue);
                return;
        }
    }
}
