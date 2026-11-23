package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c81 implements View.OnClickListener {
    public final lf0 f46741a;
    public final bn f46742b;
    public final org.telegram.ui.Components.ek0 f46743c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.x60 f46744e;
    public final org.telegram.ui.Components.x60 f46745f;
    public final g81 h;

    public c81(g81 g81Var, lf0 lf0Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, org.telegram.ui.Components.x60 x60Var, org.telegram.ui.Components.x60 x60Var2) {
        this.h = g81Var;
        this.f46741a = lf0Var;
        this.f46742b = bnVar;
        this.f46743c = ek0Var;
        this.d = linearLayout;
        this.f46744e = x60Var;
        this.f46745f = x60Var2;
    }

    @Override
    public final void onClick(View view) {
        lf0 lf0Var = this.f46741a;
        ArrayList arrayList = lf0Var.f49745b;
        ArrayList arrayList2 = lf0Var.f49746c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            g81 g81Var = this.h;
            bn bnVar = this.f46742b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28641id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28492id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                g81Var.c(false);
                return;
            }
            if (org.telegram.messenger.bz.f23278c1 > 0 && bnVar.f46279m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.fc t6 = new org.telegram.ui.Components.kc(org.telegram.ui.Components.bb.a(g81Var.getContext()), g81Var.f48170a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35091j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23278c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f46743c;
            ek0Var.requestLayout();
            this.d.requestLayout();
            ek0Var.getAdapter().f();
            this.f46744e.L(this.f46745f);
        }
    }
}
