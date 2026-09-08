package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class pn extends w7.y5 {
    public MessageObject f39569a;
    public int f39570b = 0;
    public boolean f39571c = true;
    public int d = 0;
    public int f39572e;
    public boolean f39573f;
    public int f39574g;
    public final co h;

    public pn(co coVar) {
        this.h = coVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f39569a;
        co coVar = this.h;
        if (messageObject != null) {
            coVar.A0.T();
            int indexOf = coVar.f35467u6.indexOf(this.f39569a) + coVar.A0.J;
            if (indexOf >= 0) {
                coVar.f35525z0.i1(indexOf, (int) ((this.f39572e + this.f39574g) - coVar.f35445s9), this.f39573f);
            }
        } else {
            coVar.A0.T();
            coVar.f35525z0.i1(this.f39570b, this.d, this.f39571c);
        }
        this.f39569a = null;
        coVar.f35363m3 = true;
        coVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override
    public final void c() {
        co coVar = this.h;
        coVar.I9 = coVar.getNotificationCenter().setAnimationInProgress(coVar.I9, co.Nc);
        vk vkVar = coVar.f35497wa;
        if (vkVar.f39364n) {
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
