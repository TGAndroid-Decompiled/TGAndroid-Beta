package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class od implements ValueAnimator.AnimatorUpdateListener {
    public final int f26763a;
    public final ChatActivityEnterView f26764b;

    public od(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f26763a = i10;
        this.f26764b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f26763a;
        ChatActivityEnterView chatActivityEnterView = this.f26764b;
        switch (i10) {
            case 0:
                xe xeVar = chatActivityEnterView.I1;
                if (xeVar != null) {
                    xeVar.setTranslationX(xeVar.f29921a);
                    return;
                }
                return;
            case 1:
                xe xeVar2 = chatActivityEnterView.I1;
                if (xeVar2 != null) {
                    xeVar2.setTranslationX(xeVar2.f29921a);
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
                int i11 = ChatActivityEnterView.f21727n5;
                chatActivityEnterView.f21854w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null) {
                    cgVar.Y();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.I1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f21727n5;
                chatActivityEnterView.M1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f21743c1) {
                    chatActivityEnterView.f21774h1.setAlpha(chatActivityEnterView.M1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f21774h1.invalidate();
                }
                chatActivityEnterView.y0();
                return;
            default:
                int i13 = ChatActivityEnterView.f21727n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f21849v1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f21849v1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f21849v1.setAlpha(floatValue);
                return;
        }
    }
}
