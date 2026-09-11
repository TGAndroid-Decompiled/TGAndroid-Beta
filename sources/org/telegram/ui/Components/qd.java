package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qd implements ValueAnimator.AnimatorUpdateListener {
    public final int f29693a;
    public final ChatActivityEnterView f29694b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29693a = i10;
        this.f29694b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29693a;
        ChatActivityEnterView chatActivityEnterView = this.f29694b;
        switch (i10) {
            case 0:
                af afVar = chatActivityEnterView.I1;
                if (afVar != null) {
                    afVar.setTranslationX(afVar.f24351a);
                    return;
                }
                return;
            case 1:
                af afVar2 = chatActivityEnterView.I1;
                if (afVar2 != null) {
                    afVar2.setTranslationX(afVar2.f24351a);
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
                int i11 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.f23788w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                int i12 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.M1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23677c1) {
                    chatActivityEnterView.f23709h1.setAlpha(chatActivityEnterView.M1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23709h1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f23661m5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f23783v1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23783v1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23783v1.setAlpha(floatValue);
                return;
        }
    }
}
