package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class hi0 extends org.telegram.ui.Components.ww0 {
    public final int[] f39900l0;
    public final int[] m0;
    public int f39901n0;
    public final int[] f39902o0;
    public final y10 f39903p0;
    public final Paint f39904q0;
    public final org.telegram.ui.ActionBar.u6 f39905r0;
    public final pi0 f39906s0;

    public hi0(pi0 pi0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null);
        this.f39906s0 = pi0Var;
        this.f39905r0 = u6Var;
        this.f39900l0 = new int[2];
        this.m0 = new int[2];
        this.f39901n0 = 0;
        this.f39902o0 = new int[2];
        this.f39903p0 = new y10();
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f27530f;
        this.f39904q0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        pi0 pi0Var = this.f39906s0;
        if (pi0Var.v) {
            if (view != pi0Var.W) {
                org.telegram.ui.Cells.s1 s1Var = pi0Var.P;
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
