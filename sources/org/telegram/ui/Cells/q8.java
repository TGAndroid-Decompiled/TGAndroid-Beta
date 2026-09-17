package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22499a;
    public final ImageReceiver f22500b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22499a = i10;
        this.f22500b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22499a) {
            case 0:
                this.f22500b.onAttachedToWindow();
                return;
            default:
                this.f22500b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22499a) {
            case 0:
                this.f22500b.onDetachedFromWindow();
                return;
            default:
                this.f22500b.onDetachedFromWindow();
                return;
        }
    }
}
