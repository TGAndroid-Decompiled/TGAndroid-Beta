package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rd implements ValueAnimator.AnimatorUpdateListener {
    public final int f27950a;
    public final ChatActivityEnterView f27951b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27950a = i10;
        this.f27951b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27950a;
        ChatActivityEnterView chatActivityEnterView = this.f27951b;
        switch (i10) {
            case 0:
                af afVar = chatActivityEnterView.J1;
                if (afVar != null) {
                    afVar.setTranslationX(afVar.f22666a);
                    return;
                }
                return;
            case 1:
                af afVar2 = chatActivityEnterView.J1;
                if (afVar2 != null) {
                    afVar2.setTranslationX(afVar2.f22666a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f22025m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f22025m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.f22079w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    egVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f21968c1) {
                    chatActivityEnterView.f21999h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f21999h1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f21952n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f22080w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22080w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22080w1.setAlpha(floatValue);
                return;
        }
    }
}
