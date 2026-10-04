package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22693a;
    public final ImageReceiver f22694b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22693a = i10;
        this.f22694b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22693a) {
            case 0:
                this.f22694b.onAttachedToWindow();
                return;
            default:
                this.f22694b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22693a) {
            case 0:
                this.f22694b.onDetachedFromWindow();
                return;
            default:
                this.f22694b.onDetachedFromWindow();
                return;
        }
    }
}
