package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class mn implements org.telegram.messenger.ec {
    public boolean f36211a;
    public final lg.g f36212b;
    public final on f36213c;

    public mn(lg.i iVar, lg.g gVar) {
        this.f36213c = iVar;
        this.f36212b = gVar;
    }

    @Override
    public final void F0(int i3, Drawable drawable) {
        ch0 ch0Var;
        cg.h hVar;
        if (!this.f36211a) {
            if ((i3 == 0 || i3 == 3) && drawable != null) {
                this.f36211a = true;
                boolean z10 = drawable instanceof ch0;
                lg.g gVar = this.f36212b;
                if (z10 && (hVar = (ch0Var = (ch0) drawable).C0) != null && hVar.g()) {
                    ch0Var.B0 = new cl(2, this, gVar);
                    return;
                }
                on.a(this.f36213c);
                gVar.run();
            }
        }
    }

    @Override
    public final void D(ImageReceiver imageReceiver) {
    }

    @Override
    public final void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
