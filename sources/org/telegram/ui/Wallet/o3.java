package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
public final class o3 implements Utilities.Callback {
    public final int f35334a;
    public final ci.d f35335b;
    public final org.telegram.ui.ActionBar.f3 f35336c;
    public final org.telegram.ui.ActionBar.e6 d;

    public o3(ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f35334a = i10;
        this.f35335b = dVar;
        this.f35336c = f3Var;
        this.d = e6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35334a) {
            case 0:
                this.f35335b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.f3 f3Var = this.f35336c;
                if (!isEmpty) {
                    new ad(f3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var.dismiss();
                    return;
                }
            case 1:
                this.f35335b.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f35336c;
                if (str != null) {
                    new ad(f3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = this.f35336c;
                if (str != null) {
                    new ad(f3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f35335b.setLoading(false);
                f3Var3.dismiss();
                return;
        }
    }

    public o3(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, ci.d dVar) {
        this.f35334a = 2;
        this.f35336c = f3Var;
        this.d = e6Var;
        this.f35335b = dVar;
    }
}
