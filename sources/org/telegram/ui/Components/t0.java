package org.telegram.ui.Components;

import android.view.View;
public final class t0 implements View.OnClickListener {
    public final int f31224a;
    public final boolean[] f31225b;

    public t0(int i10, boolean[] zArr) {
        this.f31224a = i10;
        this.f31225b = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f31224a) {
            case 0:
                boolean[] zArr = this.f31225b;
                boolean z4 = !zArr[0];
                zArr[0] = z4;
                ((org.telegram.ui.Cells.z1) view).c(z4, true);
                return;
            case 1:
                boolean[] zArr2 = this.f31225b;
                boolean z10 = !zArr2[0];
                zArr2[0] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                return;
            case 2:
                boolean[] zArr3 = this.f31225b;
                boolean z11 = !zArr3[0];
                zArr3[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                return;
            case 3:
                boolean[] zArr4 = this.f31225b;
                boolean z12 = !zArr4[0];
                zArr4[0] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                return;
            case 4:
                boolean[] zArr5 = this.f31225b;
                boolean z13 = !zArr5[0];
                zArr5[0] = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                return;
            case 5:
                boolean[] zArr6 = this.f31225b;
                boolean z14 = !zArr6[0];
                zArr6[0] = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                return;
            default:
                boolean[] zArr7 = this.f31225b;
                boolean z15 = !zArr7[0];
                zArr7[0] = z15;
                ((org.telegram.ui.Cells.z1) view).c(z15, true);
                return;
        }
    }
}
