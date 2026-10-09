package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22694a;
    public final ImageReceiver f22695b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22694a = i10;
        this.f22695b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22694a) {
            case 0:
                this.f22695b.onAttachedToWindow();
                return;
            default:
                this.f22695b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22694a) {
            case 0:
                this.f22695b.onDetachedFromWindow();
                return;
            default:
                this.f22695b.onDetachedFromWindow();
                return;
        }
    }
}
