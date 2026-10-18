package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class gi0 extends org.telegram.ui.Components.jw0 {
    public final u10 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.d6 C0;
    public final oi0 D0;
    public final int[] f37218w0;
    public final int[] f37219x0;
    public int f37220y0;
    public final int[] f37221z0;

    public gi0(oi0 oi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = oi0Var;
        this.C0 = d6Var;
        this.f37218w0 = new int[2];
        this.f37219x0 = new int[2];
        this.f37220y0 = 0;
        this.f37221z0 = new int[2];
        this.A0 = new u10();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25037f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        oi0 oi0Var = this.D0;
        if (oi0Var.f39836w) {
            if (view != oi0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = oi0Var.Q;
                if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j10);
    }
}
