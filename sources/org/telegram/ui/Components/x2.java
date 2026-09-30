package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final hd0 f30104a;
    public final int f30105b;
    public final hd0 f30106c;
    public final hd0 d;
    public final int e;
    public final int f30107f;
    public final int h;

    public x2(hd0 hd0Var, int i10, hd0 hd0Var2, hd0 hd0Var3, int i11, int i12, int i13) {
        this.f30104a = hd0Var;
        this.f30105b = i10;
        this.f30106c = hd0Var2;
        this.d = hd0Var3;
        this.e = i11;
        this.f30107f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        hd0 hd0Var = this.f30104a;
        int value = hd0Var.getValue();
        int i10 = this.f30105b;
        hd0 hd0Var2 = this.f30106c;
        hd0 hd0Var3 = this.d;
        if (value == i10) {
            hd0Var2.setMinValue(1);
            try {
                hd0Var2.setMaxValue(YearMonth.of(2024, hd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                hd0Var2.setMaxValue(31);
            }
            hd0Var3.setMinValue(0);
            hd0Var3.setMaxValue(11);
        } else if (hd0Var.getValue() == this.e) {
            hd0Var3.setMinValue(0);
            int i11 = this.f30107f;
            hd0Var3.setMaxValue(i11);
            if (hd0Var3.getValue() == i11) {
                hd0Var2.setMinValue(1);
                hd0Var2.setMaxValue(this.h);
                return;
            }
            hd0Var2.setMinValue(1);
            try {
                hd0Var2.setMaxValue(YearMonth.of(hd0Var.getValue(), hd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                hd0Var2.setMaxValue(31);
            }
        } else {
            hd0Var2.setMinValue(1);
            try {
                hd0Var2.setMaxValue(YearMonth.of(hd0Var.getValue(), hd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                hd0Var2.setMaxValue(31);
            }
            hd0Var3.setMinValue(0);
            hd0Var3.setMaxValue(11);
        }
    }
}
