package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22686a;
    public final ImageReceiver f22687b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22686a = i10;
        this.f22687b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22686a) {
            case 0:
                this.f22687b.onAttachedToWindow();
                return;
            default:
                this.f22687b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22686a) {
            case 0:
                this.f22687b.onDetachedFromWindow();
                return;
            default:
                this.f22687b.onDetachedFromWindow();
                return;
        }
    }
}
