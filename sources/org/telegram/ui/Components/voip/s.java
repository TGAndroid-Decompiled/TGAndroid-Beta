package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class s implements Runnable {
    public final int f39516a;
    public final y f39517b;

    public s(y yVar, int i7) {
        this.f39516a = i7;
        this.f39517b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f39516a) {
            case 0:
                this.f39517b.requestLayout();
                return;
            default:
                y yVar = this.f39517b;
                TextView textView = yVar.O;
                u uVar = yVar.f39625a;
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
