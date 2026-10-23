package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.sl;
public final class m implements Runnable {
    public final int f31741a;
    public final t f31742b;

    public m(t tVar, int i10) {
        this.f31741a = i10;
        this.f31742b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31741a) {
            case 0:
                this.f31742b.requestLayout();
                return;
            default:
                t tVar = this.f31742b;
                TextView textView = tVar.O;
                o oVar = tVar.f31893a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    sl.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
