package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f28237a;
    public final t f28238b;

    public m(t tVar, int i10) {
        this.f28237a = i10;
        this.f28238b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f28237a) {
            case 0:
                this.f28238b.requestLayout();
                return;
            default:
                t tVar = this.f28238b;
                TextView textView = tVar.O;
                o oVar = tVar.f28409a;
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
