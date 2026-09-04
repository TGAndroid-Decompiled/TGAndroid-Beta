package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class pn extends w7.y5 {
    public MessageObject f39542a;
    public int f39543b = 0;
    public boolean f39544c = true;
    public int d = 0;
    public int f39545e;
    public boolean f39546f;
    public int f39547g;
    public final co h;

    public pn(co coVar) {
        this.h = coVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39542a;
        co coVar = this.h;
        if (messageObject != null) {
            coVar.A0.T();
            int indexOf = coVar.f35440u6.indexOf(this.f39542a) + coVar.A0.J;
            if (indexOf >= 0) {
                coVar.f35498z0.i1(indexOf, (int) ((this.f39545e + this.f39547g) - coVar.f35418s9), this.f39546f);
            }
        } else {
            coVar.A0.T();
            coVar.f35498z0.i1(this.f39543b, this.d, this.f39544c);
        }
        this.f39542a = null;
        coVar.f35336m3 = true;
        coVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override
    public final void c() {
        co coVar = this.h;
        coVar.I9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.I9, co.Nc);
        vk vkVar = coVar.f35470wa;
        if (vkVar.f39337n) {
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
