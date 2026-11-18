package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.n10;
public final class s implements Runnable {
    public final int f41197a;
    public final y f41198b;

    public s(y yVar, int i7) {
        this.f41197a = i7;
        this.f41198b = yVar;
    }

    @Override
    public final void run() {
        switch (this.f41197a) {
            case 0:
                this.f41198b.requestLayout();
                return;
            default:
                y yVar = this.f41198b;
                TextView textView = yVar.P;
                u uVar = yVar.f41325a;
                if (!uVar.d.isFirstFrameRendered()) {
                    uVar.animate().cancel();
                    uVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    n10.n(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
