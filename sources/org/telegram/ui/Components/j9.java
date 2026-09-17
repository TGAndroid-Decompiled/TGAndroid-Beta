package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class j9 implements le.h, oe.a {
    public final ImageReceiver f25188a;
    public final f9 f25189b;
    public long f25190c;
    public boolean d;
    public final k9 e;

    public j9(k9 k9Var, ViewGroup viewGroup) {
        this.e = k9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f25188a = imageReceiver;
        imageReceiver.setRoundRadius(k9Var.e / 2);
        f9 f9Var = new f9((org.telegram.ui.ActionBar.f6) null);
        this.f25189b = f9Var;
        f9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f25188a.onDetachedFromWindow();
        }
        this.f25190c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f25598f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j9) || this.f25190c != ((j9) obj).f25190c) {
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
