package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.vp;
import org.telegram.ui.Components.gr;
public final class y9 extends q1 {
    public final GestureDetector f23625hd;
    public final org.telegram.ui.Components.w4 f23626id;
    public final org.telegram.ui.Components.w4 f23627jd;
    public final int f23628kd;
    public final z9 f23629ld;

    public y9(z9 z9Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, Context context2, int i11) {
        super(context, i10, false, null, p6Var);
        this.f23629ld = z9Var;
        this.f23628kd = i11;
        this.f23625hd = new GestureDetector(context2, new lg.f(2, this));
        gr grVar = gr.f26496g;
        this.f23626id = new org.telegram.ui.Components.w4(this, 180L, grVar, 0);
        this.f23627jd = new org.telegram.ui.Components.w4(this, 180L, grVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        kp kpVar;
        jj messageObject = getMessageObject();
        org.telegram.ui.Components.w4 w4Var = this.f23627jd;
        org.telegram.ui.Components.w4 w4Var2 = this.f23626id;
        org.telegram.ui.Components.r8 r8Var = this.f22807z7;
        if (messageObject != null && getMessageObject().f16305c1 >= 0) {
            int i10 = getMessageObject().f16305c1;
            if (i10 >= 14) {
                lp lpVar = vp.r1(d20.f15147s0).f18888r4;
                if (lpVar != null) {
                    kpVar = lpVar.d(i10);
                } else {
                    kpVar = null;
                }
                if (kpVar != null) {
                    int f7 = kpVar.f();
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[org.telegram.ui.Components.r8.f(f7)], this.Ob);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[org.telegram.ui.Components.r8.f(f7)], this.Ob);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[org.telegram.ui.Components.r8.e(j10)], this.Ob);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[org.telegram.ui.Components.r8.e(j10)], this.Ob);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[org.telegram.ui.Components.r8.e(j11)], this.Ob);
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[org.telegram.ui.Components.r8.e(j11)], this.Ob);
            }
            r8Var.i(w4Var2.a(w02, false), w4Var.a(w03, false));
        } else {
            w4Var2.a(r8Var.b(), false);
            w4Var.a(r8Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().N0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().K0, (getMeasuredHeight() - getAvatarImage().N0) - org.telegram.messenger.i0.L(4.0f), getAvatarImage().M0, getAvatarImage().N0);
            getAvatarImage().J0((int) (getAvatarImage().N0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.f23628kd == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23629ld.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f23625hd.onTouchEvent(motionEvent);
        return true;
    }
}
