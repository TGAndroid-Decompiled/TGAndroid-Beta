package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
public final class t3 implements Utilities.Callback {
    public final int f34879a;
    public final ei.d f34880b;
    public final org.telegram.ui.ActionBar.f3 f34881c;
    public final org.telegram.ui.ActionBar.d6 d;

    public t3(ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f34879a = i10;
        this.f34880b = dVar;
        this.f34881c = f3Var;
        this.d = d6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f34879a) {
            case 0:
                this.f34880b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.f3 f3Var = this.f34881c;
                if (!isEmpty) {
                    new xc(f3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var.dismiss();
                    return;
                }
            case 1:
                this.f34880b.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f34881c;
                if (str != null) {
                    new xc(f3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = this.f34881c;
                if (str != null) {
                    new xc(f3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f34880b.setLoading(false);
                f3Var3.dismiss();
                return;
        }
    }

    public t3(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, ei.d dVar) {
        this.f34879a = 2;
        this.f34881c = f3Var;
        this.d = d6Var;
        this.f34880b = dVar;
    }
}
