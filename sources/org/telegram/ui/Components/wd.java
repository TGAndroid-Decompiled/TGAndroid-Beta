package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wd implements ValueAnimator.AnimatorUpdateListener {
    public final int f41688a = 0;
    public final float f41689b;
    public final Object f41690c;
    public final Object d;
    public final Object f41691e;

    public wd(ChatActivityEnterView chatActivityEnterView, rg rgVar, float f10, ChatActivityEnterView.RecordCircle recordCircle) {
        this.f41690c = chatActivityEnterView;
        this.d = rgVar;
        this.f41689b = f10;
        this.f41691e = recordCircle;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int currentColor;
        int i7 = this.f41688a;
        float f10 = this.f41689b;
        Object obj = this.f41691e;
        Object obj2 = this.d;
        Object obj3 = this.f41690c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                rg rgVar = (rg) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i10 = ChatActivityEnterView.f32538n7;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.J5 = floatValue;
                float interpolation = lr.f37209g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f11 = chatActivityEnterView.K5;
                float i11 = Utilities.i((floatValue - f11) / Math.max(60.0f, chatActivityEnterView.L5 - f11), 1.0f, 0.0f);
                rgVar.f39138w = interpolation;
                rgVar.f39139x = i11;
                rgVar.invalidate();
                double radians = Math.toRadians(rgVar.g());
                chatActivityEnterView.D5.R = ((float) Math.sin(radians)) * f10;
                chatActivityEnterView.D5.S = (1.0f - ((float) Math.cos(radians))) * f10;
                float f12 = chatActivityEnterView.M5;
                if (floatValue >= f12) {
                    float min = Math.min(1.0f, (floatValue - f12) / 260.0f);
                    rgVar.f39140y = min;
                    rgVar.invalidate();
                    chatActivityEnterView.u(min);
                }
                recordCircle.invalidate();
                return;
            default:
                sg.h hVar = (sg.h) obj;
                sg.u0 u0Var = ((sg.v) obj3).f57367a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.j0 j0Var = new sg.j0(new sg.m0[]{(sg.m0) obj2});
                hVar.getClass();
                if (hVar instanceof sg.d) {
                    currentColor = -1;
                } else {
                    currentColor = u0Var.getCurrentColor();
                }
                j0Var.f57250c = currentColor;
                j0Var.d = floatValue2 * f10;
                j0Var.f57251e = hVar;
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f57225f.f(new fi.p5(painting, j0Var, true, true, null, 5));
                    return;
                }
                return;
        }
    }

    public wd(sg.v vVar, sg.m0 m0Var, sg.h hVar, float f10) {
        this.f41690c = vVar;
        this.d = m0Var;
        this.f41691e = hVar;
        this.f41689b = f10;
    }
}
