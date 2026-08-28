package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class fd implements ValueAnimator.AnimatorUpdateListener {
    public final int f28386a;
    public final ChatActivityEnterView f28387b;

    public fd(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.f28386a = i9;
        this.f28387b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = this.f28386a;
        ChatActivityEnterView chatActivityEnterView = this.f28387b;
        switch (i9) {
            case 0:
                qe qeVar = chatActivityEnterView.E1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.f31888a);
                    return;
                }
                return;
            case 1:
                qe qeVar2 = chatActivityEnterView.E1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.f31888a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f26121h1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f26121h1.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.f26177s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null) {
                    ufVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.E1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.I1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Y0) {
                    chatActivityEnterView.f26095d1.setAlpha(chatActivityEnterView.I1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f26095d1.invalidate();
                }
                chatActivityEnterView.w0();
                return;
            default:
                int i12 = ChatActivityEnterView.f26074i5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f26172r1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f26172r1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f26172r1.setAlpha(floatValue);
                return;
        }
    }
}
