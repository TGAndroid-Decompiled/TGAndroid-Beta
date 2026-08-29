package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ns extends org.telegram.ui.ActionBar.k {
    public final ContactsActivity f40895a;

    public ns(ContactsActivity contactsActivity) {
        this.f40895a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.l lVar;
        ContactsActivity contactsActivity = this.f40895a;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
            if (lVar.s()) {
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
            a0.h hVar = contactsActivity.Z;
            if (hVar.m() == 1) {
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f22714a.N = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ks(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.xo0(13));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.show();
            c2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            ps psVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            psVar.Y(i12, false);
            org.telegram.ui.ActionBar.w0 w0Var = contactsActivity.f35502s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            w0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f35487f.x0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.V.f34546r, new ui(this, 14));
        }
    }
}
