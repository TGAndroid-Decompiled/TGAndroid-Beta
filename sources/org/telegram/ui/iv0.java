package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;

public final class iv0 extends org.telegram.ui.Cells.s1 {
    public final int Be;
    public final int Ce;
    public final int De;

    public iv0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, c6Var);
        this.Be = i13;
        this.Ce = i11;
        this.De = i12;
    }

    @Override
    public final void X1(Canvas canvas) {
        switch (this.Be) {
            case 0:
                this.f25316e6 = 0;
                this.f25331f6 = this.U5.size() - 1;
                super.X1(canvas);
                break;
            default:
                this.f25316e6 = 0;
                this.f25331f6 = this.U5.size() - 1;
                super.X1(canvas);
                break;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.Be) {
            case 0:
                setMeasuredDimension(this.Ce, this.De);
                break;
            default:
                setMeasuredDimension(this.Ce, this.De);
                break;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.Be;
    }

    private final void A4(boolean z10) {
    }

    private final void z4(boolean z10) {
    }
}
