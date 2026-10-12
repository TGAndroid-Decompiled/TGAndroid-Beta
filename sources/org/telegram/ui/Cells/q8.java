package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22458a;
    public final ImageReceiver f22459b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22458a = i10;
        this.f22459b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22458a) {
            case 0:
                this.f22459b.onAttachedToWindow();
                return;
            default:
                this.f22459b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22458a) {
            case 0:
                this.f22459b.onDetachedFromWindow();
                return;
            default:
                this.f22459b.onDetachedFromWindow();
                return;
        }
    }
}
