package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class qi0 extends org.telegram.ui.Components.cw0 {
    public final j20 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.e6 C0;
    public final yi0 D0;
    public final int[] f36753w0;
    public final int[] f36754x0;
    public int f36755y0;
    public final int[] f36756z0;

    public qi0(yi0 yi0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.D0 = yi0Var;
        this.C0 = e6Var;
        this.f36753w0 = new int[2];
        this.f36754x0 = new int[2];
        this.f36755y0 = 0;
        this.f36756z0 = new int[2];
        this.A0 = new j20();
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.f28359f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        yi0 yi0Var = this.D0;
        if (yi0Var.f40249w) {
            if (view != yi0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = yi0Var.Q;
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
