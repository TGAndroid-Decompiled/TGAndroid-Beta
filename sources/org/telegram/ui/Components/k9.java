package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class k9 implements le.h, oe.a {
    public final ImageReceiver f24673a;
    public final g9 f24674b;
    public long f24675c;
    public boolean d;
    public final l9 e;

    public k9(l9 l9Var, ViewGroup viewGroup) {
        this.e = l9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f24673a = imageReceiver;
        imageReceiver.setRoundRadius(l9Var.e / 2);
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f24674b = g9Var;
        g9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f24673a.onDetachedFromWindow();
        }
        this.f24675c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f24908f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k9) || this.f24675c != ((k9) obj).f24675c) {
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
