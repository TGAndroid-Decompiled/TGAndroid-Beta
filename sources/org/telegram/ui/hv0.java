package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class hv0 extends org.telegram.ui.Cells.s1 {
    public final int Be;
    public final int Ce;
    public final int De;

    public hv0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, c6Var);
        this.Be = i13;
        this.Ce = i11;
        this.De = i12;
    }

    @Override
    public final void Y1(Canvas canvas) {
        switch (this.Be) {
            case 0:
                this.f25327e6 = 0;
                this.f25343f6 = this.U5.size() - 1;
                super.Y1(canvas);
                return;
            default:
                this.f25327e6 = 0;
                this.f25343f6 = this.U5.size() - 1;
                super.Y1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.Be) {
            case 0:
                setMeasuredDimension(this.Ce, this.De);
                return;
            default:
                setMeasuredDimension(this.Ce, this.De);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.Be;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
