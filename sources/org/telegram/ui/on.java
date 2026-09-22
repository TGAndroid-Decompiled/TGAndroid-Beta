package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class on extends w7.y5 {
    public MessageObject f36251a;
    public int f36252b = 0;
    public boolean f36253c = true;
    public int d = 0;
    public int e;
    public boolean f36254f;
    public int f36255g;
    public final bo h;

    public on(bo boVar) {
        this.h = boVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36251a;
        bo boVar = this.h;
        if (messageObject != null) {
            boVar.A0.T();
            int indexOf = boVar.f32486u6.indexOf(this.f36251a) + boVar.A0.J;
            if (indexOf >= 0) {
                boVar.f32544z0.i1(indexOf, (int) ((this.e + this.f36255g) - boVar.f32464s9), this.f36254f);
            }
        } else {
            boVar.A0.T();
            boVar.f32544z0.i1(this.f36252b, this.d, this.f36253c);
        }
        this.f36251a = null;
        boVar.f32382m3 = true;
        boVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override
    public final void c() {
        bo boVar = this.h;
        boVar.I9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.I9, bo.Mc);
        vk vkVar = boVar.f32516wa;
        if (vkVar.f36696n) {
            vkVar.d();
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
