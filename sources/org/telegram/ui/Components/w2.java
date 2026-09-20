package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class w2 implements Runnable {
    public final cd0 f29920a;
    public final int f29921b;
    public final cd0 f29922c;
    public final cd0 d;
    public final int e;
    public final int f29923f;
    public final int h;

    public w2(cd0 cd0Var, int i10, cd0 cd0Var2, cd0 cd0Var3, int i11, int i12, int i13) {
        this.f29920a = cd0Var;
        this.f29921b = i10;
        this.f29922c = cd0Var2;
        this.d = cd0Var3;
        this.e = i11;
        this.f29923f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        cd0 cd0Var = this.f29920a;
        int value = cd0Var.getValue();
        int i10 = this.f29921b;
        cd0 cd0Var2 = this.f29922c;
        cd0 cd0Var3 = this.d;
        if (value == i10) {
            cd0Var2.setMinValue(1);
            try {
                cd0Var2.setMaxValue(YearMonth.of(2024, cd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                cd0Var2.setMaxValue(31);
            }
            cd0Var3.setMinValue(0);
            cd0Var3.setMaxValue(11);
        } else if (cd0Var.getValue() == this.e) {
            cd0Var3.setMinValue(0);
            int i11 = this.f29923f;
            cd0Var3.setMaxValue(i11);
            if (cd0Var3.getValue() == i11) {
                cd0Var2.setMinValue(1);
                cd0Var2.setMaxValue(this.h);
                return;
            }
            cd0Var2.setMinValue(1);
            try {
                cd0Var2.setMaxValue(YearMonth.of(cd0Var.getValue(), cd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                cd0Var2.setMaxValue(31);
            }
        } else {
            cd0Var2.setMinValue(1);
            try {
                cd0Var2.setMaxValue(YearMonth.of(cd0Var.getValue(), cd0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                cd0Var2.setMaxValue(31);
            }
            cd0Var3.setMinValue(0);
            cd0Var3.setMaxValue(11);
        }
    }
}
