package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class vn implements org.telegram.messenger.kc {
    public boolean f40468a;
    public final kg.g f40469b;
    public final xn f40470c;

    public vn(kg.i iVar, kg.g gVar) {
        this.f40470c = iVar;
        this.f40469b = gVar;
    }

    @Override
    public final void O(int i7, Drawable drawable) {
        ch0 ch0Var;
        bg.i iVar;
        if (!this.f40468a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f40468a = true;
                boolean z10 = drawable instanceof ch0;
                kg.g gVar = this.f40469b;
                if (z10 && (iVar = (ch0Var = (ch0) drawable).C0) != null && iVar.g()) {
                    ch0Var.B0 = new od(21, this, gVar);
                    return;
                }
                xn.a(this.f40470c);
                gVar.run();
            }
        }
    }

    @Override
    public final void A(ImageReceiver imageReceiver) {
    }

    @Override
    public final void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
