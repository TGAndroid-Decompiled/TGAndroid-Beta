package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.ai;
public final class n implements Runnable {
    public final int f32174a;
    public final v f32175b;

    public n(v vVar, int i10) {
        this.f32174a = i10;
        this.f32175b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f32174a) {
            case 0:
                this.f32175b.requestLayout();
                return;
            default:
                v vVar = this.f32175b;
                TextView textView = vVar.O;
                q qVar = vVar.f32374a;
                if (!qVar.d.isFirstFrameRendered()) {
                    qVar.animate().cancel();
                    qVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    ai.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
