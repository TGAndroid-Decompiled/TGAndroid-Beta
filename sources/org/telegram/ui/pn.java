package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class pn extends w7.y5 {
    public MessageObject f39570a;
    public int f39571b = 0;
    public boolean f39572c = true;
    public int d = 0;
    public int f39573e;
    public boolean f39574f;
    public int f39575g;
    public final co h;

    public pn(co coVar) {
        this.h = coVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39570a;
        co coVar = this.h;
        if (messageObject != null) {
            coVar.A0.T();
            int indexOf = coVar.f35468u6.indexOf(this.f39570a) + coVar.A0.J;
            if (indexOf >= 0) {
                coVar.f35526z0.i1(indexOf, (int) ((this.f39573e + this.f39575g) - coVar.f35446s9), this.f39574f);
            }
        } else {
            coVar.A0.T();
            coVar.f35526z0.i1(this.f39571b, this.d, this.f39572c);
        }
        this.f39570a = null;
        coVar.f35364m3 = true;
        coVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override
    public final void c() {
        co coVar = this.h;
        coVar.I9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.I9, co.Nc);
        vk vkVar = coVar.f35498wa;
        if (vkVar.f39365n) {
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
