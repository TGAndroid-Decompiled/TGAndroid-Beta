package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final gd0 f30212a;
    public final int f30213b;
    public final gd0 f30214c;
    public final gd0 d;
    public final int e;
    public final int f30215f;
    public final int h;

    public x2(gd0 gd0Var, int i10, gd0 gd0Var2, gd0 gd0Var3, int i11, int i12, int i13) {
        this.f30212a = gd0Var;
        this.f30213b = i10;
        this.f30214c = gd0Var2;
        this.d = gd0Var3;
        this.e = i11;
        this.f30215f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        gd0 gd0Var = this.f30212a;
        int value = gd0Var.getValue();
        int i10 = this.f30213b;
        gd0 gd0Var2 = this.f30214c;
        gd0 gd0Var3 = this.d;
        if (value == i10) {
            gd0Var2.setMinValue(1);
            try {
                gd0Var2.setMaxValue(YearMonth.of(2024, gd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                gd0Var2.setMaxValue(31);
            }
            gd0Var3.setMinValue(0);
            gd0Var3.setMaxValue(11);
        } else if (gd0Var.getValue() == this.e) {
            gd0Var3.setMinValue(0);
            int i11 = this.f30215f;
            gd0Var3.setMaxValue(i11);
            if (gd0Var3.getValue() == i11) {
                gd0Var2.setMinValue(1);
                gd0Var2.setMaxValue(this.h);
                return;
            }
            gd0Var2.setMinValue(1);
            try {
                gd0Var2.setMaxValue(YearMonth.of(gd0Var.getValue(), gd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                gd0Var2.setMaxValue(31);
            }
        } else {
            gd0Var2.setMinValue(1);
            try {
                gd0Var2.setMaxValue(YearMonth.of(gd0Var.getValue(), gd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                gd0Var2.setMaxValue(31);
            }
            gd0Var3.setMinValue(0);
            gd0Var3.setMaxValue(11);
        }
    }
}
