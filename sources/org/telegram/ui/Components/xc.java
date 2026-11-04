package org.telegram.ui.Components;

import android.animation.ValueAnimator;
public final class xc implements ValueAnimator.AnimatorUpdateListener {
    public final int f40306a;
    public final ChatActivityEnterView f40307b;

    public xc(ChatActivityEnterView chatActivityEnterView, int i3) {
        this.f40306a = i3;
        this.f40307b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i3 = this.f40306a;
        ChatActivityEnterView chatActivityEnterView = this.f40307b;
        switch (i3) {
            case 0:
                ge geVar = chatActivityEnterView.K1;
                if (geVar != null) {
                    geVar.setTranslationX(geVar.f34070a);
                    return;
                }
                return;
            case 1:
                ge geVar2 = chatActivityEnterView.K1;
                if (geVar2 != null) {
                    geVar2.setTranslationX(geVar2.f34070a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f31163n1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f31163n1.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.f31220x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kf kfVar = chatActivityEnterView.V0;
                if (kfVar != null) {
                    kfVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.K1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.O1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f31104d1) {
                    chatActivityEnterView.f31136i1.setAlpha(chatActivityEnterView.O1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f31136i1.invalidate();
                }
                chatActivityEnterView.v0();
                return;
            default:
                int i12 = ChatActivityEnterView.f31082t5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f31221x1.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f31221x1.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f31221x1.setAlpha(floatValue);
                return;
        }
    }
}
