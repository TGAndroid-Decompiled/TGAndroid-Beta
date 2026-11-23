package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class p4 extends s41 {
    public final int f38439e;
    public Object f38440f;

    public p4(Object obj, int i7) {
        super("@stickers", (fz0) null);
        this.f38439e = i7;
        this.f38440f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        switch (this.f38439e) {
            case 0:
                ((org.telegram.ui.ActionBar.g2) this.f38440f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                kw0 kw0Var = (kw0) this.f38440f;
                org.telegram.messenger.np.u1(kw0Var.f30139a).F3(getURL(), kw0Var.G1, 1, null);
                kw0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                lc.b0((kg.v) this.f38440f).k(false).j();
                return;
            case 3:
                org.telegram.ui.n50 n50Var = ((org.telegram.ui.l50) this.f38440f).d;
                org.telegram.messenger.np.u1(org.telegram.ui.n50.e0(n50Var)).F3("stickers", n50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.qj0) this.f38440f).f51228a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f38440f;
                i7 = ((org.telegram.ui.ActionBar.g2) stickersActivity).currentAccount;
                org.telegram.messenger.np.u1(i7).F3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public p4(String str, int i7, Object obj) {
        super(str, (fz0) null);
        this.f38439e = i7;
        this.f38440f = obj;
    }

    public p4(String str, fz0 fz0Var) {
        super(str, fz0Var);
        this.f38439e = 2;
    }

    public p4(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        super(str, (fz0) null);
        this.f38439e = 0;
        this.f38440f = g2Var;
    }
}
