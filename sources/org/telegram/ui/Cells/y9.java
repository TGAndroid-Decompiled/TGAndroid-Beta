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
    public final GestureDetector f30933kd;
    public final org.telegram.ui.Components.z4 f30934ld;
    public final org.telegram.ui.Components.z4 f30935md;
    public final int f30936nd;
    public final z9 f30937od;

    public y9(z9 z9Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var, Context context2, int i10) {
        super(context, i7, false, null, f6Var);
        this.f30937od = z9Var;
        this.f30936nd = i10;
        this.f30933kd = new GestureDetector(context2, new x9(0, this));
        xq xqVar = xq.f40330g;
        this.f30934ld = new org.telegram.ui.Components.z4(this, 180L, xqVar, 0);
        this.f30935md = new org.telegram.ui.Components.z4(this, 180L, xqVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        fp fpVar;
        ij messageObject = getMessageObject();
        org.telegram.ui.Components.z4 z4Var = this.f30935md;
        org.telegram.ui.Components.z4 z4Var2 = this.f30934ld;
        org.telegram.ui.Components.w8 w8Var = this.A7;
        if (messageObject != null && getMessageObject().f23203c1 >= 0) {
            int i7 = getMessageObject().f23203c1;
            if (i7 >= 14) {
                gp gpVar = qp.s1(p10.f24459s0).f24859q4;
                if (gpVar != null) {
                    fpVar = gpVar.d(i7);
                } else {
                    fpVar = null;
                }
                if (fpVar != null) {
                    int f10 = fpVar.f();
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070p8[org.telegram.ui.Components.w8.f(f10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28090q8[org.telegram.ui.Components.w8.f(f10)], this.Pb);
                } else {
                    long j3 = i7;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070p8[org.telegram.ui.Components.w8.e(j3)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28090q8[org.telegram.ui.Components.w8.e(j3)], this.Pb);
                }
            } else {
                long j10 = i7;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28070p8[org.telegram.ui.Components.w8.e(j10)], this.Pb);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28090q8[org.telegram.ui.Components.w8.e(j10)], this.Pb);
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
        } else if (this.f30936nd == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30937od.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f30933kd.onTouchEvent(motionEvent);
        return true;
    }
}
