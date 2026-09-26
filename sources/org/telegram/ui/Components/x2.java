package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class x2 implements Runnable {
    public final ed0 f30246a;
    public final int f30247b;
    public final ed0 f30248c;
    public final ed0 d;
    public final int e;
    public final int f30249f;
    public final int h;

    public x2(ed0 ed0Var, int i10, ed0 ed0Var2, ed0 ed0Var3, int i11, int i12, int i13) {
        this.f30246a = ed0Var;
        this.f30247b = i10;
        this.f30248c = ed0Var2;
        this.d = ed0Var3;
        this.e = i11;
        this.f30249f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        ed0 ed0Var = this.f30246a;
        int value = ed0Var.getValue();
        int i10 = this.f30247b;
        ed0 ed0Var2 = this.f30248c;
        ed0 ed0Var3 = this.d;
        if (value == i10) {
            ed0Var2.setMinValue(1);
            try {
                ed0Var2.setMaxValue(YearMonth.of(2024, ed0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                ed0Var2.setMaxValue(31);
            }
            ed0Var3.setMinValue(0);
            ed0Var3.setMaxValue(11);
        } else if (ed0Var.getValue() == this.e) {
            ed0Var3.setMinValue(0);
            int i11 = this.f30249f;
            ed0Var3.setMaxValue(i11);
            if (ed0Var3.getValue() == i11) {
                ed0Var2.setMinValue(1);
                ed0Var2.setMaxValue(this.h);
                return;
            }
            ed0Var2.setMinValue(1);
            try {
                ed0Var2.setMaxValue(YearMonth.of(ed0Var.getValue(), ed0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                ed0Var2.setMaxValue(31);
            }
        } else {
            ed0Var2.setMinValue(1);
            try {
                ed0Var2.setMaxValue(YearMonth.of(ed0Var.getValue(), ed0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                ed0Var2.setMaxValue(31);
            }
            ed0Var3.setMinValue(0);
            ed0Var3.setMaxValue(11);
        }
    }
}
