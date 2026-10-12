package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.zc;
public final class o3 implements Utilities.Callback {
    public final int f33549a;
    public final di.d f33550b;
    public final org.telegram.ui.ActionBar.e3 f33551c;
    public final org.telegram.ui.ActionBar.c6 d;

    public o3(di.d dVar, org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f33549a = i10;
        this.f33550b = dVar;
        this.f33551c = e3Var;
        this.d = c6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f33549a) {
            case 0:
                this.f33550b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.e3 e3Var = this.f33551c;
                if (!isEmpty) {
                    new zc(e3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var.dismiss();
                    return;
                }
            case 1:
                this.f33550b.setLoading(false);
                org.telegram.ui.ActionBar.e3 e3Var2 = this.f33551c;
                if (str != null) {
                    new zc(e3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    e3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.e3 e3Var3 = this.f33551c;
                if (str != null) {
                    new zc(e3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f33550b.setLoading(false);
                e3Var3.dismiss();
                return;
        }
    }

    public o3(org.telegram.ui.ActionBar.e3 e3Var, org.telegram.ui.ActionBar.c6 c6Var, di.d dVar) {
        this.f33549a = 2;
        this.f33551c = e3Var;
        this.d = c6Var;
        this.f33550b = dVar;
    }
}
