package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ps extends hg.t1 {
    public final ContactsActivity K;

    public ps(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f12085c = context;
        this.h = hVar;
        this.f12088r = z10;
        this.f12089s = z11;
        this.f12091x = 0;
        this.v = z12;
        this.f12090w = true;
        hg.a2 a2Var = new hg.a2(true);
        this.f12086f = a2Var;
        a2Var.f11819a = new hg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f12092y && !this.f12086f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
