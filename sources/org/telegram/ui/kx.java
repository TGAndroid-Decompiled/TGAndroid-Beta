package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class kx implements org.telegram.messenger.jc {
    public final lx f49547a;
    public final boolean f49548b;
    public final org.telegram.messenger.fj f49549c;
    public final mx d;

    public kx(mx mxVar, lx lxVar, boolean z10, org.telegram.messenger.fj fjVar) {
        this.d = mxVar;
        this.f49547a = lxVar;
        this.f49548b = z10;
        this.f49549c = fjVar;
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        org.telegram.messenger.fj fjVar;
        if (this.f49548b && (fjVar = this.f49549c) != null && fjVar.F2() && imageReceiver.C() != null && imageReceiver.C().f37831y == null) {
            try {
                this.d.H.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ImageReceiver imageReceiver2 = this.f49547a.f49867r;
        if (imageReceiver2.C() != null) {
            imageReceiver2.C().N(0, false, true);
        }
    }

    @Override
    public final void J(int i7, Drawable drawable) {
    }
}
