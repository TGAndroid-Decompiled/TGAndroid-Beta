package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r8 implements View.OnAttachStateChangeListener {
    public final int f20887a;
    public final ImageReceiver f20888b;

    public r8(ImageReceiver imageReceiver, int i10) {
        this.f20887a = i10;
        this.f20888b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20887a) {
            case 0:
                this.f20888b.onAttachedToWindow();
                return;
            default:
                this.f20888b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20887a) {
            case 0:
                this.f20888b.onDetachedFromWindow();
                return;
            default:
                this.f20888b.onDetachedFromWindow();
                return;
        }
    }
}
