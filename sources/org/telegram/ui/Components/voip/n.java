package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.ai;
public final class n implements Runnable {
    public final int f32110a;
    public final v f32111b;

    public n(v vVar, int i10) {
        this.f32110a = i10;
        this.f32111b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f32110a) {
            case 0:
                this.f32111b.requestLayout();
                return;
            default:
                v vVar = this.f32111b;
                TextView textView = vVar.O;
                q qVar = vVar.f32310a;
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
