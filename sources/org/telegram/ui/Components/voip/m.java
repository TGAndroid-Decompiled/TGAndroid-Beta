package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.wh;
public final class m implements Runnable {
    public final int f29350a;
    public final u f29351b;

    public m(u uVar, int i10) {
        this.f29350a = i10;
        this.f29351b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f29350a) {
            case 0:
                this.f29351b.requestLayout();
                return;
            default:
                u uVar = this.f29351b;
                TextView textView = uVar.O;
                p pVar = uVar.f29536a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    wh.q(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
