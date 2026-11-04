package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class pr extends kg.o1 {
    public final ContactsActivity L;

    public pr(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.L = contactsActivity;
        this.d = new ArrayList();
        this.f17127e = new ArrayList();
        this.I = new ArrayList();
        this.f17126c = context;
        this.h = hVar;
        this.f17130r = z10;
        this.f17131s = z11;
        this.f17134y = 0;
        this.f17132w = z12;
        this.f17133x = true;
        kg.v1 v1Var = new kg.v1(true);
        this.f17128f = v1Var;
        v1Var.f17206a = new kg.l1(this);
    }

    @Override
    public final void F() {
        if (!this.E && !this.f17128f.e() && b() == 0) {
            this.L.f41211c.e(false, true);
        }
    }
}
