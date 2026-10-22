package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class pd implements ValueAnimator.AnimatorUpdateListener {
    public final int f29302a;
    public final ChatActivityEnterView f29303b;

    public pd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29302a = i10;
        this.f29303b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29302a;
        ChatActivityEnterView chatActivityEnterView = this.f29303b;
        switch (i10) {
            case 0:
                ze zeVar = chatActivityEnterView.J1;
                if (zeVar != null) {
                    zeVar.setTranslationX(zeVar.f32883a);
                    return;
                }
                return;
            case 1:
                ze zeVar2 = chatActivityEnterView.J1;
                if (zeVar2 != null) {
                    zeVar2.setTranslationX(zeVar2.f32883a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f23985m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f23985m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f23911n5;
                chatActivityEnterView.f24039w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                int i12 = ChatActivityEnterView.f23911n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23927c1) {
                    chatActivityEnterView.f23958h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23958h1.invalidate();
                }
                chatActivityEnterView.v0();
                return;
            default:
                int i13 = ChatActivityEnterView.f23911n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f24040w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24040w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f24040w1.setAlpha(floatValue);
                return;
        }
    }
}
