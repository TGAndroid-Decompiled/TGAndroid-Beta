package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ps extends of.o1 {
    public final ContactsActivity G;

    public ps(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z10, boolean z11, boolean z12) {
        this.G = contactsActivity;
        this.d = new ArrayList();
        this.f19439e = new ArrayList();
        this.D = new ArrayList();
        this.f19438c = context;
        this.h = hVar;
        this.f19442r = z10;
        this.f19443s = z11;
        this.f19445x = 0;
        this.v = z12;
        this.f19444w = true;
        of.v1 v1Var = new of.v1(true);
        this.f19440f = v1Var;
        v1Var.f19524a = new of.l1(this);
    }

    @Override
    public final void F() {
        if (!this.f19446y && !this.f19440f.e() && h() == 0) {
            this.G.f35418e.e(false, true);
        }
    }
}
