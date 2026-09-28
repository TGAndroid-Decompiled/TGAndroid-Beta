package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class xt implements cu, nl0 {
    public final int f30478a;
    public final int f30479b;
    public final KeyEvent.Callback f30480c;
    public final Object d;

    public xt(du duVar, int i10, int i11, Runnable runnable) {
        this.f30480c = duVar;
        this.f30478a = i10;
        this.f30479b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f30479b;
        tg.m1.Q((tg.m1) this.f30480c, this.f30478a, (org.telegram.ui.ActionBar.d6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        du.k((du) this.f30480c, this.f30478a, this.f30479b, (Runnable) this.d, str);
    }

    public xt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f30480c = m1Var;
        this.f30478a = i10;
        this.d = d6Var;
        this.f30479b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
