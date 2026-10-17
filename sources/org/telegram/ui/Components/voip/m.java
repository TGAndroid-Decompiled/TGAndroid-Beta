package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.wh;
public final class m implements Runnable {
    public final int f31595a;
    public final t f31596b;

    public m(t tVar, int i10) {
        this.f31595a = i10;
        this.f31596b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31595a) {
            case 0:
                this.f31596b.requestLayout();
                return;
            default:
                t tVar = this.f31596b;
                TextView textView = tVar.O;
                o oVar = tVar.f31747a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    wh.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
