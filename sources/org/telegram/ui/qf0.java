package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class qf0 extends org.telegram.ui.Components.qt0 {
    public final int[] f48877g0;
    public final int[] f48878h0;
    public int f48879i0;
    public final int[] f48880j0;
    public final k4.j f48881k0;
    public final Paint f48882l0;
    public final org.telegram.ui.ActionBar.e6 m0;
    public final vf0 f48883n0;

    public qf0(vf0 vf0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.f48883n0 = vf0Var;
        this.m0 = e6Var;
        this.f48877g0 = new int[2];
        this.f48878h0 = new int[2];
        this.f48879i0 = 0;
        this.f48880j0 = new int[2];
        this.f48881k0 = new k4.j(24);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
        this.f48882l0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qf0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        vf0 vf0Var = this.f48883n0;
        if (vf0Var.f50501w) {
            if (view != vf0Var.X) {
                org.telegram.ui.Cells.q1 q1Var = vf0Var.Q;
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
