package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class vt implements au, nl0 {
    public final int f29792a;
    public final int f29793b;
    public final KeyEvent.Callback f29794c;
    public final Object d;

    public vt(bu buVar, int i10, int i11, Runnable runnable) {
        this.f29794c = buVar;
        this.f29792a = i10;
        this.f29793b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29793b;
        tg.m1.Q((tg.m1) this.f29794c, this.f29792a, (org.telegram.ui.ActionBar.f6) this.d, i11, view);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        bu.k((bu) this.f29794c, this.f29792a, this.f29793b, (Runnable) this.d, str);
    }

    public vt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f29794c = m1Var;
        this.f29792a = i10;
        this.d = f6Var;
        this.f29793b = i11;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
