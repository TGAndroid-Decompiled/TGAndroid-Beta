package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class on extends w7.y5 {
    public MessageObject f36386a;
    public int f36387b = 0;
    public boolean f36388c = true;
    public int d = 0;
    public int e;
    public boolean f36389f;
    public int f36390g;
    public final bo h;

    public on(bo boVar) {
        this.h = boVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36386a;
        bo boVar = this.h;
        if (messageObject != null) {
            boVar.A0.T();
            int indexOf = boVar.f32473u6.indexOf(this.f36386a) + boVar.A0.J;
            if (indexOf >= 0) {
                boVar.f32531z0.i1(indexOf, (int) ((this.e + this.f36390g) - boVar.f32451s9), this.f36389f);
            }
        } else {
            boVar.A0.T();
            boVar.f32531z0.i1(this.f36387b, this.d, this.f36388c);
        }
        this.f36386a = null;
        boVar.f32369m3 = true;
        boVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ej(this, 8));
    }

    @Override
    public final void c() {
        bo boVar = this.h;
        boVar.I9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.I9, bo.Mc);
        wk wkVar = boVar.f32503wa;
        if (wkVar.f37326n) {
            wkVar.d();
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
