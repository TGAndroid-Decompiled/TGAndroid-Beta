package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f21434a;
    public final ImageReceiver f21435b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f21434a = i10;
        this.f21435b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f21434a) {
            case 0:
                this.f21435b.onAttachedToWindow();
                return;
            default:
                this.f21435b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f21434a) {
            case 0:
                this.f21435b.onDetachedFromWindow();
                return;
            default:
                this.f21435b.onDetachedFromWindow();
                return;
        }
    }
}
