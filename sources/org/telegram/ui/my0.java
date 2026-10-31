package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class my0 implements org.telegram.messenger.mc {
    public final Runnable[] f39792a;

    public my0(Runnable[] runnableArr) {
        this.f39792a = runnableArr;
    }

    @Override
    public final void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.f39792a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.bi0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.A0 = new wv0(runnableArr, 9);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void j(ImageReceiver imageReceiver) {
    }

    @Override
    public final void q(int i10, Drawable drawable) {
    }
}
