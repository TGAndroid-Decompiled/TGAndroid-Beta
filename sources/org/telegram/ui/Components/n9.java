package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n9 implements me.h, pe.a {
    public final ImageReceiver f29079a;
    public final j9 f29080b;
    public long f29081c;
    public boolean d;
    public final o9 f29082e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.f29082e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f29079a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.f29413e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        this.f29080b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f29079a.onDetachedFromWindow();
        }
        this.f29081c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f29082e.f29414f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9) || this.f29081c != ((n9) obj).f29081c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f29082e.f29413e;
    }

    @Override
    public final int getWidth() {
        return this.f29082e.f29413e;
    }
}
