package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class zc implements ValueAnimator.AnimatorUpdateListener {
    public final int f40933a;
    public final ChatActivityEnterView f40934b;

    public zc(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f40933a = i7;
        this.f40934b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f40933a;
        ChatActivityEnterView chatActivityEnterView = this.f40934b;
        switch (i7) {
            case 0:
                ie ieVar = chatActivityEnterView.J1;
                if (ieVar != null) {
                    ieVar.setTranslationX(ieVar.f34592a);
                    return;
                }
                return;
            case 1:
                ie ieVar2 = chatActivityEnterView.J1;
                if (ieVar2 != null) {
                    ieVar2.setTranslationX(ieVar2.f34592a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f31083m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f31083m1.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.s5;
                chatActivityEnterView.f31140w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mf mfVar = chatActivityEnterView.U0;
                if (mfVar != null) {
                    mfVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.s5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f31025c1) {
                    chatActivityEnterView.f31056h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f31056h1.invalidate();
                }
                chatActivityEnterView.w0();
                return;
            default:
                int i12 = ChatActivityEnterView.s5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f31141w1.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f31141w1.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f31141w1.setAlpha(floatValue);
                return;
        }
    }
}
