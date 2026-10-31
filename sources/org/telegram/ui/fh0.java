package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class fh0 extends org.telegram.ui.Components.uu0 {
    public final int[] f37270f0;
    public final int[] f37271g0;
    public int f37272h0;
    public final int[] f37273i0;
    public final li.k f37274j0;
    public final Paint f37275k0;
    public final org.telegram.ui.ActionBar.p6 f37276l0;
    public final kh0 m0;

    public fh0(kh0 kh0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null);
        this.m0 = kh0Var;
        this.f37276l0 = p6Var;
        this.f37270f0 = new int[2];
        this.f37271g0 = new int[2];
        this.f37272h0 = 0;
        this.f37273i0 = new int[2];
        this.f37274j0 = new li.k(23);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26495f;
        this.f37275k0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fh0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        kh0 kh0Var = this.m0;
        if (kh0Var.f38856w) {
            if (view != kh0Var.W) {
                org.telegram.ui.Cells.q1 q1Var = kh0Var.P;
                if (view == q1Var && q1Var != null && q1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
