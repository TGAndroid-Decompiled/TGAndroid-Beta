package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j2 implements Utilities.Callback {
    public final int f24190a = 0;
    public final int f24191b;
    public final int f24192c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f24193f;
    public final Object f24194g;

    public j2(int i10, int i11, p3 p3Var, r3 r3Var, int i12, q3 q3Var) {
        this.f24191b = i10;
        this.f24192c = i11;
        this.e = p3Var;
        this.f24193f = r3Var;
        this.d = i12;
        this.f24194g = q3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f24190a) {
            case 0:
                p3 p3Var = (p3) this.e;
                r3 r3Var = (r3) this.f24193f;
                q3 q3Var = (q3) this.f24194g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f24191b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f24192c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = p3Var.getValue();
                    i10 = r3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                p3Var.setMinValue(i14);
                p3Var.setMaxValue(i17);
                if (i11 > i17) {
                    p3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    p3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    r3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    r3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    r3Var.setMinValue(i13);
                    r3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    r3Var.setMinValue(i13);
                    r3Var.setMaxValue(i16);
                } else {
                    r3Var.setMinValue(0);
                    r3Var.setMaxValue(59);
                }
                if (i10 > r3Var.getMaxValue()) {
                    i10 = r3Var.getMaxValue();
                    r3Var.setValue(i10);
                } else if (i10 < r3Var.getMinValue()) {
                    i10 = r3Var.getMinValue();
                    r3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    p3Var.setValue(i11);
                    r3Var.setValue(i10);
                }
                q3Var.invalidate();
                return;
            default:
                xh.x3.E0((xh.x3) this.e, this.f24191b, this.f24192c, this.d, (TL_stars.TL_starGiftUnique) this.f24193f, (sg.p1[]) this.f24194g, (Long) obj);
                return;
        }
    }

    public j2(xh.x3 x3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, sg.p1[] p1VarArr) {
        this.e = x3Var;
        this.f24191b = i10;
        this.f24192c = i11;
        this.d = i12;
        this.f24193f = tL_starGiftUnique;
        this.f24194g = p1VarArr;
    }
}
