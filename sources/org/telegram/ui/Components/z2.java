package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class z2 implements Runnable {
    public final yd0 f33253a;
    public final int f33254b;
    public final yd0 f33255c;
    public final yd0 d;
    public final int f33256e;
    public final int f33257f;
    public final int h;

    public z2(yd0 yd0Var, int i10, yd0 yd0Var2, yd0 yd0Var3, int i11, int i12, int i13) {
        this.f33253a = yd0Var;
        this.f33254b = i10;
        this.f33255c = yd0Var2;
        this.d = yd0Var3;
        this.f33256e = i11;
        this.f33257f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        yd0 yd0Var = this.f33253a;
        int value = yd0Var.getValue();
        int i10 = this.f33254b;
        yd0 yd0Var2 = this.f33255c;
        yd0 yd0Var3 = this.d;
        if (value == i10) {
            yd0Var2.setMinValue(1);
            try {
                yd0Var2.setMaxValue(YearMonth.of(2024, yd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                yd0Var2.setMaxValue(31);
            }
            yd0Var3.setMinValue(0);
            yd0Var3.setMaxValue(11);
        } else if (yd0Var.getValue() == this.f33256e) {
            yd0Var3.setMinValue(0);
            int i11 = this.f33257f;
            yd0Var3.setMaxValue(i11);
            if (yd0Var3.getValue() == i11) {
                yd0Var2.setMinValue(1);
                yd0Var2.setMaxValue(this.h);
                return;
            }
            yd0Var2.setMinValue(1);
            try {
                yd0Var2.setMaxValue(YearMonth.of(yd0Var.getValue(), yd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                yd0Var2.setMaxValue(31);
            }
        } else {
            yd0Var2.setMinValue(1);
            try {
                yd0Var2.setMaxValue(YearMonth.of(yd0Var.getValue(), yd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                yd0Var2.setMaxValue(31);
            }
            yd0Var3.setMinValue(0);
            yd0Var3.setMaxValue(11);
        }
    }
}
