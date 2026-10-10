package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22698a;
    public final ImageReceiver f22699b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22698a = i10;
        this.f22699b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22698a) {
            case 0:
                this.f22699b.onAttachedToWindow();
                return;
            default:
                this.f22699b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22698a) {
            case 0:
                this.f22699b.onDetachedFromWindow();
                return;
            default:
                this.f22699b.onDetachedFromWindow();
                return;
        }
    }
}
