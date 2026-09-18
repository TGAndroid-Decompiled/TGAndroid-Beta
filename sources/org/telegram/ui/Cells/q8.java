package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20812a;
    public final ImageReceiver f20813b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20812a = i10;
        this.f20813b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20812a) {
            case 0:
                this.f20813b.onAttachedToWindow();
                return;
            default:
                this.f20813b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20812a) {
            case 0:
                this.f20813b.onDetachedFromWindow();
                return;
            default:
                this.f20813b.onDetachedFromWindow();
                return;
        }
    }
}
