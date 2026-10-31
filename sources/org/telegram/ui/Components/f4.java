package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class f4 extends e51 {
    public final int e;
    public Object f25957f;

    public f4(Object obj, int i10) {
        super("@stickers", (yz0) null);
        this.e = i10;
        this.f25957f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.k2) this.f25957f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                cx0 cx0Var = (cx0) this.f25957f;
                org.telegram.messenger.vp.r1(cx0Var.f21583a).v3(getURL(), cx0Var.C1, 1, null);
                cx0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.i0.g(getURL());
                cc.a0((ag.i0) this.f25957f).k(false).j();
                return;
            case 3:
                org.telegram.ui.k60 k60Var = ((org.telegram.ui.i60) this.f25957f).d;
                org.telegram.messenger.vp.r1(org.telegram.ui.k60.d0(k60Var)).v3("stickers", k60Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.tk0) this.f25957f).f41855a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f25957f;
                i10 = ((org.telegram.ui.ActionBar.k2) stickersActivity).currentAccount;
                org.telegram.messenger.vp.r1(i10).v3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public f4(String str, int i10, Object obj) {
        super(str, (yz0) null);
        this.e = i10;
        this.f25957f = obj;
    }

    public f4(String str, yz0 yz0Var) {
        super(str, yz0Var);
        this.e = 2;
    }

    public f4(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        super(str, (yz0) null);
        this.e = 0;
        this.f25957f = k2Var;
    }
}
