package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f32185a;
    public final u f32186b;

    public m(u uVar, int i10) {
        this.f32185a = i10;
        this.f32186b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f32185a) {
            case 0:
                this.f32186b.requestLayout();
                return;
            default:
                u uVar = this.f32186b;
                TextView textView = uVar.L;
                p pVar = uVar.f32360a;
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
