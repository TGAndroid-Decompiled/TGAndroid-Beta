package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class a3 implements Runnable {
    public final md0 f26396a;
    public final int f26397b;
    public final md0 f26398c;
    public final md0 d;
    public final int e;
    public final int f26399f;
    public final int h;

    public a3(md0 md0Var, int i10, md0 md0Var2, md0 md0Var3, int i11, int i12, int i13) {
        this.f26396a = md0Var;
        this.f26397b = i10;
        this.f26398c = md0Var2;
        this.d = md0Var3;
        this.e = i11;
        this.f26399f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        md0 md0Var = this.f26396a;
        int value = md0Var.getValue();
        int i10 = this.f26397b;
        md0 md0Var2 = this.f26398c;
        md0 md0Var3 = this.d;
        if (value == i10) {
            md0Var2.setMinValue(1);
            try {
                md0Var2.setMaxValue(YearMonth.of(2024, md0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                md0Var2.setMaxValue(31);
            }
            md0Var3.setMinValue(0);
            md0Var3.setMaxValue(11);
        } else if (md0Var.getValue() == this.e) {
            md0Var3.setMinValue(0);
            int i11 = this.f26399f;
            md0Var3.setMaxValue(i11);
            if (md0Var3.getValue() == i11) {
                md0Var2.setMinValue(1);
                md0Var2.setMaxValue(this.h);
                return;
            }
            md0Var2.setMinValue(1);
            try {
                md0Var2.setMaxValue(YearMonth.of(md0Var.getValue(), md0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                md0Var2.setMaxValue(31);
            }
        } else {
            md0Var2.setMinValue(1);
            try {
                md0Var2.setMaxValue(YearMonth.of(md0Var.getValue(), md0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                md0Var2.setMaxValue(31);
            }
            md0Var3.setMinValue(0);
            md0Var3.setMaxValue(11);
        }
    }
}
