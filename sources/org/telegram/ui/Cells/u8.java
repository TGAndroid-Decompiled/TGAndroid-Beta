package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class u8 implements View.OnAttachStateChangeListener {
    public final int f25486a;
    public final ImageReceiver f25487b;

    public u8(ImageReceiver imageReceiver, int i10) {
        this.f25486a = i10;
        this.f25487b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f25486a) {
            case 0:
                this.f25487b.onAttachedToWindow();
                return;
            default:
                this.f25487b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25486a) {
            case 0:
                this.f25487b.onDetachedFromWindow();
                return;
            default:
                this.f25487b.onDetachedFromWindow();
                return;
        }
    }
}
