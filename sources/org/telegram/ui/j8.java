package org.telegram.ui;

import android.view.View;
public final class j8 implements View.OnClickListener {
    public final int f46843a;
    public final boolean[] f46844b;

    public j8(int i7, boolean[] zArr) {
        this.f46843a = i7;
        this.f46844b = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f46843a) {
            case 0:
                boolean[] zArr = this.f46844b;
                boolean z9 = !zArr[0];
                zArr[0] = z9;
                ((org.telegram.ui.Cells.c2) view).c(z9, true);
                return;
            case 1:
                boolean[] zArr2 = this.f46844b;
                boolean z10 = !zArr2[1];
                zArr2[1] = z10;
                ((org.telegram.ui.Cells.c2) view).c(z10, true);
                return;
            case 2:
                boolean[] zArr3 = this.f46844b;
                boolean z11 = !zArr3[0];
                zArr3[0] = z11;
                ((org.telegram.ui.Cells.c2) view).c(z11, true);
                return;
            case 3:
                boolean[] zArr4 = this.f46844b;
                boolean z12 = !zArr4[0];
                zArr4[0] = z12;
                ((org.telegram.ui.Cells.c2) view).c(z12, true);
                return;
            case 4:
                if (view.isEnabled()) {
                    boolean[] zArr5 = this.f46844b;
                    boolean z13 = !zArr5[0];
                    zArr5[0] = z13;
                    ((org.telegram.ui.Cells.c2) view).c(z13, true);
                    return;
                }
                return;
            case 5:
                boolean[] zArr6 = this.f46844b;
                boolean z14 = !zArr6[0];
                zArr6[0] = z14;
                ((org.telegram.ui.Cells.c2) view).c(z14, true);
                return;
            default:
                if (view.isEnabled()) {
                    boolean[] zArr7 = this.f46844b;
                    boolean z15 = !zArr7[0];
                    zArr7[0] = z15;
                    ((org.telegram.ui.Cells.c2) view).c(z15, true);
                    return;
                }
                return;
        }
    }
}
