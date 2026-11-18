package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class bx0 implements org.telegram.messenger.jc {
    public final Runnable[] f46318a;

    public bx0(Runnable[] runnableArr) {
        this.f46318a = runnableArr;
    }

    @Override
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.f46318a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.mh0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.B0 = new ru0(runnableArr, 7);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void V(ImageReceiver imageReceiver) {
    }

    @Override
    public final void G0(int i7, Drawable drawable) {
    }
}
