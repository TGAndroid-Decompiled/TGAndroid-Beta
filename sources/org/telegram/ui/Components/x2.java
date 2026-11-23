package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class x2 implements Runnable {
    public final tb0 f41948a;
    public final int f41949b;
    public final tb0 f41950c;
    public final tb0 d;
    public final int f41951e;
    public final int f41952f;
    public final int h;

    public x2(tb0 tb0Var, int i7, tb0 tb0Var2, tb0 tb0Var3, int i10, int i11, int i12) {
        this.f41948a = tb0Var;
        this.f41949b = i7;
        this.f41950c = tb0Var2;
        this.d = tb0Var3;
        this.f41951e = i10;
        this.f41952f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        tb0 tb0Var = this.f41948a;
        int value = tb0Var.getValue();
        int i7 = this.f41949b;
        tb0 tb0Var2 = this.f41950c;
        tb0 tb0Var3 = this.d;
        if (value == i7) {
            tb0Var2.setMinValue(1);
            try {
                tb0Var2.setMaxValue(YearMonth.of(2024, tb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                tb0Var2.setMaxValue(31);
            }
            tb0Var3.setMinValue(0);
            tb0Var3.setMaxValue(11);
        } else if (tb0Var.getValue() == this.f41951e) {
            tb0Var3.setMinValue(0);
            int i10 = this.f41952f;
            tb0Var3.setMaxValue(i10);
            if (tb0Var3.getValue() == i10) {
                tb0Var2.setMinValue(1);
                tb0Var2.setMaxValue(this.h);
                return;
            }
            tb0Var2.setMinValue(1);
            try {
                tb0Var2.setMaxValue(YearMonth.of(tb0Var.getValue(), tb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                tb0Var2.setMaxValue(31);
            }
        } else {
            tb0Var2.setMinValue(1);
            try {
                tb0Var2.setMaxValue(YearMonth.of(tb0Var.getValue(), tb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
                tb0Var2.setMaxValue(31);
            }
            tb0Var3.setMinValue(0);
            tb0Var3.setMaxValue(11);
        }
    }
}
