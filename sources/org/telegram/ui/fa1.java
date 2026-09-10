package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class fa1 extends org.telegram.ui.Components.n81 {
    public final boolean f32735a;
    public final boolean f32736b;
    public final boolean f32737c;
    public final FrameLayout d;
    public final fb1 e;

    public fa1(fb1 fb1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.e = fb1Var;
        this.f32735a = z10;
        this.f32736b = z11;
        this.f32737c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        fb1 fb1Var = this.e;
        if (fb1Var.f32755l0) {
            return fb1Var.f32753j0;
        }
        boolean z10 = this.f32735a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f32736b) {
            if (i10 == 0) {
                return fb1Var.f32753j0;
            }
            i10--;
        }
        if (this.f32737c && i10 == 0) {
            return fb1Var.f32754k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.e.f32755l0) {
            return 1;
        }
        return (this.f32735a ? 1 : 0) + (this.f32736b ? 1 : 0) + (this.f32737c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
