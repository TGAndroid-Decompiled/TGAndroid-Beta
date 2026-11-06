package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class s implements Runnable {
    public final int f39460a;
    public final y f39461b;

    public s(y yVar, int i7) {
        this.f39460a = i7;
        this.f39461b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f39460a) {
            case 0:
                this.f39461b.requestLayout();
                return;
            default:
                y yVar = this.f39461b;
                TextView textView = yVar.O;
                u uVar = yVar.f39569a;
                if (!uVar.d.isFirstFrameRendered()) {
                    uVar.animate().cancel();
                    uVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    org.telegram.messenger.camera.q.k(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
