package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f29768a;
    public final t f29769b;

    public m(t tVar, int i10) {
        this.f29768a = i10;
        this.f29769b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f29768a) {
            case 0:
                this.f29769b.requestLayout();
                return;
            default:
                t tVar = this.f29769b;
                TextView textView = tVar.L;
                o oVar = tVar.f29919a;
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
