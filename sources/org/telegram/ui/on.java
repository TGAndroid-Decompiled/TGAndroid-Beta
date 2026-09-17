package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class on extends w7.y5 {
    public MessageObject f36381a;
    public int f36382b = 0;
    public boolean f36383c = true;
    public int d = 0;
    public int e;
    public boolean f36384f;
    public int f36385g;
    public final bo h;

    public on(bo boVar) {
        this.h = boVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36381a;
        bo boVar = this.h;
        if (messageObject != null) {
            boVar.A0.T();
            int indexOf = boVar.f32469u6.indexOf(this.f36381a) + boVar.A0.J;
            if (indexOf >= 0) {
                boVar.f32527z0.i1(indexOf, (int) ((this.e + this.f36385g) - boVar.f32447s9), this.f36384f);
            }
        } else {
            boVar.A0.T();
            boVar.f32527z0.i1(this.f36382b, this.d, this.f36383c);
        }
        this.f36381a = null;
        boVar.f32365m3 = true;
        boVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ej(this, 8));
    }

    @Override
    public final void c() {
        bo boVar = this.h;
        boVar.I9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.I9, bo.Nc);
        wk wkVar = boVar.f32499wa;
        if (wkVar.f37321n) {
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
