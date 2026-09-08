package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22525a;
    public final ImageReceiver f22526b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22525a = i10;
        this.f22526b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22525a) {
            case 0:
                this.f22526b.onAttachedToWindow();
                return;
            default:
                this.f22526b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22525a) {
            case 0:
                this.f22526b.onDetachedFromWindow();
                return;
            default:
                this.f22526b.onDetachedFromWindow();
                return;
        }
    }
}
