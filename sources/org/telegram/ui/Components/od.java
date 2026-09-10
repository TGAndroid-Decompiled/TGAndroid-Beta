package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class od implements ValueAnimator.AnimatorUpdateListener {
    public final int f25766a;
    public final ChatActivityEnterView f25767b;

    public od(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25766a = i10;
        this.f25767b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f25766a;
        ChatActivityEnterView chatActivityEnterView = this.f25767b;
        switch (i10) {
            case 0:
                af afVar = chatActivityEnterView.I1;
                if (afVar != null) {
                    afVar.setTranslationX(afVar.f21488a);
                    return;
                }
                return;
            case 1:
                af afVar2 = chatActivityEnterView.I1;
                if (afVar2 != null) {
                    afVar2.setTranslationX(afVar2.f21488a);
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
                int i11 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.f20942w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    fgVar.a0();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.I1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.M1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f20832c1) {
                    chatActivityEnterView.f20863h1.setAlpha(chatActivityEnterView.M1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f20863h1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f20816m5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f20937v1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f20937v1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f20937v1.setAlpha(floatValue);
                return;
        }
    }
}
