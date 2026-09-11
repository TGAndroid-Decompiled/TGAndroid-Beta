package org.telegram.ui.Components;

import android.view.View;
public final class u0 implements View.OnClickListener {
    public final int f30752a;
    public final boolean[] f30753b;

    public u0(int i10, boolean[] zArr) {
        this.f30752a = i10;
        this.f30753b = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f30752a) {
            case 0:
                boolean[] zArr = this.f30753b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.z1) view).c(z10, true);
                return;
            case 1:
                boolean[] zArr2 = this.f30753b;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                ((org.telegram.ui.Cells.z1) view).c(z11, true);
                return;
            case 2:
                boolean[] zArr3 = this.f30753b;
                boolean z12 = !zArr3[0];
                zArr3[0] = z12;
                ((org.telegram.ui.Cells.z1) view).c(z12, true);
                return;
            case 3:
                boolean[] zArr4 = this.f30753b;
                boolean z13 = !zArr4[0];
                zArr4[0] = z13;
                ((org.telegram.ui.Cells.z1) view).c(z13, true);
                return;
            case 4:
                boolean[] zArr5 = this.f30753b;
                boolean z14 = !zArr5[0];
                zArr5[0] = z14;
                ((org.telegram.ui.Cells.z1) view).c(z14, true);
                return;
            case 5:
                boolean[] zArr6 = this.f30753b;
                boolean z15 = !zArr6[0];
                zArr6[0] = z15;
                ((org.telegram.ui.Cells.z1) view).c(z15, true);
                return;
            default:
                boolean[] zArr7 = this.f30753b;
                boolean z16 = !zArr7[0];
                zArr7[0] = z16;
                ((org.telegram.ui.Cells.z1) view).c(z16, true);
                return;
        }
    }
}
