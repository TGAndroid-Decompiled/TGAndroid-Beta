package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class mu implements ru, gm0 {
    public final int f28896a;
    public final int f28897b;
    public final KeyEvent.Callback f28898c;
    public final Object d;

    public mu(su suVar, int i10, int i11, Runnable runnable) {
        this.f28898c = suVar;
        this.f28896a = i10;
        this.f28897b = i11;
        this.d = runnable;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f28897b;
        tg.m1.R((tg.m1) this.f28898c, this.f28896a, (org.telegram.ui.ActionBar.e6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        su.k((su) this.f28898c, this.f28896a, this.f28897b, (Runnable) this.d, str);
    }

    public mu(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        this.f28898c = m1Var;
        this.f28896a = i10;
        this.d = e6Var;
        this.f28897b = i11;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
