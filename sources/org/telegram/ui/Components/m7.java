package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.ui.PhotoViewer;
public final class m7 extends vc {
    public final int f35887b;
    public final org.telegram.messenger.ls f35888c;

    public m7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.f35887b = i7;
        this.f35888c = lsVar;
    }

    @Override
    public final void c(boolean z9) {
        boolean z10;
        int i7;
        switch (this.f35887b) {
            case 0:
                b8 b8Var = (b8) this.f35888c;
                b8Var.updateColors();
                org.telegram.ui.uq uqVar = b8Var.E1;
                if (uqVar != null) {
                    uqVar.a(d1.f.u());
                    return;
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) this.f35888c;
                org.telegram.ui.ActionBar.z0 z0Var = photoViewer.F0;
                if (z0Var != null) {
                    z0Var.f(z9);
                    org.telegram.ui.ActionBar.z0 z0Var2 = photoViewer.F0;
                    if (z9) {
                        i7 = 259241196;
                    } else {
                        i7 = 268435455;
                    }
                    z0Var2.setSelectorColor(i7);
                }
                s51 s51Var = photoViewer.F2;
                if (s51Var != null) {
                    if (!d1.f.u() && !photoViewer.f41493r) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    s51Var.t0(z10);
                }
                org.telegram.ui.uq uqVar2 = photoViewer.f41539w0;
                if (uqVar2 != null) {
                    uqVar2.a(d1.f.u());
                    return;
                }
                return;
        }
    }
}
