package org.telegram.ui.Components;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
public final class i71 implements org.telegram.ui.ActionBar.u6 {
    public final j71 f29205a;

    public i71(j71 j71Var) {
        this.f29205a = j71Var;
    }

    @Override
    public final boolean a() {
        return org.telegram.ui.ActionBar.y6.I.q();
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        org.telegram.ui.ActionBar.y6.q(f7, f10, i10, i11);
    }

    @Override
    public final ColorFilter c() {
        return org.telegram.ui.ActionBar.y6.f23687v3;
    }

    @Override
    public final Paint d(String str) {
        return org.telegram.ui.ActionBar.y6.U0(str);
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
        return this.f29205a.I(i10);
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
