package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class l8 implements View.OnAttachStateChangeListener {
    public final int f31089a;
    public final ImageReceiver f31090b;

    public l8(ImageReceiver imageReceiver, int i7) {
        this.f31089a = i7;
        this.f31090b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f31089a) {
            case 0:
                this.f31090b.Q();
                return;
            default:
                this.f31090b.Q();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31089a) {
            case 0:
                this.f31090b.S();
                return;
            default:
                this.f31090b.S();
                return;
        }
    }
}
