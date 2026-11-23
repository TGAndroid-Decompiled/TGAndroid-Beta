package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class m8 implements View.OnAttachStateChangeListener {
    public final int f31109a;
    public final ImageReceiver f31110b;

    public m8(ImageReceiver imageReceiver, int i7) {
        this.f31109a = i7;
        this.f31110b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f31109a) {
            case 0:
                this.f31110b.P();
                return;
            default:
                this.f31110b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31109a) {
            case 0:
                this.f31110b.R();
                return;
            default:
                this.f31110b.R();
                return;
        }
    }
}
