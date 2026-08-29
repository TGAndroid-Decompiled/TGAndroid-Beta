package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f33847a;
    public final u f33848b;

    public m(u uVar, int i10) {
        this.f33847a = i10;
        this.f33848b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f33847a) {
            case 0:
                this.f33848b.requestLayout();
                return;
            default:
                u uVar = this.f33848b;
                TextView textView = uVar.K;
                p pVar = uVar.f34014a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    textView.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                return;
        }
    }
}
