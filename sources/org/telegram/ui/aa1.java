package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class aa1 extends org.telegram.ui.Components.g91 {
    public final boolean f35990a;
    public final boolean f35991b;
    public final boolean f35992c;
    public final FrameLayout d;
    public final ab1 f35993e;

    public aa1(ab1 ab1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f35993e = ab1Var;
        this.f35990a = z10;
        this.f35991b = z11;
        this.f35992c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ab1 ab1Var = this.f35993e;
        if (ab1Var.f36011l0) {
            return ab1Var.f36009j0;
        }
        boolean z10 = this.f35990a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f35991b) {
            if (i10 == 0) {
                return ab1Var.f36009j0;
            }
            i10--;
        }
        if (this.f35992c && i10 == 0) {
            return ab1Var.f36010k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f35993e.f36011l0) {
            return 1;
        }
        return (this.f35990a ? 1 : 0) + (this.f35991b ? 1 : 0) + (this.f35992c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
