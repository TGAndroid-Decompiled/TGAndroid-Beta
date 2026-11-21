package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class m8 implements View.OnAttachStateChangeListener {
    public final int f31106a;
    public final ImageReceiver f31107b;

    public m8(ImageReceiver imageReceiver, int i7) {
        this.f31106a = i7;
        this.f31107b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f31106a) {
            case 0:
                this.f31107b.P();
                return;
            default:
                this.f31107b.P();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f31106a) {
            case 0:
                this.f31107b.R();
                return;
            default:
                this.f31107b.R();
                return;
        }
    }
}
