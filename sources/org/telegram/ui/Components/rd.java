package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class rd implements ValueAnimator.AnimatorUpdateListener {
    public final int f28806a;
    public final ChatActivityEnterView f28807b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i10) {
        this.f28806a = i10;
        this.f28807b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f28806a;
        ChatActivityEnterView chatActivityEnterView = this.f28807b;
        switch (i10) {
            case 0:
                bf bfVar = chatActivityEnterView.J1;
                if (bfVar != null) {
                    bfVar.setTranslationX(bfVar.f23748a);
                    return;
                }
                return;
            case 1:
                bf bfVar2 = chatActivityEnterView.J1;
                if (bfVar2 != null) {
                    bfVar2.setTranslationX(bfVar2.f23748a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f22923m1.invalidate();
                return;
            case 3:
                chatActivityEnterView.f22923m1.invalidate();
                return;
            case 4:
                int i11 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.f22977w0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
                int i12 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.N1.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f22865c1) {
                    chatActivityEnterView.f22896h1.setAlpha(chatActivityEnterView.N1.getTransformToSeekbarProgressStep3());
                    chatActivityEnterView.f22896h1.invalidate();
                }
                chatActivityEnterView.v0();
                return;
            default:
                int i13 = ChatActivityEnterView.f22849n5;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f22978w1.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22978w1.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, floatValue));
                chatActivityEnterView.f22978w1.setAlpha(floatValue);
                return;
        }
    }
}
