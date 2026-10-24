package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class hi0 extends org.telegram.ui.Components.nw0 {
    public final w10 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.g6 C0;
    public final pi0 D0;
    public final int[] f37872w0;
    public final int[] f37873x0;
    public int f37874y0;
    public final int[] f37875z0;

    public hi0(pi0 pi0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null);
        this.D0 = pi0Var;
        this.C0 = g6Var;
        this.f37872w0 = new int[2];
        this.f37873x0 = new int[2];
        this.f37874y0 = 0;
        this.f37875z0 = new int[2];
        this.A0 = new w10();
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.f33337f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        pi0 pi0Var = this.D0;
        if (pi0Var.v) {
            if (view != pi0Var.W) {
                org.telegram.ui.Cells.t1 t1Var = pi0Var.P;
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
