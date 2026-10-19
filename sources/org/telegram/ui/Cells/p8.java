package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class p8 implements View.OnAttachStateChangeListener {
    public final int f22756a;
    public final ImageReceiver f22757b;

    public p8(ImageReceiver imageReceiver, int i10) {
        this.f22756a = i10;
        this.f22757b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f22756a) {
            case 0:
                this.f22757b.onAttachedToWindow();
                return;
            default:
                this.f22757b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f22756a) {
            case 0:
                this.f22757b.onDetachedFromWindow();
                return;
            default:
                this.f22757b.onDetachedFromWindow();
                return;
        }
    }
}
