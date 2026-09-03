package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class mi0 extends org.telegram.ui.Components.qv0 {
    public final ui0 A0;
    public final int[] f36097t0;
    public final int[] f36098u0;
    public int f36099v0;
    public final int[] f36100w0;
    public final i20 f36101x0;
    public final Paint f36102y0;
    public final org.telegram.ui.ActionBar.f6 f36103z0;

    public mi0(ui0 ui0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.A0 = ui0Var;
        this.f36103z0 = f6Var;
        this.f36097t0 = new int[2];
        this.f36098u0 = new int[2];
        this.f36099v0 = 0;
        this.f36100w0 = new int[2];
        this.f36101x0 = new i20();
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f27122f;
        this.f36102y0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mi0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ui0 ui0Var = this.A0;
        if (ui0Var.f38853w) {
            if (view != ui0Var.U) {
                org.telegram.ui.Cells.s1 s1Var = ui0Var.N;
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
