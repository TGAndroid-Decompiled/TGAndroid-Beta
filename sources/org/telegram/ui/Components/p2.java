package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class p2 implements Runnable {
    public final ac0 f29315a;
    public final int f29316b;
    public final ac0 f29317c;
    public final ac0 d;
    public final int e;
    public final int f29318f;
    public final int h;

    public p2(ac0 ac0Var, int i10, ac0 ac0Var2, ac0 ac0Var3, int i11, int i12, int i13) {
        this.f29315a = ac0Var;
        this.f29316b = i10;
        this.f29317c = ac0Var2;
        this.d = ac0Var3;
        this.e = i11;
        this.f29318f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        ac0 ac0Var = this.f29315a;
        int value = ac0Var.getValue();
        int i10 = this.f29316b;
        ac0 ac0Var2 = this.f29317c;
        ac0 ac0Var3 = this.d;
        if (value == i10) {
            ac0Var2.setMinValue(1);
            try {
                ac0Var2.setMaxValue(YearMonth.of(2024, ac0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                ac0Var2.setMaxValue(31);
            }
            ac0Var3.setMinValue(0);
            ac0Var3.setMaxValue(11);
        } else if (ac0Var.getValue() == this.e) {
            ac0Var3.setMinValue(0);
            int i11 = this.f29318f;
            ac0Var3.setMaxValue(i11);
            if (ac0Var3.getValue() == i11) {
                ac0Var2.setMinValue(1);
                ac0Var2.setMaxValue(this.h);
                return;
            }
            ac0Var2.setMinValue(1);
            try {
                ac0Var2.setMaxValue(YearMonth.of(ac0Var.getValue(), ac0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                ac0Var2.setMaxValue(31);
            }
        } else {
            ac0Var2.setMinValue(1);
            try {
                ac0Var2.setMaxValue(YearMonth.of(ac0Var.getValue(), ac0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.f8.g(e10, true);
                ac0Var2.setMaxValue(31);
            }
            ac0Var3.setMinValue(0);
            ac0Var3.setMaxValue(11);
        }
    }
}
