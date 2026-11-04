package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class or0 extends org.telegram.ui.Cells.q1 {
    public final int f48335kd;
    public final int f48336ld;
    public final int f48337md;

    public or0(Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11, int i12) {
        super(context, i3, false, null, e6Var);
        this.f48335kd = i12;
        this.f48336ld = i10;
        this.f48337md = i11;
    }

    @Override
    public final void j1(Canvas canvas) {
        switch (this.f48335kd) {
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
    public final void onMeasure(int i3, int i10) {
        switch (this.f48335kd) {
            case 0:
                setMeasuredDimension(this.f48336ld, this.f48337md);
                return;
            default:
                setMeasuredDimension(this.f48336ld, this.f48337md);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i3 = this.f48335kd;
    }

    private final void b4(boolean z10) {
    }

    private final void c4(boolean z10) {
    }
}
