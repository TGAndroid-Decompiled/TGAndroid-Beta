package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
public final class w21 extends n6 {
    public final Paint f41495s;
    public final n2.p0 f41496w;
    public final y21 f41497x;

    public w21(y21 y21Var, Context context) {
        super(context, false, false, false);
        this.f41497x = y21Var;
        this.f41495s = new Paint(1);
        this.f41496w = new n2.p0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.gd.f24314a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        a31 a31Var = this.f41497x.f42313n;
        int i7 = org.telegram.ui.ActionBar.n6.Gj;
        String[] strArr = a31.S1;
        int r12 = org.telegram.ui.ActionBar.n6.r1(0.1175f, org.telegram.ui.ActionBar.n6.w0(i7, a31Var.J0));
        Paint paint = this.f41495s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f41496w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a31 a31Var = this.f41497x.f42313n;
        int action = motionEvent.getAction();
        n2.p0 p0Var = this.f41496w;
        if (action == 0) {
            String[] strArr = a31.S1;
            k80 k80Var = new k80(null, a31Var.J0, motionEvent.getX(), motionEvent.getY(), 0);
            k80Var.d(org.telegram.ui.ActionBar.n6.r1(0.1175f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Gj, a31Var.J0)));
            e80 b10 = k80Var.b();
            if (org.telegram.messenger.gd.f24314a0) {
                org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            } else {
                org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
            p0Var.b(k80Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            p0Var.f(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
