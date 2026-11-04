package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class y8 implements qe.f, te.a {
    public final ImageReceiver f40651a;
    public final u8 f40652b;
    public long f40653c;
    public boolean d;
    public final z8 f40654e;

    public y8(z8 z8Var, View view) {
        this.f40654e = z8Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f40651a = imageReceiver;
        imageReceiver.J0(z8Var.f40987e / 2);
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        this.f40652b = u8Var;
        u8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f40651a.R();
        }
        this.f40653c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f40654e.f40988f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y8) || this.f40653c != ((y8) obj).f40653c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f40654e.f40987e;
    }

    @Override
    public final int getWidth() {
        return this.f40654e.f40987e;
    }
}
