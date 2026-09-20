package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qd implements ValueAnimator.AnimatorUpdateListener {
    public final int f27562a;
    public final ChatActivityEnterView f27563b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27562a = i10;
        this.f27563b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27562a;
        ChatActivityEnterView chatActivityEnterView = this.f27563b;
        switch (i10) {
            case 0:
                ze zeVar = chatActivityEnterView.I1;
                if (zeVar != null) {
                    zeVar.setTranslationX(zeVar.f30804a);
                    return;
                }
                return;
            case 1:
                ze zeVar2 = chatActivityEnterView.I1;
                if (zeVar2 != null) {
                    zeVar2.setTranslationX(zeVar2.f30804a);
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
                int i11 = ChatActivityEnterView.f21952m5;
                chatActivityEnterView.f22078w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.I1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f21952m5;
                chatActivityEnterView.M1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f21968c1) {
                    chatActivityEnterView.f21999h1.setAlpha(chatActivityEnterView.M1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f21999h1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f21952m5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f22073v1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22073v1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22073v1.setAlpha(floatValue);
                return;
        }
    }
}
