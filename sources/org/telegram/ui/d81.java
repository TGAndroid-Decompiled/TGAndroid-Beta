package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d81 implements View.OnClickListener {
    public final lf0 f44893a;
    public final cn f44894b;
    public final org.telegram.ui.Components.qj0 f44895c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.l60 f44896e;
    public final org.telegram.ui.Components.l60 f44897f;
    public final h81 h;

    public d81(h81 h81Var, lf0 lf0Var, cn cnVar, org.telegram.ui.Components.qj0 qj0Var, LinearLayout linearLayout, org.telegram.ui.Components.l60 l60Var, org.telegram.ui.Components.l60 l60Var2) {
        this.h = h81Var;
        this.f44893a = lf0Var;
        this.f44894b = cnVar;
        this.f44895c = qj0Var;
        this.d = linearLayout;
        this.f44896e = l60Var;
        this.f44897f = l60Var2;
    }

    @Override
    public final void onClick(View view) {
        lf0 lf0Var = this.f44893a;
        ArrayList arrayList = lf0Var.f47591b;
        ArrayList arrayList2 = lf0Var.f47592c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            h81 h81Var = this.h;
            cn cnVar = this.f44894b;
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
                cnVar.presentFragment(new ProfileActivity(bundle, null));
                h81Var.c(false);
                return;
            }
            if (org.telegram.messenger.iz.f23393c1 > 0 && cnVar.l1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.cc t6 = new org.telegram.ui.Components.hc(org.telegram.ui.Components.xa.a(h81Var.getContext()), h81Var.f46245a).t(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(2131748488, null)), null);
                cnVar.B1 = t6;
                t6.f32627j = 4000;
                t6.j();
                org.telegram.messenger.iz.S(org.telegram.messenger.iz.f23393c1 - 1);
            }
            org.telegram.ui.Components.qj0 qj0Var = this.f44895c;
            qj0Var.requestLayout();
            this.d.requestLayout();
            qj0Var.getAdapter().f();
            this.f44896e.K(this.f44897f);
        }
    }
}
