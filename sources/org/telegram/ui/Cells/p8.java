package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class p8 implements View.OnAttachStateChangeListener {
    public final int f22759a;
    public final ImageReceiver f22760b;

    public p8(ImageReceiver imageReceiver, int i10) {
        this.f22759a = i10;
        this.f22760b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22759a) {
            case 0:
                this.f22760b.onAttachedToWindow();
                return;
            default:
                this.f22760b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22759a) {
            case 0:
                this.f22760b.onDetachedFromWindow();
                return;
            default:
                this.f22760b.onDetachedFromWindow();
                return;
        }
    }
}
