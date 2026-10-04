package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.ok;
public final class m implements Runnable {
    public final int f31971a;
    public final u f31972b;

    public m(u uVar, int i10) {
        this.f31971a = i10;
        this.f31972b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f31971a) {
            case 0:
                this.f31972b.requestLayout();
                return;
            default:
                u uVar = this.f31972b;
                TextView textView = uVar.O;
                p pVar = uVar.f32170a;
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
