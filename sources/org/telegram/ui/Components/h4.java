package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class h4 extends b41 {
    public final int f34155e;
    public Object f34156f;

    public h4(Object obj, int i7) {
        super("@stickers", (uy0) null);
        this.f34155e = i7;
        this.f34156f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.f34155e) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f34156f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                yv0 yv0Var = (yv0) this.f34156f;
                org.telegram.messenger.qp.s1(yv0Var.f28669a).y3(getURL(), yv0Var.F1, 1, null);
                yv0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                gc.a0((kg.v) this.f34156f).k(false).j();
                return;
            case 3:
                org.telegram.ui.p50 p50Var = ((org.telegram.ui.n50) this.f34156f).d;
                i7 = ((org.telegram.ui.ActionBar.f2) p50Var).currentAccount;
                org.telegram.messenger.qp.s1(i7).y3("stickers", p50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.nj0) this.f34156f).f48219a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f34156f;
                i10 = ((org.telegram.ui.ActionBar.f2) stickersActivity).currentAccount;
                org.telegram.messenger.qp.s1(i10).y3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public h4(String str, int i7, Object obj) {
        super(str, (uy0) null);
        this.f34155e = i7;
        this.f34156f = obj;
    }

    public h4(String str, uy0 uy0Var) {
        super(str, uy0Var);
        this.f34155e = 2;
    }

    public h4(String str, org.telegram.ui.ActionBar.f2 f2Var) {
        super(str, (uy0) null);
        this.f34155e = 0;
        this.f34156f = f2Var;
    }
}
