package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f29740a;
    public final t f29741b;

    public m(t tVar, int i10) {
        this.f29740a = i10;
        this.f29741b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f29740a) {
            case 0:
                this.f29741b.requestLayout();
                return;
            default:
                t tVar = this.f29741b;
                TextView textView = tVar.L;
                o oVar = tVar.f29891a;
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
