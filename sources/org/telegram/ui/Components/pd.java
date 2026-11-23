package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pd implements ValueAnimator.AnimatorUpdateListener {
    public final int f38451a;
    public final ChatActivityEnterView f38452b;

    public pd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f38451a = i7;
        this.f38452b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f38451a;
        float f10 = 1.0f;
        ChatActivityEnterView chatActivityEnterView = this.f38452b;
        switch (i7) {
            case 0:
                te teVar = chatActivityEnterView.f32830z2;
                if (teVar != null) {
                    teVar.setTranslationX(teVar.f39910a);
                    return;
                }
                return;
            case 1:
                te teVar2 = chatActivityEnterView.f32830z2;
                if (teVar2 != null) {
                    teVar2.setTranslationX(teVar2.f39910a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f32655c2.invalidate();
                return;
            case 3:
                chatActivityEnterView.f32655c2.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.f32813x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eg egVar = chatActivityEnterView.V0;
                if (egVar != null) {
                    egVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.f32830z2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.D2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f32662d1) {
                    zi0 zi0Var = chatActivityEnterView.f32702i1;
                    if (!chatActivityEnterView.K1) {
                        f10 = chatActivityEnterView.D2.getTransformToSeekbarProgressStep3();
                    }
                    zi0Var.setAlpha(f10);
                    chatActivityEnterView.f32702i1.invalidate();
                }
                chatActivityEnterView.X0();
                return;
            case 7:
                int i12 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.w(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                int i13 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.B6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qg qgVar = chatActivityEnterView.E2;
                if (qgVar != null) {
                    qgVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.D2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 9:
                int i14 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.D5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.r();
                return;
            case 10:
                int i15 = ChatActivityEnterView.f32633s7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.P1 = floatValue;
                jh.f D0 = chatActivityEnterView.D0();
                if (D0 != null) {
                    D0.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                ee eeVar = chatActivityEnterView.f32679f1;
                if (eeVar != null) {
                    eeVar.invalidate();
                    return;
                }
                return;
            default:
                int i16 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f32731m2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32731m2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32731m2.setAlpha(floatValue2);
                return;
        }
    }
}
