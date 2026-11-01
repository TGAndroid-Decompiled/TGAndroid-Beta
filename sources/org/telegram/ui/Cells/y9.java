package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.lp;
import org.telegram.messenger.mp;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.gr;
public final class y9 extends q1 {
    public final GestureDetector f23626hd;
    public final org.telegram.ui.Components.w4 f23627id;
    public final org.telegram.ui.Components.w4 f23628jd;
    public final int f23629kd;
    public final z9 f23630ld;

    public y9(z9 z9Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, Context context2, int i11) {
        super(context, i10, false, null, p6Var);
        this.f23630ld = z9Var;
        this.f23629kd = i11;
        this.f23626hd = new GestureDetector(context2, new lg.f(2, this));
        gr grVar = gr.f26524g;
        this.f23627id = new org.telegram.ui.Components.w4(this, 180L, grVar, 0);
        this.f23628jd = new org.telegram.ui.Components.w4(this, 180L, grVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        lp lpVar;
        kj messageObject = getMessageObject();
        org.telegram.ui.Components.w4 w4Var = this.f23628jd;
        org.telegram.ui.Components.w4 w4Var2 = this.f23627id;
        org.telegram.ui.Components.r8 r8Var = this.f22808z7;
        if (messageObject != null && getMessageObject().f16658c1 >= 0) {
            int i10 = getMessageObject().f16658c1;
            if (i10 >= 14) {
                mp mpVar = wp.r1(e20.f15506s0).f19231r4;
                if (mpVar != null) {
                    lpVar = mpVar.d(i10);
                } else {
                    lpVar = null;
                }
                if (lpVar != null) {
                    int f7 = lpVar.f();
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21155p8[org.telegram.ui.Components.r8.f(f7)], this.Ob);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21172q8[org.telegram.ui.Components.r8.f(f7)], this.Ob);
                } else {
                    long j10 = i10;
                    w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21155p8[org.telegram.ui.Components.r8.e(j10)], this.Ob);
                    w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21172q8[org.telegram.ui.Components.r8.e(j10)], this.Ob);
                }
            } else {
                long j11 = i10;
                w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21155p8[org.telegram.ui.Components.r8.e(j11)], this.Ob);
                w03 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21172q8[org.telegram.ui.Components.r8.e(j11)], this.Ob);
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
        } else if (this.f23629kd == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f23630ld.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f23626hd.onTouchEvent(motionEvent);
        return true;
    }
}
