package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class l8 implements View.OnAttachStateChangeListener {
    public final int f29515a;
    public final ImageReceiver f29516b;

    public l8(ImageReceiver imageReceiver, int i7) {
        this.f29515a = i7;
        this.f29516b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f29515a) {
            case 0:
                this.f29516b.P();
                return;
            default:
                this.f29516b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29515a) {
            case 0:
                this.f29516b.R();
                return;
            default:
                this.f29516b.R();
                return;
        }
    }
}
