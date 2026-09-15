package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class on extends w7.y5 {
    public MessageObject f36248a;
    public int f36249b = 0;
    public boolean f36250c = true;
    public int d = 0;
    public int e;
    public boolean f36251f;
    public int f36252g;
    public final bo h;

    public on(bo boVar) {
        this.h = boVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f36248a;
        bo boVar = this.h;
        if (messageObject != null) {
            boVar.A0.T();
            int indexOf = boVar.f32491u6.indexOf(this.f36248a) + boVar.A0.J;
            if (indexOf >= 0) {
                boVar.f32549z0.i1(indexOf, (int) ((this.e + this.f36252g) - boVar.f32469s9), this.f36251f);
            }
        } else {
            boVar.A0.T();
            boVar.f32549z0.i1(this.f36249b, this.d, this.f36250c);
        }
        this.f36248a = null;
        boVar.f32387m3 = true;
        boVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override
    public final void c() {
        bo boVar = this.h;
        boVar.I9 = boVar.getNotificationCenter().setAnimationInProgress(boVar.I9, bo.Nc);
        vk vkVar = boVar.f32521wa;
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
