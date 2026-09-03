package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class u2 implements Runnable {
    public final xc0 f29080a;
    public final int f29081b;
    public final xc0 f29082c;
    public final xc0 d;
    public final int e;
    public final int f29083f;
    public final int h;

    public u2(xc0 xc0Var, int i10, xc0 xc0Var2, xc0 xc0Var3, int i11, int i12, int i13) {
        this.f29080a = xc0Var;
        this.f29081b = i10;
        this.f29082c = xc0Var2;
        this.d = xc0Var3;
        this.e = i11;
        this.f29083f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        xc0 xc0Var = this.f29080a;
        int value = xc0Var.getValue();
        int i10 = this.f29081b;
        xc0 xc0Var2 = this.f29082c;
        xc0 xc0Var3 = this.d;
        if (value == i10) {
            xc0Var2.setMinValue(1);
            try {
                xc0Var2.setMaxValue(YearMonth.of(2024, xc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                xc0Var2.setMaxValue(31);
            }
            xc0Var3.setMinValue(0);
            xc0Var3.setMaxValue(11);
        } else if (xc0Var.getValue() == this.e) {
            xc0Var3.setMinValue(0);
            int i11 = this.f29083f;
            xc0Var3.setMaxValue(i11);
            if (xc0Var3.getValue() == i11) {
                xc0Var2.setMinValue(1);
                xc0Var2.setMaxValue(this.h);
                return;
            }
            xc0Var2.setMinValue(1);
            try {
                xc0Var2.setMaxValue(YearMonth.of(xc0Var.getValue(), xc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e6) {
                FileLog.e(e6);
                xc0Var2.setMaxValue(31);
            }
        } else {
            xc0Var2.setMinValue(1);
            try {
                xc0Var2.setMaxValue(YearMonth.of(xc0Var.getValue(), xc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                xc0Var2.setMaxValue(31);
            }
            xc0Var3.setMinValue(0);
            xc0Var3.setMaxValue(11);
        }
    }
}
