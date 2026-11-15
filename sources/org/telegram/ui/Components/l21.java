package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
public final class l21 extends h6 {
    public final Paint f36716s;
    public final n2.o0 f36717w;
    public final n21 f36718x;

    public l21(n21 n21Var, Context context) {
        super(context, false, false, false);
        this.f36718x = n21Var;
        this.f36716s = new Paint(1);
        this.f36717w = new n2.o0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.hd.f24101a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        p21 p21Var = this.f36718x.f37440n;
        int i7 = org.telegram.ui.ActionBar.j6.Gj;
        String[] strArr = p21.S1;
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.1175f, org.telegram.ui.ActionBar.j6.w0(i7, p21Var.J0));
        Paint paint = this.f36716s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f36717w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p21 p21Var = this.f36718x.f37440n;
        int action = motionEvent.getAction();
        n2.o0 o0Var = this.f36717w;
        if (action == 0) {
            String[] strArr = p21.S1;
            a80 a80Var = new a80(null, p21Var.J0, motionEvent.getX(), motionEvent.getY(), 0);
            a80Var.d(org.telegram.ui.ActionBar.j6.r1(0.1175f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Gj, p21Var.J0)));
            u70 b10 = a80Var.b();
            if (org.telegram.messenger.hd.f24101a0) {
                org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            } else {
                org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
            o0Var.b(a80Var, null);
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
