package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f9 implements te.f, we.a {
    public final ImageReceiver f35135a;
    public final b9 f35136b;
    public long f35137c;
    public boolean d;
    public final g9 f35138e;

    public f9(g9 g9Var, View view) {
        this.f35138e = g9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f35135a = imageReceiver;
        imageReceiver.J0(g9Var.f35443e / 2);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        this.f35136b = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f35135a.R();
        }
        this.f35137c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f35138e.f35444f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f9) || this.f35137c != ((f9) obj).f35137c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f35138e.f35443e;
    }

    @Override
    public final int getWidth() {
        return this.f35138e.f35443e;
    }
}
