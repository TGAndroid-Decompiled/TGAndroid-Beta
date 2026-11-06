package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class a9 implements te.f, we.a {
    public final ImageReceiver f31749a;
    public final w8 f31750b;
    public long f31751c;
    public boolean d;
    public final b9 f31752e;

    public a9(b9 b9Var, View view) {
        this.f31752e = b9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f31749a = imageReceiver;
        imageReceiver.J0(b9Var.f32079e / 2);
        w8 w8Var = new w8((org.telegram.ui.ActionBar.f6) null);
        this.f31750b = w8Var;
        w8Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f31749a.R();
        }
        this.f31751c = 0L;
    }

    @Override
    public final int b(boolean z9) {
        if (z9) {
            return 0;
        }
        return -this.f31752e.f32080f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a9) || this.f31751c != ((a9) obj).f31751c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f31752e.f32079e;
    }

    @Override
    public final int getWidth() {
        return this.f31752e.f32079e;
    }
}
