package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.ok;
public final class m implements Runnable {
    public final int f29458a;
    public final u f29459b;

    public m(u uVar, int i10) {
        this.f29458a = i10;
        this.f29459b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f29458a) {
            case 0:
                this.f29459b.requestLayout();
                return;
            default:
                u uVar = this.f29459b;
                TextView textView = uVar.O;
                p pVar = uVar.f29643a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    ok.r(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
