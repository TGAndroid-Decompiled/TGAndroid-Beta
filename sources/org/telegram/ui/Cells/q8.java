package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22457a;
    public final ImageReceiver f22458b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22457a = i10;
        this.f22458b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22457a) {
            case 0:
                this.f22458b.onAttachedToWindow();
                return;
            default:
                this.f22458b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22457a) {
            case 0:
                this.f22458b.onDetachedFromWindow();
                return;
            default:
                this.f22458b.onDetachedFromWindow();
                return;
        }
    }
}
