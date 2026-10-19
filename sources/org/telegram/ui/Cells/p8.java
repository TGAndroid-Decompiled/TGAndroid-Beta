package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class p8 implements View.OnAttachStateChangeListener {
    public final int f22758a;
    public final ImageReceiver f22759b;

    public p8(ImageReceiver imageReceiver, int i10) {
        this.f22758a = i10;
        this.f22759b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22758a) {
            case 0:
                this.f22759b.onAttachedToWindow();
                return;
            default:
                this.f22759b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22758a) {
            case 0:
                this.f22759b.onDetachedFromWindow();
                return;
            default:
                this.f22759b.onDetachedFromWindow();
                return;
        }
    }
}
