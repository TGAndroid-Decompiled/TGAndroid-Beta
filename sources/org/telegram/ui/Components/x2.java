package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final qc0 f34553a;
    public final int f34554b;
    public final qc0 f34555c;
    public final qc0 d;
    public final int f34556e;
    public final int f34557f;
    public final int h;

    public x2(qc0 qc0Var, int i10, qc0 qc0Var2, qc0 qc0Var3, int i11, int i12, int i13) {
        this.f34553a = qc0Var;
        this.f34554b = i10;
        this.f34555c = qc0Var2;
        this.d = qc0Var3;
        this.f34556e = i11;
        this.f34557f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        qc0 qc0Var = this.f34553a;
        int value = qc0Var.getValue();
        int i10 = this.f34554b;
        qc0 qc0Var2 = this.f34555c;
        qc0 qc0Var3 = this.d;
        if (value == i10) {
            qc0Var2.setMinValue(1);
            try {
                qc0Var2.setMaxValue(YearMonth.of(2024, qc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                qc0Var2.setMaxValue(31);
            }
            qc0Var3.setMinValue(0);
            qc0Var3.setMaxValue(11);
        } else if (qc0Var.getValue() == this.f34556e) {
            qc0Var3.setMinValue(0);
            int i11 = this.f34557f;
            qc0Var3.setMaxValue(i11);
            if (qc0Var3.getValue() == i11) {
                qc0Var2.setMinValue(1);
                qc0Var2.setMaxValue(this.h);
                return;
            }
            qc0Var2.setMinValue(1);
            try {
                qc0Var2.setMaxValue(YearMonth.of(qc0Var.getValue(), qc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                qc0Var2.setMaxValue(31);
            }
        } else {
            qc0Var2.setMinValue(1);
            try {
                qc0Var2.setMaxValue(YearMonth.of(qc0Var.getValue(), qc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                FileLog.e(e12);
                qc0Var2.setMaxValue(31);
            }
            qc0Var3.setMinValue(0);
            qc0Var3.setMaxValue(11);
        }
    }
}
