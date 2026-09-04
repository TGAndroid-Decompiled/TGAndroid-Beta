package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f31640a;
    public final t f31641b;

    public m(t tVar, int i10) {
        this.f31640a = i10;
        this.f31641b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f31640a) {
            case 0:
                this.f31641b.requestLayout();
                return;
            default:
                t tVar = this.f31641b;
                TextView textView = tVar.O;
                o oVar = tVar.f31804a;
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
