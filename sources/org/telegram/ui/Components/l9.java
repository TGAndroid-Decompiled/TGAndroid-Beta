package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class l9 implements le.h, oe.a {
    public final ImageReceiver f26073a;
    public final h9 f26074b;
    public long f26075c;
    public boolean d;
    public final m9 e;

    public l9(m9 m9Var, ViewGroup viewGroup) {
        this.e = m9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f26073a = imageReceiver;
        imageReceiver.setRoundRadius(m9Var.e / 2);
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        this.f26074b = h9Var;
        h9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f26073a.onDetachedFromWindow();
        }
        this.f26075c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f26360f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l9) || this.f26075c != ((l9) obj).f26075c) {
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
