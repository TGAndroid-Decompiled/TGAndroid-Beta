package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20850a;
    public final ImageReceiver f20851b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20850a = i10;
        this.f20851b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20850a) {
            case 0:
                this.f20851b.onAttachedToWindow();
                return;
            default:
                this.f20851b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20850a) {
            case 0:
                this.f20851b.onDetachedFromWindow();
                return;
            default:
                this.f20851b.onDetachedFromWindow();
                return;
        }
    }
}
