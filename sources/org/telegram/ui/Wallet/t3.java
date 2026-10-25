package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wc;
public final class t3 implements Utilities.Callback {
    public final int f37261a;
    public final fi.d f37262b;
    public final org.telegram.ui.ActionBar.k3 f37263c;
    public final org.telegram.ui.ActionBar.u6 d;

    public t3(fi.d dVar, org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        this.f37261a = i10;
        this.f37262b = dVar;
        this.f37263c = k3Var;
        this.d = u6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f37261a) {
            case 0:
                this.f37262b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.k3 k3Var = this.f37263c;
                if (!isEmpty) {
                    new wc(k3Var.topBulletinContainer, this.d).f0(str, false);
                    return;
                } else {
                    k3Var.dismiss();
                    return;
                }
            case 1:
                this.f37262b.setLoading(false);
                org.telegram.ui.ActionBar.k3 k3Var2 = this.f37263c;
                if (str != null) {
                    new wc(k3Var2.topBulletinContainer, this.d).f0(str, false);
                    return;
                } else {
                    k3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.k3 k3Var3 = this.f37263c;
                if (str != null) {
                    new wc(k3Var3.topBulletinContainer, this.d).f0(str, false);
                    return;
                }
                this.f37262b.setLoading(false);
                k3Var3.dismiss();
                return;
        }
    }

    public t3(org.telegram.ui.ActionBar.k3 k3Var, org.telegram.ui.ActionBar.u6 u6Var, fi.d dVar) {
        this.f37261a = 2;
        this.f37263c = k3Var;
        this.d = u6Var;
        this.f37262b = dVar;
    }
}
