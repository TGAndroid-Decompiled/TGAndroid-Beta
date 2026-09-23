package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class wt implements bu, bl0 {
    public final int f29804a;
    public final int f29805b;
    public final KeyEvent.Callback f29806c;
    public final Object d;

    public wt(cu cuVar, int i10, int i11, Runnable runnable) {
        this.f29806c = cuVar;
        this.f29804a = i10;
        this.f29805b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29805b;
        tg.n1.Q((tg.n1) this.f29806c, this.f29804a, (org.telegram.ui.ActionBar.d6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        cu.k((cu) this.f29806c, this.f29804a, this.f29805b, (Runnable) this.d, str);
    }

    public wt(tg.n1 n1Var, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f29806c = n1Var;
        this.f29804a = i10;
        this.d = d6Var;
        this.f29805b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
