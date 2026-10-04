package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22692a;
    public final ImageReceiver f22693b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22692a = i10;
        this.f22693b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22692a) {
            case 0:
                this.f22693b.onAttachedToWindow();
                return;
            default:
                this.f22693b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22692a) {
            case 0:
                this.f22693b.onDetachedFromWindow();
                return;
            default:
                this.f22693b.onDetachedFromWindow();
                return;
        }
    }
}
