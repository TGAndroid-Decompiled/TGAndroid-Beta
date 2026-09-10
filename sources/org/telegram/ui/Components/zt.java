package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class zt implements eu, kl0 {
    public final int f29805a;
    public final int f29806b;
    public final KeyEvent.Callback f29807c;
    public final Object d;

    public zt(fu fuVar, int i10, int i11, Runnable runnable) {
        this.f29807c = fuVar;
        this.f29805a = i10;
        this.f29806b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29806b;
        sg.p1.Q((sg.p1) this.f29807c, this.f29805a, (org.telegram.ui.ActionBar.f6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        fu.k((fu) this.f29807c, this.f29805a, this.f29806b, (Runnable) this.d, str);
    }

    public zt(sg.p1 p1Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f29807c = p1Var;
        this.f29805a = i10;
        this.d = f6Var;
        this.f29806b = i11;
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
