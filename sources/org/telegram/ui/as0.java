package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class as0 extends org.telegram.ui.Cells.q1 {
    public final int f43773ld;
    public final int f43774md;
    public final int f43775nd;

    public as0(Context context, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, g6Var);
        this.f43773ld = i12;
        this.f43774md = i10;
        this.f43775nd = i11;
    }

    @Override
    public final void j1(Canvas canvas) {
        switch (this.f43773ld) {
            case 0:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                return;
            default:
                this.R4 = 0;
                this.S4 = this.P4.size() - 1;
                super.j1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f43773ld) {
            case 0:
                setMeasuredDimension(this.f43774md, this.f43775nd);
                return;
            default:
                setMeasuredDimension(this.f43774md, this.f43775nd);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z9) {
        int i7 = this.f43773ld;
    }

    private final void d4(boolean z9) {
    }

    private final void e4(boolean z9) {
    }
}
