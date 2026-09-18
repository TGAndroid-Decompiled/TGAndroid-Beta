package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class aa1 extends org.telegram.ui.Components.b81 {
    public final boolean f31780a;
    public final boolean f31781b;
    public final boolean f31782c;
    public final FrameLayout d;
    public final ab1 e;

    public aa1(ab1 ab1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = ab1Var;
        this.f31780a = z10;
        this.f31781b = z11;
        this.f31782c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ab1 ab1Var = this.e;
        if (ab1Var.f31801l0) {
            return ab1Var.f31799j0;
        }
        boolean z10 = this.f31780a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f31781b) {
            if (i10 == 0) {
                return ab1Var.f31799j0;
            }
            i10--;
        }
        if (this.f31782c && i10 == 0) {
            return ab1Var.f31800k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f31801l0) {
            return 1;
        }
        return (this.f31780a ? 1 : 0) + (this.f31781b ? 1 : 0) + (this.f31782c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
