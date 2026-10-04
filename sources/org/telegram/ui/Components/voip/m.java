package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.bi;
public final class m implements Runnable {
    public final int f31978a;
    public final u f31979b;

    public m(u uVar, int i10) {
        this.f31978a = i10;
        this.f31979b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f31978a) {
            case 0:
                this.f31979b.requestLayout();
                return;
            default:
                u uVar = this.f31979b;
                TextView textView = uVar.O;
                p pVar = uVar.f32177a;
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
