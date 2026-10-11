package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n9 implements me.h, pe.a {
    public final ImageReceiver f29119a;
    public final j9 f29120b;
    public long f29121c;
    public boolean d;
    public final o9 f29122e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.f29122e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f29119a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.f29416e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.d6) null);
        this.f29120b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f29119a.onDetachedFromWindow();
        }
        this.f29121c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f29122e.f29417f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9) || this.f29121c != ((n9) obj).f29121c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f29122e.f29416e;
    }

    @Override
    public final int getWidth() {
        return this.f29122e.f29416e;
    }
}
