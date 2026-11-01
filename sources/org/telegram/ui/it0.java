package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class it0 extends org.telegram.ui.Cells.q1 {
    public final int f38168hd;
    public final int f38169id;
    public final int f38170jd;

    public it0(Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, p6Var);
        this.f38168hd = i13;
        this.f38169id = i11;
        this.f38170jd = i12;
    }

    @Override
    public final void h1(Canvas canvas) {
        switch (this.f38168hd) {
            case 0:
                this.Q4 = 0;
                this.R4 = this.O4.size() - 1;
                super.h1(canvas);
                return;
            default:
                this.Q4 = 0;
                this.R4 = this.O4.size() - 1;
                super.h1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.f38168hd) {
            case 0:
                setMeasuredDimension(this.f38169id, this.f38170jd);
                return;
            default:
                setMeasuredDimension(this.f38169id, this.f38170jd);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.f38168hd;
    }

    private final void Z3(boolean z10) {
    }

    private final void a4(boolean z10) {
    }
}
