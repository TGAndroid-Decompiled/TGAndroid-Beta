package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class mo0 implements Utilities.Callback {
    public final int f40615a;
    public final no0 f40616b;

    public mo0(no0 no0Var, int i10) {
        this.f40615a = i10;
        this.f40616b = no0Var;
    }

    @Override
    public final void run(Object obj) {
        TL_stars.StarGift starGift;
        int i10;
        to0 to0Var;
        xo0 xo0Var;
        to0 to0Var2;
        switch (this.f40615a) {
            case 0:
                Integer num = (Integer) obj;
                no0 no0Var = this.f40616b;
                to0 to0Var3 = no0Var.f40855e;
                if (num.intValue() == 0) {
                    starGift = null;
                } else {
                    starGift = (TL_stars.StarGift) to0Var3.D.get(num);
                }
                to0Var3.B = starGift;
                yo0 yo0Var = to0Var3.f43077f0;
                if (starGift == null) {
                    ih.b5 b5Var = to0Var3.A;
                    if (b5Var != null) {
                        b5Var.f();
                        to0Var3.A = null;
                    }
                } else {
                    ih.b5 b5Var2 = to0Var3.A;
                    if (b5Var2 == null || b5Var2.f9044b != starGift.f22619id) {
                        i10 = ((org.telegram.ui.ActionBar.o2) yo0Var).currentAccount;
                        ih.b5 b5Var3 = new ih.b5(to0Var3.B.f22619id, i10, new mo0(no0Var, 2));
                        to0Var3.A = b5Var3;
                        b5Var3.g(false);
                    }
                }
                to0Var3.e();
                if (yo0Var.f44951y.getCurrentPosition() == 1) {
                    to0Var = yo0Var.h;
                } else {
                    to0Var = yo0Var.f44945f;
                }
                to0Var.e();
                return;
            case 1:
                to0 to0Var4 = this.f40616b.f40855e;
                to0Var4.f43078n = ((Integer) obj).intValue();
                to0Var4.f43080s = null;
                to0Var4.v = null;
                to0Var4.f43083y = null;
                to0Var4.i(true);
                to0Var4.h();
                to0Var4.f();
                so0 so0Var = to0Var4.f43082x;
                if (so0Var != null) {
                    so0Var.invalidate();
                }
                yo0 yo0Var2 = to0Var4.f43077f0;
                to0 to0Var5 = yo0Var2.h;
                if (to0Var5 != null && (xo0Var = to0Var5.f43067a) != null && (to0Var2 = yo0Var2.f44945f) != null) {
                    xo0Var.a(to0Var2.f43078n);
                    return;
                }
                return;
            default:
                Boolean bool = (Boolean) obj;
                this.f40616b.f40855e.e();
                return;
        }
    }
}
