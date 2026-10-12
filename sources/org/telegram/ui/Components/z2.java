package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class z2 implements Runnable {
    public final ud0 f31736a;
    public final int f31737b;
    public final ud0 f31738c;
    public final ud0 d;
    public final int e;
    public final int f31739f;
    public final int h;

    public z2(ud0 ud0Var, int i10, ud0 ud0Var2, ud0 ud0Var3, int i11, int i12, int i13) {
        this.f31736a = ud0Var;
        this.f31737b = i10;
        this.f31738c = ud0Var2;
        this.d = ud0Var3;
        this.e = i11;
        this.f31739f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        ud0 ud0Var = this.f31736a;
        int value = ud0Var.getValue();
        int i10 = this.f31737b;
        ud0 ud0Var2 = this.f31738c;
        ud0 ud0Var3 = this.d;
        if (value == i10) {
            ud0Var2.setMinValue(1);
            try {
                ud0Var2.setMaxValue(YearMonth.of(2024, ud0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                ud0Var2.setMaxValue(31);
            }
            ud0Var3.setMinValue(0);
            ud0Var3.setMaxValue(11);
        } else if (ud0Var.getValue() == this.e) {
            ud0Var3.setMinValue(0);
            int i11 = this.f31739f;
            ud0Var3.setMaxValue(i11);
            if (ud0Var3.getValue() == i11) {
                ud0Var2.setMinValue(1);
                ud0Var2.setMaxValue(this.h);
                return;
            }
            ud0Var2.setMinValue(1);
            try {
                ud0Var2.setMaxValue(YearMonth.of(ud0Var.getValue(), ud0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                ud0Var2.setMaxValue(31);
            }
        } else {
            ud0Var2.setMinValue(1);
            try {
                ud0Var2.setMaxValue(YearMonth.of(ud0Var.getValue(), ud0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                ud0Var2.setMaxValue(31);
            }
            ud0Var3.setMinValue(0);
            ud0Var3.setMaxValue(11);
        }
    }
}
