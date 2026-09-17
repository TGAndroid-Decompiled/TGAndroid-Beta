package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f31641a;
    public final t f31642b;

    public m(t tVar, int i10) {
        this.f31641a = i10;
        this.f31642b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31641a) {
            case 0:
                this.f31642b.requestLayout();
                return;
            default:
                t tVar = this.f31642b;
                TextView textView = tVar.O;
                o oVar = tVar.f31805a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    textView.animate().alpha(1.0f).setDuration(150L).start();
                    return;
                }
                return;
        }
    }
}
