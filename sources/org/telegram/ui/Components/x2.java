package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final qd0 f32402a;
    public final int f32403b;
    public final qd0 f32404c;
    public final qd0 d;
    public final int e;
    public final int f32405f;
    public final int h;

    public x2(qd0 qd0Var, int i10, qd0 qd0Var2, qd0 qd0Var3, int i11, int i12, int i13) {
        this.f32402a = qd0Var;
        this.f32403b = i10;
        this.f32404c = qd0Var2;
        this.d = qd0Var3;
        this.e = i11;
        this.f32405f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        qd0 qd0Var = this.f32402a;
        int value = qd0Var.getValue();
        int i10 = this.f32403b;
        qd0 qd0Var2 = this.f32404c;
        qd0 qd0Var3 = this.d;
        if (value == i10) {
            qd0Var2.setMinValue(1);
            try {
                qd0Var2.setMaxValue(YearMonth.of(2024, qd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                qd0Var2.setMaxValue(31);
            }
            qd0Var3.setMinValue(0);
            qd0Var3.setMaxValue(11);
        } else if (qd0Var.getValue() == this.e) {
            qd0Var3.setMinValue(0);
            int i11 = this.f32405f;
            qd0Var3.setMaxValue(i11);
            if (qd0Var3.getValue() == i11) {
                qd0Var2.setMinValue(1);
                qd0Var2.setMaxValue(this.h);
                return;
            }
            qd0Var2.setMinValue(1);
            try {
                qd0Var2.setMaxValue(YearMonth.of(qd0Var.getValue(), qd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                qd0Var2.setMaxValue(31);
            }
        } else {
            qd0Var2.setMinValue(1);
            try {
                qd0Var2.setMaxValue(YearMonth.of(qd0Var.getValue(), qd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                qd0Var2.setMaxValue(31);
            }
            qd0Var3.setMinValue(0);
            qd0Var3.setMaxValue(11);
        }
    }
}
