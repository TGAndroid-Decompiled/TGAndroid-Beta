package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class jx implements org.telegram.messenger.lc {
    public final kx f47089a;
    public final boolean f47090b;
    public final org.telegram.messenger.ij f47091c;
    public final lx d;

    public jx(lx lxVar, kx kxVar, boolean z9, org.telegram.messenger.ij ijVar) {
        this.d = lxVar;
        this.f47089a = kxVar;
        this.f47090b = z9;
        this.f47091c = ijVar;
    }

    @Override
    public final void O(ImageReceiver imageReceiver) {
        org.telegram.messenger.ij ijVar;
        if (this.f47090b && (ijVar = this.f47091c) != null && ijVar.F2() && imageReceiver.B() != null && imageReceiver.B().f40994y == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ImageReceiver imageReceiver2 = this.f47089a.f47455r;
        if (imageReceiver2.B() != null) {
            imageReceiver2.B().N(0, false, true);
        }
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
    }
}
