package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class e9 implements xd.f, ae.a {
    public final ImageReceiver f26483a;
    public final z8 f26484b;
    public long f26485c;
    public boolean d;
    public final f9 f26486e;

    public e9(f9 f9Var, ViewGroup viewGroup) {
        this.f26486e = f9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f26483a = imageReceiver;
        imageReceiver.setRoundRadius(f9Var.f26793e / 2);
        z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
        this.f26484b = z8Var;
        z8Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f26483a.onDetachedFromWindow();
        }
        this.f26485c = 0L;
    }

    @Override
    public final int b(boolean z4) {
        if (z4) {
            return 0;
        }
        return -this.f26486e.f26794f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e9) || this.f26485c != ((e9) obj).f26485c) {
            return false;
        }
        return true;
    }

    @Override
    public final int getHeight() {
        return this.f26486e.f26793e;
    }

    @Override
    public final int getWidth() {
        return this.f26486e.f26793e;
    }
}
