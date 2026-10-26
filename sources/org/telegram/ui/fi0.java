package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class fi0 extends org.telegram.ui.Components.vw0 {
    public final int[] f39386l0;
    public final int[] m0;
    public int f39387n0;
    public final int[] f39388o0;
    public final w10 f39389p0;
    public final Paint f39390q0;
    public final org.telegram.ui.ActionBar.u6 f39391r0;
    public final ni0 f39392s0;

    public fi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null);
        this.f39392s0 = ni0Var;
        this.f39391r0 = u6Var;
        this.f39386l0 = new int[2];
        this.m0 = new int[2];
        this.f39387n0 = 0;
        this.f39388o0 = new int[2];
        this.f39389p0 = new w10();
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27586f;
        this.f39390q0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ni0 ni0Var = this.f39392s0;
        if (ni0Var.v) {
            if (view != ni0Var.W) {
                org.telegram.ui.Cells.s1 s1Var = ni0Var.P;
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
