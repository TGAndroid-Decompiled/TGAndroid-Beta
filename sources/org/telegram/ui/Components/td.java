package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td implements ValueAnimator.AnimatorUpdateListener {
    public final int f31212a;
    public final ChatActivityEnterView f31213b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31212a = i10;
        this.f31213b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31212a;
        ChatActivityEnterView chatActivityEnterView = this.f31213b;
        switch (i10) {
            case 0:
                cf cfVar = chatActivityEnterView.J1;
                if (cfVar != null) {
                    cfVar.setTranslationX(cfVar.f25333a);
                    return;
                }
                return;
            case 1:
                cf cfVar2 = chatActivityEnterView.J1;
                if (cfVar2 != null) {
                    cfVar2.setTranslationX(cfVar2.f25333a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f23952m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f23952m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.f24006w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                int i12 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23894c1) {
                    chatActivityEnterView.f23926h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23926h1.invalidate();
                }
                chatActivityEnterView.v0();
                return;
            default:
                int i13 = ChatActivityEnterView.f23878n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f24007w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24007w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24007w1.setAlpha(floatValue);
                return;
        }
    }
}
