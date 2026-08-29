package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class i9 implements vd.g, yd.a {
    public final ImageReceiver f29350a;
    public final e9 f29351b;
    public long f29352c;
    public boolean d;
    public final j9 f29353e;

    public i9(j9 j9Var, ViewGroup viewGroup) {
        this.f29353e = j9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f29350a = imageReceiver;
        imageReceiver.setRoundRadius(j9Var.f29622e / 2);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        this.f29351b = e9Var;
        e9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f29350a.onDetachedFromWindow();
        }
        this.f29352c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f29353e.f29623f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i9) || this.f29352c != ((i9) obj).f29352c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f29353e.f29622e;
    }

    @Override
    public final int getWidth() {
        return this.f29353e.f29622e;
    }
}
