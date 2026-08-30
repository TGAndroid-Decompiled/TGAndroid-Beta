package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class gd implements ValueAnimator.AnimatorUpdateListener {
    public final int f25106a;
    public final ChatActivityEnterView f25107b;

    public gd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f25106a = i10;
        this.f25107b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f25106a;
        ChatActivityEnterView chatActivityEnterView = this.f25107b;
        switch (i10) {
            case 0:
                qe qeVar = chatActivityEnterView.F1;
                if (qeVar != null) {
                    qeVar.setTranslationX(qeVar.f28118a);
                    return;
                }
                return;
            case 1:
                qe qeVar2 = chatActivityEnterView.F1;
                if (qeVar2 != null) {
                    qeVar2.setTranslationX(qeVar2.f28118a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f22781i1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f22781i1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView.f22837t0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uf ufVar = chatActivityEnterView.R0;
                if (ufVar != null) {
                    ufVar.a0();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.F1.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i12 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView.J1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.Z0) {
                    chatActivityEnterView.f22756e1.setAlpha(chatActivityEnterView.J1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f22756e1.invalidate();
                }
                chatActivityEnterView.x0();
                return;
            default:
                int i13 = ChatActivityEnterView.f22729j5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f22833s1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22833s1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22833s1.setAlpha(floatValue);
                return;
        }
    }
}
