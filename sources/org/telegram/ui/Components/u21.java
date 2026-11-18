package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
public final class u21 extends n6 {
    public final Paint f40192s;
    public final n2.o0 f40193w;
    public final w21 f40194x;

    public u21(w21 w21Var, Context context) {
        super(context, false, false, false);
        this.f40194x = w21Var;
        this.f40192s = new Paint(1);
        this.f40193w = new n2.o0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.gd.f24216a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        y21 y21Var = this.f40194x.f41548n;
        int i7 = org.telegram.ui.ActionBar.n6.Gj;
        String[] strArr = y21.S1;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1175f, org.telegram.ui.ActionBar.n6.w0(i7, y21Var.J0));
        Paint paint = this.f40192s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f40193w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        y21 y21Var = this.f40194x.f41548n;
        int action = motionEvent.getAction();
        n2.o0 o0Var = this.f40193w;
        if (action == 0) {
            String[] strArr = y21.S1;
            l80 l80Var = new l80(null, y21Var.J0, motionEvent.getX(), motionEvent.getY(), 0);
            l80Var.d(org.telegram.ui.ActionBar.n6.r1(0.1175f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, y21Var.J0)));
            f80 b10 = l80Var.b();
            if (org.telegram.messenger.gd.f24216a0) {
                org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            } else {
                org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
            o0Var.b(l80Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            o0Var.f(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
