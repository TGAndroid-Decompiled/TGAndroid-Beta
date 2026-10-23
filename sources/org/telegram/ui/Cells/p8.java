package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class p8 implements View.OnAttachStateChangeListener {
    public final int f22763a;
    public final ImageReceiver f22764b;

    public p8(ImageReceiver imageReceiver, int i10) {
        this.f22763a = i10;
        this.f22764b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22763a) {
            case 0:
                this.f22764b.onAttachedToWindow();
                return;
            default:
                this.f22764b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22763a) {
            case 0:
                this.f22764b.onDetachedFromWindow();
                return;
            default:
                this.f22764b.onDetachedFromWindow();
                return;
        }
    }
}
