package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class dh0 extends org.telegram.ui.Components.vu0 {
    public final int[] f36604f0;
    public final int[] f36605g0;
    public int f36606h0;
    public final int[] f36607i0;
    public final li.k f36608j0;
    public final Paint f36609k0;
    public final org.telegram.ui.ActionBar.p6 f36610l0;
    public final ih0 m0;

    public dh0(ih0 ih0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, null);
        this.m0 = ih0Var;
        this.f36610l0 = p6Var;
        this.f36604f0 = new int[2];
        this.f36605g0 = new int[2];
        this.f36606h0 = 0;
        this.f36607i0 = new int[2];
        this.f36608j0 = new li.k(23);
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
        this.f36609k0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dh0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ih0 ih0Var = this.m0;
        if (ih0Var.f38086w) {
            if (view != ih0Var.W) {
                org.telegram.ui.Cells.q1 q1Var = ih0Var.P;
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
