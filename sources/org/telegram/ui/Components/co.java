package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class co implements org.telegram.messenger.jc {
    public boolean f34097a;
    public final kg.g f34098b;
    public final fo f34099c;

    public co(kg.i iVar, kg.g gVar) {
        this.f34099c = iVar;
        this.f34098b = gVar;
    }

    @Override
    public final void J(int i7, Drawable drawable) {
        nh0 nh0Var;
        bg.i iVar;
        if (!this.f34097a) {
            if ((i7 == 0 || i7 == 3) && drawable != null) {
                this.f34097a = true;
                boolean z10 = drawable instanceof nh0;
                kg.g gVar = this.f34098b;
                if (z10 && (iVar = (nh0Var = (nh0) drawable).C0) != null && iVar.g()) {
                    nh0Var.B0 = new xd(21, this, gVar);
                    return;
                }
                fo.a(this.f34099c);
                gVar.run();
            }
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
