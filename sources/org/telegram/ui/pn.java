package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class pn extends w7.y5 {
    public MessageObject f39543a;
    public int f39544b = 0;
    public boolean f39545c = true;
    public int d = 0;
    public int f39546e;
    public boolean f39547f;
    public int f39548g;
    public final co h;

    public pn(co coVar) {
        this.h = coVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39543a;
        co coVar = this.h;
        if (messageObject != null) {
            coVar.A0.T();
            int indexOf = coVar.f35441u6.indexOf(this.f39543a) + coVar.A0.J;
            if (indexOf >= 0) {
                coVar.f35499z0.i1(indexOf, (int) ((this.f39546e + this.f39548g) - coVar.f35419s9), this.f39547f);
            }
        } else {
            coVar.A0.T();
            coVar.f35499z0.i1(this.f39544b, this.d, this.f39545c);
        }
        this.f39543a = null;
        coVar.f35337m3 = true;
        coVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override
    public final void c() {
        co coVar = this.h;
        coVar.I9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.I9, co.Nc);
        vk vkVar = coVar.f35471wa;
        if (vkVar.f39338n) {
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
