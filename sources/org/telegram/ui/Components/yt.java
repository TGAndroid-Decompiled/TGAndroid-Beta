package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class yt implements du, ol0 {
    public final int f30806a;
    public final int f30807b;
    public final KeyEvent.Callback f30808c;
    public final Object d;

    public yt(eu euVar, int i10, int i11, Runnable runnable) {
        this.f30808c = euVar;
        this.f30806a = i10;
        this.f30807b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f30807b;
        tg.m1.Q((tg.m1) this.f30808c, this.f30806a, (org.telegram.ui.ActionBar.d6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        eu.k((eu) this.f30808c, this.f30806a, this.f30807b, (Runnable) this.d, str);
    }

    public yt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f30808c = m1Var;
        this.f30806a = i10;
        this.d = d6Var;
        this.f30807b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
