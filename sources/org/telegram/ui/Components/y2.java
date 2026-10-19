package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class y2 implements Runnable {
    public final od0 f32531a;
    public final int f32532b;
    public final od0 f32533c;
    public final od0 d;
    public final int e;
    public final int f32534f;
    public final int h;

    public y2(od0 od0Var, int i10, od0 od0Var2, od0 od0Var3, int i11, int i12, int i13) {
        this.f32531a = od0Var;
        this.f32532b = i10;
        this.f32533c = od0Var2;
        this.d = od0Var3;
        this.e = i11;
        this.f32534f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        od0 od0Var = this.f32531a;
        int value = od0Var.getValue();
        int i10 = this.f32532b;
        od0 od0Var2 = this.f32533c;
        od0 od0Var3 = this.d;
        if (value == i10) {
            od0Var2.setMinValue(1);
            try {
                od0Var2.setMaxValue(YearMonth.of(2024, od0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                od0Var2.setMaxValue(31);
            }
            od0Var3.setMinValue(0);
            od0Var3.setMaxValue(11);
        } else if (od0Var.getValue() == this.e) {
            od0Var3.setMinValue(0);
            int i11 = this.f32534f;
            od0Var3.setMaxValue(i11);
            if (od0Var3.getValue() == i11) {
                od0Var2.setMinValue(1);
                od0Var2.setMaxValue(this.h);
                return;
            }
            od0Var2.setMinValue(1);
            try {
                od0Var2.setMaxValue(YearMonth.of(od0Var.getValue(), od0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                od0Var2.setMaxValue(31);
            }
        } else {
            od0Var2.setMinValue(1);
            try {
                od0Var2.setMaxValue(YearMonth.of(od0Var.getValue(), od0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                od0Var2.setMaxValue(31);
            }
            od0Var3.setMinValue(0);
            od0Var3.setMaxValue(11);
        }
    }
}
