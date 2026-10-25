package org.telegram.ui;

import android.content.Context;
public final class os extends ig.e {
    public final ContactsActivity O;

    public os(ContactsActivity contactsActivity, Context context, int i10, boolean z10, a0.h hVar, int i11) {
        super(context, i10, z10, hVar, i11);
        this.O = contactsActivity;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.os.R():int");
    }

    @Override
    public final void l() {
        boolean z10 = false;
        X(false);
        ContactsActivity contactsActivity = this.O;
        org.telegram.ui.Components.mm0 mm0Var = contactsActivity.d;
        if (mm0Var != null && mm0Var.getAdapter() == this) {
            int h = h();
            if (contactsActivity.F) {
                org.telegram.ui.Components.mm0 mm0Var2 = contactsActivity.d;
                if (h != 2) {
                    z10 = true;
                }
                mm0Var2.setFastScrollVisible(z10);
                return;
            }
            org.telegram.ui.Components.mm0 mm0Var3 = contactsActivity.d;
            if (h != 0) {
                z10 = true;
            }
            mm0Var3.setFastScrollVisible(z10);
        }
    }
}
