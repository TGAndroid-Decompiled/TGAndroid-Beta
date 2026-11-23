package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class o4 extends r41 {
    public final int f38006e;
    public Object f38007f;

    public o4(Object obj, int i7) {
        super("@stickers", (ez0) null);
        this.f38006e = i7;
        this.f38007f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.f38006e) {
            case 0:
                ((org.telegram.ui.ActionBar.g2) this.f38007f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                jw0 jw0Var = (jw0) this.f38007f;
                org.telegram.messenger.mp.u1(jw0Var.f30223a).F3(getURL(), jw0Var.G1, 1, null);
                jw0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                kc.b0((kg.v) this.f38007f).k(false).j();
                return;
            case 3:
                org.telegram.ui.n50 n50Var = ((org.telegram.ui.l50) this.f38007f).d;
                i7 = ((org.telegram.ui.ActionBar.g2) n50Var).currentAccount;
                org.telegram.messenger.mp.u1(i7).F3("stickers", n50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.oj0) this.f38007f).f50706a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f38007f;
                i10 = ((org.telegram.ui.ActionBar.g2) stickersActivity).currentAccount;
                org.telegram.messenger.mp.u1(i10).F3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public o4(String str, int i7, Object obj) {
        super(str, (ez0) null);
        this.f38006e = i7;
        this.f38007f = obj;
    }

    public o4(String str, ez0 ez0Var) {
        super(str, ez0Var);
        this.f38006e = 2;
    }

    public o4(String str, org.telegram.ui.ActionBar.g2 g2Var) {
        super(str, (ez0) null);
        this.f38006e = 0;
        this.f38007f = g2Var;
    }
}
