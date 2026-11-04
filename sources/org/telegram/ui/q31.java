package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class q31 extends org.telegram.ui.Components.f61 {
    public final boolean f48744a;
    public final boolean f48745b;
    public final boolean f48746c;
    public final FrameLayout d;
    public final r41 f48747e;

    public q31(r41 r41Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f48747e = r41Var;
        this.f48744a = z10;
        this.f48745b = z11;
        this.f48746c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i3) {
        r41 r41Var = this.f48747e;
        if (r41Var.f49082o0) {
            return r41Var.f49077j0;
        }
        boolean z10 = this.f48744a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i3 == 0) {
                return frameLayout;
            }
            i3--;
        }
        if (this.f48745b) {
            if (i3 == 0) {
                return r41Var.f49077j0;
            }
            i3--;
        }
        if (this.f48746c && i3 == 0) {
            return r41Var.f49078k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f48747e.f49082o0) {
            return 1;
        }
        return (this.f48744a ? 1 : 0) + (this.f48745b ? 1 : 0) + (this.f48746c ? 1 : 0);
    }

    @Override
    public final int h(int i3) {
        return i3;
    }

    @Override
    public final void b(View view, int i3, int i10) {
    }
}
