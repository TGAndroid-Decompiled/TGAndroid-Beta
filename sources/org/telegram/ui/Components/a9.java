package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class a9 implements te.f, we.a {
    public final ImageReceiver f31745a;
    public final w8 f31746b;
    public long f31747c;
    public boolean d;
    public final b9 f31748e;

    public a9(b9 b9Var, View view) {
        this.f31748e = b9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f31745a = imageReceiver;
        imageReceiver.J0(b9Var.f32113e / 2);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        this.f31746b = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f31745a.R();
        }
        this.f31747c = 0L;
    }

    @Override
    public final int b(boolean z9) {
        if (z9) {
            return 0;
        }
        return -this.f31748e.f32114f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a9) || this.f31747c != ((a9) obj).f31747c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f31748e.f32113e;
    }

    @Override
    public final int getWidth() {
        return this.f31748e.f32113e;
    }
}
