package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class jt0 extends org.telegram.ui.Cells.q1 {
    public final int f38585hd;
    public final int f38586id;
    public final int f38587jd;

    public jt0(Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, p6Var);
        this.f38585hd = i13;
        this.f38586id = i11;
        this.f38587jd = i12;
    }

    @Override
    public final void h1(Canvas canvas) {
        switch (this.f38585hd) {
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
        switch (this.f38585hd) {
            case 0:
                setMeasuredDimension(this.f38586id, this.f38587jd);
                return;
            default:
                setMeasuredDimension(this.f38586id, this.f38587jd);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.f38585hd;
    }

    private final void Z3(boolean z10) {
    }

    private final void a4(boolean z10) {
    }
}
