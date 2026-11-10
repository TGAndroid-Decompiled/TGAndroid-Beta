package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class yc implements ValueAnimator.AnimatorUpdateListener {
    public final int f40551a;
    public final ChatActivityEnterView f40552b;

    public yc(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40551a = i7;
        this.f40552b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f40551a;
        ChatActivityEnterView chatActivityEnterView = this.f40552b;
        switch (i7) {
            case 0:
                he heVar = chatActivityEnterView.J1;
                if (heVar != null) {
                    heVar.setTranslationX(heVar.f34319a);
                    return;
                }
                return;
            case 1:
                he heVar2 = chatActivityEnterView.J1;
                if (heVar2 != null) {
                    heVar2.setTranslationX(heVar2.f34319a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f31103m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f31103m1.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.f31160w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lf lfVar = chatActivityEnterView.U0;
                if (lfVar != null) {
                    lfVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f31045c1) {
                    chatActivityEnterView.f31076h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f31076h1.invalidate();
                }
                chatActivityEnterView.w0();
                return;
            default:
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f31161w1.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f31161w1.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f31161w1.setAlpha(floatValue);
                return;
        }
    }
}
