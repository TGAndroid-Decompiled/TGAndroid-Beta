package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class hv0 extends org.telegram.ui.Cells.t1 {
    public final int Be;
    public final int Ce;
    public final int De;

    public hv0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10, int i11, int i12) {
        super(context, i9, false, null, b6Var);
        this.Be = i12;
        this.Ce = i10;
        this.De = i11;
    }

    @Override
    public final void Y1(Canvas canvas) {
        switch (this.Be) {
            case 0:
                this.f25363e6 = 0;
                this.f25378f6 = this.U5.size() - 1;
                super.Y1(canvas);
                return;
            default:
                this.f25363e6 = 0;
                this.f25378f6 = this.U5.size() - 1;
                super.Y1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
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
        int i9 = this.Be;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
