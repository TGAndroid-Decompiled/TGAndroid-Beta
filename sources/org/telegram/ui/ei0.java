package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ei0 extends org.telegram.ui.Components.lw0 {
    public final s10 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.d6 C0;
    public final mi0 D0;
    public final int[] f36667w0;
    public final int[] f36668x0;
    public int f36669y0;
    public final int[] f36670z0;

    public ei0(mi0 mi0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = mi0Var;
        this.C0 = d6Var;
        this.f36667w0 = new int[2];
        this.f36668x0 = new int[2];
        this.f36669y0 = 0;
        this.f36670z0 = new int[2];
        this.A0 = new s10();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25024f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ei0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        mi0 mi0Var = this.D0;
        if (mi0Var.v) {
            if (view != mi0Var.W) {
                org.telegram.ui.Cells.u1 u1Var = mi0Var.P;
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
