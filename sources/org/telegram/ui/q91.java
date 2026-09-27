package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class q91 extends org.telegram.ui.Components.p81 {
    public final boolean f36656a;
    public final boolean f36657b;
    public final boolean f36658c;
    public final FrameLayout d;
    public final ra1 e;

    public q91(ra1 ra1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = ra1Var;
        this.f36656a = z10;
        this.f36657b = z11;
        this.f36658c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ra1 ra1Var = this.e;
        if (ra1Var.f37068k0) {
            return ra1Var.f37066i0;
        }
        boolean z10 = this.f36656a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36657b) {
            if (i10 == 0) {
                return ra1Var.f37066i0;
            }
            i10--;
        }
        if (this.f36658c && i10 == 0) {
            return ra1Var.f37067j0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f37068k0) {
            return 1;
        }
        return (this.f36656a ? 1 : 0) + (this.f36657b ? 1 : 0) + (this.f36658c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
