package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class o9 implements ne.h, qe.a {
    public final ImageReceiver f27605a;
    public final k9 f27606b;
    public long f27607c;
    public boolean d;
    public final p9 e;

    public o9(p9 p9Var, ViewGroup viewGroup) {
        this.e = p9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f27605a = imageReceiver;
        imageReceiver.setRoundRadius(p9Var.e / 2);
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        this.f27606b = k9Var;
        k9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f27605a.onDetachedFromWindow();
        }
        this.f27607c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f27932f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o9) || this.f27607c != ((o9) obj).f27607c) {
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
