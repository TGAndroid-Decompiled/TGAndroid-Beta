package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class vn implements org.telegram.messenger.kc {
    public boolean f40465a;
    public final kg.g f40466b;
    public final xn f40467c;

    public vn(kg.i iVar, kg.g gVar) {
        this.f40467c = iVar;
        this.f40466b = gVar;
    }

    @Override
    public final void O(int i7, Drawable drawable) {
        ch0 ch0Var;
        bg.i iVar;
        if (!this.f40465a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f40465a = true;
                boolean z10 = drawable instanceof ch0;
                kg.g gVar = this.f40466b;
                if (z10 && (iVar = (ch0Var = (ch0) drawable).C0) != null && iVar.g()) {
                    ch0Var.B0 = new od(21, this, gVar);
                    return;
                }
                xn.a(this.f40467c);
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
