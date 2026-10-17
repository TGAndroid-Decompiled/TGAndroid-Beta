package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
public final class q3 implements Utilities.Callback {
    public final int f34775a;
    public final ei.d f34776b;
    public final org.telegram.ui.ActionBar.f3 f34777c;
    public final org.telegram.ui.ActionBar.d6 d;

    public q3(ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f34775a = i10;
        this.f34776b = dVar;
        this.f34777c = f3Var;
        this.d = d6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f34775a) {
            case 0:
                this.f34776b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.f3 f3Var = this.f34777c;
                if (!isEmpty) {
                    new xc(f3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var.dismiss();
                    return;
                }
            case 1:
                this.f34776b.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f34777c;
                if (str != null) {
                    new xc(f3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = this.f34777c;
                if (str != null) {
                    new xc(f3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f34776b.setLoading(false);
                f3Var3.dismiss();
                return;
        }
    }

    public q3(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, ei.d dVar) {
        this.f34775a = 2;
        this.f34777c = f3Var;
        this.d = d6Var;
        this.f34776b = dVar;
    }
}
