package org.telegram.ui.Components;

import android.view.View;

public final class s0 implements View.OnClickListener {

    public final int f32284a;

    public final boolean[] f32285b;

    public s0(int i10, boolean[] zArr) {
        this.f32284a = i10;
        this.f32285b = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f32284a) {
            case 0:
                boolean[] zArr = this.f32285b;
                boolean z10 = !zArr[0];
                zArr[0] = z10;
                ((org.telegram.ui.Cells.y1) view).c(z10, true);
                break;
            case 1:
                boolean[] zArr2 = this.f32285b;
                boolean z11 = !zArr2[0];
                zArr2[0] = z11;
                ((org.telegram.ui.Cells.y1) view).c(z11, true);
                break;
            case 2:
                boolean[] zArr3 = this.f32285b;
                boolean z12 = !zArr3[0];
                zArr3[0] = z12;
                ((org.telegram.ui.Cells.y1) view).c(z12, true);
                break;
            case 3:
                boolean[] zArr4 = this.f32285b;
                boolean z13 = !zArr4[0];
                zArr4[0] = z13;
                ((org.telegram.ui.Cells.y1) view).c(z13, true);
                break;
            case 4:
                boolean[] zArr5 = this.f32285b;
                boolean z14 = !zArr5[0];
                zArr5[0] = z14;
                ((org.telegram.ui.Cells.y1) view).c(z14, true);
                break;
            case 5:
                boolean[] zArr6 = this.f32285b;
                boolean z15 = !zArr6[0];
                zArr6[0] = z15;
                ((org.telegram.ui.Cells.y1) view).c(z15, true);
                break;
            default:
                boolean[] zArr7 = this.f32285b;
                boolean z16 = !zArr7[0];
                zArr7[0] = z16;
                ((org.telegram.ui.Cells.y1) view).c(z16, true);
                break;
        }
    }
}
