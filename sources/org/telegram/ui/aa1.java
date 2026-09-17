package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class aa1 extends org.telegram.ui.Components.b81 {
    public final boolean f31776a;
    public final boolean f31777b;
    public final boolean f31778c;
    public final FrameLayout d;
    public final ab1 e;

    public aa1(ab1 ab1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = ab1Var;
        this.f31776a = z10;
        this.f31777b = z11;
        this.f31778c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        ab1 ab1Var = this.e;
        if (ab1Var.f31797l0) {
            return ab1Var.f31795j0;
        }
        boolean z10 = this.f31776a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f31777b) {
            if (i10 == 0) {
                return ab1Var.f31795j0;
            }
            i10--;
        }
        if (this.f31778c && i10 == 0) {
            return ab1Var.f31796k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f31797l0) {
            return 1;
        }
        return (this.f31776a ? 1 : 0) + (this.f31777b ? 1 : 0) + (this.f31778c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
