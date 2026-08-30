package org.telegram.ui.Components;

import j$.time.YearMonth;
import org.telegram.messenger.FileLog;
public final class u2 implements Runnable {
    public final wc0 f29089a;
    public final int f29090b;
    public final wc0 f29091c;
    public final wc0 d;
    public final int e;
    public final int f29092f;
    public final int h;

    public u2(wc0 wc0Var, int i10, wc0 wc0Var2, wc0 wc0Var3, int i11, int i12, int i13) {
        this.f29089a = wc0Var;
        this.f29090b = i10;
        this.f29091c = wc0Var2;
        this.d = wc0Var3;
        this.e = i11;
        this.f29092f = i12;
        this.h = i13;
    }

    @Override
    public final void run() {
        wc0 wc0Var = this.f29089a;
        int value = wc0Var.getValue();
        int i10 = this.f29090b;
        wc0 wc0Var2 = this.f29091c;
        wc0 wc0Var3 = this.d;
        if (value == i10) {
            wc0Var2.setMinValue(1);
            try {
                wc0Var2.setMaxValue(YearMonth.of(2024, wc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e) {
                FileLog.e(e);
                wc0Var2.setMaxValue(31);
            }
            wc0Var3.setMinValue(0);
            wc0Var3.setMaxValue(11);
        } else if (wc0Var.getValue() == this.e) {
            wc0Var3.setMinValue(0);
            int i11 = this.f29092f;
            wc0Var3.setMaxValue(i11);
            if (wc0Var3.getValue() == i11) {
                wc0Var2.setMinValue(1);
                wc0Var2.setMaxValue(this.h);
                return;
            }
            wc0Var2.setMinValue(1);
            try {
                wc0Var2.setMaxValue(YearMonth.of(wc0Var.getValue(), wc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e6) {
                FileLog.e(e6);
                wc0Var2.setMaxValue(31);
            }
        } else {
            wc0Var2.setMinValue(1);
            try {
                wc0Var2.setMaxValue(YearMonth.of(wc0Var.getValue(), wc0Var3.getValue() + 1).lengthOfMonth());
            } catch (Exception e10) {
                FileLog.e(e10);
                wc0Var2.setMaxValue(31);
            }
            wc0Var3.setMinValue(0);
            wc0Var3.setMaxValue(11);
        }
    }
}
