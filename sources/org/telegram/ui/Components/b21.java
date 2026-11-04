package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
public final class b21 extends h6 {
    public final Paint f32066s;
    public final m2.p0 f32067w;
    public final d21 f32068x;

    public b21(d21 d21Var, Context context) {
        super(context, false, false, false);
        this.f32068x = d21Var;
        this.f32066s = new Paint(1);
        this.f32067w = new m2.p0();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.bd.f21784a0) {
            org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
        }
        f21 f21Var = this.f32068x.f32922n;
        int i3 = org.telegram.ui.ActionBar.k6.Dj;
        String[] strArr = f21.P1;
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.1175f, org.telegram.ui.ActionBar.k6.w0(i3, f21Var.J0));
        Paint paint = this.f32066s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.g0.P, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), paint);
        if (this.f32067w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f21 f21Var = this.f32068x.f32922n;
        int action = motionEvent.getAction();
        m2.p0 p0Var = this.f32067w;
        if (action == 0) {
            String[] strArr = f21.P1;
            t70 t70Var = new t70(null, f21Var.J0, motionEvent.getX(), motionEvent.getY(), 0);
            t70Var.d(org.telegram.ui.ActionBar.k6.r1(0.1175f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Dj, f21Var.J0)));
            n70 b10 = t70Var.b();
            if (org.telegram.messenger.bd.f21784a0) {
                org.telegram.messenger.g0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            } else {
                org.telegram.messenger.g0.P.set(0.0f, (getHeight() - org.telegram.messenger.g0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.g0.L(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(org.telegram.messenger.g0.P, Path.Direction.CW);
            p0Var.b(t70Var, null);
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
