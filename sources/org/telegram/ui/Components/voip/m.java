package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f29054a;
    public final u f29055b;

    public m(u uVar, int i10) {
        this.f29054a = i10;
        this.f29055b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f29054a) {
            case 0:
                this.f29055b.requestLayout();
                return;
            default:
                u uVar = this.f29055b;
                TextView textView = uVar.O;
                p pVar = uVar.f29240a;
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
