package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

public final class c9 implements ud.f, xd.a {

    public final ImageReceiver f27379a;

    public final y8 f27380b;

    public long f27381c;
    public boolean d;

    public final d9 f27382e;

    public c9(d9 d9Var, ViewGroup viewGroup) {
        this.f27382e = d9Var;
        ImageReceiver imageReceiver = new ImageReceiver(viewGroup);
        this.f27379a = imageReceiver;
        imageReceiver.setRoundRadius(d9Var.f27676e / 2);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        this.f27380b = y8Var;
        y8Var.u(AndroidUtilities.dp(22.0f));
    }

    @Override
    public final void a() {
        if (this.d) {
            this.d = false;
            this.f27379a.onDetachedFromWindow();
        }
        this.f27381c = 0L;
    }

    @Override
    public final int b(boolean z10) {
        if (z10) {
            return 0;
        }
        return -this.f27382e.f27677f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof c9) && this.f27381c == ((c9) obj).f27381c;
    }

    @Override
    public final int getHeight() {
        return this.f27382e.f27676e;
    }

    @Override
    public final int getWidth() {
        return this.f27382e.f27676e;
    }
}
