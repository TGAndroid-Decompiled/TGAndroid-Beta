package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ki0 extends org.telegram.ui.Components.qv0 {
    public final si0 A0;
    public final int[] f35734t0;
    public final int[] f35735u0;
    public int f35736v0;
    public final int[] f35737w0;
    public final g20 f35738x0;
    public final Paint f35739y0;
    public final org.telegram.ui.ActionBar.f6 f35740z0;

    public ki0(si0 si0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.A0 = si0Var;
        this.f35740z0 = f6Var;
        this.f35734t0 = new int[2];
        this.f35735u0 = new int[2];
        this.f35736v0 = 0;
        this.f35737w0 = new int[2];
        this.f35738x0 = new g20();
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.f27346f;
        this.f35739y0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ki0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        si0 si0Var = this.A0;
        if (si0Var.f38378w) {
            if (view != si0Var.U) {
                org.telegram.ui.Cells.t1 t1Var = si0Var.N;
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
