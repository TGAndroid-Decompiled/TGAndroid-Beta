package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class vt implements au, ll0 {
    public final int f29753a;
    public final int f29754b;
    public final KeyEvent.Callback f29755c;
    public final Object d;

    public vt(bu buVar, int i10, int i11, Runnable runnable) {
        this.f29755c = buVar;
        this.f29753a = i10;
        this.f29754b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29754b;
        tg.m1.Q((tg.m1) this.f29755c, this.f29753a, (org.telegram.ui.ActionBar.e6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        bu.k((bu) this.f29755c, this.f29753a, this.f29754b, (Runnable) this.d, str);
    }

    public vt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        this.f29755c = m1Var;
        this.f29753a = i10;
        this.d = e6Var;
        this.f29754b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
