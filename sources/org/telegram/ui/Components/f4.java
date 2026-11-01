package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class f4 extends f51 {
    public final int e;
    public Object f26052f;

    public f4(Object obj, int i10) {
        super("@stickers", (zz0) null);
        this.e = i10;
        this.f26052f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        switch (this.e) {
            case 0:
                ((org.telegram.ui.ActionBar.k2) this.f26052f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                dx0 dx0Var = (dx0) this.f26052f;
                org.telegram.messenger.wp.r1(dx0Var.f21584a).v3(getURL(), dx0Var.C1, 1, null);
                dx0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.i0.g(getURL());
                cc.a0((ag.i0) this.f26052f).k(false).j();
                return;
            case 3:
                org.telegram.ui.j60 j60Var = ((org.telegram.ui.h60) this.f26052f).d;
                org.telegram.messenger.wp.r1(org.telegram.ui.j60.e0(j60Var)).v3("stickers", j60Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.rk0) this.f26052f).f41099a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f26052f;
                i10 = ((org.telegram.ui.ActionBar.k2) stickersActivity).currentAccount;
                org.telegram.messenger.wp.r1(i10).v3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public f4(String str, int i10, Object obj) {
        super(str, (zz0) null);
        this.e = i10;
        this.f26052f = obj;
    }

    public f4(String str, zz0 zz0Var) {
        super(str, zz0Var);
        this.e = 2;
    }

    public f4(String str, org.telegram.ui.ActionBar.k2 k2Var) {
        super(str, (zz0) null);
        this.e = 0;
        this.f26052f = k2Var;
    }
}
