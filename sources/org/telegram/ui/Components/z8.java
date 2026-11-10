package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class z8 implements te.f, we.a {
    public final ImageReceiver f40893a;
    public final v8 f40894b;
    public long f40895c;
    public boolean d;
    public final a9 f40896e;

    public z8(a9 a9Var, View view) {
        this.f40896e = a9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f40893a = imageReceiver;
        imageReceiver.J0(a9Var.f31798e / 2);
        v8 v8Var = new v8((org.telegram.ui.ActionBar.h6) null);
        this.f40894b = v8Var;
        v8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f40893a.R();
        }
        this.f40895c = 0L;
    }

    @Override
    public final int b(boolean z9) {
        if (z9) {
            return 0;
        }
        return -this.f40896e.f31799f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z8) || this.f40895c != ((z8) obj).f40895c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f40896e.f31798e;
    }

    @Override
    public final int getWidth() {
        return this.f40896e.f31798e;
    }
}
