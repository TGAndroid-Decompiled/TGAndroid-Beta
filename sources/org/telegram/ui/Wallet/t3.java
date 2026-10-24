package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vc;
public final class t3 implements Utilities.Callback {
    public final int f35207a;
    public final ei.d f35208b;
    public final org.telegram.ui.ActionBar.h3 f35209c;
    public final org.telegram.ui.ActionBar.g6 d;

    public t3(ei.d dVar, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f35207a = i10;
        this.f35208b = dVar;
        this.f35209c = h3Var;
        this.d = g6Var;
    }

    @Override
    public final void run(Object obj) {
        String str = (String) obj;
        switch (this.f35207a) {
            case 0:
                this.f35208b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.h3 h3Var = this.f35209c;
                if (!isEmpty) {
                    new vc(h3Var.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    h3Var.dismiss();
                    return;
                }
            case 1:
                this.f35208b.setLoading(false);
                org.telegram.ui.ActionBar.h3 h3Var2 = this.f35209c;
                if (str != null) {
                    new vc(h3Var2.topBulletinContainer, this.d).e0(str, false);
                    return;
                } else {
                    h3Var2.dismiss();
                    return;
                }
            default:
                org.telegram.ui.ActionBar.h3 h3Var3 = this.f35209c;
                if (str != null) {
                    new vc(h3Var3.topBulletinContainer, this.d).e0(str, false);
                    return;
                }
                this.f35208b.setLoading(false);
                h3Var3.dismiss();
                return;
        }
    }

    public t3(org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, ei.d dVar) {
        this.f35207a = 2;
        this.f35209c = h3Var;
        this.d = g6Var;
        this.f35208b = dVar;
    }
}
