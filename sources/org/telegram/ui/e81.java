package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e81 implements View.OnClickListener {
    public final mf0 f47171a;
    public final bn f47172b;
    public final org.telegram.ui.Components.ek0 f47173c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.a70 f47174e;
    public final org.telegram.ui.Components.a70 f47175f;
    public final i81 h;

    public e81(i81 i81Var, mf0 mf0Var, bn bnVar, org.telegram.ui.Components.ek0 ek0Var, LinearLayout linearLayout, org.telegram.ui.Components.a70 a70Var, org.telegram.ui.Components.a70 a70Var2) {
        this.h = i81Var;
        this.f47171a = mf0Var;
        this.f47172b = bnVar;
        this.f47173c = ek0Var;
        this.d = linearLayout;
        this.f47174e = a70Var;
        this.f47175f = a70Var2;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f47171a;
        ArrayList arrayList = mf0Var.f49841b;
        ArrayList arrayList2 = mf0Var.f49842c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            i81 i81Var = this.h;
            bn bnVar = this.f47172b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f28547id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f28398id);
                }
                bnVar.presentFragment(new ProfileActivity(bundle, null));
                i81Var.c(false);
                return;
            }
            if (org.telegram.messenger.cz.f23362c1 > 0 && bnVar.f46064m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.gc t6 = new org.telegram.ui.Components.lc(org.telegram.ui.Components.cb.a(i81Var.getContext()), i81Var.f48648a).t(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.N0(2131748295, null)), null);
                bnVar.C1 = t6;
                t6.f35489j = 4000;
                t6.j();
                org.telegram.messenger.cz.S(org.telegram.messenger.cz.f23362c1 - 1);
            }
            org.telegram.ui.Components.ek0 ek0Var = this.f47173c;
            ek0Var.requestLayout();
            this.d.requestLayout();
            ek0Var.getAdapter().f();
            this.f47174e.L(this.f47175f);
        }
    }
}
