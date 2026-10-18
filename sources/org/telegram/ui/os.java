package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class os extends hg.t1 {
    public final ContactsActivity K;

    public os(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.f12058c = context;
        this.h = hVar;
        this.f12061r = z10;
        this.f12062s = z11;
        this.f12064x = 0;
        this.v = z12;
        this.f12063w = true;
        hg.a2 a2Var = new hg.a2(true);
        this.f12059f = a2Var;
        a2Var.f11795a = new hg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f12065y && !this.f12059f.e() && h() == 0) {
            this.K.e.e(false, true);
        }
    }
}
