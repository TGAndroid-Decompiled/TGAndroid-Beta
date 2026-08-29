package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ci0 extends org.telegram.ui.Components.hv0 {
    public final int[] f37135s0;
    public final int[] f37136t0;
    public int f37137u0;
    public final int[] f37138v0;
    public final u10 f37139w0;
    public final Paint f37140x0;
    public final org.telegram.ui.ActionBar.c6 f37141y0;
    public final ki0 f37142z0;

    public ci0(ki0 ki0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null);
        this.f37142z0 = ki0Var;
        this.f37141y0 = c6Var;
        this.f37135s0 = new int[2];
        this.f37136t0 = new int[2];
        this.f37137u0 = 0;
        this.f37138v0 = new int[2];
        this.f37139w0 = new u10();
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.f29800f;
        this.f37140x0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ci0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ki0 ki0Var = this.f37142z0;
        if (ki0Var.f39901w) {
            if (view != ki0Var.T) {
                org.telegram.ui.Cells.s1 s1Var = ki0Var.M;
                if (view == s1Var && s1Var != null && s1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
