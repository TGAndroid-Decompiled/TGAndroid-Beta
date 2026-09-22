package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20614a;
    public final ImageReceiver f20615b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20614a = i10;
        this.f20615b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20614a) {
            case 0:
                this.f20615b.onAttachedToWindow();
                return;
            default:
                this.f20615b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20614a) {
            case 0:
                this.f20615b.onDetachedFromWindow();
                return;
            default:
                this.f20615b.onDetachedFromWindow();
                return;
        }
    }
}
