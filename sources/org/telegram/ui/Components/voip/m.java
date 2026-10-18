package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.kk;
public final class m implements Runnable {
    public final int f31602a;
    public final t f31603b;

    public m(t tVar, int i10) {
        this.f31602a = i10;
        this.f31603b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31602a) {
            case 0:
                this.f31603b.requestLayout();
                return;
            default:
                t tVar = this.f31603b;
                TextView textView = tVar.O;
                o oVar = tVar.f31754a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    kk.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
