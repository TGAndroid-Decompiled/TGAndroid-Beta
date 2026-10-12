package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class at extends gg.t1 {
    public final ContactsActivity K;

    public at(ContactsActivity contactsActivity, Context context, a0.i iVar, boolean z10, boolean z11, boolean z12) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.f10812e = new ArrayList();
        this.H = new ArrayList();
        this.f10811c = context;
        this.h = iVar;
        this.f10815r = z10;
        this.f10816s = z11;
        this.f10818x = 0;
        this.v = z12;
        this.f10817w = true;
        gg.b2 b2Var = new gg.b2(true);
        this.f10813f = b2Var;
        b2Var.f10530a = new gg.q1(this);
    }

    @Override
    public final void F() {
        if (!this.f10819y && !this.f10813f.e() && h() == 0) {
            this.K.f33537e.e(false, true);
        }
    }
}
