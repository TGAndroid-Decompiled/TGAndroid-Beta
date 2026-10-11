package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22722a;
    public final ImageReceiver f22723b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22722a = i10;
        this.f22723b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22722a) {
            case 0:
                this.f22723b.onAttachedToWindow();
                return;
            default:
                this.f22723b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22722a) {
            case 0:
                this.f22723b.onDetachedFromWindow();
                return;
            default:
                this.f22723b.onDetachedFromWindow();
                return;
        }
    }
}
