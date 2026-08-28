package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class os extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f41235a;

    public os(ContactsActivity contactsActivity) {
        this.f41235a = contactsActivity;
    }

    @Override
    public final void b(int i9) {
        int i10;
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.f41235a;
        if (i9 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
            if (kVar.s()) {
                contactsActivity.n0();
                return;
            } else {
                contactsActivity.finishFragment();
                return;
            }
        }
        int i11 = 1;
        if (i9 == 100) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
            a0.h hVar = contactsActivity.Z;
            if (hVar.m() == 1) {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ls(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.if0(19));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.show();
            c2Var.h();
        } else if (i9 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            qs qsVar = contactsActivity.d;
            if (!z10) {
                i11 = 2;
            }
            qsVar.Y(i11, false);
            org.telegram.ui.ActionBar.w0 w0Var = contactsActivity.f35435s;
            if (contactsActivity.v) {
                i10 = R.drawable.msg_contacts_time;
            } else {
                i10 = R.drawable.msg_contacts_name;
            }
            w0Var.setIcon(i10);
        } else if (i9 == 0) {
            contactsActivity.f35420f.x0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.V.f30664r, new ri(this, 14));
        }
    }
}
