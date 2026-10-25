package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class qd implements ValueAnimator.AnimatorUpdateListener {
    public final int f31900a;
    public final ChatActivityEnterView f31901b;

    public qd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f31900a = i10;
        this.f31901b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f31900a;
        ChatActivityEnterView chatActivityEnterView = this.f31901b;
        switch (i10) {
            case 0:
                ze zeVar = chatActivityEnterView.J1;
                if (zeVar != null) {
                    zeVar.setTranslationX(zeVar.f35308a);
                    return;
                }
                return;
            case 1:
                ze zeVar2 = chatActivityEnterView.J1;
                if (zeVar2 != null) {
                    zeVar2.setTranslationX(zeVar2.f35308a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f25915m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f25915m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.f25972w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    dgVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f25857c1) {
                    chatActivityEnterView.f25888h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f25888h1.invalidate();
                }
                chatActivityEnterView.u0();
                return;
            default:
                int i13 = ChatActivityEnterView.f25841r5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f25973w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f25973w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f25973w1.setAlpha(floatValue);
                return;
        }
    }
}
