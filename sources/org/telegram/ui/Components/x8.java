package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class x8 implements te.f, we.a {
    public final ImageReceiver f41612a;
    public final t8 f41613b;
    public long f41614c;
    public boolean d;
    public final y8 f41615e;

    public x8(y8 y8Var, View view) {
        this.f41615e = y8Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f41612a = imageReceiver;
        imageReceiver.J0(y8Var.f41935e / 2);
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        this.f41613b = t8Var;
        t8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f41612a.R();
        }
        this.f41614c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f41615e.f41936f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x8) || this.f41614c != ((x8) obj).f41614c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f41615e.f41935e;
    }

    @Override
    public final int getWidth() {
        return this.f41615e.f41935e;
    }
}
