package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class gd implements ValueAnimator.AnimatorUpdateListener {
    public final int f34904a;
    public final ChatActivityEnterView f34905b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f34904a = i7;
        this.f34905b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f34904a;
        float f10 = 1.0f;
        ChatActivityEnterView chatActivityEnterView = this.f34905b;
        switch (i7) {
            case 0:
                je jeVar = chatActivityEnterView.f32275r2;
                if (jeVar != null) {
                    jeVar.setTranslationX(jeVar.f35968a);
                    return;
                }
                return;
            case 1:
                je jeVar2 = chatActivityEnterView.f32275r2;
                if (jeVar2 != null) {
                    jeVar2.setTranslationX(jeVar2.f35968a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.U1.invalidate();
                return;
            case 3:
                chatActivityEnterView.U1.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.f32316x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    sfVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.f32275r2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.N6;
                chatActivityEnterView.f32302v2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f32178d1) {
                    oi0 oi0Var = chatActivityEnterView.f32214i1;
                    if (!chatActivityEnterView.C1) {
                        f10 = chatActivityEnterView.f32302v2.getTransformToSeekbarProgressStep3();
                    }
                    oi0Var.setAlpha(f10);
                    chatActivityEnterView.f32214i1.invalidate();
                }
                chatActivityEnterView.K0();
                return;
            case 7:
                int i12 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                chatActivityEnterView.u(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                int i13 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                chatActivityEnterView.f32305v5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.p();
                return;
            case 9:
                int i14 = ChatActivityEnterView.N6;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.H1 = floatValue;
                jh.f r02 = chatActivityEnterView.r0();
                if (r02 != null) {
                    r02.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                ud udVar = chatActivityEnterView.f32193f1;
                if (udVar != null) {
                    udVar.invalidate();
                    return;
                }
                return;
            default:
                int i15 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f32186e2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32186e2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32186e2.setAlpha(floatValue2);
                return;
        }
    }
}
