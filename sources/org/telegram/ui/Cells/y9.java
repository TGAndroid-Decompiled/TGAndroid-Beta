package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.fp;
import org.telegram.messenger.gp;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.xq;
public final class y9 extends q1 {
    public final GestureDetector f30943ld;
    public final org.telegram.ui.Components.z4 f30944md;
    public final org.telegram.ui.Components.z4 f30945nd;
    public final int f30946od;
    public final z9 f30947pd;

    public y9(z9 z9Var, Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, Context context2, int i10) {
        super(context, i7, false, null, g6Var);
        this.f30947pd = z9Var;
        this.f30946od = i10;
        this.f30943ld = new GestureDetector(context2, new x9(0, this));
        xq xqVar = xq.f40459g;
        this.f30944md = new org.telegram.ui.Components.z4(this, 180L, xqVar, 0);
        this.f30945nd = new org.telegram.ui.Components.z4(this, 180L, xqVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        fp fpVar;
        ij messageObject = getMessageObject();
        org.telegram.ui.Components.z4 z4Var = this.f30945nd;
        org.telegram.ui.Components.z4 z4Var2 = this.f30944md;
        org.telegram.ui.Components.w8 w8Var = this.A7;
        if (messageObject != null && getMessageObject().f23228c1 >= 0) {
            int i7 = getMessageObject().f23228c1;
            if (i7 >= 14) {
                gp gpVar = qp.s1(p10.f24470s0).f24874q4;
                if (gpVar != null) {
                    fpVar = gpVar.d(i7);
                } else {
                    fpVar = null;
                }
                if (fpVar != null) {
                    int f10 = fpVar.f();
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28087p8[org.telegram.ui.Components.w8.f(f10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28107q8[org.telegram.ui.Components.w8.f(f10)], this.Pb);
                } else {
                    long j3 = i7;
                    w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28087p8[org.telegram.ui.Components.w8.e(j3)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28107q8[org.telegram.ui.Components.w8.e(j3)], this.Pb);
                }
            } else {
                long j10 = i7;
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28087p8[org.telegram.ui.Components.w8.e(j10)], this.Pb);
                w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28107q8[org.telegram.ui.Components.w8.e(j10)], this.Pb);
            }
            w8Var.i(z4Var2.a(w02, false), z4Var.a(w03, false));
        } else {
            z4Var2.a(w8Var.b(), false);
            z4Var.a(w8Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().N0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().K0, (getMeasuredHeight() - getAvatarImage().N0) - org.telegram.messenger.g0.L(4.0f), getAvatarImage().M0, getAvatarImage().N0);
            getAvatarImage().J0((int) (getAvatarImage().N0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.f30946od == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30947pd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f30943ld.onTouchEvent(motionEvent);
        return true;
    }
}
