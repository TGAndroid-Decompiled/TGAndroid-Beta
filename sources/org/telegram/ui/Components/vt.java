package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class vt implements au, bl0 {
    public final int f29404a;
    public final int f29405b;
    public final KeyEvent.Callback f29406c;
    public final Object d;

    public vt(bu buVar, int i10, int i11, Runnable runnable) {
        this.f29406c = buVar;
        this.f29404a = i10;
        this.f29405b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29405b;
        tg.n1.Q((tg.n1) this.f29406c, this.f29404a, (org.telegram.ui.ActionBar.f6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        bu.k((bu) this.f29406c, this.f29404a, this.f29405b, (Runnable) this.d, str);
    }

    public vt(tg.n1 n1Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f29406c = n1Var;
        this.f29404a = i10;
        this.d = f6Var;
        this.f29405b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
