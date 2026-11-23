package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class a41 extends org.telegram.ui.Components.c71 {
    public final boolean f45584a;
    public final boolean f45585b;
    public final boolean f45586c;
    public final FrameLayout d;
    public final b51 f45587e;

    public a41(b51 b51Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f45587e = b51Var;
        this.f45584a = z10;
        this.f45585b = z11;
        this.f45586c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i7) {
        b51 b51Var = this.f45587e;
        if (b51Var.f45943o0) {
            return b51Var.f45938j0;
        }
        boolean z10 = this.f45584a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i7 == 0) {
                return frameLayout;
            }
            i7--;
        }
        if (this.f45585b) {
            if (i7 == 0) {
                return b51Var.f45938j0;
            }
            i7--;
        }
        if (this.f45586c && i7 == 0) {
            return b51Var.f45939k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f45587e.f45943o0) {
            return 1;
        }
        return (this.f45584a ? 1 : 0) + (this.f45585b ? 1 : 0) + (this.f45586c ? 1 : 0);
    }

    @Override
    public final int h(int i7) {
        return i7;
    }

    @Override
    public final void b(View view, int i7, int i10) {
    }
}
