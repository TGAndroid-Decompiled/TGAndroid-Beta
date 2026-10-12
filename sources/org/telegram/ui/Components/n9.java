package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n9 implements me.h, pe.a {
    public final ImageReceiver f28755a;
    public final j9 f28756b;
    public long f28757c;
    public boolean d;
    public final o9 f28758e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.f28758e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f28755a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.f29101e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        this.f28756b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f28755a.onDetachedFromWindow();
        }
        this.f28757c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f28758e.f29102f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9) || this.f28757c != ((n9) obj).f28757c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f28758e.f29101e;
    }

    @Override
    public final int getWidth() {
        return this.f28758e.f29101e;
    }
}
