package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;

public final class u2 implements Runnable {

    public final fc0 f32949a;

    public final int f32950b;

    public final fc0 f32951c;
    public final fc0 d;

    public final int f32952e;

    public final int f32953f;
    public final int h;

    public u2(fc0 fc0Var, int i10, fc0 fc0Var2, fc0 fc0Var3, int i11, int i12, int i13) {
        this.f32949a = fc0Var;
        this.f32950b = i10;
        this.f32951c = fc0Var2;
        this.d = fc0Var3;
        this.f32952e = i11;
        this.f32953f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        fc0 fc0Var = this.f32949a;
        int value = fc0Var.getValue();
        int i10 = this.f32950b;
        fc0 fc0Var2 = this.f32951c;
        fc0 fc0Var3 = this.d;
        if (value == i10) {
            fc0Var2.setMinValue(1);
            try {
                fc0Var2.setMaxValue(YearMonth.of(2024, fc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e9) {
                FileLog.e(e9);
                fc0Var2.setMaxValue(31);
            }
            fc0Var3.setMinValue(0);
            fc0Var3.setMaxValue(11);
            return;
        }
        if (fc0Var.getValue() != this.f32952e) {
            fc0Var2.setMinValue(1);
            try {
                fc0Var2.setMaxValue(YearMonth.of(fc0Var.getValue(), fc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                fc0Var2.setMaxValue(31);
            }
            fc0Var3.setMinValue(0);
            fc0Var3.setMaxValue(11);
            return;
        }
        fc0Var3.setMinValue(0);
        int i11 = this.f32953f;
        fc0Var3.setMaxValue(i11);
        if (fc0Var3.getValue() == i11) {
            fc0Var2.setMinValue(1);
            fc0Var2.setMaxValue(this.h);
            return;
        }
        fc0Var2.setMinValue(1);
        try {
            fc0Var2.setMaxValue(YearMonth.of(fc0Var.getValue(), fc0Var3.getValue() + 1).lengthOfMonth());
        } catch (Exception e11) {
            FileLog.e(e11);
            fc0Var2.setMaxValue(31);
        }
    }
}
