package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f23052a;
    public final ImageReceiver f23053b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f23052a = i10;
        this.f23053b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f23052a) {
            case 0:
                this.f23053b.onAttachedToWindow();
                return;
            default:
                this.f23053b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f23052a) {
            case 0:
                this.f23053b.onDetachedFromWindow();
                return;
            default:
                this.f23053b.onDetachedFromWindow();
                return;
        }
    }
}
