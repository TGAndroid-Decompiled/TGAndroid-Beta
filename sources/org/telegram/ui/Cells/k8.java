package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class k8 implements View.OnAttachStateChangeListener {
    public final int f30568a;
    public final ImageReceiver f30569b;

    public k8(ImageReceiver imageReceiver, int i7) {
        this.f30568a = i7;
        this.f30569b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f30568a) {
            case 0:
                this.f30569b.P();
                return;
            default:
                this.f30569b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f30568a) {
            case 0:
                this.f30569b.R();
                return;
            default:
                this.f30569b.R();
                return;
        }
    }
}
