package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.sk;
public final class m implements Runnable {
    public final int f29992a;
    public final t f29993b;

    public m(t tVar, int i10) {
        this.f29992a = i10;
        this.f29993b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f29992a) {
            case 0:
                this.f29993b.requestLayout();
                return;
            default:
                t tVar = this.f29993b;
                TextView textView = tVar.O;
                o oVar = tVar.f30145a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    sk.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
