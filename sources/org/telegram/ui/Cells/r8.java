package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r8 implements View.OnAttachStateChangeListener {
    public final int f20902a;
    public final ImageReceiver f20903b;

    public r8(ImageReceiver imageReceiver, int i10) {
        this.f20902a = i10;
        this.f20903b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f20902a) {
            case 0:
                this.f20903b.onAttachedToWindow();
                return;
            default:
                this.f20903b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f20902a) {
            case 0:
                this.f20903b.onDetachedFromWindow();
                return;
            default:
                this.f20903b.onDetachedFromWindow();
                return;
        }
    }
}
