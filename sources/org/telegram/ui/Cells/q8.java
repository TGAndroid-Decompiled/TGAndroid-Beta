package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class q8 implements View.OnAttachStateChangeListener {
    public final int f22498a;
    public final ImageReceiver f22499b;

    public q8(ImageReceiver imageReceiver, int i10) {
        this.f22498a = i10;
        this.f22499b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22498a) {
            case 0:
                this.f22499b.onAttachedToWindow();
                return;
            default:
                this.f22499b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22498a) {
            case 0:
                this.f22499b.onDetachedFromWindow();
                return;
            default:
                this.f22499b.onDetachedFromWindow();
                return;
        }
    }
}
