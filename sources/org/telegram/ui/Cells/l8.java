package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class l8 implements View.OnAttachStateChangeListener {
    public final int f29533a;
    public final ImageReceiver f29534b;

    public l8(ImageReceiver imageReceiver, int i7) {
        this.f29533a = i7;
        this.f29534b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f29533a) {
            case 0:
                this.f29534b.P();
                return;
            default:
                this.f29534b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29533a) {
            case 0:
                this.f29534b.R();
                return;
            default:
                this.f29534b.R();
                return;
        }
    }
}
