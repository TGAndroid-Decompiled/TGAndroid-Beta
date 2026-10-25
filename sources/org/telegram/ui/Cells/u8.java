package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class u8 implements View.OnAttachStateChangeListener {
    public final int f25484a;
    public final ImageReceiver f25485b;

    public u8(ImageReceiver imageReceiver, int i10) {
        this.f25484a = i10;
        this.f25485b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f25484a) {
            case 0:
                this.f25485b.onAttachedToWindow();
                return;
            default:
                this.f25485b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25484a) {
            case 0:
                this.f25485b.onDetachedFromWindow();
                return;
            default:
                this.f25485b.onDetachedFromWindow();
                return;
        }
    }
}
