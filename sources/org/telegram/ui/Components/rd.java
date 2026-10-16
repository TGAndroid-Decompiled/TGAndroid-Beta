package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rd implements ValueAnimator.AnimatorUpdateListener {
    public final int f28496a;
    public final ChatActivityEnterView f28497b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28496a = i10;
        this.f28497b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28496a;
        ChatActivityEnterView chatActivityEnterView = this.f28497b;
        switch (i10) {
            case 0:
                bf bfVar = chatActivityEnterView.J1;
                if (bfVar != null) {
                    bfVar.setTranslationX(bfVar.f23442a);
                    return;
                }
                return;
            case 1:
                bf bfVar2 = chatActivityEnterView.J1;
                if (bfVar2 != null) {
                    bfVar2.setTranslationX(bfVar2.f23442a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f22623m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f22623m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.f22677w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                int i12 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f22565c1) {
                    chatActivityEnterView.f22596h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f22596h1.invalidate();
                }
                chatActivityEnterView.v0();
                return;
            default:
                int i13 = ChatActivityEnterView.f22549n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f22678w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22678w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22678w1.setAlpha(floatValue);
                return;
        }
    }
}
