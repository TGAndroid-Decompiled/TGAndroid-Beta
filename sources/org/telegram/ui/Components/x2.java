package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final dd0 f28909a;
    public final int f28910b;
    public final dd0 f28911c;
    public final dd0 d;
    public final int e;
    public final int f28912f;
    public final int h;

    public x2(dd0 dd0Var, int i10, dd0 dd0Var2, dd0 dd0Var3, int i11, int i12, int i13) {
        this.f28909a = dd0Var;
        this.f28910b = i10;
        this.f28911c = dd0Var2;
        this.d = dd0Var3;
        this.e = i11;
        this.f28912f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        dd0 dd0Var = this.f28909a;
        int value = dd0Var.getValue();
        int i10 = this.f28910b;
        dd0 dd0Var2 = this.f28911c;
        dd0 dd0Var3 = this.d;
        if (value == i10) {
            dd0Var2.setMinValue(1);
            try {
                dd0Var2.setMaxValue(YearMonth.of(2024, dd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                dd0Var2.setMaxValue(31);
            }
            dd0Var3.setMinValue(0);
            dd0Var3.setMaxValue(11);
        } else if (dd0Var.getValue() == this.e) {
            dd0Var3.setMinValue(0);
            int i11 = this.f28912f;
            dd0Var3.setMaxValue(i11);
            if (dd0Var3.getValue() == i11) {
                dd0Var2.setMinValue(1);
                dd0Var2.setMaxValue(this.h);
                return;
            }
            dd0Var2.setMinValue(1);
            try {
                dd0Var2.setMaxValue(YearMonth.of(dd0Var.getValue(), dd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                dd0Var2.setMaxValue(31);
            }
        } else {
            dd0Var2.setMinValue(1);
            try {
                dd0Var2.setMaxValue(YearMonth.of(dd0Var.getValue(), dd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                dd0Var2.setMaxValue(31);
            }
            dd0Var3.setMinValue(0);
            dd0Var3.setMaxValue(11);
        }
    }
}
