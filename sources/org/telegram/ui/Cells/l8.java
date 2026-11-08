package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class l8 implements View.OnAttachStateChangeListener {
    public final int f29518a;
    public final ImageReceiver f29519b;

    public l8(ImageReceiver imageReceiver, int i7) {
        this.f29518a = i7;
        this.f29519b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f29518a) {
            case 0:
                this.f29519b.P();
                return;
            default:
                this.f29519b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29518a) {
            case 0:
                this.f29519b.R();
                return;
            default:
                this.f29519b.R();
                return;
        }
    }
}
