package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class di0 extends org.telegram.ui.Components.xu0 {
    public final int[] f37543s0;
    public final int[] f37544t0;
    public int f37545u0;
    public final int[] f37546v0;
    public final s10 f37547w0;
    public final Paint f37548x0;
    public final org.telegram.ui.ActionBar.b6 f37549y0;
    public final li0 f37550z0;

    public di0(li0 li0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null);
        this.f37550z0 = li0Var;
        this.f37549y0 = b6Var;
        this.f37543s0 = new int[2];
        this.f37544t0 = new int[2];
        this.f37545u0 = 0;
        this.f37546v0 = new int[2];
        this.f37547w0 = new s10();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f28844f;
        this.f37548x0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.di0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        li0 li0Var = this.f37550z0;
        if (li0Var.f40176w) {
            if (view != li0Var.T) {
                org.telegram.ui.Cells.t1 t1Var = li0Var.M;
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
