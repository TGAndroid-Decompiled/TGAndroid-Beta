package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class nw0 extends org.telegram.ui.Cells.t1 {
    public final int Ge;
    public final int He;
    public final int Ie;

    public nw0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, f6Var);
        this.Ge = i13;
        this.He = i11;
        this.Ie = i12;
    }

    @Override
    public final void Y1(Canvas canvas) {
        switch (this.Ge) {
            case 0:
                this.f21101i6 = 0;
                this.f21115j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                return;
            default:
                this.f21101i6 = 0;
                this.f21115j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.Ge) {
            case 0:
                setMeasuredDimension(this.He, this.Ie);
                return;
            default:
                setMeasuredDimension(this.He, this.Ie);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.Ge;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
