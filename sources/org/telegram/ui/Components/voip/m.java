package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.rk;
public final class m implements Runnable {
    public final int f29457a;
    public final u f29458b;

    public m(u uVar, int i10) {
        this.f29457a = i10;
        this.f29458b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f29457a) {
            case 0:
                this.f29458b.requestLayout();
                return;
            default:
                u uVar = this.f29458b;
                TextView textView = uVar.O;
                p pVar = uVar.f29643a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    rk.r(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
