package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class at extends org.telegram.ui.ActionBar.j {
    public final ContactsActivity f31976a;

    public at(ContactsActivity contactsActivity) {
        this.f31976a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        int i11;
        org.telegram.ui.ActionBar.k kVar;
        ContactsActivity contactsActivity = this.f31976a;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) contactsActivity).actionBar;
            if (kVar.s()) {
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
            a0.i iVar = contactsActivity.f30754d0;
            if (iVar.m() == 1) {
                alertDialog$Builder.f18446a.R = LocaleController.getString(R.string.DeleteContactTitle);
                alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.DeleteContactSubtitle);
            } else {
                alertDialog$Builder.f18446a.R = LocaleController.formatPluralString("DeleteContactsTitle", iVar.m(), new Object[0]);
                alertDialog$Builder.f18446a.T = LocaleController.getString(R.string.DeleteContactsSubtitle);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xs(contactsActivity));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.bn0(17));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18446a;
            c2Var.show();
            c2Var.h();
        } else if (i10 == 1) {
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            ct ctVar = contactsActivity.d;
            if (!z10) {
                i12 = 2;
            }
            ctVar.Y(i12, false);
            org.telegram.ui.ActionBar.w0 w0Var = contactsActivity.f30771s;
            if (contactsActivity.v) {
                i11 = R.drawable.msg_contacts_time;
            } else {
                i11 = R.drawable.msg_contacts_name;
            }
            w0Var.setIcon(i11);
        } else if (i10 == 0) {
            contactsActivity.f30756f.y0(0);
            AndroidUtilities.doOnPreDraw(contactsActivity.Z.f22543r, new ej(this, 14));
        }
    }
}
