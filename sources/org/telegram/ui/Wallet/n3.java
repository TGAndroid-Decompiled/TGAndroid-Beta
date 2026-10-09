package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
public final class n3 implements Utilities.Callback {
    public final int f35265a;
    public final ci.d f35266b;
    public final org.telegram.ui.ActionBar.f3 f35267c;
    public final org.telegram.ui.ActionBar.e6 d;

    public n3(ci.d dVar, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f35265a = i10;
        this.f35266b = dVar;
        this.f35267c = f3Var;
        this.d = e6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35265a) {
            case 0:
                this.f35266b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.f3 f3Var = this.f35267c;
                if (!isEmpty) {
                    new ad(f3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var.dismiss();
                    return;
                }
            case 1:
                this.f35266b.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f35267c;
                if (str != null) {
                    new ad(f3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = this.f35267c;
                if (str != null) {
                    new ad(f3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f35266b.setLoading(false);
                f3Var3.dismiss();
                return;
        }
    }

    public n3(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.e6 e6Var, ci.d dVar) {
        this.f35265a = 2;
        this.f35267c = f3Var;
        this.d = e6Var;
        this.f35266b = dVar;
    }
}
