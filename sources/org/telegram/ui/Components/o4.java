package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class o4 extends p41 {
    public final int f37952e;
    public Object f37953f;

    public o4(Object obj, int i7) {
        super("@stickers", (dz0) null);
        this.f37952e = i7;
        this.f37953f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        switch (this.f37952e) {
            case 0:
                ((org.telegram.ui.ActionBar.h2) this.f37953f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                iw0 iw0Var = (iw0) this.f37953f;
                org.telegram.messenger.mp.u1(iw0Var.f30189a).F3(getURL(), iw0Var.G1, 1, null);
                iw0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                lc.b0((kg.v) this.f37953f).k(false).j();
                return;
            case 3:
                org.telegram.ui.n50 n50Var = ((org.telegram.ui.l50) this.f37953f).d;
                org.telegram.messenger.mp.u1(org.telegram.ui.n50.e0(n50Var)).F3("stickers", n50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.qj0) this.f37953f).f51277a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f37953f;
                i7 = ((org.telegram.ui.ActionBar.h2) stickersActivity).currentAccount;
                org.telegram.messenger.mp.u1(i7).F3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public o4(String str, int i7, Object obj) {
        super(str, (dz0) null);
        this.f37952e = i7;
        this.f37953f = obj;
    }

    public o4(String str, dz0 dz0Var) {
        super(str, dz0Var);
        this.f37952e = 2;
    }

    public o4(String str, org.telegram.ui.ActionBar.h2 h2Var) {
        super(str, (dz0) null);
        this.f37952e = 0;
        this.f37953f = h2Var;
    }
}
