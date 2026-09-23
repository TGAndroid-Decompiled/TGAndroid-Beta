package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class oi0 extends org.telegram.ui.Components.pv0 {
    public final i20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.d6 C0;
    public final wi0 D0;
    public final int[] f35886w0;
    public final int[] f35887x0;
    public int f35888y0;
    public final int[] f35889z0;

    public oi0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = wi0Var;
        this.C0 = d6Var;
        this.f35886w0 = new int[2];
        this.f35887x0 = new int[2];
        this.f35888y0 = 0;
        this.f35889z0 = new int[2];
        this.A0 = new i20();
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f27701f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        wi0 wi0Var = this.D0;
        if (wi0Var.f39024w) {
            if (view != wi0Var.X) {
                org.telegram.ui.Cells.t1 t1Var = wi0Var.Q;
                if (view == t1Var && t1Var != null && t1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
