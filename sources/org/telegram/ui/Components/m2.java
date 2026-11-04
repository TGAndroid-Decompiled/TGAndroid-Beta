package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class m2 implements Runnable {
    public final cb0 f35979a;
    public final int f35980b;
    public final cb0 f35981c;
    public final cb0 d;
    public final int f35982e;
    public final int f35983f;
    public final int h;

    public m2(cb0 cb0Var, int i3, cb0 cb0Var2, cb0 cb0Var3, int i10, int i11, int i12) {
        this.f35979a = cb0Var;
        this.f35980b = i3;
        this.f35981c = cb0Var2;
        this.d = cb0Var3;
        this.f35982e = i10;
        this.f35983f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        cb0 cb0Var = this.f35979a;
        int value = cb0Var.getValue();
        int i3 = this.f35980b;
        cb0 cb0Var2 = this.f35981c;
        cb0 cb0Var3 = this.d;
        if (value == i3) {
            cb0Var2.setMinValue(1);
            try {
                cb0Var2.setMaxValue(YearMonth.of(2024, cb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                cb0Var2.setMaxValue(31);
            }
            cb0Var3.setMinValue(0);
            cb0Var3.setMaxValue(11);
        } else if (cb0Var.getValue() == this.f35982e) {
            cb0Var3.setMinValue(0);
            int i10 = this.f35983f;
            cb0Var3.setMaxValue(i10);
            if (cb0Var3.getValue() == i10) {
                cb0Var2.setMinValue(1);
                cb0Var2.setMaxValue(this.h);
                return;
            }
            cb0Var2.setMinValue(1);
            try {
                cb0Var2.setMaxValue(YearMonth.of(cb0Var.getValue(), cb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                cb0Var2.setMaxValue(31);
            }
        } else {
            cb0Var2.setMinValue(1);
            try {
                cb0Var2.setMaxValue(YearMonth.of(cb0Var.getValue(), cb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
                cb0Var2.setMaxValue(31);
            }
            cb0Var3.setMinValue(0);
            cb0Var3.setMaxValue(11);
        }
    }
}
