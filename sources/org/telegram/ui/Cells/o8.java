package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class o8 implements View.OnAttachStateChangeListener {
    public final int f24839a;
    public final ImageReceiver f24840b;

    public o8(ImageReceiver imageReceiver, int i9) {
        this.f24839a = i9;
        this.f24840b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f24839a) {
            case 0:
                this.f24840b.onAttachedToWindow();
                return;
            default:
                this.f24840b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f24839a) {
            case 0:
                this.f24840b.onDetachedFromWindow();
                return;
            default:
                this.f24840b.onDetachedFromWindow();
                return;
        }
    }
}
