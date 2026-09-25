package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class wt implements bu, ll0 {
    public final int f30178a;
    public final int f30179b;
    public final KeyEvent.Callback f30180c;
    public final Object d;

    public wt(cu cuVar, int i10, int i11, Runnable runnable) {
        this.f30180c = cuVar;
        this.f30178a = i10;
        this.f30179b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f30179b;
        tg.m1.Q((tg.m1) this.f30180c, this.f30178a, (org.telegram.ui.ActionBar.d6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        cu.k((cu) this.f30180c, this.f30178a, this.f30179b, (Runnable) this.d, str);
    }

    public wt(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.d6 d6Var, int i11) {
        this.f30180c = m1Var;
        this.f30178a = i10;
        this.d = d6Var;
        this.f30179b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
