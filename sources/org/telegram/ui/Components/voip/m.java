package org.telegram.ui.Components.voip;

import android.widget.TextView;

public final class m implements Runnable {

    public final int f33715a;

    public final t f33716b;

    public m(t tVar, int i10) {
        this.f33715a = i10;
        this.f33716b = tVar;
    }

    @Override
    public final void run() {
        switch (this.f33715a) {
            case 0:
                this.f33716b.requestLayout();
                break;
            default:
                t tVar = this.f33716b;
                TextView textView = tVar.K;
                o oVar = tVar.f33871a;
                if (!oVar.d.isFirstFrameRendered()) {
                    oVar.animate().cancel();
                    oVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    textView.animate().alpha(1.0f).setDuration(150L).start();
                    break;
                }
                break;
        }
    }
}
