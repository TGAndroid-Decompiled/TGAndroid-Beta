package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class gx implements org.telegram.messenger.lc {
    public final hx f46106a;
    public final boolean f46107b;
    public final org.telegram.messenger.ij f46108c;
    public final ix d;

    public gx(ix ixVar, hx hxVar, boolean z9, org.telegram.messenger.ij ijVar) {
        this.d = ixVar;
        this.f46106a = hxVar;
        this.f46107b = z9;
        this.f46108c = ijVar;
    }

    @Override
    public final void O(ImageReceiver imageReceiver) {
        org.telegram.messenger.ij ijVar;
        if (this.f46107b && (ijVar = this.f46108c) != null && ijVar.G2() && imageReceiver.B() != null && imageReceiver.B().f40957y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver2 = this.f46106a.f46511r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
    }
}
