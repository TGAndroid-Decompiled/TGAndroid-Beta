package org.telegram.ui;

import android.view.View;

public final class m8 implements View.OnClickListener {

    public final int f40389a;

    public final boolean[] f40390b;

    public m8(int i10, boolean[] zArr) {
        this.f40389a = i10;
        this.f40390b = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40389a) {
            case 0:
                boolean[] zArr = this.f40390b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                break;
            case 1:
                boolean[] zArr2 = this.f40390b;
                boolean z11 = !zArr2[1];
                zArr2[1] = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                break;
            case 2:
                boolean[] zArr3 = this.f40390b;
                boolean z12 = !zArr3[0];
                zArr3[0] = z12;
                ((org.telegram.ui.Cells.y1) view).c(z12, true);
                break;
            case 3:
                boolean[] zArr4 = this.f40390b;
                boolean z13 = !zArr4[0];
                zArr4[0] = z13;
                ((org.telegram.ui.Cells.y1) view).c(z13, true);
                break;
            case 4:
                if (view.isEnabled()) {
                    boolean[] zArr5 = this.f40390b;
                    boolean z14 = !zArr5[0];
                    zArr5[0] = z14;
                    ((org.telegram.ui.Cells.y1) view).c(z14, true);
                    break;
                }
                break;
            case 5:
                boolean[] zArr6 = this.f40390b;
                boolean z15 = !zArr6[0];
                zArr6[0] = z15;
                ((org.telegram.ui.Cells.y1) view).c(z15, true);
                break;
            default:
                if (view.isEnabled()) {
                    boolean[] zArr7 = this.f40390b;
                    boolean z16 = !zArr7[0];
                    zArr7[0] = z16;
                    ((org.telegram.ui.Cells.y1) view).c(z16, true);
                    break;
                }
                break;
        }
    }
}
