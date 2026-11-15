package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.StickersActivity;
public final class g4 extends f41 {
    public final int f34789e;
    public Object f34790f;

    public g4(Object obj, int i7) {
        super("@stickers", (wy0) null);
        this.f34789e = i7;
        this.f34790f = obj;
    }

    @Override
    public final void onClick(View view) {
        int i7;
        int i10;
        switch (this.f34789e) {
            case 0:
                ((org.telegram.ui.ActionBar.e2) this.f34790f).dismissCurrentDialog();
                super.onClick(view);
                return;
            case 1:
                bw0 bw0Var = (bw0) this.f34790f;
                org.telegram.messenger.np.s1(bw0Var.f29679a).y3(getURL(), bw0Var.G1, 1, null);
                bw0Var.dismiss();
                return;
            case 2:
                org.telegram.messenger.g0.g(getURL());
                cc.a0((kg.v) this.f34790f).k(false).j();
                return;
            case 3:
                org.telegram.ui.l50 l50Var = ((org.telegram.ui.j50) this.f34790f).d;
                i7 = ((org.telegram.ui.ActionBar.e2) l50Var).currentAccount;
                org.telegram.messenger.np.s1(i7).y3("stickers", l50Var, 1, null);
                return;
            case 4:
                ((org.telegram.ui.nj0) this.f34790f).f49572a.dismissCurrentDialog();
                super.onClick(view);
                return;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.f34790f;
                i10 = ((org.telegram.ui.ActionBar.e2) stickersActivity).currentAccount;
                org.telegram.messenger.np.s1(i10).y3("stickers", stickersActivity, 3, null);
                return;
        }
    }

    public g4(String str, int i7, Object obj) {
        super(str, (wy0) null);
        this.f34789e = i7;
        this.f34790f = obj;
    }

    public g4(String str, wy0 wy0Var) {
        super(str, wy0Var);
        this.f34789e = 2;
    }

    public g4(String str, org.telegram.ui.ActionBar.e2 e2Var) {
        super(str, (wy0) null);
        this.f34789e = 0;
        this.f34790f = e2Var;
    }
}
