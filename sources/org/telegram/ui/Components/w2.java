package org.telegram.ui.Components;

import j$.time.YearMonth;
public final class w2 implements Runnable {
    public final sb0 f41523a;
    public final int f41524b;
    public final sb0 f41525c;
    public final sb0 d;
    public final int f41526e;
    public final int f41527f;
    public final int h;

    public w2(sb0 sb0Var, int i7, sb0 sb0Var2, sb0 sb0Var3, int i10, int i11, int i12) {
        this.f41523a = sb0Var;
        this.f41524b = i7;
        this.f41525c = sb0Var2;
        this.d = sb0Var3;
        this.f41526e = i10;
        this.f41527f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        sb0 sb0Var = this.f41523a;
        int value = sb0Var.getValue();
        int i7 = this.f41524b;
        sb0 sb0Var2 = this.f41525c;
        sb0 sb0Var3 = this.d;
        if (value == i7) {
            sb0Var2.setMinValue(1);
            try {
                sb0Var2.setMaxValue(YearMonth.of(2024, sb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                sb0Var2.setMaxValue(31);
            }
            sb0Var3.setMinValue(0);
            sb0Var3.setMaxValue(11);
        } else if (sb0Var.getValue() == this.f41526e) {
            sb0Var3.setMinValue(0);
            int i10 = this.f41527f;
            sb0Var3.setMaxValue(i10);
            if (sb0Var3.getValue() == i10) {
                sb0Var2.setMinValue(1);
                sb0Var2.setMaxValue(this.h);
                return;
            }
            sb0Var2.setMinValue(1);
            try {
                sb0Var2.setMaxValue(YearMonth.of(sb0Var.getValue(), sb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                sb0Var2.setMaxValue(31);
            }
        } else {
            sb0Var2.setMinValue(1);
            try {
                sb0Var2.setMaxValue(YearMonth.of(sb0Var.getValue(), sb0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
                sb0Var2.setMaxValue(31);
            }
            sb0Var3.setMinValue(0);
            sb0Var3.setMaxValue(11);
        }
    }
}
