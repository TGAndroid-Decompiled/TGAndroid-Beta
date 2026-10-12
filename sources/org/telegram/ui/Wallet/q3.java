package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
public final class q3 implements Utilities.Callback {
    public final int f35277a;
    public final ci.d f35278b;
    public final org.telegram.ui.ActionBar.e3 f35279c;
    public final org.telegram.ui.ActionBar.c6 d;

    public q3(ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f35277a = i10;
        this.f35278b = dVar;
        this.f35279c = e3Var;
        this.d = c6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35277a) {
            case 0:
                this.f35278b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.e3 e3Var = this.f35279c;
                if (!isEmpty) {
                    new zc(e3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var.dismiss();
                    return;
                }
            case 1:
                this.f35278b.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var2 = this.f35279c;
                if (str != null) {
                    new zc(e3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.e3 e3Var3 = this.f35279c;
                if (str != null) {
                    new zc(e3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f35278b.setLoading(false);
                e3Var3.dismiss();
                return;
        }
    }

    public q3(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, ci.d dVar) {
        this.f35277a = 2;
        this.f35279c = e3Var;
        this.d = c6Var;
        this.f35278b = dVar;
    }
}
