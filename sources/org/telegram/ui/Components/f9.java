package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class f9 implements te.f, we.a {
    public final ImageReceiver f35160a;
    public final b9 f35161b;
    public long f35162c;
    public boolean d;
    public final g9 f35163e;

    public f9(g9 g9Var, View view) {
        this.f35163e = g9Var;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f35160a = imageReceiver;
        imageReceiver.J0(g9Var.f35481e / 2);
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        this.f35161b = b9Var;
        b9Var.u(org.telegram.messenger.g0.L(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f35160a.R();
        }
        this.f35162c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f35163e.f35482f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f9) || this.f35162c != ((f9) obj).f35162c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f35163e.f35481e;
    }

    @Override
    public final int getWidth() {
        return this.f35163e.f35481e;
    }
}
