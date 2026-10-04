package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class yt implements du, nl0 {
    public final int f33245a;
    public final int f33246b;
    public final KeyEvent.Callback f33247c;
    public final Object d;

    public yt(eu euVar, int i10, int i11, Runnable runnable) {
        this.f33247c = euVar;
        this.f33245a = i10;
        this.f33246b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f33246b;
        tg.m1.O((tg.m1) this.f33247c, this.f33245a, (org.telegram.ui.ActionBar.d6) this.d, i11, view);
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        eu.k((eu) this.f33247c, this.f33245a, this.f33246b, (Runnable) this.d, str);
    }

    public yt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f33247c = m1Var;
        this.f33245a = i10;
        this.d = d6Var;
        this.f33246b = i11;
    }

    @Override
    public void s0(View view, float f7, float f10) {
    }
}
