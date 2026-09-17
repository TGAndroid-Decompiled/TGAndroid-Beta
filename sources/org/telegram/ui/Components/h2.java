package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class h2 implements Utilities.Callback {
    public final int f24460a = 0;
    public final int f24461b;
    public final int f24462c;
    public final int d;
    public final KeyEvent.Callback e;
    public final Object f24463f;
    public final Object f24464g;

    public h2(int i10, int i11, o3 o3Var, q3 q3Var, int i12, p3 p3Var) {
        this.f24461b = i10;
        this.f24462c = i11;
        this.e = o3Var;
        this.f24463f = q3Var;
        this.d = i12;
        this.f24464g = p3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f24460a) {
            case 0:
                o3 o3Var = (o3) this.e;
                q3 q3Var = (q3) this.f24463f;
                p3 p3Var = (p3) this.f24464g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f24461b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f24462c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = o3Var.getValue();
                    i10 = q3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                o3Var.setMinValue(i14);
                o3Var.setMaxValue(i17);
                if (i11 > i17) {
                    o3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    o3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    q3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    q3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    q3Var.setMinValue(i13);
                    q3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    q3Var.setMinValue(i13);
                    q3Var.setMaxValue(i16);
                } else {
                    q3Var.setMinValue(0);
                    q3Var.setMaxValue(59);
                }
                if (i10 > q3Var.getMaxValue()) {
                    i10 = q3Var.getMaxValue();
                    q3Var.setValue(i10);
                } else if (i10 < q3Var.getMinValue()) {
                    i10 = q3Var.getMinValue();
                    q3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    o3Var.setValue(i11);
                    q3Var.setValue(i10);
                }
                p3Var.invalidate();
                return;
            default:
                yh.a4.E0((yh.a4) this.e, this.f24461b, this.f24462c, this.d, (TL_stars.TL_starGiftUnique) this.f24463f, (tg.n1[]) this.f24464g, (Long) obj);
                return;
        }
    }

    public h2(yh.a4 a4Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, tg.n1[] n1VarArr) {
        this.e = a4Var;
        this.f24461b = i10;
        this.f24462c = i11;
        this.d = i12;
        this.f24463f = tL_starGiftUnique;
        this.f24464g = n1VarArr;
    }
}
