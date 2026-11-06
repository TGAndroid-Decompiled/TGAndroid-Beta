package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class nn implements org.telegram.messenger.lc {
    public boolean f36447a;
    public final kg.g f36448b;
    public final pn f36449c;

    public nn(kg.i iVar, kg.g gVar) {
        this.f36449c = iVar;
        this.f36448b = gVar;
    }

    @Override
    public final void t0(int i7, Drawable drawable) {
        zg0 zg0Var;
        bg.i iVar;
        if (!this.f36447a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f36447a = true;
                boolean z9 = drawable instanceof zg0;
                kg.g gVar = this.f36448b;
                if (z9 && (iVar = (zg0Var = (zg0) drawable).B0) != null && iVar.g()) {
                    zg0Var.A0 = new f(27, this, gVar);
                    return;
                }
                pn.a(this.f36449c);
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
