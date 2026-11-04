package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class g4 extends v31 {
    public final int f33952e;
    public Object f33953f;

    public g4(Object obj, int i3) {
        super("@stickers", (ty0) null);
        this.f33952e = i3;
        this.f33953f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i3;
        int i10;
        switch (this.f33952e) {
            case 0:
                ((org.telegram.ui.ActionBar.d2) this.f33953f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                xv0 xv0Var = (xv0) this.f33953f;
                org.telegram.messenger.hp.s1(xv0Var.f28583a).y3(getURL(), xv0Var.D1, 1, null);
                xv0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                fc.a0((lg.v) this.f33953f).k(false).j();
                return;
            case 3:
                org.telegram.ui.g50 g50Var = ((org.telegram.ui.e50) this.f33953f).d;
                i3 = ((org.telegram.ui.ActionBar.d2) g50Var).currentAccount;
                org.telegram.messenger.hp.s1(i3).y3("stickers", g50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.hj0) this.f33953f).f45928a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f33953f;
                i10 = ((org.telegram.ui.ActionBar.d2) stickersActivity).currentAccount;
                org.telegram.messenger.hp.s1(i10).y3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public g4(String str, int i3, Object obj) {
        super(str, (ty0) null);
        this.f33952e = i3;
        this.f33953f = obj;
    }

    public g4(String str, ty0 ty0Var) {
        super(str, ty0Var);
        this.f33952e = 2;
    }

    public g4(String str, org.telegram.ui.ActionBar.d2 d2Var) {
        super(str, (ty0) null);
        this.f33952e = 0;
        this.f33953f = d2Var;
    }
}
