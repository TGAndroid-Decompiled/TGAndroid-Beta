package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class qc implements d5.d {
    public final int f41754a;
    public final vc f41755b;

    public qc(vc vcVar, int i9) {
        this.f41754a = i9;
        this.f41755b = vcVar;
    }

    @Override
    public final void accept(Object obj) {
        TLRPC.WallPaper wallPaper;
        View view = (View) obj;
        switch (this.f41754a) {
            case 0:
                vc vcVar = this.f41755b;
                vcVar.getClass();
                ((org.telegram.ui.Components.a11) view).setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23091i5, vcVar.f43429b));
                return;
            default:
                if (view instanceof org.telegram.ui.Components.a11) {
                    org.telegram.ui.Components.a11 a11Var = (org.telegram.ui.Components.a11) view;
                    if (a11Var.C.f27261a.f22749b) {
                        wallPaper = null;
                    } else {
                        wallPaper = this.f41755b.v;
                    }
                    a11Var.setFallbackWallpaper(wallPaper);
                    return;
                }
                return;
        }
    }
}
