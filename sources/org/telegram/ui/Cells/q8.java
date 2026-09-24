package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20834a;
    public final ImageReceiver f20835b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20834a = i10;
        this.f20835b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20834a) {
            case 0:
                this.f20835b.onAttachedToWindow();
                return;
            default:
                this.f20835b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20834a) {
            case 0:
                this.f20835b.onDetachedFromWindow();
                return;
            default:
                this.f20835b.onDetachedFromWindow();
                return;
        }
    }
}
