package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class mn extends w7.z5 {
    public MessageObject f35791a;
    public int f35792b = 0;
    public boolean f35793c = true;
    public int d = 0;
    public int e;
    public boolean f35794f;
    public int f35795g;
    public final zn h;

    public mn(zn znVar) {
        this.h = znVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f35791a;
        zn znVar = this.h;
        if (messageObject != null) {
            znVar.A0.T();
            int indexOf = znVar.f40518u6.indexOf(this.f35791a) + znVar.A0.J;
            if (indexOf >= 0) {
                znVar.f40576z0.i1(indexOf, (int) ((this.e + this.f35795g) - znVar.f40496s9), this.f35794f);
            }
        } else {
            znVar.A0.T();
            znVar.f40576z0.i1(this.f35792b, this.d, this.f35793c);
        }
        this.f35791a = null;
        znVar.f40414m3 = true;
        znVar.Wc(false);
        AndroidUtilities.runOnUIThread(new dj(this, 8));
    }

    @Override
    public final void c() {
        zn znVar = this.h;
        znVar.I9 = znVar.getNotificationCenter().setAnimationInProgress(znVar.I9, zn.Mc);
        vk vkVar = znVar.f40548wa;
        if (vkVar.f36725n) {
            vkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            u1Var.setDelegate(null);
            u1Var.setResourcesProvider(null);
        }
    }
}
