package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class fn extends w7.a6 {
    public MessageObject f36946a;
    public int f36947b = 0;
    public boolean f36948c = true;
    public int d = 0;
    public int e;
    public boolean f36949f;
    public int f36950g;
    public final sn h;

    public fn(sn snVar) {
        this.h = snVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36946a;
        sn snVar = this.h;
        if (messageObject != null) {
            snVar.A0.T();
            int indexOf = snVar.f41386u6.indexOf(this.f36946a) + snVar.A0.J;
            if (indexOf >= 0) {
                snVar.f41444z0.i1(indexOf, (int) ((this.e + this.f36950g) - snVar.f41363s9), this.f36949f);
            }
        } else {
            snVar.A0.T();
            snVar.f41444z0.i1(this.f36947b, this.d, this.f36948c);
        }
        this.f36946a = null;
        snVar.f41281m3 = true;
        snVar.ad(false);
        AndroidUtilities.runOnUIThread(new vi(this, 9));
    }

    @Override
    public final void c() {
        sn snVar = this.h;
        snVar.I9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.I9, sn.Oc);
        qk qkVar = snVar.f41415wa;
        if (qkVar.f43252n) {
            qkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
