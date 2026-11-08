package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c81 implements View.OnClickListener {
    public final jf0 f44722a;
    public final an f44723b;
    public final org.telegram.ui.Components.pj0 f44724c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.k60 f44725e;
    public final org.telegram.ui.Components.k60 f44726f;
    public final g81 h;

    public c81(g81 g81Var, jf0 jf0Var, an anVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = g81Var;
        this.f44722a = jf0Var;
        this.f44723b = anVar;
        this.f44724c = pj0Var;
        this.d = linearLayout;
        this.f44725e = k60Var;
        this.f44726f = k60Var2;
    }

    @Override
    public final void onClick(View view) {
        jf0 jf0Var = this.f44722a;
        ArrayList arrayList = jf0Var.f46948b;
        ArrayList arrayList2 = jf0Var.f46949c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            g81 g81Var = this.h;
            an anVar = this.f44723b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f27105id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26956id);
                }
                anVar.presentFragment(new ProfileActivity(bundle, null));
                g81Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23393c1 > 0 && anVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(g81Var.getContext()), g81Var.f45900a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748489, null)), null);
                anVar.B1 = t6;
                t6.f32545j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23393c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f44724c;
            pj0Var.requestLayout();
            this.d.requestLayout();
            pj0Var.getAdapter().f();
            this.f44725e.K(this.f44726f);
        }
    }
}
