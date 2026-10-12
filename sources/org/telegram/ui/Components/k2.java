package org.telegram.ui.Components;

import android.view.KeyEvent;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class k2 implements Utilities.Callback {
    public final int f27731a = 0;
    public final int f27732b;
    public final int f27733c;
    public final int d;
    public final KeyEvent.Callback f27734e;
    public final Object f27735f;
    public final Object f27736g;

    public k2(int i10, int i11, s3 s3Var, u3 u3Var, int i12, t3 t3Var) {
        this.f27732b = i10;
        this.f27733c = i11;
        this.f27734e = s3Var;
        this.f27735f = u3Var;
        this.d = i12;
        this.f27736g = t3Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        switch (this.f27731a) {
            case 0:
                s3 s3Var = (s3) this.f27734e;
                u3 u3Var = (u3) this.f27735f;
                t3 t3Var = (t3) this.f27736g;
                Boolean bool = (Boolean) obj;
                int i12 = this.f27732b;
                int i13 = i12 % 60;
                int i14 = (i12 - i13) / 60;
                int i15 = this.f27733c;
                int i16 = i15 % 60;
                int i17 = (i15 - i16) / 60;
                int i18 = 59;
                if (i16 == 0 && i17 > 0) {
                    i17--;
                    i16 = 59;
                }
                if (bool.booleanValue()) {
                    i11 = s3Var.getValue();
                    i10 = u3Var.getValue();
                } else {
                    int i19 = this.d;
                    i10 = i19 % 60;
                    i11 = (i19 - i10) / 60;
                    if (i11 == 24) {
                        i11--;
                        i10 = 59;
                    }
                }
                s3Var.setMinValue(i14);
                s3Var.setMaxValue(i17);
                if (i11 > i17) {
                    s3Var.setValue(i17);
                    i11 = i17;
                } else if (i11 < i14) {
                    s3Var.setValue(i14);
                    i11 = i14;
                }
                if (i11 <= i14) {
                    u3Var.setMinValue(i13);
                    if (i14 == i17) {
                        i18 = i16;
                    }
                    u3Var.setMaxValue(i18);
                } else if (i11 >= i17) {
                    if (i14 != i17) {
                        i13 = 0;
                    }
                    u3Var.setMinValue(i13);
                    u3Var.setMaxValue(i16);
                } else if (i14 == i17) {
                    u3Var.setMinValue(i13);
                    u3Var.setMaxValue(i16);
                } else {
                    u3Var.setMinValue(0);
                    u3Var.setMaxValue(59);
                }
                if (i10 > u3Var.getMaxValue()) {
                    i10 = u3Var.getMaxValue();
                    u3Var.setValue(i10);
                } else if (i10 < u3Var.getMinValue()) {
                    i10 = u3Var.getMinValue();
                    u3Var.setValue(i10);
                }
                if (!bool.booleanValue()) {
                    s3Var.setValue(i11);
                    u3Var.setValue(i10);
                }
                t3Var.invalidate();
                return;
            default:
                yh.s3.F0((yh.s3) this.f27734e, this.f27732b, this.f27733c, this.d, (TL_stars.TL_starGiftUnique) this.f27735f, (tg.m1[]) this.f27736g, (Long) obj);
                return;
        }
    }

    public k2(yh.s3 s3Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, tg.m1[] m1VarArr) {
        this.f27734e = s3Var;
        this.f27732b = i10;
        this.f27733c = i11;
        this.d = i12;
        this.f27735f = tL_starGiftUnique;
        this.f27736g = m1VarArr;
    }
}
