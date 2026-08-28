package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class u2 implements Runnable {
    public final bc0 f32902a;
    public final int f32903b;
    public final bc0 f32904c;
    public final bc0 d;
    public final int f32905e;
    public final int f32906f;
    public final int h;

    public u2(bc0 bc0Var, int i9, bc0 bc0Var2, bc0 bc0Var3, int i10, int i11, int i12) {
        this.f32902a = bc0Var;
        this.f32903b = i9;
        this.f32904c = bc0Var2;
        this.d = bc0Var3;
        this.f32905e = i10;
        this.f32906f = i11;
        this.h = i12;
    }

    @Override
    public final void run() {
        bc0 bc0Var = this.f32902a;
        int value = bc0Var.getValue();
        int i9 = this.f32903b;
        bc0 bc0Var2 = this.f32904c;
        bc0 bc0Var3 = this.d;
        if (value == i9) {
            bc0Var2.setMinValue(1);
            try {
                bc0Var2.setMaxValue(YearMonth.of(2024, bc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                bc0Var2.setMaxValue(31);
            }
            bc0Var3.setMinValue(0);
            bc0Var3.setMaxValue(11);
        } else if (bc0Var.getValue() == this.f32905e) {
            bc0Var3.setMinValue(0);
            int i10 = this.f32906f;
            bc0Var3.setMaxValue(i10);
            if (bc0Var3.getValue() == i10) {
                bc0Var2.setMinValue(1);
                bc0Var2.setMaxValue(this.h);
                return;
            }
            bc0Var2.setMinValue(1);
            try {
                bc0Var2.setMaxValue(YearMonth.of(bc0Var.getValue(), bc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                bc0Var2.setMaxValue(31);
            }
        } else {
            bc0Var2.setMinValue(1);
            try {
                bc0Var2.setMaxValue(YearMonth.of(bc0Var.getValue(), bc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e12) {
                FileLog.e(e12);
                bc0Var2.setMaxValue(31);
            }
            bc0Var3.setMinValue(0);
            bc0Var3.setMaxValue(11);
        }
    }
}
