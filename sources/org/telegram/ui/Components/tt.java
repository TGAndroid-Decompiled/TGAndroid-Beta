package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class tt implements yt, al0 {
    public final int f30698a;
    public final int f30699b;
    public final KeyEvent.Callback f30700c;
    public final Object d;

    public tt(zt ztVar, int i10, int i11, Runnable runnable) {
        this.f30700c = ztVar;
        this.f30698a = i10;
        this.f30699b = i11;
        this.d = runnable;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        int i11 = this.f30699b;
        ug.n1.Q((ug.n1) this.f30700c, this.f30698a, (org.telegram.ui.ActionBar.f6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        zt.k((zt) this.f30700c, this.f30698a, this.f30699b, (Runnable) this.d, str);
    }

    public tt(ug.n1 n1Var, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        this.f30700c = n1Var;
        this.f30698a = i10;
        this.d = f6Var;
        this.f30699b = i11;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
