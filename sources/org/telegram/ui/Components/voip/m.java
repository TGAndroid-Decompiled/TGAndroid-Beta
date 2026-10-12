package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.am;
public final class m implements Runnable {
    public final int f31799a;
    public final u f31800b;

    public m(u uVar, int i10) {
        this.f31799a = i10;
        this.f31800b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f31799a) {
            case 0:
                this.f31800b.requestLayout();
                return;
            default:
                u uVar = this.f31800b;
                TextView textView = uVar.O;
                p pVar = uVar.f31995a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    am.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
