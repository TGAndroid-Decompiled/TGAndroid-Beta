package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f23051a;
    public final ImageReceiver f23052b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f23051a = i10;
        this.f23052b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f23051a) {
            case 0:
                this.f23052b.onAttachedToWindow();
                return;
            default:
                this.f23052b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f23051a) {
            case 0:
                this.f23052b.onDetachedFromWindow();
                return;
            default:
                this.f23052b.onDetachedFromWindow();
                return;
        }
    }
}
