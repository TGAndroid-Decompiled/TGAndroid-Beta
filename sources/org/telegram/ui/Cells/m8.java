package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class m8 implements View.OnAttachStateChangeListener {
    public final int f31078a;
    public final ImageReceiver f31079b;

    public m8(ImageReceiver imageReceiver, int i7) {
        this.f31078a = i7;
        this.f31079b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f31078a) {
            case 0:
                this.f31079b.P();
                return;
            default:
                this.f31079b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31078a) {
            case 0:
                this.f31079b.R();
                return;
            default:
                this.f31079b.R();
                return;
        }
    }
}
