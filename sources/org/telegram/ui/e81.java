package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e81 implements View.OnClickListener {
    public final mf0 f45207a;
    public final cn f45208b;
    public final org.telegram.ui.Components.pj0 f45209c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.k60 f45210e;
    public final org.telegram.ui.Components.k60 f45211f;
    public final i81 h;

    public e81(i81 i81Var, mf0 mf0Var, cn cnVar, org.telegram.ui.Components.pj0 pj0Var, LinearLayout linearLayout, org.telegram.ui.Components.k60 k60Var, org.telegram.ui.Components.k60 k60Var2) {
        this.h = i81Var;
        this.f45207a = mf0Var;
        this.f45208b = cnVar;
        this.f45209c = pj0Var;
        this.d = linearLayout;
        this.f45210e = k60Var;
        this.f45211f = k60Var2;
    }

    @Override
    public final void onClick(View view) {
        mf0 mf0Var = this.f45207a;
        ArrayList arrayList = mf0Var.f47942b;
        ArrayList arrayList2 = mf0Var.f47943c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            i81 i81Var = this.h;
            cn cnVar = this.f45208b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f27109id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f26960id);
                }
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                i81Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23397c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.bc t6 = new org.telegram.ui.Components.gc(org.telegram.ui.Components.wa.a(i81Var.getContext()), i81Var.f46558a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
                cnVar.B1 = t6;
                t6.f32203j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23397c1 - 1);
            }
            org.telegram.ui.Components.pj0 pj0Var = this.f45209c;
            pj0Var.requestLayout();
            this.d.requestLayout();
            pj0Var.getAdapter().f();
            this.f45210e.K(this.f45211f);
        }
    }
}
