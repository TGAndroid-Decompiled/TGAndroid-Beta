package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wd implements ValueAnimator.AnimatorUpdateListener {
    public final int f41777a = 0;
    public final float f41778b;
    public final Object f41779c;
    public final Object d;
    public final Object f41780e;

    public wd(ChatActivityEnterView chatActivityEnterView, tg tgVar, float f10, ChatActivityEnterView.RecordCircle recordCircle) {
        this.f41779c = chatActivityEnterView;
        this.d = tgVar;
        this.f41778b = f10;
        this.f41780e = recordCircle;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int currentColor;
        int i7 = this.f41777a;
        float f10 = this.f41778b;
        Object obj = this.f41780e;
        Object obj2 = this.d;
        Object obj3 = this.f41779c;
        switch (i7) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                tg tgVar = (tg) obj2;
                ChatActivityEnterView.RecordCircle recordCircle = (ChatActivityEnterView.RecordCircle) obj;
                int i10 = ChatActivityEnterView.f32569s7;
                chatActivityEnterView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                chatActivityEnterView.L5 = floatValue;
                float interpolation = nr.f37961g.getInterpolation(Utilities.i((floatValue - 60.0f) / 170.0f, 1.0f, 0.0f));
                float f11 = chatActivityEnterView.M5;
                float i11 = Utilities.i((floatValue - f11) / Math.max(60.0f, chatActivityEnterView.N5 - f11), 1.0f, 0.0f);
                tgVar.f39904w = interpolation;
                tgVar.f39905x = i11;
                tgVar.invalidate();
                double radians = Math.toRadians(tgVar.g());
                chatActivityEnterView.F5.R = ((float) Math.sin(radians)) * f10;
                chatActivityEnterView.F5.S = (1.0f - ((float) Math.cos(radians))) * f10;
                float f12 = chatActivityEnterView.O5;
                if (floatValue >= f12) {
                    float min = Math.min(1.0f, (floatValue - f12) / 260.0f);
                    tgVar.f39906y = min;
                    tgVar.invalidate();
                    chatActivityEnterView.u(min);
                }
                recordCircle.invalidate();
                return;
            default:
                sg.h hVar = (sg.h) obj;
                sg.u0 u0Var = ((sg.v) obj3).f57412a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.j0 j0Var = new sg.j0(new sg.m0[]{(sg.m0) obj2});
                hVar.getClass();
                if (hVar instanceof sg.d) {
                    currentColor = -1;
                } else {
                    currentColor = u0Var.getCurrentColor();
                }
                j0Var.f57295c = currentColor;
                j0Var.d = floatValue2 * f10;
                j0Var.f57296e = hVar;
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f57270f.f(new fi.q5(painting, j0Var, true, true, null, 5));
                    return;
                }
                return;
        }
    }

    public wd(sg.v vVar, sg.m0 m0Var, sg.h hVar, float f10) {
        this.f41779c = vVar;
        this.d = m0Var;
        this.f41780e = hVar;
        this.f41778b = f10;
    }
}
