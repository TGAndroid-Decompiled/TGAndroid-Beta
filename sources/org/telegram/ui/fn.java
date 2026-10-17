package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class fn extends w7.a6 {
    public MessageObject f36958a;
    public int f36959b = 0;
    public boolean f36960c = true;
    public int d = 0;
    public int e;
    public boolean f36961f;
    public int f36962g;
    public final sn h;

    public fn(sn snVar) {
        this.h = snVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36958a;
        sn snVar = this.h;
        if (messageObject != null) {
            snVar.A0.T();
            int indexOf = snVar.f41400u6.indexOf(this.f36958a) + snVar.A0.J;
            if (indexOf >= 0) {
                snVar.f41458z0.i1(indexOf, (int) ((this.e + this.f36962g) - snVar.f41377s9), this.f36961f);
            }
        } else {
            snVar.A0.T();
            snVar.f41458z0.i1(this.f36959b, this.d, this.f36960c);
        }
        this.f36958a = null;
        snVar.f41295m3 = true;
        snVar.ad(false);
        AndroidUtilities.runOnUIThread(new vi(this, 9));
    }

    @Override
    public final void c() {
        sn snVar = this.h;
        snVar.I9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.I9, sn.Nc);
        qk qkVar = snVar.f41429wa;
        if (qkVar.f43266n) {
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
