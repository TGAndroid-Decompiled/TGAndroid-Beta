package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class l9 implements le.h, oe.a {
    public final ImageReceiver f28308a;
    public final h9 f28309b;
    public long f28310c;
    public boolean d;
    public final m9 f28311e;

    public l9(m9 m9Var, ViewGroup viewGroup) {
        this.f28311e = m9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f28308a = imageReceiver;
        imageReceiver.setRoundRadius(m9Var.f28551e / 2);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f28309b = h9Var;
        h9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f28308a.onDetachedFromWindow();
        }
        this.f28310c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f28311e.f28552f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l9) || this.f28310c != ((l9) obj).f28310c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f28311e.f28551e;
    }

    @Override
    public final int getWidth() {
        return this.f28311e.f28551e;
    }
}
