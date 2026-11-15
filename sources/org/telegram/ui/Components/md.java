package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class md implements ValueAnimator.AnimatorUpdateListener {
    public final int f37223a = 0;
    public final float f37224b;
    public final Object f37225c;
    public final Object d;
    public final Object f37226e;

    public md(ChatActivityEnterView chatActivityEnterView, ig igVar, float f10, ChatActivityEnterView.RecordCircle recordCircle) {
        this.f37225c = chatActivityEnterView;
        this.d = igVar;
        this.f37224b = f10;
        this.f37226e = recordCircle;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int currentColor;
        int i7 = this.f37223a;
        float f10 = this.f37224b;
        Object obj = this.f37226e;
        Object obj2 = this.d;
        Object obj3 = this.f37225c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                ig igVar = (ig) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i10 = ChatActivityEnterView.N6;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.D5 = floatValue;
                float interpolation = er.f34420g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f11 = chatActivityEnterView.E5;
                float i11 = Utilities.i((floatValue - f11) / Math.max(60.0f, chatActivityEnterView.F5 - f11), 1.0f, 0.0f);
                igVar.f35614w = interpolation;
                igVar.f35615x = i11;
                igVar.invalidate();
                double radians = Math.toRadians(igVar.f());
                chatActivityEnterView.f32321x5.R = ((float) Math.sin(radians)) * f10;
                chatActivityEnterView.f32321x5.S = (1.0f - ((float) Math.cos(radians))) * f10;
                float f12 = chatActivityEnterView.G5;
                if (floatValue >= f12) {
                    float min = Math.min(1.0f, (floatValue - f12) / 260.0f);
                    igVar.f35616y = min;
                    igVar.invalidate();
                    chatActivityEnterView.s(min);
                }
                recordCircle.invalidate();
                return;
            default:
                sg.h hVar = (sg.h) obj;
                sg.u0 u0Var = ((sg.v) obj3).f56793a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.j0 j0Var = new sg.j0(new sg.m0[]{(sg.m0) obj2});
                hVar.getClass();
                if (hVar instanceof sg.d) {
                    currentColor = -1;
                } else {
                    currentColor = u0Var.getCurrentColor();
                }
                j0Var.f56676c = currentColor;
                j0Var.d = floatValue2 * f10;
                j0Var.f56677e = hVar;
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f56651f.f(new fi.r5(painting, j0Var, true, true, null, 5));
                    return;
                }
                return;
        }
    }

    public md(sg.v vVar, sg.m0 m0Var, sg.h hVar, float f10) {
        this.f37225c = vVar;
        this.d = m0Var;
        this.f37226e = hVar;
        this.f37224b = f10;
    }
}
