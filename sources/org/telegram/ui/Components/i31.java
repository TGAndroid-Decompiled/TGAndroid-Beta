package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
public final class i31 extends f6 {
    public final Paint f26875s;
    public final ji.a f26876w;
    public final k31 f26877x;

    public i31(k31 k31Var, Context context) {
        super(context, false, false, false);
        this.f26877x = k31Var;
        this.f26875s = new Paint(1);
        this.f26876w = new ji.a();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (org.telegram.messenger.cd.X) {
            org.telegram.messenger.i0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
        } else {
            org.telegram.messenger.i0.P.set(0.0f, (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
        }
        m31 m31Var = this.f26877x.f27632n;
        int i10 = org.telegram.ui.ActionBar.t6.Dj;
        String[] strArr = m31.O1;
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.1175f, org.telegram.ui.ActionBar.t6.w0(i10, m31Var.I0));
        Paint paint = this.f26875s;
        paint.setColor(r12);
        canvas.drawRoundRect(org.telegram.messenger.i0.P, org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), paint);
        if (this.f26876w.h(canvas)) {
            invalidate();
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        m31 m31Var = this.f26877x.f27632n;
        int action = motionEvent.getAction();
        ji.a aVar = this.f26876w;
        if (action == 0) {
            String[] strArr = m31.O1;
            q80 q80Var = new q80(null, m31Var.I0, motionEvent.getX(), motionEvent.getY(), 0);
            q80Var.d(org.telegram.ui.ActionBar.t6.r1(0.1175f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Dj, m31Var.I0)));
            k80 b10 = q80Var.b();
            if (org.telegram.messenger.cd.X) {
                org.telegram.messenger.i0.P.set(getWidth() - d(), (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, getWidth(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
            } else {
                org.telegram.messenger.i0.P.set(0.0f, (getHeight() - org.telegram.messenger.i0.L(18.0f)) / 2.0f, d(), (org.telegram.messenger.i0.L(18.0f) + getHeight()) / 2.0f);
            }
            b10.addRect(org.telegram.messenger.i0.P, Path.Direction.CW);
            aVar.b(q80Var, null);
            invalidate();
            return true;
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            aVar.f(true);
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }
}
