package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
public final class x21 extends o6 {
    public final Paint f41956s;
    public final n2.o0 f41957w;
    public final z21 f41958x;

    public x21(z21 z21Var, Context context) {
        super(context, false, false, false);
        this.f41958x = z21Var;
        this.f41956s = new Paint(1);
        this.f41957w = new n2.o0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.hd.f24444a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        b31 b31Var = this.f41958x.f42660n;
        int i7 = org.telegram.ui.ActionBar.m6.Gj;
        String[] strArr = b31.S1;
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.1175f, org.telegram.ui.ActionBar.m6.w0(i7, b31Var.J0));
        Paint paint = this.f41956s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f41957w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b31 b31Var = this.f41958x.f42660n;
        int action = motionEvent.getAction();
        n2.o0 o0Var = this.f41957w;
        if (action == 0) {
            String[] strArr = b31.S1;
            n80 n80Var = new n80(null, b31Var.J0, motionEvent.getX(), motionEvent.getY(), 0);
            n80Var.d(org.telegram.ui.ActionBar.m6.r1(0.1175f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Gj, b31Var.J0)));
            h80 b10 = n80Var.b();
            if (org.telegram.messenger.hd.f24444a0) {
                org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            } else {
                org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
            o0Var.b(n80Var, null);
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
