package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public final class j9 implements le.h, oe.a {
    public final ImageReceiver f25266a;
    public final f9 f25267b;
    public long f25268c;
    public boolean d;
    public final k9 e;

    public j9(k9 k9Var, ViewGroup viewGroup) {
        this.e = k9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f25266a = imageReceiver;
        imageReceiver.setRoundRadius(k9Var.e / 2);
        f9 f9Var = new f9((org.telegram.ui.ActionBar.e6) null);
        this.f25267b = f9Var;
        f9Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f25266a.onDetachedFromWindow();
        }
        this.f25268c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.e.f25573f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j9) || this.f25268c != ((j9) obj).f25268c) {
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
