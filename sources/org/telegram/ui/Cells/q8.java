package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20849a;
    public final ImageReceiver f20850b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20849a = i10;
        this.f20850b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20849a) {
            case 0:
                this.f20850b.onAttachedToWindow();
                return;
            default:
                this.f20850b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20849a) {
            case 0:
                this.f20850b.onDetachedFromWindow();
                return;
            default:
                this.f20850b.onDetachedFromWindow();
                return;
        }
    }
}
