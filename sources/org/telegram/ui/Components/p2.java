package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class p2 implements Runnable {
    public final ib0 f36868a;
    public final int f36869b;
    public final ib0 f36870c;
    public final ib0 d;
    public final int f36871e;
    public final int f36872f;
    public final int h;

    public p2(ib0 ib0Var, int i7, ib0 ib0Var2, ib0 ib0Var3, int i10, int i11, int i12) {
        this.f36868a = ib0Var;
        this.f36869b = i7;
        this.f36870c = ib0Var2;
        this.d = ib0Var3;
        this.f36871e = i10;
        this.f36872f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        ib0 ib0Var = this.f36868a;
        int value = ib0Var.getValue();
        int i7 = this.f36869b;
        ib0 ib0Var2 = this.f36870c;
        ib0 ib0Var3 = this.d;
        if (value == i7) {
            ib0Var2.setMinValue(1);
            try {
                ib0Var2.setMaxValue(YearMonth.of(2024, ib0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                ib0Var2.setMaxValue(31);
            }
            ib0Var3.setMinValue(0);
            ib0Var3.setMaxValue(11);
        } else if (ib0Var.getValue() == this.f36871e) {
            ib0Var3.setMinValue(0);
            int i10 = this.f36872f;
            ib0Var3.setMaxValue(i10);
            if (ib0Var3.getValue() == i10) {
                ib0Var2.setMinValue(1);
                ib0Var2.setMaxValue(this.h);
                return;
            }
            ib0Var2.setMinValue(1);
            try {
                ib0Var2.setMaxValue(YearMonth.of(ib0Var.getValue(), ib0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                ib0Var2.setMaxValue(31);
            }
        } else {
            ib0Var2.setMinValue(1);
            try {
                ib0Var2.setMaxValue(YearMonth.of(ib0Var.getValue(), ib0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
                ib0Var2.setMaxValue(31);
            }
            ib0Var3.setMinValue(0);
            ib0Var3.setMaxValue(11);
        }
    }
}
