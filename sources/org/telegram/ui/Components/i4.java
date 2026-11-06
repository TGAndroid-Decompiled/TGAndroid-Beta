package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class i4 extends a41 {
    public final int f34431e;
    public Object f34432f;

    public i4(Object obj, int i7) {
        super("@stickers", (ty0) null);
        this.f34431e = i7;
        this.f34432f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.f34431e) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f34432f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                yv0 yv0Var = (yv0) this.f34432f;
                org.telegram.messenger.qp.s1(yv0Var.f28612a).y3(getURL(), yv0Var.C1, 1, null);
                yv0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                hc.a0((kg.v) this.f34432f).k(false).j();
                return;
            case 3:
                org.telegram.ui.m50 m50Var = ((org.telegram.ui.k50) this.f34432f).d;
                i7 = ((org.telegram.ui.ActionBar.f2) m50Var).currentAccount;
                org.telegram.messenger.qp.s1(i7).y3("stickers", m50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.kj0) this.f34432f).f47201a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f34432f;
                i10 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
                org.telegram.messenger.qp.s1(i10).y3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public i4(String str, int i7, Object obj) {
        super(str, (ty0) null);
        this.f34431e = i7;
        this.f34432f = obj;
    }

    public i4(String str, ty0 ty0Var) {
        super(str, ty0Var);
        this.f34431e = 2;
    }

    public i4(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        super(str, (ty0) null);
        this.f34431e = 0;
        this.f34432f = f2Var;
    }
}
