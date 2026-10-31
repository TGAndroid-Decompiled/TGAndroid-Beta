package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class v8 implements fe.i, ie.a {
    public final ImageReceiver f31187a;
    public final r8 f31188b;
    public long f31189c;
    public boolean d;
    public final w8 e;

    public v8(w8 w8Var, View view) {
        this.e = w8Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f31187a = imageReceiver;
        imageReceiver.J0(w8Var.e / 2);
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        this.f31188b = r8Var;
        r8Var.u(org.telegram.messenger.i0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f31187a.R();
        }
        this.f31189c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f32102f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v8) || this.f31189c != ((v8) obj).f31189c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.e.e;
    }

    @Override
    public final int getWidth() {
        return this.e.e;
    }
}
