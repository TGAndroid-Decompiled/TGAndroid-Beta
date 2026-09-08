package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
public final class kw0 extends org.telegram.ui.Cells.t1 {
    public final int Fe;
    public final int Ge;
    public final int He;

    public kw0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11, int i12, int i13) {
        super(context, i10, false, null, f6Var);
        this.Fe = i13;
        this.Ge = i11;
        this.He = i12;
    }

    @Override
    public final void Y1(Canvas canvas) {
        switch (this.Fe) {
            case 0:
                this.f23000i6 = 0;
                this.f23014j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                return;
            default:
                this.f23000i6 = 0;
                this.f23014j6 = this.Y5.size() - 1;
                super.Y1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        switch (this.Fe) {
            case 0:
                setMeasuredDimension(this.Ge, this.He);
                return;
            default:
                setMeasuredDimension(this.Ge, this.He);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z10) {
        int i10 = this.Fe;
    }

    private final void A4(boolean z10) {
    }

    private final void B4(boolean z10) {
    }
}
