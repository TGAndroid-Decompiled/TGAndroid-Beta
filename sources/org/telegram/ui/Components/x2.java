package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final vc0 f32407a;
    public final int f32408b;
    public final vc0 f32409c;
    public final vc0 d;
    public final int f32410e;
    public final int f32411f;
    public final int h;

    public x2(vc0 vc0Var, int i10, vc0 vc0Var2, vc0 vc0Var3, int i11, int i12, int i13) {
        this.f32407a = vc0Var;
        this.f32408b = i10;
        this.f32409c = vc0Var2;
        this.d = vc0Var3;
        this.f32410e = i11;
        this.f32411f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        vc0 vc0Var = this.f32407a;
        int value = vc0Var.getValue();
        int i10 = this.f32408b;
        vc0 vc0Var2 = this.f32409c;
        vc0 vc0Var3 = this.d;
        if (value == i10) {
            vc0Var2.setMinValue(1);
            try {
                vc0Var2.setMaxValue(YearMonth.of(2024, vc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                vc0Var2.setMaxValue(31);
            }
            vc0Var3.setMinValue(0);
            vc0Var3.setMaxValue(11);
        } else if (vc0Var.getValue() == this.f32410e) {
            vc0Var3.setMinValue(0);
            int i11 = this.f32411f;
            vc0Var3.setMaxValue(i11);
            if (vc0Var3.getValue() == i11) {
                vc0Var2.setMinValue(1);
                vc0Var2.setMaxValue(this.h);
                return;
            }
            vc0Var2.setMinValue(1);
            try {
                vc0Var2.setMaxValue(YearMonth.of(vc0Var.getValue(), vc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                vc0Var2.setMaxValue(31);
            }
        } else {
            vc0Var2.setMinValue(1);
            try {
                vc0Var2.setMaxValue(YearMonth.of(vc0Var.getValue(), vc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                vc0Var2.setMaxValue(31);
            }
            vc0Var3.setMinValue(0);
            vc0Var3.setMaxValue(11);
        }
    }
}
