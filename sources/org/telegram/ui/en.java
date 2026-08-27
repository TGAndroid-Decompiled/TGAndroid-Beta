package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class en extends h7.a6 {

    public MessageObject f37787a;

    public int f37788b = 0;

    public boolean f37789c = true;
    public int d = 0;

    public int f37790e;

    public boolean f37791f;

    public int f37792g;
    public final rn h;

    public en(rn rnVar) {
        this.h = rnVar;
    }

    @Override
    public final void a() {
        MessageObject messageObject = this.f37787a;
        rn rnVar = this.h;
        if (messageObject != null) {
            rnVar.f42252w0.T();
            int iIndexOf = rnVar.q6.indexOf(this.f37787a) + rnVar.f42252w0.F;
            if (iIndexOf >= 0) {
                rnVar.f42239v0.i1(iIndexOf, (int) ((this.f37790e + this.f37792g) - rnVar.f42160o9), this.f37791f);
            }
        } else {
            rnVar.f42252w0.T();
            rnVar.f42239v0.i1(this.f37788b, this.d, this.f37789c);
        }
        this.f37787a = null;
        rnVar.f42080i3 = true;
        rnVar.Wc(false);
        AndroidUtilities.runOnUIThread(new ti(this, 8));
    }

    @Override
    public final void c() {
        rn rnVar = this.h;
        rnVar.E9 = rnVar.getNotificationCenter().setAnimationInProgress(rnVar.E9, rn.Jc);
        lk lkVar = rnVar.f42210sa;
        if (lkVar.f41180n) {
            lkVar.d();
        }
    }

    @Override
    public final void d(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            s1Var.setDelegate(null);
            s1Var.setResourcesProvider(null);
        }
    }
}
