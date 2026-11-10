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
import org.telegram.ui.Components.wq;
public final class y9 extends q1 {
    public final GestureDetector f30954ld;
    public final org.telegram.ui.Components.y4 f30955md;
    public final org.telegram.ui.Components.y4 f30956nd;
    public final int f30957od;
    public final z9 f30958pd;

    public y9(z9 z9Var, Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, Context context2, int i10) {
        super(context, i7, false, null, h6Var);
        this.f30958pd = z9Var;
        this.f30957od = i10;
        this.f30954ld = new GestureDetector(context2, new x9(0, this));
        wq wqVar = wq.f40047g;
        this.f30955md = new org.telegram.ui.Components.y4(this, 180L, wqVar, 0);
        this.f30956nd = new org.telegram.ui.Components.y4(this, 180L, wqVar, 0);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02;
        int w03;
        fp fpVar;
        ij messageObject = getMessageObject();
        org.telegram.ui.Components.y4 y4Var = this.f30956nd;
        org.telegram.ui.Components.y4 y4Var2 = this.f30955md;
        org.telegram.ui.Components.v8 v8Var = this.A7;
        if (messageObject != null && getMessageObject().f23232c1 >= 0) {
            int i7 = getMessageObject().f23232c1;
            if (i7 >= 14) {
                gp gpVar = qp.s1(p10.f24474s0).f24878q4;
                if (gpVar != null) {
                    fpVar = gpVar.d(i7);
                } else {
                    fpVar = null;
                }
                if (fpVar != null) {
                    int f10 = fpVar.f();
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[org.telegram.ui.Components.v8.f(f10)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[org.telegram.ui.Components.v8.f(f10)], this.Pb);
                } else {
                    long j3 = i7;
                    w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[org.telegram.ui.Components.v8.e(j3)], this.Pb);
                    w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[org.telegram.ui.Components.v8.e(j3)], this.Pb);
                }
            } else {
                long j10 = i7;
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[org.telegram.ui.Components.v8.e(j10)], this.Pb);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[org.telegram.ui.Components.v8.e(j10)], this.Pb);
            }
            v8Var.i(y4Var2.a(w02, false), y4Var.a(w03, false));
        } else {
            y4Var2.a(v8Var.b(), false);
            y4Var.a(v8Var.c(), false);
        }
        if (getAvatarImage() != null && getAvatarImage().N0 != 0.0f) {
            getAvatarImage().y0(getAvatarImage().K0, (getMeasuredHeight() - getAvatarImage().N0) - org.telegram.messenger.g0.L(4.0f), getAvatarImage().M0, getAvatarImage().N0);
            getAvatarImage().J0((int) (getAvatarImage().N0 / 2.0f));
            getAvatarImage().h(canvas, null);
        } else if (this.f30957od == 2) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f30958pd.a()) {
            return super.onTouchEvent(motionEvent);
        }
        this.f30954ld.onTouchEvent(motionEvent);
        return true;
    }
}
