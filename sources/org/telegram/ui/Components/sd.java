package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class sd implements ValueAnimator.AnimatorUpdateListener {
    public final int f28239a;
    public final ChatActivityEnterView f28240b;

    public sd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28239a = i10;
        this.f28240b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28239a;
        ChatActivityEnterView chatActivityEnterView = this.f28240b;
        switch (i10) {
            case 0:
                bf bfVar = chatActivityEnterView.J1;
                if (bfVar != null) {
                    bfVar.setTranslationX(bfVar.f22928a);
                    return;
                }
                return;
            case 1:
                bf bfVar2 = chatActivityEnterView.J1;
                if (bfVar2 != null) {
                    bfVar2.setTranslationX(bfVar2.f22928a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f22047m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f22047m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView.f22101w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    fgVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f21990c1) {
                    chatActivityEnterView.f22021h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f22021h1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f21974n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f22102w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22102w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22102w1.setAlpha(floatValue);
                return;
        }
    }
}
