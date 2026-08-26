package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Cells.CheckBoxCell;

public final class ChatActivity$$ExternalSyntheticLambda342 implements View.OnClickListener {
    public final int $r8$classId;
    public final boolean[] f$0;

    public ChatActivity$$ExternalSyntheticLambda342(int i, boolean[] zArr) {
        this.$r8$classId = i;
        this.f$0 = zArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                boolean[] zArr = this.f$0;
                boolean z = !zArr[1];
                zArr[1] = z;
                ((CheckBoxCell) view).setChecked(z, true);
                break;
            case 1:
                boolean[] zArr2 = this.f$0;
                boolean z2 = !zArr2[0];
                zArr2[0] = z2;
                ((CheckBoxCell) view).setChecked(z2, true);
                break;
            case 2:
                boolean[] zArr3 = this.f$0;
                boolean z3 = !zArr3[0];
                zArr3[0] = z3;
                ((CheckBoxCell) view).setChecked(z3, true);
                break;
            case 3:
                boolean[] zArr4 = this.f$0;
                boolean z4 = !zArr4[0];
                zArr4[0] = z4;
                ((CheckBoxCell) view).setChecked(z4, true);
                break;
            case 4:
                boolean[] zArr5 = this.f$0;
                boolean z5 = !zArr5[0];
                zArr5[0] = z5;
                ((CheckBoxCell) view).setChecked(z5, true);
                break;
            case 5:
                boolean[] zArr6 = this.f$0;
                boolean z6 = !zArr6[0];
                zArr6[0] = z6;
                ((CheckBoxCell) view).setChecked(z6, true);
                break;
            case 6:
                boolean[] zArr7 = this.f$0;
                boolean z7 = !zArr7[0];
                zArr7[0] = z7;
                ((CheckBoxCell) view).setChecked(z7, true);
                break;
            case 7:
                boolean[] zArr8 = this.f$0;
                boolean z8 = !zArr8[0];
                zArr8[0] = z8;
                ((CheckBoxCell) view).setChecked(z8, true);
                break;
            case 8:
                boolean[] zArr9 = this.f$0;
                boolean z9 = !zArr9[0];
                zArr9[0] = z9;
                ((CheckBoxCell) view).setChecked(z9, true);
                break;
            case 9:
                boolean[] zArr10 = this.f$0;
                boolean z10 = !zArr10[0];
                zArr10[0] = z10;
                ((CheckBoxCell) view).setChecked(z10, true);
                break;
            case 10:
                boolean[] zArr11 = this.f$0;
                boolean z11 = !zArr11[0];
                zArr11[0] = z11;
                ((CheckBoxCell) view).setChecked(z11, true);
                break;
            case 11:
                if (view.isEnabled()) {
                    boolean[] zArr12 = this.f$0;
                    boolean z12 = !zArr12[0];
                    zArr12[0] = z12;
                    ((CheckBoxCell) view).setChecked(z12, true);
                    break;
                }
                break;
            case 12:
                boolean[] zArr13 = this.f$0;
                boolean z13 = !zArr13[0];
                zArr13[0] = z13;
                ((CheckBoxCell) view).setChecked(z13, true);
                break;
            default:
                if (view.isEnabled()) {
                    boolean[] zArr14 = this.f$0;
                    boolean z14 = !zArr14[0];
                    zArr14[0] = z14;
                    ((CheckBoxCell) view).setChecked(z14, true);
                    break;
                }
                break;
        }
    }
}
