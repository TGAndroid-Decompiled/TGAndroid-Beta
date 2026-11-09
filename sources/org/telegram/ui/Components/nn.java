package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class nn implements org.telegram.messenger.lc {
    public boolean f36421a;
    public final kg.g f36422b;
    public final pn f36423c;

    public nn(kg.i iVar, kg.g gVar) {
        this.f36423c = iVar;
        this.f36422b = gVar;
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
        ah0 ah0Var;
        bg.i iVar;
        if (!this.f36421a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f36421a = true;
                boolean z9 = drawable instanceof ah0;
                kg.g gVar = this.f36422b;
                if (z9 && (iVar = (ah0Var = (ah0) drawable).B0) != null && iVar.g()) {
                    ah0Var.A0 = new f(27, this, gVar);
                    return;
                }
                pn.a(this.f36423c);
                gVar.run();
            }
        }
    }

    @Override
    public final void O(ImageReceiver imageReceiver) {
    }

    @Override
    public final void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
    }
}
