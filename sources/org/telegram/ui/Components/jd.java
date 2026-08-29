package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class jd implements ValueAnimator.AnimatorUpdateListener {
    public final int f29642a;
    public final ChatActivityEnterView f29643b;

    public jd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f29642a = i10;
        this.f29643b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f29642a;
        ChatActivityEnterView chatActivityEnterView = this.f29643b;
        switch (i10) {
            case 0:
                te teVar = chatActivityEnterView.E1;
                if (teVar != null) {
                    teVar.setTranslationX(teVar.f32928a);
                    return;
                }
                return;
            case 1:
                te teVar2 = chatActivityEnterView.E1;
                if (teVar2 != null) {
                    teVar2.setTranslationX(teVar2.f32928a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f26132h1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f26132h1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.f26188s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xf xfVar = chatActivityEnterView.Q0;
                if (xfVar != null) {
                    xfVar.a0();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.E1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.I1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Y0) {
                    chatActivityEnterView.f26106d1.setAlpha(chatActivityEnterView.I1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f26106d1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f26085i5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f26183r1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f26183r1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f26183r1.setAlpha(floatValue);
                return;
        }
    }
}
