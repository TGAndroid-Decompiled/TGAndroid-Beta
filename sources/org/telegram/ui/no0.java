package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class no0 implements Utilities.Callback {
    public final int f40780a;
    public final oo0 f40781b;

    public no0(oo0 oo0Var, int i9) {
        this.f40780a = i9;
        this.f40781b = oo0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i9;
        uo0 uo0Var;
        yo0 yo0Var;
        uo0 uo0Var2;
        switch (this.f40780a) {
            case 0:
                Integer num = (Integer) obj;
                oo0 oo0Var = this.f40781b;
                uo0 uo0Var3 = oo0Var.f41216e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) uo0Var3.D.get(num);
                }
                uo0Var3.B = starGift;
                zo0 zo0Var = uo0Var3.f43287f0;
                if (starGift == null) {
                    fh.p5 p5Var = uo0Var3.A;
                    if (p5Var != null) {
                        p5Var.f();
                        uo0Var3.A = null;
                    }
                } else {
                    fh.p5 p5Var2 = uo0Var3.A;
                    if (p5Var2 == null || p5Var2.f6702b != starGift.f22607id) {
                        i9 = ((org.telegram.ui.ActionBar.o2) zo0Var).currentAccount;
                        fh.p5 p5Var3 = new fh.p5(uo0Var3.B.f22607id, i9, new no0(oo0Var, 2));
                        uo0Var3.A = p5Var3;
                        p5Var3.g(false);
                    }
                }
                uo0Var3.e();
                if (zo0Var.f45202y.getCurrentPosition() == 1) {
                    uo0Var = zo0Var.h;
                } else {
                    uo0Var = zo0Var.f45196f;
                }
                uo0Var.e();
                return;
            case 1:
                uo0 uo0Var4 = this.f40781b.f41216e;
                uo0Var4.f43288n = ((Integer) obj).intValue();
                uo0Var4.f43290s = null;
                uo0Var4.v = null;
                uo0Var4.f43293y = null;
                uo0Var4.i(true);
                uo0Var4.h();
                uo0Var4.f();
                to0 to0Var = uo0Var4.f43292x;
                if (to0Var != null) {
                    to0Var.invalidate();
                }
                zo0 zo0Var2 = uo0Var4.f43287f0;
                uo0 uo0Var5 = zo0Var2.h;
                if (uo0Var5 != null && (yo0Var = uo0Var5.f43277a) != null && (uo0Var2 = zo0Var2.f45196f) != null) {
                    yo0Var.a(uo0Var2.f43288n);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f40781b.f41216e.e();
                return;
        }
    }
}
