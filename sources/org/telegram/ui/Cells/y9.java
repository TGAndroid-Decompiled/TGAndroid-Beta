package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.wo;
import org.telegram.messenger.xo;
import org.telegram.messenger.zi;
import org.telegram.ui.Components.xq;
public final class y9 extends q1 {
    public final GestureDetector f31012kd;
    public final org.telegram.ui.Components.x4 f31013ld;
    public final org.telegram.ui.Components.x4 f31014md;
    public final int f31015nd;
    public final z9 f31016od;

    public y9(z9 z9Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, Context context2, int i10) {
        super(context, i3, false, null, e6Var);
        this.f31016od = z9Var;
        this.f31015nd = i10;
        this.f31012kd = new GestureDetector(context2, new x9(0, this));
        xq xqVar = xq.f40453g;
        this.f31013ld = new org.telegram.ui.Components.x4(this, 180L, xqVar, 0);
        this.f31014md = new org.telegram.ui.Components.x4(this, 180L, xqVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        wo woVar;
        zi messageObject = getMessageObject();
        org.telegram.ui.Components.x4 x4Var = this.f31014md;
        org.telegram.ui.Components.x4 x4Var2 = this.f31013ld;
        org.telegram.ui.Components.u8 u8Var = this.A7;
        if (messageObject != null && getMessageObject().f26834c1 >= 0) {
            int i3 = getMessageObject().f26834c1;
            if (i3 >= 14) {
                xo xoVar = hp.s1(h10.f22829t0).f23099q4;
                if (xoVar != null) {
                    woVar = xoVar.d(i3);
                } else {
                    woVar = null;
                }
                if (woVar != null) {
                    int f10 = woVar.f();
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.f(f10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[org.telegram.ui.Components.u8.f(f10)], this.Pb);
                } else {
                    long j10 = i3;
                    w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.e(j10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[org.telegram.ui.Components.u8.e(j10)], this.Pb);
                }
            } else {
                long j11 = i3;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.e(j11)], this.Pb);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[org.telegram.ui.Components.u8.e(j11)], this.Pb);
            }
            u8Var.i(x4Var2.a(w02, false), x4Var.a(w03, false));
        } else {
            x4Var2.a(u8Var.b(), false);
            x4Var.a(u8Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().O0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().L0, (getMeasuredHeight() - getAvatarImage().O0) - org.telegram.messenger.g0.L(4.0f), getAvatarImage().N0, getAvatarImage().O0);
            getAvatarImage().J0((int) (getAvatarImage().O0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.f31015nd == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31016od.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f31012kd.onTouchEvent(motionEvent);
        return true;
    }
}
