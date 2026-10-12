package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class ou implements tu, lm0 {
    public final int f29296a;
    public final int f29297b;
    public final KeyEvent.Callback f29298c;
    public final Object d;

    public ou(uu uuVar, int i10, int i11, Runnable runnable) {
        this.f29298c = uuVar;
        this.f29296a = i10;
        this.f29297b = i11;
        this.d = runnable;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29297b;
        tg.m1.R((tg.m1) this.f29298c, this.f29296a, (org.telegram.ui.ActionBar.c6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        uu.k((uu) this.f29298c, this.f29296a, this.f29297b, (Runnable) this.d, str);
    }

    public ou(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        this.f29298c = m1Var;
        this.f29296a = i10;
        this.d = c6Var;
        this.f29297b = i11;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
