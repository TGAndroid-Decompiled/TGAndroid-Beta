package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class a3 implements Runnable {
    public final nd0 f26417a;
    public final int f26418b;
    public final nd0 f26419c;
    public final nd0 d;
    public final int e;
    public final int f26420f;
    public final int h;

    public a3(nd0 nd0Var, int i10, nd0 nd0Var2, nd0 nd0Var3, int i11, int i12, int i13) {
        this.f26417a = nd0Var;
        this.f26418b = i10;
        this.f26419c = nd0Var2;
        this.d = nd0Var3;
        this.e = i11;
        this.f26420f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        nd0 nd0Var = this.f26417a;
        int value = nd0Var.getValue();
        int i10 = this.f26418b;
        nd0 nd0Var2 = this.f26419c;
        nd0 nd0Var3 = this.d;
        if (value == i10) {
            nd0Var2.setMinValue(1);
            try {
                nd0Var2.setMaxValue(YearMonth.of(2024, nd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                nd0Var2.setMaxValue(31);
            }
            nd0Var3.setMinValue(0);
            nd0Var3.setMaxValue(11);
        } else if (nd0Var.getValue() == this.e) {
            nd0Var3.setMinValue(0);
            int i11 = this.f26420f;
            nd0Var3.setMaxValue(i11);
            if (nd0Var3.getValue() == i11) {
                nd0Var2.setMinValue(1);
                nd0Var2.setMaxValue(this.h);
                return;
            }
            nd0Var2.setMinValue(1);
            try {
                nd0Var2.setMaxValue(YearMonth.of(nd0Var.getValue(), nd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                nd0Var2.setMaxValue(31);
            }
        } else {
            nd0Var2.setMinValue(1);
            try {
                nd0Var2.setMaxValue(YearMonth.of(nd0Var.getValue(), nd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e11) {
                FileLog.e(e11);
                nd0Var2.setMaxValue(31);
            }
            nd0Var3.setMinValue(0);
            nd0Var3.setMaxValue(11);
        }
    }
}
