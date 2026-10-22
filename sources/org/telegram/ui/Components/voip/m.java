package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.ok;
public final class m implements Runnable {
    public final int f31559a;
    public final t f31560b;

    public m(t tVar, int i10) {
        this.f31559a = i10;
        this.f31560b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31559a) {
            case 0:
                this.f31560b.requestLayout();
                return;
            default:
                t tVar = this.f31560b;
                TextView textView = tVar.O;
                o oVar = tVar.f31711a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    ok.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
