package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class i2 implements Utilities.Callback {
    public final int f26968a = 0;
    public final int f26969b;
    public final int f26970c;
    public final int d;
    public final KeyEvent.Callback f26971e;
    public final Object f26972f;
    public final Object f26973g;

    public i2(int i10, int i11, q3 q3Var, s3 s3Var, int i12, r3 r3Var) {
        this.f26969b = i10;
        this.f26970c = i11;
        this.f26971e = q3Var;
        this.f26972f = s3Var;
        this.d = i12;
        this.f26973g = r3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f26968a) {
            case 0:
                q3 q3Var = (q3) this.f26971e;
                s3 s3Var = (s3) this.f26972f;
                r3 r3Var = (r3) this.f26973g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f26969b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f26970c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = q3Var.getValue();
                    i10 = s3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                q3Var.setMinValue(i14);
                q3Var.setMaxValue(i17);
                if (i11 > i17) {
                    q3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    q3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    s3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    s3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    s3Var.setMinValue(i13);
                    s3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    s3Var.setMinValue(i13);
                    s3Var.setMaxValue(i16);
                } else {
                    s3Var.setMinValue(0);
                    s3Var.setMaxValue(59);
                }
                if (i10 > s3Var.getMaxValue()) {
                    i10 = s3Var.getMaxValue();
                    s3Var.setValue(i10);
                } else if (i10 < s3Var.getMinValue()) {
                    i10 = s3Var.getMinValue();
                    s3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    q3Var.setValue(i11);
                    s3Var.setValue(i10);
                }
                r3Var.invalidate();
                return;
            default:
                zh.w3.E0((zh.w3) this.f26971e, this.f26969b, this.f26970c, this.d, (TL_stars.TL_starGiftUnique) this.f26972f, (ug.n1[]) this.f26973g, (Long) obj);
                return;
        }
    }

    public i2(zh.w3 w3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, ug.n1[] n1VarArr) {
        this.f26971e = w3Var;
        this.f26969b = i10;
        this.f26970c = i11;
        this.d = i12;
        this.f26972f = tL_starGiftUnique;
        this.f26973g = n1VarArr;
    }
}
