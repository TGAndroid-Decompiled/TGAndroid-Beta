package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r8 implements View.OnAttachStateChangeListener {
    public final int f20769a;
    public final ImageReceiver f20770b;

    public r8(ImageReceiver imageReceiver, int i10) {
        this.f20769a = i10;
        this.f20770b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20769a) {
            case 0:
                this.f20770b.onAttachedToWindow();
                return;
            default:
                this.f20770b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20769a) {
            case 0:
                this.f20770b.onDetachedFromWindow();
                return;
            default:
                this.f20770b.onDetachedFromWindow();
                return;
        }
    }
}
