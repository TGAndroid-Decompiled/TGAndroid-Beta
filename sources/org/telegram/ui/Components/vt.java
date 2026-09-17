package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class vt implements au, bl0 {
    public final int f29401a;
    public final int f29402b;
    public final KeyEvent.Callback f29403c;
    public final Object d;

    public vt(bu buVar, int i10, int i11, Runnable runnable) {
        this.f29403c = buVar;
        this.f29401a = i10;
        this.f29402b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29402b;
        tg.n1.Q((tg.n1) this.f29403c, this.f29401a, (org.telegram.ui.ActionBar.f6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        bu.k((bu) this.f29403c, this.f29401a, this.f29402b, (Runnable) this.d, str);
    }

    public vt(tg.n1 n1Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f29403c = n1Var;
        this.f29401a = i10;
        this.d = f6Var;
        this.f29402b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
