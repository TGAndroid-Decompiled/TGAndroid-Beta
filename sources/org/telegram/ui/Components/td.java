package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td implements ValueAnimator.AnimatorUpdateListener {
    public final int f31083a;
    public final ChatActivityEnterView f31084b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31083a = i10;
        this.f31084b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31083a;
        ChatActivityEnterView chatActivityEnterView = this.f31084b;
        switch (i10) {
            case 0:
                cf cfVar = chatActivityEnterView.J1;
                if (cfVar != null) {
                    cfVar.setTranslationX(cfVar.f25198a);
                    return;
                }
                return;
            case 1:
                cf cfVar2 = chatActivityEnterView.J1;
                if (cfVar2 != null) {
                    cfVar2.setTranslationX(cfVar2.f25198a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f23916m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f23916m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.f23970w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                int i12 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23858c1) {
                    chatActivityEnterView.f23890h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23890h1.invalidate();
                }
                chatActivityEnterView.v0();
                return;
            default:
                int i13 = ChatActivityEnterView.f23842n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f23971w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23971w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23971w1.setAlpha(floatValue);
                return;
        }
    }
}
