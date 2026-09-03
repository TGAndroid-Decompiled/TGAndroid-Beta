package org.telegram.ui.Components.voip;

import android.widget.TextView;
public final class m implements Runnable {
    public final int f32190a;
    public final u f32191b;

    public m(u uVar, int i10) {
        this.f32190a = i10;
        this.f32191b = uVar;
    }

    @Override
    public final void run() {
        switch (this.f32190a) {
            case 0:
                this.f32191b.requestLayout();
                return;
            default:
                u uVar = this.f32191b;
                TextView textView = uVar.L;
                p pVar = uVar.f32365a;
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
