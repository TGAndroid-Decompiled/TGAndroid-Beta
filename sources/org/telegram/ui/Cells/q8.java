package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22697a;
    public final ImageReceiver f22698b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22697a = i10;
        this.f22698b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22697a) {
            case 0:
                this.f22698b.onAttachedToWindow();
                return;
            default:
                this.f22698b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22697a) {
            case 0:
                this.f22698b.onDetachedFromWindow();
                return;
            default:
                this.f22698b.onDetachedFromWindow();
                return;
        }
    }
}
