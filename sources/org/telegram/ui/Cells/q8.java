package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22526a;
    public final ImageReceiver f22527b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22526a = i10;
        this.f22527b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22526a) {
            case 0:
                this.f22527b.onAttachedToWindow();
                return;
            default:
                this.f22527b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22526a) {
            case 0:
                this.f22527b.onDetachedFromWindow();
                return;
            default:
                this.f22527b.onDetachedFromWindow();
                return;
        }
    }
}
