package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class eo implements org.telegram.messenger.jc {
    public boolean f34773a;
    public final kg.g f34774b;
    public final go f34775c;

    public eo(kg.i iVar, kg.g gVar) {
        this.f34775c = iVar;
        this.f34774b = gVar;
    }

    @Override
    public final void G0(int i7, Drawable drawable) {
        mh0 mh0Var;
        bg.i iVar;
        if (!this.f34773a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f34773a = true;
                boolean z10 = drawable instanceof mh0;
                kg.g gVar = this.f34774b;
                if (z10 && (iVar = (mh0Var = (mh0) drawable).C0) != null && iVar.g()) {
                    mh0Var.B0 = new mg(17, this, gVar);
                    return;
                }
                go.a(this.f34775c);
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
