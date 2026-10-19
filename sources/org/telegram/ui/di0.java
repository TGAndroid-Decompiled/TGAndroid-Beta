package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class di0 extends org.telegram.ui.Components.kw0 {
    public final s10 A0;
    public final Paint B0;
    public final org.telegram.ui.ActionBar.d6 C0;
    public final li0 D0;
    public final int[] f36395w0;
    public final int[] f36396x0;
    public int f36397y0;
    public final int[] f36398z0;

    public di0(li0 li0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null);
        this.D0 = li0Var;
        this.C0 = d6Var;
        this.f36395w0 = new int[2];
        this.f36396x0 = new int[2];
        this.f36397y0 = 0;
        this.f36398z0 = new int[2];
        this.A0 = new s10();
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.f25014f;
        this.B0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.di0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        li0 li0Var = this.D0;
        if (li0Var.f38958w) {
            if (view != li0Var.X) {
                org.telegram.ui.Cells.u1 u1Var = li0Var.Q;
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
