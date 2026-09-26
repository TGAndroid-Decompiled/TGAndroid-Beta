package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ni0 extends org.telegram.ui.Components.bw0 {
    public final g20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.d6 C0;
    public final vi0 D0;
    public final int[] f35892w0;
    public final int[] f35893x0;
    public int f35894y0;
    public final int[] f35895z0;

    public ni0(vi0 vi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = vi0Var;
        this.C0 = d6Var;
        this.f35892w0 = new int[2];
        this.f35893x0 = new int[2];
        this.f35894y0 = 0;
        this.f35895z0 = new int[2];
        this.A0 = new g20();
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28339f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ni0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        vi0 vi0Var = this.D0;
        if (vi0Var.f38753w) {
            if (view != vi0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = vi0Var.Q;
                if (view == u1Var && u1Var != null && u1Var.getCurrentPosition() == null) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }
}
