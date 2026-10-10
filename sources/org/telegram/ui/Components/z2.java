package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class z2 implements Runnable {
    public final vd0 f33490a;
    public final int f33491b;
    public final vd0 f33492c;
    public final vd0 d;
    public final int f33493e;
    public final int f33494f;
    public final int h;

    public z2(vd0 vd0Var, int i10, vd0 vd0Var2, vd0 vd0Var3, int i11, int i12, int i13) {
        this.f33490a = vd0Var;
        this.f33491b = i10;
        this.f33492c = vd0Var2;
        this.d = vd0Var3;
        this.f33493e = i11;
        this.f33494f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        vd0 vd0Var = this.f33490a;
        int value = vd0Var.getValue();
        int i10 = this.f33491b;
        vd0 vd0Var2 = this.f33492c;
        vd0 vd0Var3 = this.d;
        if (value == i10) {
            vd0Var2.setMinValue(1);
            try {
                vd0Var2.setMaxValue(YearMonth.of(2024, vd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                vd0Var2.setMaxValue(31);
            }
            vd0Var3.setMinValue(0);
            vd0Var3.setMaxValue(11);
        } else if (vd0Var.getValue() == this.f33493e) {
            vd0Var3.setMinValue(0);
            int i11 = this.f33494f;
            vd0Var3.setMaxValue(i11);
            if (vd0Var3.getValue() == i11) {
                vd0Var2.setMinValue(1);
                vd0Var2.setMaxValue(this.h);
                return;
            }
            vd0Var2.setMinValue(1);
            try {
                vd0Var2.setMaxValue(YearMonth.of(vd0Var.getValue(), vd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                vd0Var2.setMaxValue(31);
            }
        } else {
            vd0Var2.setMinValue(1);
            try {
                vd0Var2.setMaxValue(YearMonth.of(vd0Var.getValue(), vd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                vd0Var2.setMaxValue(31);
            }
            vd0Var3.setMinValue(0);
            vd0Var3.setMaxValue(11);
        }
    }
}
