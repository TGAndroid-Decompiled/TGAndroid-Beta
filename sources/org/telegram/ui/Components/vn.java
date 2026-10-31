package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class vn implements org.telegram.messenger.mc {
    public boolean f31291a;
    public final ag.n f31292b;
    public final xn f31293c;

    public vn(ag.p pVar, ag.n nVar) {
        this.f31293c = pVar;
        this.f31292b = nVar;
    }

    @Override
    public final void q(int i10, Drawable drawable) {
        bi0 bi0Var;
        rf.e eVar;
        if (!this.f31291a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f31291a = true;
                boolean z10 = drawable instanceof bi0;
                ag.n nVar = this.f31292b;
                if (z10 && (eVar = (bi0Var = (bi0) drawable).B0) != null && eVar.g()) {
                    bi0Var.A0 = new cd(21, this, nVar);
                    return;
                }
                xn.a(this.f31293c);
                nVar.run();
            }
        }
    }

    @Override
    public final void j(ImageReceiver imageReceiver) {
    }

    @Override
    public final void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
