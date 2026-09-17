package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20626a;
    public final ImageReceiver f20627b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20626a = i10;
        this.f20627b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20626a) {
            case 0:
                this.f20627b.onAttachedToWindow();
                return;
            default:
                this.f20627b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20626a) {
            case 0:
                this.f20627b.onDetachedFromWindow();
                return;
            default:
                this.f20627b.onDetachedFromWindow();
                return;
        }
    }
}
