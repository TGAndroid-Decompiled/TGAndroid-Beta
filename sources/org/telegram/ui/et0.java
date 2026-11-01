package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class et0 implements View.OnClickListener {
    public final pg0 f36903a;
    public final un f36904b;
    public final org.telegram.ui.Components.uk0 f36905c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.z60 e;
    public final org.telegram.ui.Components.z60 f36906f;
    public final jt0 h;

    public et0(jt0 jt0Var, pg0 pg0Var, un unVar, org.telegram.ui.Components.uk0 uk0Var, LinearLayout linearLayout, org.telegram.ui.Components.z60 z60Var, org.telegram.ui.Components.z60 z60Var2) {
        this.h = jt0Var;
        this.f36903a = pg0Var;
        this.f36904b = unVar;
        this.f36905c = uk0Var;
        this.d = linearLayout;
        this.e = z60Var;
        this.f36906f = z60Var2;
    }

    @Override
    public final void onClick(View view) {
        pg0 pg0Var = this.f36903a;
        ArrayList arrayList = pg0Var.f40476b;
        ArrayList arrayList2 = pg0Var.f40477c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            jt0 jt0Var = this.h;
            un unVar = this.f36904b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f19943id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19794id);
                }
                unVar.presentFragment(new ProfileActivity(bundle, null));
                jt0Var.c(false);
                return;
            }
            if (org.telegram.messenger.uz.f18508c1 > 0 && unVar.l1.getKeyboardHeight() < org.telegram.messenger.i0.L(20.0f)) {
                org.telegram.ui.Components.wb t10 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(jt0Var.getContext()), jt0Var.f38542b).t(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131748503, null)), null);
                unVar.B1 = t10;
                t10.f32201j = 4000;
                t10.j();
                org.telegram.messenger.uz.S(org.telegram.messenger.uz.f18508c1 - 1);
            }
            org.telegram.ui.Components.uk0 uk0Var = this.f36905c;
            uk0Var.requestLayout();
            this.d.requestLayout();
            uk0Var.getAdapter().f();
            this.e.K(this.f36906f);
        }
    }
}
