package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.wh;
public final class m implements Runnable {
    public final int f34049a;
    public final t f34050b;

    public m(t tVar, int i10) {
        this.f34049a = i10;
        this.f34050b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f34049a) {
            case 0:
                this.f34050b.requestLayout();
                return;
            default:
                t tVar = this.f34050b;
                TextView textView = tVar.O;
                o oVar = tVar.f34179a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    wh.p(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
