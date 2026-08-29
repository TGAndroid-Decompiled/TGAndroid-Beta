package org.telegram.ui;

import android.content.Context;
public final class ps extends rf.e {
    public final ContactsActivity H;

    public ps(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.H = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ps.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.H;
        org.telegram.ui.Components.jl0 jl0Var = contactsActivity.f35487f;
        if (jl0Var != null && jl0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.D) {
                org.telegram.ui.Components.jl0 jl0Var2 = contactsActivity.f35487f;
                if (h != 2) {
                    z10 = true;
                }
                jl0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.jl0 jl0Var3 = contactsActivity.f35487f;
            if (h != 0) {
                z10 = true;
            }
            jl0Var3.setFastScrollVisible(z10);
        }
    }
}
