package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.am;
public final class m implements Runnable {
    public final int f31784a;
    public final v f31785b;

    public m(v vVar, int i10) {
        this.f31784a = i10;
        this.f31785b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f31784a) {
            case 0:
                this.f31785b.requestLayout();
                return;
            default:
                v vVar = this.f31785b;
                TextView textView = vVar.O;
                q qVar = vVar.f31996a;
                if (!qVar.d.isFirstFrameRendered()) {
                    qVar.animate().cancel();
                    qVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    am.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
