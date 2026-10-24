package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class nd implements ValueAnimator.AnimatorUpdateListener {
    public final int f28874a;
    public final ChatActivityEnterView f28875b;

    public nd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28874a = i10;
        this.f28875b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28874a;
        ChatActivityEnterView chatActivityEnterView = this.f28875b;
        switch (i10) {
            case 0:
                xe xeVar = chatActivityEnterView.J1;
                if (xeVar != null) {
                    xeVar.setTranslationX(xeVar.f32564a);
                    return;
                }
                return;
            case 1:
                xe xeVar2 = chatActivityEnterView.J1;
                if (xeVar2 != null) {
                    xeVar2.setTranslationX(xeVar2.f32564a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f24125m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f24125m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.f24182w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg bgVar = chatActivityEnterView.U0;
                if (bgVar != null) {
                    bgVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f24067c1) {
                    chatActivityEnterView.f24098h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f24098h1.invalidate();
                }
                chatActivityEnterView.u0();
                return;
            default:
                int i13 = ChatActivityEnterView.f24051r5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f24183w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24183w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24183w1.setAlpha(floatValue);
                return;
        }
    }
}
