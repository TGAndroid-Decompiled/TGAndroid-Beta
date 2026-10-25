package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.vh;
public final class m implements Runnable {
    public final int f33941a;
    public final t f33942b;

    public m(t tVar, int i10) {
        this.f33941a = i10;
        this.f33942b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f33941a) {
            case 0:
                this.f33942b.requestLayout();
                return;
            default:
                t tVar = this.f33942b;
                TextView textView = tVar.O;
                o oVar = tVar.f34071a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    vh.p(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
