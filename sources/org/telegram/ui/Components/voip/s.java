package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class s implements Runnable {
    public final int f39525a;
    public final y f39526b;

    public s(y yVar, int i7) {
        this.f39525a = i7;
        this.f39526b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f39525a) {
            case 0:
                this.f39526b.requestLayout();
                return;
            default:
                y yVar = this.f39526b;
                TextView textView = yVar.O;
                u uVar = yVar.f39636a;
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
