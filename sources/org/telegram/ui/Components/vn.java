package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class vn implements org.telegram.messenger.nc {
    public boolean f31348a;
    public final ag.n f31349b;
    public final xn f31350c;

    public vn(ag.p pVar, ag.n nVar) {
        this.f31350c = pVar;
        this.f31349b = nVar;
    }

    @Override
    public final void s(int i10, Drawable drawable) {
        ci0 ci0Var;
        rf.e eVar;
        if (!this.f31348a) {
            if ((i10 == 0 || i10 == 3) && drawable != null) {
                this.f31348a = true;
                boolean z10 = drawable instanceof ci0;
                ag.n nVar = this.f31349b;
                if (z10 && (eVar = (ci0Var = (ci0) drawable).B0) != null && eVar.g()) {
                    ci0Var.A0 = new cd(21, this, nVar);
                    return;
                }
                xn.a(this.f31350c);
                nVar.run();
            }
        }
    }

    @Override
    public final void j(ImageReceiver imageReceiver) {
    }

    @Override
    public final void q(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }
}
