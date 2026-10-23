package org.telegram.ui;

import android.content.Context;
public final class ns extends hg.e {
    public final ContactsActivity L;

    public ns(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.L = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ns.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.L;
        org.telegram.ui.Components.jm0 jm0Var = contactsActivity.f33088f;
        if (jm0Var != null && jm0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.H) {
                org.telegram.ui.Components.jm0 jm0Var2 = contactsActivity.f33088f;
                if (h != 2) {
                    z10 = true;
                }
                jm0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.jm0 jm0Var3 = contactsActivity.f33088f;
            if (h != 0) {
                z10 = true;
            }
            jm0Var3.setFastScrollVisible(z10);
        }
    }
}
