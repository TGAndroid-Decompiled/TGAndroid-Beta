package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class e9 implements te.f, we.a {
    public final ImageReceiver f34668a;
    public final a9 f34669b;
    public long f34670c;
    public boolean d;
    public final f9 f34671e;

    public e9(f9 f9Var, View view) {
        this.f34671e = f9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f34668a = imageReceiver;
        imageReceiver.K0(f9Var.f35059e / 2);
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        this.f34669b = a9Var;
        a9Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f34668a.S();
        }
        this.f34670c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f34671e.f35060f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e9) || this.f34670c != ((e9) obj).f34670c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f34671e.f35059e;
    }

    @Override
    public final int getWidth() {
        return this.f34671e.f35059e;
    }
}
