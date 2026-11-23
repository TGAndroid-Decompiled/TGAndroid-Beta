package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class w2 implements Runnable {
    public final qb0 f41475a;
    public final int f41476b;
    public final qb0 f41477c;
    public final qb0 d;
    public final int f41478e;
    public final int f41479f;
    public final int h;

    public w2(qb0 qb0Var, int i7, qb0 qb0Var2, qb0 qb0Var3, int i10, int i11, int i12) {
        this.f41475a = qb0Var;
        this.f41476b = i7;
        this.f41477c = qb0Var2;
        this.d = qb0Var3;
        this.f41478e = i10;
        this.f41479f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        qb0 qb0Var = this.f41475a;
        int value = qb0Var.getValue();
        int i7 = this.f41476b;
        qb0 qb0Var2 = this.f41477c;
        qb0 qb0Var3 = this.d;
        if (value == i7) {
            qb0Var2.setMinValue(1);
            try {
                qb0Var2.setMaxValue(YearMonth.of(2024, qb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                qb0Var2.setMaxValue(31);
            }
            qb0Var3.setMinValue(0);
            qb0Var3.setMaxValue(11);
        } else if (qb0Var.getValue() == this.f41478e) {
            qb0Var3.setMinValue(0);
            int i10 = this.f41479f;
            qb0Var3.setMaxValue(i10);
            if (qb0Var3.getValue() == i10) {
                qb0Var2.setMinValue(1);
                qb0Var2.setMaxValue(this.h);
                return;
            }
            qb0Var2.setMinValue(1);
            try {
                qb0Var2.setMaxValue(YearMonth.of(qb0Var.getValue(), qb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                qb0Var2.setMaxValue(31);
            }
        } else {
            qb0Var2.setMinValue(1);
            try {
                qb0Var2.setMaxValue(YearMonth.of(qb0Var.getValue(), qb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
                qb0Var2.setMaxValue(31);
            }
            qb0Var3.setMinValue(0);
            qb0Var3.setMaxValue(11);
        }
    }
}
