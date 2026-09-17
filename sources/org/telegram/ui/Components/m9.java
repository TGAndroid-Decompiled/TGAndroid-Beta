package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class m9 implements le.h, oe.a {
    public final ImageReceiver f28417a;
    public final i9 f28418b;
    public long f28419c;
    public boolean d;
    public final n9 f28420e;

    public m9(n9 n9Var, ViewGroup viewGroup) {
        this.f28420e = n9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f28417a = imageReceiver;
        imageReceiver.setRoundRadius(n9Var.f28694e / 2);
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        this.f28418b = i9Var;
        i9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f28417a.onDetachedFromWindow();
        }
        this.f28419c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f28420e.f28695f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m9) || this.f28419c != ((m9) obj).f28419c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f28420e.f28694e;
    }

    @Override
    public final int getWidth() {
        return this.f28420e.f28694e;
    }
}
