package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class z61 implements org.telegram.ui.ActionBar.g6 {
    public final a71 f33164a;

    public z61(a71 a71Var) {
        this.f33164a = a71Var;
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.k6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.k6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.k6.f21514v3;
    }

    @Override
    public final Paint d(String str) {
        return org.telegram.ui.ActionBar.k6.U0(str);
    }

    @Override
    public final int e(int i10) {
        return g(i10);
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final int g(int i10) {
        return this.f33164a.I(i10);
    }

    @Override
    public final Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public final int i(int i10) {
        return g(i10);
    }

    @Override
    public final void h(int i10, int i11) {
    }
}
