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
        this.f10747c = context;
        this.h = hVar;
        this.f10750r = z10;
        this.f10751s = z11;
        this.f10753x = 0;
        this.v = z12;
        this.f10752w = true;
        hg.a2 a2Var = new hg.a2(true);
        this.f10748f = a2Var;
        a2Var.f10484a = new hg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f10754y && !this.f10748f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
