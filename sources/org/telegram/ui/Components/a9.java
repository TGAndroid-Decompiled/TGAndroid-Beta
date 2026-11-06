package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class a9 implements te.f, we.a {
    public final ImageReceiver f31737a;
    public final w8 f31738b;
    public long f31739c;
    public boolean d;
    public final b9 f31740e;

    public a9(b9 b9Var, View view) {
        this.f31740e = b9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f31737a = imageReceiver;
        imageReceiver.J0(b9Var.f32085e / 2);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        this.f31738b = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f31737a.R();
        }
        this.f31739c = 0L;
    }

    @Override
    public final int b(boolean z9) {
        if (z9) {
            return 0;
        }
        return -this.f31740e.f32086f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a9) || this.f31739c != ((a9) obj).f31739c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f31740e.f32085e;
    }

    @Override
    public final int getWidth() {
        return this.f31740e.f32085e;
    }
}
