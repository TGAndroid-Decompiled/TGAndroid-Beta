package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class fi0 extends org.telegram.ui.Components.jw0 {
    public final u10 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.d6 C0;
    public final ni0 D0;
    public final int[] f36917w0;
    public final int[] f36918x0;
    public int f36919y0;
    public final int[] f36920z0;

    public fi0(ni0 ni0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = ni0Var;
        this.C0 = d6Var;
        this.f36917w0 = new int[2];
        this.f36918x0 = new int[2];
        this.f36919y0 = 0;
        this.f36920z0 = new int[2];
        this.A0 = new u10();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25030f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ni0 ni0Var = this.D0;
        if (ni0Var.f39476w) {
            if (view != ni0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = ni0Var.Q;
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
