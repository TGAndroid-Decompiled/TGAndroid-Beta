package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class dt extends hg.t1 {
    public final ContactsActivity K;

    public dt(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f10751c = context;
        this.h = hVar;
        this.f10754r = z10;
        this.f10755s = z11;
        this.f10757x = 0;
        this.v = z12;
        this.f10756w = true;
        hg.a2 a2Var = new hg.a2(true);
        this.f10752f = a2Var;
        a2Var.f10488a = new hg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f10758y && !this.f10752f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
