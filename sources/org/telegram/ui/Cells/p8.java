package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class p8 implements View.OnAttachStateChangeListener {
    public final int f22755a;
    public final ImageReceiver f22756b;

    public p8(ImageReceiver imageReceiver, int i10) {
        this.f22755a = i10;
        this.f22756b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22755a) {
            case 0:
                this.f22756b.onAttachedToWindow();
                return;
            default:
                this.f22756b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22755a) {
            case 0:
                this.f22756b.onDetachedFromWindow();
                return;
            default:
                this.f22756b.onDetachedFromWindow();
                return;
        }
    }
}
