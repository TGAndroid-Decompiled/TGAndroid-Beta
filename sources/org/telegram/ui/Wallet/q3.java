package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
public final class q3 implements Utilities.Callback {
    public final int f35459a;
    public final ci.d f35460b;
    public final org.telegram.ui.ActionBar.e3 f35461c;
    public final org.telegram.ui.ActionBar.d6 d;

    public q3(ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f35459a = i10;
        this.f35460b = dVar;
        this.f35461c = e3Var;
        this.d = d6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35459a) {
            case 0:
                this.f35460b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.e3 e3Var = this.f35461c;
                if (!isEmpty) {
                    new ad(e3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var.dismiss();
                    return;
                }
            case 1:
                this.f35460b.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var2 = this.f35461c;
                if (str != null) {
                    new ad(e3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.e3 e3Var3 = this.f35461c;
                if (str != null) {
                    new ad(e3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f35460b.setLoading(false);
                e3Var3.dismiss();
                return;
        }
    }

    public q3(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.d6 d6Var, ci.d dVar) {
        this.f35459a = 2;
        this.f35461c = e3Var;
        this.d = d6Var;
        this.f35460b = dVar;
    }
}
