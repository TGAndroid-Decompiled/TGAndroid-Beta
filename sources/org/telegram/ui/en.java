package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class en extends w7.a6 {
    public MessageObject f36995a;
    public int f36996b = 0;
    public boolean f36997c = true;
    public int d = 0;
    public int e;
    public boolean f36998f;
    public int f36999g;
    public final sn h;

    public en(sn snVar) {
        this.h = snVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36995a;
        sn snVar = this.h;
        if (messageObject != null) {
            snVar.A0.T();
            int indexOf = snVar.G6.indexOf(this.f36995a) + snVar.A0.J;
            if (indexOf >= 0) {
                snVar.f41762z0.i1(indexOf, (int) ((this.e + this.f36999g) - snVar.E9), this.f36998f);
            }
        } else {
            snVar.A0.T();
            snVar.f41762z0.i1(this.f36996b, this.d, this.f36997c);
        }
        this.f36995a = null;
        snVar.y3 = true;
        snVar.dd(false);
        AndroidUtilities.runOnUIThread(new ti(this, 9));
    }

    @Override
    public final void c() {
        sn snVar = this.h;
        snVar.U9 = snVar.getNotificationCenter().setAnimationInProgress(snVar.U9, sn.f41445bd);
        pk pkVar = snVar.Ia;
        if (pkVar.f43985n) {
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
