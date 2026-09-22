package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class vt implements au, al0 {
    public final int f29423a;
    public final int f29424b;
    public final KeyEvent.Callback f29425c;
    public final Object d;

    public vt(bu buVar, int i10, int i11, Runnable runnable) {
        this.f29425c = buVar;
        this.f29423a = i10;
        this.f29424b = i11;
        this.d = runnable;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f29424b;
        tg.n1.Q((tg.n1) this.f29425c, this.f29423a, (org.telegram.ui.ActionBar.e6) this.d, i11, view);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void run(String str) {
        bu.k((bu) this.f29425c, this.f29423a, this.f29424b, (Runnable) this.d, str);
    }

    public vt(tg.n1 n1Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        this.f29425c = n1Var;
        this.f29423a = i10;
        this.d = e6Var;
        this.f29424b = i11;
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
