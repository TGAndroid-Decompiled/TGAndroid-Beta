package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class li0 extends org.telegram.ui.Components.pv0 {
    public final ti0 A0;
    public final int[] f38657t0;
    public final int[] f38658u0;
    public int f38659v0;
    public final int[] f38660w0;
    public final h20 f38661x0;
    public final Paint f38662y0;
    public final org.telegram.ui.ActionBar.g6 f38663z0;

    public li0(ti0 ti0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.A0 = ti0Var;
        this.f38663z0 = g6Var;
        this.f38657t0 = new int[2];
        this.f38658u0 = new int[2];
        this.f38659v0 = 0;
        this.f38660w0 = new int[2];
        this.f38661x0 = new h20();
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f30168f;
        this.f38662y0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.li0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ti0 ti0Var = this.A0;
        if (ti0Var.f41576w) {
            if (view != ti0Var.U) {
                org.telegram.ui.Cells.t1 t1Var = ti0Var.N;
                if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
