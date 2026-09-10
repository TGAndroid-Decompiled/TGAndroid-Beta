package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
public final class r8 implements View.OnAttachStateChangeListener {
    public final int f19901a;
    public final ImageReceiver f19902b;

    public r8(ImageReceiver imageReceiver, int i10) {
        this.f19901a = i10;
        this.f19902b = imageReceiver;
    }

    @Override
    public final void onViewAttachedToWindow(View view) {
        switch (this.f19901a) {
            case 0:
                this.f19902b.onAttachedToWindow();
                return;
            default:
                this.f19902b.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f19901a) {
            case 0:
                this.f19902b.onDetachedFromWindow();
                return;
            default:
                this.f19902b.onDetachedFromWindow();
                return;
        }
    }
}
