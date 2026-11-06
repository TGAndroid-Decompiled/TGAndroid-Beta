package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class b81 implements View.OnClickListener {
    public final jf0 f44223a;
    public final an f44224b;
    public final org.telegram.ui.Components.pj0 f44225c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.k60 f44226e;
    public final org.telegram.ui.Components.k60 f44227f;
    public final f81 h;

    public b81(f81 f81Var, jf0 jf0Var, an anVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = f81Var;
        this.f44223a = jf0Var;
        this.f44224b = anVar;
        this.f44225c = pj0Var;
        this.d = linearLayout;
        this.f44226e = k60Var;
        this.f44227f = k60Var2;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f44223a;
        ArrayList arrayList = jf0Var.f46951b;
        ArrayList arrayList2 = jf0Var.f46952c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            f81 f81Var = this.h;
            an anVar = this.f44224b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f27101id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26952id);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                f81Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23365c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(f81Var.getContext()), f81Var.f45556a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131748487, null)), null);
                anVar.B1 = t6;
                t6.f32527j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23365c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f44225c;
            pj0Var.requestLayout();
            this.d.requestLayout();
            pj0Var.getAdapter().f();
            this.f44226e.K(this.f44227f);
        }
    }
}
