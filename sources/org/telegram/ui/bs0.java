package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class bs0 extends org.telegram.ui.Cells.q1 {
    public final int f44123ld;
    public final int f44124md;
    public final int f44125nd;

    public bs0(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10, int i11, int i12) {
        super(context, i7, false, null, h6Var);
        this.f44123ld = i12;
        this.f44124md = i10;
        this.f44125nd = i11;
    }

    @Override
    public final void j1(Canvas canvas) {
        switch (this.f44123ld) {
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
        switch (this.f44123ld) {
            case 0:
                setMeasuredDimension(this.f44124md, this.f44125nd);
                return;
            default:
                setMeasuredDimension(this.f44124md, this.f44125nd);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z9) {
        int i7 = this.f44123ld;
    }

    private final void d4(boolean z9) {
    }

    private final void e4(boolean z9) {
    }
}
