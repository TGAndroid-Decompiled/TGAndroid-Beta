package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class d9 implements td.f, wd.a {
    public final ImageReceiver f27688a;
    public final z8 f27689b;
    public long f27690c;
    public boolean d;
    public final e9 f27691e;

    public d9(e9 e9Var, ViewGroup viewGroup) {
        this.f27691e = e9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f27688a = imageReceiver;
        imageReceiver.setRoundRadius(e9Var.f27982e / 2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        this.f27689b = z8Var;
        z8Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f27688a.onDetachedFromWindow();
        }
        this.f27690c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f27691e.f27983f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d9) || this.f27690c != ((d9) obj).f27690c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f27691e.f27982e;
    }

    @Override
    public final int getWidth() {
        return this.f27691e.f27982e;
    }
}
