package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ps extends ig.t1 {
    public final ContactsActivity K;

    public ps(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f14250c = context;
        this.h = hVar;
        this.f14253r = z10;
        this.f14254s = z11;
        this.f14256x = 0;
        this.v = z12;
        this.f14255w = true;
        ig.a2 a2Var = new ig.a2(true);
        this.f14251f = a2Var;
        a2Var.f13987a = new ig.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f14257y && !this.f14251f.e() && h() == 0) {
            this.K.f35483c.e(false, true);
        }
    }
}
