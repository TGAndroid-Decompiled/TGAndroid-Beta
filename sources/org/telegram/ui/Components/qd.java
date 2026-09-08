package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qd implements ValueAnimator.AnimatorUpdateListener {
    public final int f29720a;
    public final ChatActivityEnterView f29721b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29720a = i10;
        this.f29721b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29720a;
        ChatActivityEnterView chatActivityEnterView = this.f29721b;
        switch (i10) {
            case 0:
                af afVar = chatActivityEnterView.I1;
                if (afVar != null) {
                    afVar.setTranslationX(afVar.f24378a);
                    return;
                }
                return;
            case 1:
                af afVar2 = chatActivityEnterView.I1;
                if (afVar2 != null) {
                    afVar2.setTranslationX(afVar2.f24378a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.l1.invalidate();
                return;
            case 3:
                chatActivityEnterView.l1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.f23815w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    egVar.a0();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.I1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.M1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23704c1) {
                    chatActivityEnterView.f23736h1.setAlpha(chatActivityEnterView.M1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23736h1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f23688m5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f23810v1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23810v1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23810v1.setAlpha(floatValue);
                return;
        }
    }
}
