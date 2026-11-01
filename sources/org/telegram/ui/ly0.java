package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class ly0 implements org.telegram.messenger.nc {
    public final Runnable[] f39402a;

    public ly0(Runnable[] runnableArr) {
        this.f39402a = runnableArr;
    }

    @Override
    public final void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.I()) {
            Runnable[] runnableArr = this.f39402a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.ci0 B = imageReceiver.B();
                if (B == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (B.y()) {
                    B.A0 = new vv0(runnableArr, 9);
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
    public final void s(int i10, Drawable drawable) {
    }
}
