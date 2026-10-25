package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ps extends s4.u0 {
    public boolean f42646a;
    public boolean f42647b;
    public final ContactsActivity f42648c;

    public ps(ContactsActivity contactsActivity) {
        this.f42648c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f42648c;
            if (contactsActivity.f35474y && contactsActivity.f35473x) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f42647b = true;
            return;
        }
        this.f42647b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ContactsActivity contactsActivity = this.f42648c;
        if (contactsActivity.f35471s != null && !contactsActivity.f35474y) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f42646a && (z10 || this.f42647b)) {
                contactsActivity.v = !z10;
                ContactsActivity.c0(contactsActivity);
            }
            this.f42646a = true;
        }
    }
}
