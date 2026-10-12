package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td implements ValueAnimator.AnimatorUpdateListener {
    public final int f30865a;
    public final ChatActivityEnterView f30866b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30865a = i10;
        this.f30866b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30865a;
        ChatActivityEnterView chatActivityEnterView = this.f30866b;
        switch (i10) {
            case 0:
                cf cfVar = chatActivityEnterView.J1;
                if (cfVar != null) {
                    cfVar.setTranslationX(cfVar.f24935a);
                    return;
                }
                return;
            case 1:
                cf cfVar2 = chatActivityEnterView.J1;
                if (cfVar2 != null) {
                    cfVar2.setTranslationX(cfVar2.f24935a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f23689m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f23689m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.Q5;
                chatActivityEnterView.f23751w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig igVar = chatActivityEnterView.U0;
                if (igVar != null) {
                    igVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.Q5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23631c1) {
                    chatActivityEnterView.f23663h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23663h1.invalidate();
                }
                chatActivityEnterView.z0();
                return;
            default:
                int i13 = ChatActivityEnterView.Q5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f23752w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23752w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23752w1.setAlpha(floatValue);
                return;
        }
    }
}
