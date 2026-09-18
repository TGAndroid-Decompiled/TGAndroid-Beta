package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class w2 implements Runnable {
    public final uc0 f29503a;
    public final int f29504b;
    public final uc0 f29505c;
    public final uc0 d;
    public final int e;
    public final int f29506f;
    public final int h;

    public w2(uc0 uc0Var, int i10, uc0 uc0Var2, uc0 uc0Var3, int i11, int i12, int i13) {
        this.f29503a = uc0Var;
        this.f29504b = i10;
        this.f29505c = uc0Var2;
        this.d = uc0Var3;
        this.e = i11;
        this.f29506f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        uc0 uc0Var = this.f29503a;
        int value = uc0Var.getValue();
        int i10 = this.f29504b;
        uc0 uc0Var2 = this.f29505c;
        uc0 uc0Var3 = this.d;
        if (value == i10) {
            uc0Var2.setMinValue(1);
            try {
                uc0Var2.setMaxValue(YearMonth.of(2024, uc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                uc0Var2.setMaxValue(31);
            }
            uc0Var3.setMinValue(0);
            uc0Var3.setMaxValue(11);
        } else if (uc0Var.getValue() == this.e) {
            uc0Var3.setMinValue(0);
            int i11 = this.f29506f;
            uc0Var3.setMaxValue(i11);
            if (uc0Var3.getValue() == i11) {
                uc0Var2.setMinValue(1);
                uc0Var2.setMaxValue(this.h);
                return;
            }
            uc0Var2.setMinValue(1);
            try {
                uc0Var2.setMaxValue(YearMonth.of(uc0Var.getValue(), uc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                uc0Var2.setMaxValue(31);
            }
        } else {
            uc0Var2.setMinValue(1);
            try {
                uc0Var2.setMaxValue(YearMonth.of(uc0Var.getValue(), uc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                uc0Var2.setMaxValue(31);
            }
            uc0Var3.setMinValue(0);
            uc0Var3.setMaxValue(11);
        }
    }
}
