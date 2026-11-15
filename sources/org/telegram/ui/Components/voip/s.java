package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.i20;
public final class s implements Runnable {
    public final int f40928a;
    public final z f40929b;

    public s(z zVar, int i7) {
        this.f40928a = i7;
        this.f40929b = zVar;
    }

    @Override
    public final void run() {
        switch (this.f40928a) {
            case 0:
                this.f40929b.requestLayout();
                return;
            default:
                z zVar = this.f40929b;
                TextView textView = zVar.P;
                v vVar = zVar.f41078a;
                if (!vVar.d.isFirstFrameRendered()) {
                    vVar.animate().cancel();
                    vVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    i20.m(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
