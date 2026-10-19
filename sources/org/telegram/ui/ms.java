package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ms extends hg.t1 {
    public final ContactsActivity K;

    public ms(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f12057c = context;
        this.h = hVar;
        this.f12060r = z10;
        this.f12061s = z11;
        this.f12063x = 0;
        this.v = z12;
        this.f12062w = true;
        hg.a2 a2Var = new hg.a2(true);
        this.f12058f = a2Var;
        a2Var.f11794a = new hg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f12064y && !this.f12058f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
