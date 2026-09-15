package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20616a;
    public final ImageReceiver f20617b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20616a = i10;
        this.f20617b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20616a) {
            case 0:
                this.f20617b.onAttachedToWindow();
                return;
            default:
                this.f20617b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20616a) {
            case 0:
                this.f20617b.onDetachedFromWindow();
                return;
            default:
                this.f20617b.onDetachedFromWindow();
                return;
        }
    }
}
