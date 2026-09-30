package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f20867a;
    public final ImageReceiver f20868b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f20867a = i10;
        this.f20868b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20867a) {
            case 0:
                this.f20868b.onAttachedToWindow();
                return;
            default:
                this.f20868b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20867a) {
            case 0:
                this.f20868b.onDetachedFromWindow();
                return;
            default:
                this.f20868b.onDetachedFromWindow();
                return;
        }
    }
}
