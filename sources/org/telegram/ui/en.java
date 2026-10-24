package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class en extends w7.a6 {
    public MessageObject f36953a;
    public int f36954b = 0;
    public boolean f36955c = true;
    public int d = 0;
    public int e;
    public boolean f36956f;
    public int f36957g;
    public final sn h;

    public en(sn snVar) {
        this.h = snVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36953a;
        sn snVar = this.h;
        if (messageObject != null) {
            snVar.A0.T();
            int indexOf = snVar.G6.indexOf(this.f36953a) + snVar.A0.J;
            if (indexOf >= 0) {
                snVar.f41759z0.i1(indexOf, (int) ((this.e + this.f36957g) - snVar.E9), this.f36956f);
            }
        } else {
            snVar.A0.T();
            snVar.f41759z0.i1(this.f36954b, this.d, this.f36955c);
        }
        this.f36953a = null;
        snVar.y3 = true;
        snVar.dd(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override
    public final void c() {
        sn snVar = this.h;
        snVar.U9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.U9, sn.f41442bd);
        pk pkVar = snVar.Ia;
        if (pkVar.f43687n) {
            pkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            t1Var.setDelegate(null);
            t1Var.setResourcesProvider(null);
        }
    }
}
