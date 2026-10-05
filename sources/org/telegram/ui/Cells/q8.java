package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22700a;
    public final ImageReceiver f22701b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22700a = i10;
        this.f22701b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22700a) {
            case 0:
                this.f22701b.onAttachedToWindow();
                return;
            default:
                this.f22701b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22700a) {
            case 0:
                this.f22701b.onDetachedFromWindow();
                return;
            default:
                this.f22701b.onDetachedFromWindow();
                return;
        }
    }
}
