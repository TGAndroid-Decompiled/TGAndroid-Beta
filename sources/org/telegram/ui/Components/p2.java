package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class p2 implements Runnable {
    public final hb0 f36781a;
    public final int f36782b;
    public final hb0 f36783c;
    public final hb0 d;
    public final int f36784e;
    public final int f36785f;
    public final int h;

    public p2(hb0 hb0Var, int i7, hb0 hb0Var2, hb0 hb0Var3, int i10, int i11, int i12) {
        this.f36781a = hb0Var;
        this.f36782b = i7;
        this.f36783c = hb0Var2;
        this.d = hb0Var3;
        this.f36784e = i10;
        this.f36785f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        hb0 hb0Var = this.f36781a;
        int value = hb0Var.getValue();
        int i7 = this.f36782b;
        hb0 hb0Var2 = this.f36783c;
        hb0 hb0Var3 = this.d;
        if (value == i7) {
            hb0Var2.setMinValue(1);
            try {
                hb0Var2.setMaxValue(YearMonth.of(2024, hb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                hb0Var2.setMaxValue(31);
            }
            hb0Var3.setMinValue(0);
            hb0Var3.setMaxValue(11);
        } else if (hb0Var.getValue() == this.f36784e) {
            hb0Var3.setMinValue(0);
            int i10 = this.f36785f;
            hb0Var3.setMaxValue(i10);
            if (hb0Var3.getValue() == i10) {
                hb0Var2.setMinValue(1);
                hb0Var2.setMaxValue(this.h);
                return;
            }
            hb0Var2.setMinValue(1);
            try {
                hb0Var2.setMaxValue(YearMonth.of(hb0Var.getValue(), hb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                hb0Var2.setMaxValue(31);
            }
        } else {
            hb0Var2.setMinValue(1);
            try {
                hb0Var2.setMaxValue(YearMonth.of(hb0Var.getValue(), hb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
                hb0Var2.setMaxValue(31);
            }
            hb0Var3.setMinValue(0);
            hb0Var3.setMaxValue(11);
        }
    }
}
