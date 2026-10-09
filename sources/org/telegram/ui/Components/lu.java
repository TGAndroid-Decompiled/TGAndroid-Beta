package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
public final class lu implements qu, fm0 {
    public final int f28592a;
    public final int f28593b;
    public final KeyEvent.Callback f28594c;
    public final Object d;

    public lu(ru ruVar, int i10, int i11, Runnable runnable) {
        this.f28594c = ruVar;
        this.f28592a = i10;
        this.f28593b = i11;
        this.d = runnable;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        int i11 = this.f28593b;
        tg.m1.R((tg.m1) this.f28594c, this.f28592a, (org.telegram.ui.ActionBar.e6) this.d, i11, view);
    }

    @Override
    public void run(String str) {
        ru.k((ru) this.f28594c, this.f28592a, this.f28593b, (Runnable) this.d, str);
    }

    public lu(tg.m1 m1Var, int i10, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        this.f28594c = m1Var;
        this.f28592a = i10;
        this.d = e6Var;
        this.f28593b = i11;
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
