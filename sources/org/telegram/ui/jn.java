package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class jn extends w7.z5 {
    public MessageObject f34836a;
    public int f34837b = 0;
    public boolean f34838c = true;
    public int d = 0;
    public int e;
    public boolean f34839f;
    public int f34840g;
    public final wn h;

    public jn(wn wnVar) {
        this.h = wnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f34836a;
        wn wnVar = this.h;
        if (messageObject != null) {
            wnVar.A0.T();
            int indexOf = wnVar.f39663u6.indexOf(this.f34836a) + wnVar.A0.J;
            if (indexOf >= 0) {
                wnVar.f39721z0.i1(indexOf, (int) ((this.e + this.f34840g) - wnVar.f39641s9), this.f34839f);
            }
        } else {
            wnVar.A0.T();
            wnVar.f39721z0.i1(this.f34837b, this.d, this.f34838c);
        }
        this.f34836a = null;
        wnVar.f39559m3 = true;
        wnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new aj(this, 8));
    }

    @Override
    public final void c() {
        wn wnVar = this.h;
        wnVar.I9 = wnVar.getNotificationCenter().setAnimationInProgress(wnVar.I9, wn.Mc);
        sk skVar = wnVar.f39693wa;
        if (skVar.f34306n) {
            skVar.d();
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
