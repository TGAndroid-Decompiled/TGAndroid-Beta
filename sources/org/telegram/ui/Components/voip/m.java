package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.ok;
public final class m implements Runnable {
    public final int f29374a;
    public final u f29375b;

    public m(u uVar, int i10) {
        this.f29374a = i10;
        this.f29375b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f29374a) {
            case 0:
                this.f29375b.requestLayout();
                return;
            default:
                u uVar = this.f29375b;
                TextView textView = uVar.O;
                p pVar = uVar.f29559a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    ok.r(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
