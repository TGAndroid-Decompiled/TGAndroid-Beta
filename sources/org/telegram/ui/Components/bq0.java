package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
public final class bq0 implements r0.n, org.telegram.ui.ActionBar.k1 {
    public final int f25074a;
    public final hr0 f25075b;

    public bq0(hr0 hr0Var, int i10) {
        this.f25074a = i10;
        this.f25075b = hr0Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        WindowInsets g10 = k1Var.g();
        hr0 hr0Var = this.f25075b;
        hr0Var.processLegacyContainerInsets(g10);
        i0.b f7 = k1Var.f45250a.f(519);
        if (!hr0Var.H0.equals(f7)) {
            hr0Var.H0 = f7;
            hr0Var.container.requestLayout();
        }
        return r0.k1.f45249b;
    }

    @Override
    public void j(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.m1 m1Var;
        org.telegram.ui.ActionBar.m1 m1Var2;
        switch (this.f25074a) {
            case 1:
                hr0 hr0Var = this.f25075b;
                hr0Var.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var = hr0Var.K0) != null && m1Var.isShowing()) {
                    hr0Var.K0.d(true);
                    return;
                }
                return;
            default:
                hr0 hr0Var2 = this.f25075b;
                hr0Var2.getClass();
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m1Var2 = hr0Var2.K0) != null && m1Var2.isShowing()) {
                    hr0Var2.K0.d(true);
                    return;
                }
                return;
        }
    }
}
