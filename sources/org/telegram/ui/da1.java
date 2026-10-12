package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class da1 extends org.telegram.ui.Components.l91 {
    public final boolean f36717a;
    public final boolean f36718b;
    public final boolean f36719c;
    public final FrameLayout d;
    public final db1 f36720e;

    public da1(db1 db1Var, boolean z10, boolean z11, boolean z12, FrameLayout frameLayout) {
        this.f36720e = db1Var;
        this.f36717a = z10;
        this.f36718b = z11;
        this.f36719c = z12;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i10) {
        db1 db1Var = this.f36720e;
        if (db1Var.f36740l0) {
            return db1Var.f36738j0;
        }
        boolean z10 = this.f36717a;
        FrameLayout frameLayout = this.d;
        if (z10) {
            if (i10 == 0) {
                return frameLayout;
            }
            i10--;
        }
        if (this.f36718b) {
            if (i10 == 0) {
                return db1Var.f36738j0;
            }
            i10--;
        }
        if (this.f36719c && i10 == 0) {
            return db1Var.f36739k0;
        }
        return frameLayout;
    }

    @Override
    public final int e() {
        if (this.f36720e.f36740l0) {
            return 1;
        }
        return (this.f36717a ? 1 : 0) + (this.f36718b ? 1 : 0) + (this.f36719c ? 1 : 0);
    }

    @Override
    public final int h(int i10) {
        return i10;
    }

    @Override
    public final void b(View view, int i10, int i11) {
    }
}
