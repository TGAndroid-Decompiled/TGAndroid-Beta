package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wd implements ValueAnimator.AnimatorUpdateListener {
    public final int f41606a = 0;
    public final float f41607b;
    public final Object f41608c;
    public final Object d;
    public final Object f41609e;

    public wd(ChatActivityEnterView chatActivityEnterView, sg sgVar, float f10, ChatActivityEnterView.RecordCircle recordCircle) {
        this.f41608c = chatActivityEnterView;
        this.d = sgVar;
        this.f41607b = f10;
        this.f41609e = recordCircle;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int currentColor;
        int i7 = this.f41606a;
        float f10 = this.f41607b;
        Object obj = this.f41609e;
        Object obj2 = this.d;
        Object obj3 = this.f41608c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                sg sgVar = (sg) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i10 = ChatActivityEnterView.f32633s7;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.L5 = floatValue;
                float interpolation = kr.f36859g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f11 = chatActivityEnterView.M5;
                float i11 = Utilities.i((floatValue - f11) / Math.max(60.0f, chatActivityEnterView.N5 - f11), 1.0f, 0.0f);
                sgVar.f39612w = interpolation;
                sgVar.f39613x = i11;
                sgVar.invalidate();
                double radians = Math.toRadians(sgVar.g());
                chatActivityEnterView.F5.R = ((float) Math.sin(radians)) * f10;
                chatActivityEnterView.F5.S = (1.0f - ((float) Math.cos(radians))) * f10;
                float f12 = chatActivityEnterView.O5;
                if (floatValue >= f12) {
                    float min = Math.min(1.0f, (floatValue - f12) / 260.0f);
                    sgVar.f39614y = min;
                    sgVar.invalidate();
                    chatActivityEnterView.u(min);
                }
                recordCircle.invalidate();
                return;
            default:
                sg.h hVar = (sg.h) obj;
                sg.t0 t0Var = ((sg.v) obj3).f57487a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.i0 i0Var = new sg.i0(new sg.l0[]{(sg.l0) obj2});
                hVar.getClass();
                if (hVar instanceof sg.d) {
                    currentColor = -1;
                } else {
                    currentColor = t0Var.getCurrentColor();
                }
                i0Var.f57366c = currentColor;
                i0Var.d = floatValue2 * f10;
                i0Var.f57367e = hVar;
                sg.h0 painting = t0Var.getPainting();
                if (painting.L == null) {
                    painting.f57343f.f(new fi.q5(painting, i0Var, true, true, null, 5));
                    return;
                }
                return;
        }
    }

    public wd(sg.v vVar, sg.l0 l0Var, sg.h hVar, float f10) {
        this.f41608c = vVar;
        this.d = l0Var;
        this.f41609e = hVar;
        this.f41607b = f10;
    }
}
