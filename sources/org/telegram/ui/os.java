package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class os extends rf.d1 {
    public final ContactsActivity G;

    public os(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.G = contactsActivity;
        this.d = new ArrayList();
        this.f47194e = new ArrayList();
        this.D = new ArrayList();
        this.f47193c = context;
        this.h = hVar;
        this.f47197r = z10;
        this.f47198s = z11;
        this.f47200x = 0;
        this.v = z12;
        this.f47199w = true;
        rf.k1 k1Var = new rf.k1(true);
        this.f47195f = k1Var;
        k1Var.f47277a = new rf.b1(this);
    }

    @Override
    public final void F() {
        if (!this.f47201y && !this.f47195f.e() && h() == 0) {
            this.G.f35485e.e(false, true);
        }
    }
}
