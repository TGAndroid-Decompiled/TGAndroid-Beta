package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n9 implements me.h, pe.a {
    public final ImageReceiver f29003a;
    public final j9 f29004b;
    public long f29005c;
    public boolean d;
    public final o9 f29006e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.f29006e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f29003a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.f29341e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.d6) null);
        this.f29004b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f29003a.onDetachedFromWindow();
        }
        this.f29005c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f29006e.f29342f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9) || this.f29005c != ((n9) obj).f29005c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f29006e.f29341e;
    }

    @Override
    public final int getWidth() {
        return this.f29006e.f29341e;
    }
}
