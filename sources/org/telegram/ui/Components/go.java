package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class go implements org.telegram.messenger.kc {
    public boolean f35642a;
    public final kg.g f35643b;
    public final io f35644c;

    public go(kg.i iVar, kg.g gVar) {
        this.f35644c = iVar;
        this.f35643b = gVar;
    }

    @Override
    public final void G0(int i7, Drawable drawable) {
        oh0 oh0Var;
        bg.i iVar;
        if (!this.f35642a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f35642a = true;
                boolean z10 = drawable instanceof oh0;
                kg.g gVar = this.f35643b;
                if (z10 && (iVar = (oh0Var = (oh0) drawable).C0) != null && iVar.g()) {
                    oh0Var.B0 = new mf(19, this, gVar);
                    return;
                }
                io.a(this.f35644c);
                gVar.run();
            }
        }
    }

    @Override
    public final void V(ImageReceiver imageReceiver) {
    }

    @Override
    public final void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
