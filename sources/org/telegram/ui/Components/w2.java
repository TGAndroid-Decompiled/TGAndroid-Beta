package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class w2 implements Runnable {
    public final tc0 f29470a;
    public final int f29471b;
    public final tc0 f29472c;
    public final tc0 d;
    public final int e;
    public final int f29473f;
    public final int h;

    public w2(tc0 tc0Var, int i10, tc0 tc0Var2, tc0 tc0Var3, int i11, int i12, int i13) {
        this.f29470a = tc0Var;
        this.f29471b = i10;
        this.f29472c = tc0Var2;
        this.d = tc0Var3;
        this.e = i11;
        this.f29473f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        tc0 tc0Var = this.f29470a;
        int value = tc0Var.getValue();
        int i10 = this.f29471b;
        tc0 tc0Var2 = this.f29472c;
        tc0 tc0Var3 = this.d;
        if (value == i10) {
            tc0Var2.setMinValue(1);
            try {
                tc0Var2.setMaxValue(YearMonth.of(2024, tc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                tc0Var2.setMaxValue(31);
            }
            tc0Var3.setMinValue(0);
            tc0Var3.setMaxValue(11);
        } else if (tc0Var.getValue() == this.e) {
            tc0Var3.setMinValue(0);
            int i11 = this.f29473f;
            tc0Var3.setMaxValue(i11);
            if (tc0Var3.getValue() == i11) {
                tc0Var2.setMinValue(1);
                tc0Var2.setMaxValue(this.h);
                return;
            }
            tc0Var2.setMinValue(1);
            try {
                tc0Var2.setMaxValue(YearMonth.of(tc0Var.getValue(), tc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e7) {
                FileLog.e(e7);
                tc0Var2.setMaxValue(31);
            }
        } else {
            tc0Var2.setMinValue(1);
            try {
                tc0Var2.setMaxValue(YearMonth.of(tc0Var.getValue(), tc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                tc0Var2.setMaxValue(31);
            }
            tc0Var3.setMinValue(0);
            tc0Var3.setMaxValue(11);
        }
    }
}
