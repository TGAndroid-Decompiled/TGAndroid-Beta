package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n9 implements me.h, pe.a {
    public final ImageReceiver f28744a;
    public final j9 f28745b;
    public long f28746c;
    public boolean d;
    public final o9 f28747e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.f28747e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f28744a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.f29105e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        this.f28745b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f28744a.onDetachedFromWindow();
        }
        this.f28746c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f28747e.f29106f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9) || this.f28746c != ((n9) obj).f28746c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f28747e.f29105e;
    }

    @Override
    public final int getWidth() {
        return this.f28747e.f29105e;
    }
}
