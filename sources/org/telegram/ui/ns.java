package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ns extends ig.t1 {
    public final ContactsActivity K;

    public ns(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f14251c = context;
        this.h = hVar;
        this.f14254r = z10;
        this.f14255s = z11;
        this.f14257x = 0;
        this.v = z12;
        this.f14256w = true;
        ig.a2 a2Var = new ig.a2(true);
        this.f14252f = a2Var;
        a2Var.f13988a = new ig.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f14258y && !this.f14252f.e() && h() == 0) {
            this.K.f35456c.e(false, true);
        }
    }
}
