package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f33665a;
    public final t f33666b;

    public m(t tVar, int i9) {
        this.f33665a = i9;
        this.f33666b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f33665a) {
            case 0:
                this.f33666b.requestLayout();
                return;
            default:
                t tVar = this.f33666b;
                TextView textView = tVar.K;
                o oVar = tVar.f33821a;
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
