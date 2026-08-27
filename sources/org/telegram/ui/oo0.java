package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

public final class oo0 implements Utilities.Callback {

    public final int f41146a;

    public final po0 f41147b;

    public oo0(po0 po0Var, int i10) {
        this.f41146a = i10;
        this.f41147b = po0Var;
    }

    @Override
    public final void run(Object obj) {
        zo0 zo0Var;
        vo0 vo0Var;
        switch (this.f41146a) {
            case 0:
                Integer num = (Integer) obj;
                po0 po0Var = this.f41147b;
                vo0 vo0Var2 = po0Var.f41405e;
                TL_stars.StarGift starGift = num.intValue() == 0 ? null : (TL_stars.StarGift) vo0Var2.D.get(num);
                vo0Var2.B = starGift;
                ap0 ap0Var = vo0Var2.f43505f0;
                if (starGift == null) {
                    gh.i5 i5Var = vo0Var2.A;
                    if (i5Var != null) {
                        i5Var.f();
                        vo0Var2.A = null;
                    }
                } else {
                    gh.i5 i5Var2 = vo0Var2.A;
                    if (i5Var2 == null || i5Var2.f7324b != starGift.f22607id) {
                        gh.i5 i5Var3 = new gh.i5(vo0Var2.B.f22607id, ((org.telegram.ui.ActionBar.n2) ap0Var).currentAccount, new oo0(po0Var, 2));
                        vo0Var2.A = i5Var3;
                        i5Var3.g(false);
                    }
                }
                vo0Var2.e();
                (ap0Var.f36595y.getCurrentPosition() == 1 ? ap0Var.h : ap0Var.f36589f).e();
                break;
            case 1:
                vo0 vo0Var3 = this.f41147b.f41405e;
                vo0Var3.f43506n = ((Integer) obj).intValue();
                vo0Var3.f43508s = null;
                vo0Var3.v = null;
                vo0Var3.f43511y = null;
                vo0Var3.i(true);
                vo0Var3.h();
                vo0Var3.f();
                uo0 uo0Var = vo0Var3.f43510x;
                if (uo0Var != null) {
                    uo0Var.invalidate();
                }
                ap0 ap0Var2 = vo0Var3.f43505f0;
                vo0 vo0Var4 = ap0Var2.h;
                if (vo0Var4 != null && (zo0Var = vo0Var4.f43495a) != null && (vo0Var = ap0Var2.f36589f) != null) {
                    zo0Var.a(vo0Var.f43506n);
                    break;
                }
                break;
            default:
                this.f41147b.f41405e.e();
                break;
        }
    }
}
