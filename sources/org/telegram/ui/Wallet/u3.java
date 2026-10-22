package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.xc;
public final class u3 implements Utilities.Callback {
    public final int f34992a;
    public final ei.d f34993b;
    public final org.telegram.ui.ActionBar.f3 f34994c;
    public final org.telegram.ui.ActionBar.d6 d;

    public u3(ei.d dVar, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f34992a = i10;
        this.f34993b = dVar;
        this.f34994c = f3Var;
        this.d = d6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f34992a) {
            case 0:
                this.f34993b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.f3 f3Var = this.f34994c;
                if (!isEmpty) {
                    new xc(f3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var.dismiss();
                    return;
                }
            case 1:
                this.f34993b.setLoading(false);
                org.telegram.ui.ActionBar.f3 f3Var2 = this.f34994c;
                if (str != null) {
                    new xc(f3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    f3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.f3 f3Var3 = this.f34994c;
                if (str != null) {
                    new xc(f3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f34993b.setLoading(false);
                f3Var3.dismiss();
                return;
        }
    }

    public u3(org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.d6 d6Var, ei.d dVar) {
        this.f34992a = 2;
        this.f34994c = f3Var;
        this.d = d6Var;
        this.f34993b = dVar;
    }
}
