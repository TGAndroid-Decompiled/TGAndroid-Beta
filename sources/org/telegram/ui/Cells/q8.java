package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20627a;
    public final ImageReceiver f20628b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20627a = i10;
        this.f20628b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20627a) {
            case 0:
                this.f20628b.onAttachedToWindow();
                return;
            default:
                this.f20628b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20627a) {
            case 0:
                this.f20628b.onDetachedFromWindow();
                return;
            default:
                this.f20628b.onDetachedFromWindow();
                return;
        }
    }
}
