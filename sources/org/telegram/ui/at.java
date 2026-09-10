package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class at extends fg.w1 {
    public final ContactsActivity K;

    public at(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f8245c = context;
        this.h = iVar;
        this.f8248r = z10;
        this.f8249s = z11;
        this.f8251x = 0;
        this.v = z12;
        this.f8250w = true;
        fg.d2 d2Var = new fg.d2(true);
        this.f8246f = d2Var;
        d2Var.f7979a = new fg.t1(this);
    }

    @Override
    public final void F() {
        if (!this.f8252y && !this.f8246f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
