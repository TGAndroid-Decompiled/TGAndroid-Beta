package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
public final class f21 extends j6 {
    public final Paint f33446s;
    public final n2.n0 f33447w;
    public final h21 f33448x;

    public f21(h21 h21Var, Context context) {
        super(context, false, false, false);
        this.f33448x = h21Var;
        this.f33446s = new Paint(1);
        this.f33447w = new n2.n0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.hd.f22871a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        j21 j21Var = this.f33448x.f34153n;
        int i7 = org.telegram.ui.ActionBar.k6.Dj;
        String[] strArr = j21.O1;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1175f, org.telegram.ui.ActionBar.k6.w0(i7, j21Var.I0));
        Paint paint = this.f33446s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f33447w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j21 j21Var = this.f33448x.f34153n;
        int action = motionEvent.getAction();
        n2.n0 n0Var = this.f33447w;
        if (action == 0) {
            String[] strArr = j21.O1;
            x70 x70Var = new x70(null, j21Var.I0, motionEvent.getX(), motionEvent.getY(), 0);
            x70Var.d(org.telegram.ui.ActionBar.k6.r1(0.1175f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, j21Var.I0)));
            r70 b10 = x70Var.b();
            if (org.telegram.messenger.hd.f22871a0) {
                org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            } else {
                org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
            n0Var.b(x70Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            n0Var.f(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
