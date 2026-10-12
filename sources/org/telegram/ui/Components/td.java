package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class td implements ValueAnimator.AnimatorUpdateListener {
    public final int f30868a;
    public final ChatActivityEnterView f30869b;

    public td(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f30868a = i10;
        this.f30869b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f30868a;
        ChatActivityEnterView chatActivityEnterView = this.f30869b;
        switch (i10) {
            case 0:
                cf cfVar = chatActivityEnterView.J1;
                if (cfVar != null) {
                    cfVar.setTranslationX(cfVar.f24930a);
                    return;
                }
                return;
            case 1:
                cf cfVar2 = chatActivityEnterView.J1;
                if (cfVar2 != null) {
                    cfVar2.setTranslationX(cfVar2.f24930a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f23690m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f23690m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.S5;
                chatActivityEnterView.f23752w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig igVar = chatActivityEnterView.U0;
                if (igVar != null) {
                    igVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.J1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.S5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f23632c1) {
                    chatActivityEnterView.f23664h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f23664h1.invalidate();
                }
                chatActivityEnterView.z0();
                return;
            default:
                int i13 = ChatActivityEnterView.S5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f23753w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23753w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f23753w1.setAlpha(floatValue);
                return;
        }
    }
}
