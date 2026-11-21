package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f9 implements te.f, we.a {
    public final ImageReceiver f35158a;
    public final b9 f35159b;
    public long f35160c;
    public boolean d;
    public final g9 f35161e;

    public f9(g9 g9Var, View view) {
        this.f35161e = g9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f35158a = imageReceiver;
        imageReceiver.J0(g9Var.f35462e / 2);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        this.f35159b = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f35158a.R();
        }
        this.f35160c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f35161e.f35463f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f9) || this.f35160c != ((f9) obj).f35160c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f35161e.f35462e;
    }

    @Override
    public final int getWidth() {
        return this.f35161e.f35462e;
    }
}
