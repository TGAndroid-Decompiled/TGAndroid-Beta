package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class i4 extends c41 {
    public final int f34548e;
    public Object f34549f;

    public i4(Object obj, int i7) {
        super("@stickers", (vy0) null);
        this.f34548e = i7;
        this.f34549f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.f34548e) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f34549f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                zv0 zv0Var = (zv0) this.f34549f;
                org.telegram.messenger.qp.s1(zv0Var.f28621a).y3(getURL(), zv0Var.C1, 1, null);
                zv0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                hc.a0((kg.v) this.f34549f).k(false).j();
                return;
            case 3:
                org.telegram.ui.o50 o50Var = ((org.telegram.ui.m50) this.f34549f).d;
                i7 = ((org.telegram.ui.ActionBar.f2) o50Var).currentAccount;
                org.telegram.messenger.qp.s1(i7).y3("stickers", o50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.mj0) this.f34549f).f47889a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f34549f;
                i10 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
                org.telegram.messenger.qp.s1(i10).y3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public i4(String str, int i7, Object obj) {
        super(str, (vy0) null);
        this.f34548e = i7;
        this.f34549f = obj;
    }

    public i4(String str, vy0 vy0Var) {
        super(str, vy0Var);
        this.f34548e = 2;
    }

    public i4(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        super(str, (vy0) null);
        this.f34548e = 0;
        this.f34549f = f2Var;
    }
}
