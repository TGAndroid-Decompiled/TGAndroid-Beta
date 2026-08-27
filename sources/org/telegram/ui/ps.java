package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ps extends org.telegram.ui.ActionBar.j {

    public final ContactsActivity f41424a;

    public ps(ContactsActivity contactsActivity) {
        this.f41424a = contactsActivity;
    }

    @Override
    public final void b(int i10) {
        ContactsActivity contactsActivity = this.f41424a;
        if (i10 == -1) {
            if (((org.telegram.ui.ActionBar.n2) contactsActivity).actionBar.t()) {
                contactsActivity.o0();
                return;
            } else {
                contactsActivity.finishFragment();
                return;
            }
        }
        if (i10 != 100) {
            if (i10 != 1) {
                if (i10 == 0) {
                    contactsActivity.f35423f.x0(0);
                    AndroidUtilities.doOnPreDraw(contactsActivity.V.f31468r, new ti(this, 14));
                    return;
                }
                return;
            }
            SharedConfig.toggleSortContactsByName();
            boolean z10 = SharedConfig.sortContactsByName;
            contactsActivity.v = z10;
            contactsActivity.d.Y(z10 ? 1 : 2, false);
            contactsActivity.f35438s.setIcon(contactsActivity.v ? R.drawable.msg_contacts_time : R.drawable.msg_contacts_name);
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(contactsActivity.getParentActivity(), 0, contactsActivity.getResourceProvider());
        a0.h hVar = contactsActivity.Z;
        if (hVar.m() == 1) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteContactTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteContactSubtitle);
        } else {
            alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteContactsTitle", hVar.m(), new Object[0]);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DeleteContactsSubtitle);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ms(contactsActivity));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.pc0(24));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.show();
        b2Var.h();
    }
}
