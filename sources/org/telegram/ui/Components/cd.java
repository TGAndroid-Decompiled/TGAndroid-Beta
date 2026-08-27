package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class cd implements ValueAnimator.AnimatorUpdateListener {

    public final int f27406a;

    public final ChatActivityEnterView f27407b;

    public cd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f27406a = i10;
        this.f27407b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f27406a;
        ChatActivityEnterView chatActivityEnterView = this.f27407b;
        switch (i10) {
            case 0:
                me meVar = chatActivityEnterView.E1;
                if (meVar != null) {
                    meVar.setTranslationX(meVar.f30654a);
                }
                break;
            case 1:
                me meVar2 = chatActivityEnterView.E1;
                if (meVar2 != null) {
                    meVar2.setTranslationX(meVar2.f30654a);
                }
                break;
            case 2:
                chatActivityEnterView.f26117h1.invalidate();
                break;
            case 3:
                chatActivityEnterView.f26117h1.invalidate();
                break;
            case 4:
                int i11 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.f26173s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf qfVar = chatActivityEnterView.Q0;
                if (qfVar != null) {
                    qfVar.a0();
                }
                break;
            case 5:
                chatActivityEnterView.E1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 6:
                int i12 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.I1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Y0) {
                    chatActivityEnterView.f26091d1.setAlpha(chatActivityEnterView.I1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f26091d1.invalidate();
                }
                chatActivityEnterView.x0();
                break;
            default:
                int i13 = ChatActivityEnterView.f26070i5;
                chatActivityEnterView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f26168r1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                chatActivityEnterView.f26168r1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                chatActivityEnterView.f26168r1.setAlpha(fFloatValue);
                break;
        }
    }
}
