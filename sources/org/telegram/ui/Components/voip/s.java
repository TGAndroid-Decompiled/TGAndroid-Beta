package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.o10;
public final class s implements Runnable {
    public final int f41333a;
    public final y f41334b;

    public s(y yVar, int i7) {
        this.f41333a = i7;
        this.f41334b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f41333a) {
            case 0:
                this.f41334b.requestLayout();
                return;
            default:
                y yVar = this.f41334b;
                TextView textView = yVar.P;
                u uVar = yVar.f41461a;
                if (!uVar.d.isFirstFrameRendered()) {
                    uVar.animate().cancel();
                    uVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    o10.n(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
