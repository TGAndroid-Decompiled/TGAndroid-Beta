package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class k8 implements View.OnAttachStateChangeListener {
    public final int f29507a;
    public final ImageReceiver f29508b;

    public k8(ImageReceiver imageReceiver, int i3) {
        this.f29507a = i3;
        this.f29508b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f29507a) {
            case 0:
                this.f29508b.P();
                return;
            default:
                this.f29508b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29507a) {
            case 0:
                this.f29508b.R();
                return;
            default:
                this.f29508b.R();
                return;
        }
    }
}
