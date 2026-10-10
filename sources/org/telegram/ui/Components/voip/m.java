package org.telegram.ui.Components.voip;

import android.widget.TextView;
import org.telegram.messenger.bi;
public final class m implements Runnable {
    public final int f32116a;
    public final u f32117b;

    public m(u uVar, int i10) {
        this.f32116a = i10;
        this.f32117b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f32116a) {
            case 0:
                this.f32117b.requestLayout();
                return;
            default:
                u uVar = this.f32117b;
                TextView textView = uVar.O;
                p pVar = uVar.f32316a;
                if (!pVar.d.isFirstFrameRendered()) {
                    pVar.animate().cancel();
                    pVar.animate().alpha(0.0f).setDuration(150L).start();
                    textView.animate().cancel();
                    bi.s(textView.animate(), 1.0f, 150L);
                    return;
                }
                return;
        }
    }
}
