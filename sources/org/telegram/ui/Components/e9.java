package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class e9 implements xd.f, ae.a {
    public final ImageReceiver f24496a;
    public final z8 f24497b;
    public long f24498c;
    public boolean d;
    public final f9 e;

    public e9(f9 f9Var, ViewGroup viewGroup) {
        this.e = f9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f24496a = imageReceiver;
        imageReceiver.setRoundRadius(f9Var.e / 2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        this.f24497b = z8Var;
        z8Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f24496a.onDetachedFromWindow();
        }
        this.f24498c = 0L;
    }

    @Override
    public final int b(boolean z4) {
        if (z4) {
            return 0;
        }
        return -this.e.f24806f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e9) || this.f24498c != ((e9) obj).f24498c) {
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
