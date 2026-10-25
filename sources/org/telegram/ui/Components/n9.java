package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class n9 implements oe.h, re.a {
    public final ImageReceiver f30923a;
    public final j9 f30924b;
    public long f30925c;
    public boolean d;
    public final o9 e;

    public n9(o9 o9Var, ViewGroup viewGroup) {
        this.e = o9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f30923a = imageReceiver;
        imageReceiver.setRoundRadius(o9Var.e / 2);
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        this.f30924b = j9Var;
        j9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f30923a.onDetachedFromWindow();
        }
        this.f30925c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f31229f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n9) || this.f30925c != ((n9) obj).f30925c) {
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
