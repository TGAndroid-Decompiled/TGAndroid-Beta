package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class p81 extends org.telegram.ui.Components.w81 {
    public final boolean f40119a;
    public final boolean f40120b;
    public final boolean f40121c;
    public final FrameLayout d;
    public final p91 e;

    public p81(p91 p91Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = p91Var;
        this.f40119a = z10;
        this.f40120b = z11;
        this.f40121c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        p91 p91Var = this.e;
        if (p91Var.f40142l0) {
            return p91Var.f40140j0;
        }
        boolean z10 = this.f40119a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f40120b) {
            if (i10 == 0) {
                return p91Var.f40140j0;
            }
            i10--;
        }
        if (this.f40121c && i10 == 0) {
            return p91Var.f40141k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f40142l0) {
            return 1;
        }
        return (this.f40119a ? 1 : 0) + (this.f40120b ? 1 : 0) + (this.f40121c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
