package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final vc0 f32434a;
    public final int f32435b;
    public final vc0 f32436c;
    public final vc0 d;
    public final int f32437e;
    public final int f32438f;
    public final int h;

    public x2(vc0 vc0Var, int i10, vc0 vc0Var2, vc0 vc0Var3, int i11, int i12, int i13) {
        this.f32434a = vc0Var;
        this.f32435b = i10;
        this.f32436c = vc0Var2;
        this.d = vc0Var3;
        this.f32437e = i11;
        this.f32438f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        vc0 vc0Var = this.f32434a;
        int value = vc0Var.getValue();
        int i10 = this.f32435b;
        vc0 vc0Var2 = this.f32436c;
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
        } else if (vc0Var.getValue() == this.f32437e) {
            vc0Var3.setMinValue(0);
            int i11 = this.f32438f;
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
