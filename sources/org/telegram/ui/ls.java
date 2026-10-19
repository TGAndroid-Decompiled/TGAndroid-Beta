package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ls extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f39033a;

    public ls(ContactsActivity contactsActivity) {
        this.f39033a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.f39033a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar;
            if (kVar.t()) {
                contactsActivity.o0();
                return;
            } else {
                contactsActivity.finishFragment();
                return;
            }
        }
        int i12 = 1;
        if (i10 == 100) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
            a0.h hVar = contactsActivity.f33075d0;
            if (hVar.m() == 1) {
                alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f20604a.R = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
                alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new is(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.tg0(20));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
            b2Var.show();
            b2Var.i();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            ns nsVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            nsVar.Y(i12, false);
            org.telegram.ui.ActionBar.u0 u0Var = contactsActivity.f33092s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            u0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f33077f.x0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.Z.f27688r, new ti(this, 15));
        }
    }
}
