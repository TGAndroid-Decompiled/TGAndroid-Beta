package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class w2 implements Runnable {
    public final fd0 f29901a;
    public final int f29902b;
    public final fd0 f29903c;
    public final fd0 d;
    public final int e;
    public final int f29904f;
    public final int h;

    public w2(fd0 fd0Var, int i10, fd0 fd0Var2, fd0 fd0Var3, int i11, int i12, int i13) {
        this.f29901a = fd0Var;
        this.f29902b = i10;
        this.f29903c = fd0Var2;
        this.d = fd0Var3;
        this.e = i11;
        this.f29904f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        fd0 fd0Var = this.f29901a;
        int value = fd0Var.getValue();
        int i10 = this.f29902b;
        fd0 fd0Var2 = this.f29903c;
        fd0 fd0Var3 = this.d;
        if (value == i10) {
            fd0Var2.setMinValue(1);
            try {
                fd0Var2.setMaxValue(YearMonth.of(2024, fd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                fd0Var2.setMaxValue(31);
            }
            fd0Var3.setMinValue(0);
            fd0Var3.setMaxValue(11);
        } else if (fd0Var.getValue() == this.e) {
            fd0Var3.setMinValue(0);
            int i11 = this.f29904f;
            fd0Var3.setMaxValue(i11);
            if (fd0Var3.getValue() == i11) {
                fd0Var2.setMinValue(1);
                fd0Var2.setMaxValue(this.h);
                return;
            }
            fd0Var2.setMinValue(1);
            try {
                fd0Var2.setMaxValue(YearMonth.of(fd0Var.getValue(), fd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                fd0Var2.setMaxValue(31);
            }
        } else {
            fd0Var2.setMinValue(1);
            try {
                fd0Var2.setMaxValue(YearMonth.of(fd0Var.getValue(), fd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                fd0Var2.setMaxValue(31);
            }
            fd0Var3.setMinValue(0);
            fd0Var3.setMaxValue(11);
        }
    }
}
