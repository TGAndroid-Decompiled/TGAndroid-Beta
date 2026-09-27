package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.qk;
public final class m implements Runnable {
    public final int f29400a;
    public final u f29401b;

    public m(u uVar, int i10) {
        this.f29400a = i10;
        this.f29401b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f29400a) {
            case 0:
                this.f29401b.requestLayout();
                return;
            default:
                u uVar = this.f29401b;
                TextView textView = uVar.O;
                p pVar = uVar.f29585a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    qk.r(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
