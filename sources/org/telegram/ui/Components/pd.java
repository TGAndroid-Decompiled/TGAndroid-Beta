package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class pd implements ValueAnimator.AnimatorUpdateListener {
    public final int f38380a;
    public final ChatActivityEnterView f38381b;

    public pd(ChatActivityEnterView chatActivityEnterView, int i7) {
        this.f38380a = i7;
        this.f38381b = chatActivityEnterView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i7 = this.f38380a;
        float f10 = 1.0f;
        ChatActivityEnterView chatActivityEnterView = this.f38381b;
        switch (i7) {
            case 0:
                se seVar = chatActivityEnterView.f32715x2;
                if (seVar != null) {
                    seVar.setTranslationX(seVar.f39613a);
                    return;
                }
                return;
            case 1:
                se seVar2 = chatActivityEnterView.f32715x2;
                if (seVar2 != null) {
                    seVar2.setTranslationX(seVar2.f39613a);
                    return;
                }
                return;
            case 2:
                chatActivityEnterView.f32542a2.invalidate();
                return;
            case 3:
                chatActivityEnterView.f32542a2.invalidate();
                return;
            case 4:
                int i10 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.f32713x0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cg cgVar = chatActivityEnterView.V0;
                if (cgVar != null) {
                    cgVar.Z();
                    return;
                }
                return;
            case 5:
                chatActivityEnterView.f32715x2.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                int i11 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.B2.setTransformToSeekbar(((Float) valueAnimator.getAnimatedValue()).floatValue());
                if (!chatActivityEnterView.f32567d1) {
                    xi0 xi0Var = chatActivityEnterView.f32607i1;
                    if (!chatActivityEnterView.I1) {
                        f10 = chatActivityEnterView.B2.getTransformToSeekbarProgressStep3();
                    }
                    xi0Var.setAlpha(f10);
                    chatActivityEnterView.f32607i1.invalidate();
                }
                chatActivityEnterView.S0();
                return;
            case 7:
                int i12 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.w(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 8:
                int i13 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.f32734z6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pg pgVar = chatActivityEnterView.C2;
                if (pgVar != null) {
                    pgVar.invalidate();
                }
                ChatActivityEnterView.RecordCircle recordCircle = chatActivityEnterView.B2;
                if (recordCircle != null) {
                    recordCircle.invalidate();
                    return;
                }
                return;
            case 9:
                int i14 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.getClass();
                chatActivityEnterView.B5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.r();
                return;
            case 10:
                int i15 = ChatActivityEnterView.f32538n7;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.N1 = floatValue;
                jh.f z02 = chatActivityEnterView.z0();
                if (z02 != null) {
                    z02.setInputBubbleExtraAlpha(1.0f - floatValue);
                }
                de deVar = chatActivityEnterView.f32584f1;
                if (deVar != null) {
                    deVar.invalidate();
                    return;
                }
                return;
            default:
                int i16 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.f32622k2.setScaleX(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32622k2.setScaleY(org.telegram.messenger.g0.T1(0.6f, 1.0f, floatValue2));
                chatActivityEnterView.f32622k2.setAlpha(floatValue2);
                return;
        }
    }
}
