package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
public final class q3 implements Utilities.Callback {
    public final int f35493a;
    public final ci.d f35494b;
    public final org.telegram.ui.ActionBar.e3 f35495c;
    public final org.telegram.ui.ActionBar.d6 d;

    public q3(ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f35493a = i10;
        this.f35494b = dVar;
        this.f35495c = e3Var;
        this.d = d6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35493a) {
            case 0:
                this.f35494b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.e3 e3Var = this.f35495c;
                if (!isEmpty) {
                    new ad(e3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var.dismiss();
                    return;
                }
            case 1:
                this.f35494b.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var2 = this.f35495c;
                if (str != null) {
                    new ad(e3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.e3 e3Var3 = this.f35495c;
                if (str != null) {
                    new ad(e3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f35494b.setLoading(false);
                e3Var3.dismiss();
                return;
        }
    }

    public q3(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.d6 d6Var, ci.d dVar) {
        this.f35493a = 2;
        this.f35495c = e3Var;
        this.d = d6Var;
        this.f35494b = dVar;
    }
}
