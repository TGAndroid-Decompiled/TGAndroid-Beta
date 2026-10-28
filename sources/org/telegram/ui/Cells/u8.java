package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class u8 implements View.OnAttachStateChangeListener {
    public final int f25488a;
    public final ImageReceiver f25489b;

    public u8(ImageReceiver imageReceiver, int i10) {
        this.f25488a = i10;
        this.f25489b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f25488a) {
            case 0:
                this.f25489b.onAttachedToWindow();
                return;
            default:
                this.f25489b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25488a) {
            case 0:
                this.f25489b.onDetachedFromWindow();
                return;
            default:
                this.f25489b.onDetachedFromWindow();
                return;
        }
    }
}
