package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class u2 implements Runnable {
    public final yc0 f31474a;
    public final int f31475b;
    public final yc0 f31476c;
    public final yc0 d;
    public final int f31477e;
    public final int f31478f;
    public final int h;

    public u2(yc0 yc0Var, int i10, yc0 yc0Var2, yc0 yc0Var3, int i11, int i12, int i13) {
        this.f31474a = yc0Var;
        this.f31475b = i10;
        this.f31476c = yc0Var2;
        this.d = yc0Var3;
        this.f31477e = i11;
        this.f31478f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        yc0 yc0Var = this.f31474a;
        int value = yc0Var.getValue();
        int i10 = this.f31475b;
        yc0 yc0Var2 = this.f31476c;
        yc0 yc0Var3 = this.d;
        if (value == i10) {
            yc0Var2.setMinValue(1);
            try {
                yc0Var2.setMaxValue(YearMonth.of(2024, yc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e6) {
                FileLog.e(e6);
                yc0Var2.setMaxValue(31);
            }
            yc0Var3.setMinValue(0);
            yc0Var3.setMaxValue(11);
        } else if (yc0Var.getValue() == this.f31477e) {
            yc0Var3.setMinValue(0);
            int i11 = this.f31478f;
            yc0Var3.setMaxValue(i11);
            if (yc0Var3.getValue() == i11) {
                yc0Var2.setMinValue(1);
                yc0Var2.setMaxValue(this.h);
                return;
            }
            yc0Var2.setMinValue(1);
            try {
                yc0Var2.setMaxValue(YearMonth.of(yc0Var.getValue(), yc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                yc0Var2.setMaxValue(31);
            }
        } else {
            yc0Var2.setMinValue(1);
            try {
                yc0Var2.setMaxValue(YearMonth.of(yc0Var.getValue(), yc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                yc0Var2.setMaxValue(31);
            }
            yc0Var3.setMinValue(0);
            yc0Var3.setMaxValue(11);
        }
    }
}
