package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class l8 implements View.OnAttachStateChangeListener {
    public final int f29522a;
    public final ImageReceiver f29523b;

    public l8(ImageReceiver imageReceiver, int i7) {
        this.f29522a = i7;
        this.f29523b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f29522a) {
            case 0:
                this.f29523b.P();
                return;
            default:
                this.f29523b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f29522a) {
            case 0:
                this.f29523b.R();
                return;
            default:
                this.f29523b.R();
                return;
        }
    }
}
