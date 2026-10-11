package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class mu implements ru, gm0 {
    public final int f28936a;
    public final int f28937b;
    public final KeyEvent.Callback f28938c;
    public final Object d;

    public mu(su suVar, int i10, int i11, Runnable runnable) {
        this.f28938c = suVar;
        this.f28936a = i10;
        this.f28937b = i11;
        this.d = runnable;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f28937b;
        tg.m1.R((tg.m1) this.f28938c, this.f28936a, (org.telegram.ui.ActionBar.d6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        su.k((su) this.f28938c, this.f28936a, this.f28937b, (Runnable) this.d, str);
    }

    public mu(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f28938c = m1Var;
        this.f28936a = i10;
        this.d = d6Var;
        this.f28937b = i11;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
