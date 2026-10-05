package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.bi;
public final class m implements Runnable {
    public final int f32045a;
    public final u f32046b;

    public m(u uVar, int i10) {
        this.f32045a = i10;
        this.f32046b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f32045a) {
            case 0:
                this.f32046b.requestLayout();
                return;
            default:
                u uVar = this.f32046b;
                TextView textView = uVar.O;
                p pVar = uVar.f32244a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    bi.q(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
