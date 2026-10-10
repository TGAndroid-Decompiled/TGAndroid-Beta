package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td implements ValueAnimator.AnimatorUpdateListener {
    public final int f31111a;
    public final ChatActivityEnterView f31112b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31111a = i10;
        this.f31112b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31111a;
        ChatActivityEnterView chatActivityEnterView = this.f31112b;
        switch (i10) {
            case 0:
                cf cfVar = chatActivityEnterView.J1;
                if (cfVar != null) {
                    cfVar.setTranslationX(cfVar.f25284a);
                    return;
                }
                return;
            case 1:
                cf cfVar2 = chatActivityEnterView.J1;
                if (cfVar2 != null) {
                    cfVar2.setTranslationX(cfVar2.f25284a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f23928m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f23928m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.f23982w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gg ggVar = chatActivityEnterView.U0;
                if (ggVar != null) {
                    ggVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23870c1) {
                    chatActivityEnterView.f23902h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23902h1.invalidate();
                }
                chatActivityEnterView.v0();
                return;
            default:
                int i13 = ChatActivityEnterView.f23854n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f23983w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23983w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23983w1.setAlpha(floatValue);
                return;
        }
    }
}
