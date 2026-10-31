package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.cc;
public final class k4 implements q20 {
    public final int f34810a;
    public final vh.d f34811b;
    public final org.telegram.ui.ActionBar.z2 f34812c;
    public final org.telegram.ui.ActionBar.p6 d;

    public k4(vh.d dVar, org.telegram.ui.ActionBar.z2 z2Var, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        this.f34810a = i10;
        this.f34811b = dVar;
        this.f34812c = z2Var;
        this.d = p6Var;
    }

    @Override
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.f34810a) {
            case 0:
                this.f34811b.setLoading(false);
                boolean isEmpty = TextUtils.isEmpty(str);
                org.telegram.ui.ActionBar.z2 z2Var = this.f34812c;
                if (!isEmpty) {
                    new cc(z2Var.E, this.d).e0(str, false);
                    return;
                } else {
                    z2Var.dismiss();
                    return;
                }
            default:
                this.f34811b.setLoading(false);
                org.telegram.ui.ActionBar.z2 z2Var2 = this.f34812c;
                if (str != null) {
                    new cc(z2Var2.E, this.d).e0(str, false);
                    return;
                } else {
                    z2Var2.dismiss();
                    return;
                }
        }
    }
}
