package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pd implements ValueAnimator.AnimatorUpdateListener {
    public final int f38528a;
    public final ChatActivityEnterView f38529b;

    public pd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f38528a = i7;
        this.f38529b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f38528a;
        float f10 = 1.0f;
        ChatActivityEnterView chatActivityEnterView = this.f38529b;
        switch (i7) {
            case 0:
                se seVar = chatActivityEnterView.f32732z2;
                if (seVar != null) {
                    seVar.setTranslationX(seVar.f39515a);
                    return;
                }
                return;
            case 1:
                se seVar2 = chatActivityEnterView.f32732z2;
                if (seVar2 != null) {
                    seVar2.setTranslationX(seVar2.f39515a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f32557c2.invalidate();
                return;
            case 3:
                chatActivityEnterView.f32557c2.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.f32715x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    egVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.f32732z2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.D2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f32564d1) {
                    zi0 zi0Var = chatActivityEnterView.f32604i1;
                    if (!chatActivityEnterView.K1) {
                        f10 = chatActivityEnterView.D2.getTransformToSeekbarProgressStep3();
                    }
                    zi0Var.setAlpha(f10);
                    chatActivityEnterView.f32604i1.invalidate();
                }
                chatActivityEnterView.W0();
                return;
            case 7:
                int i12 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.w(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                int i13 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.B6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rg rgVar = chatActivityEnterView.E2;
                if (rgVar != null) {
                    rgVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 9:
                int i14 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.D5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.r();
                return;
            case 10:
                int i15 = ChatActivityEnterView.f32535s7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.P1 = floatValue;
                jh.f D0 = chatActivityEnterView.D0();
                if (D0 != null) {
                    D0.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                de deVar = chatActivityEnterView.f32581f1;
                if (deVar != null) {
                    deVar.invalidate();
                    return;
                }
                return;
            default:
                int i16 = ChatActivityEnterView.f32535s7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f32633m2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32633m2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32633m2.setAlpha(floatValue2);
                return;
        }
    }
}
