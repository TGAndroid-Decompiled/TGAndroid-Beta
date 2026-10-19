package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.lk;
public final class m implements Runnable {
    public final int f31606a;
    public final t f31607b;

    public m(t tVar, int i10) {
        this.f31606a = i10;
        this.f31607b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31606a) {
            case 0:
                this.f31607b.requestLayout();
                return;
            default:
                t tVar = this.f31607b;
                TextView textView = tVar.O;
                o oVar = tVar.f31758a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    lk.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
