package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class x2 implements Runnable {
    public final tb0 f41905a;
    public final int f41906b;
    public final tb0 f41907c;
    public final tb0 d;
    public final int f41908e;
    public final int f41909f;
    public final int h;

    public x2(tb0 tb0Var, int i7, tb0 tb0Var2, tb0 tb0Var3, int i10, int i11, int i12) {
        this.f41905a = tb0Var;
        this.f41906b = i7;
        this.f41907c = tb0Var2;
        this.d = tb0Var3;
        this.f41908e = i10;
        this.f41909f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        tb0 tb0Var = this.f41905a;
        int value = tb0Var.getValue();
        int i7 = this.f41906b;
        tb0 tb0Var2 = this.f41907c;
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
        } else if (tb0Var.getValue() == this.f41908e) {
            tb0Var3.setMinValue(0);
            int i10 = this.f41909f;
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
