package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n9 implements me.h, pe.a {
    public final ImageReceiver f29069a;
    public final j9 f29070b;
    public long f29071c;
    public boolean d;
    public final o9 f29072e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.f29072e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f29069a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.f29384e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        this.f29070b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f29069a.onDetachedFromWindow();
        }
        this.f29071c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f29072e.f29385f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9) || this.f29071c != ((n9) obj).f29071c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f29072e.f29384e;
    }

    @Override
    public final int getWidth() {
        return this.f29072e.f29384e;
    }
}
