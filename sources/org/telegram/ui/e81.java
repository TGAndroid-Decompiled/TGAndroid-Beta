package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e81 implements View.OnClickListener {
    public final nf0 f47129a;
    public final bn f47130b;
    public final org.telegram.ui.Components.ck0 f47131c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.y60 f47132e;
    public final org.telegram.ui.Components.y60 f47133f;
    public final i81 h;

    public e81(i81 i81Var, nf0 nf0Var, bn bnVar, org.telegram.ui.Components.ck0 ck0Var, LinearLayout linearLayout, org.telegram.ui.Components.y60 y60Var, org.telegram.ui.Components.y60 y60Var2) {
        this.h = i81Var;
        this.f47129a = nf0Var;
        this.f47130b = bnVar;
        this.f47131c = ck0Var;
        this.d = linearLayout;
        this.f47132e = y60Var;
        this.f47133f = y60Var2;
    }

    @Override
    public final void onClick(View view) {
        nf0 nf0Var = this.f47129a;
        ArrayList arrayList = nf0Var.f50159b;
        ArrayList arrayList2 = nf0Var.f50160c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            i81 i81Var = this.h;
            bn bnVar = this.f47130b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28552id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28403id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                i81Var.c(false);
                return;
            }
            if (org.telegram.messenger.bz.f23153c1 > 0 && bnVar.f46084m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(i81Var.getContext()), i81Var.f48634a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.M0(2131748296, null)), null);
                bnVar.C1 = t6;
                t6.f35461j = 4000;
                t6.j();
                org.telegram.messenger.bz.S(org.telegram.messenger.bz.f23153c1 - 1);
            }
            org.telegram.ui.Components.ck0 ck0Var = this.f47131c;
            ck0Var.requestLayout();
            this.d.requestLayout();
            ck0Var.getAdapter().f();
            this.f47132e.L(this.f47133f);
        }
    }
}
