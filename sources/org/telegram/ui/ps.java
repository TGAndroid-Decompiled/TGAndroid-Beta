package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ps extends s4.u0 {
    public boolean f42649a;
    public boolean f42650b;
    public final ContactsActivity f42651c;

    public ps(ContactsActivity contactsActivity) {
        this.f42651c = contactsActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 1) {
            ContactsActivity contactsActivity = this.f42651c;
            if (contactsActivity.f35477y && contactsActivity.f35476x) {
                AndroidUtilities.hideKeyboard(contactsActivity.getParentActivity().getCurrentFocus());
            }
            this.f42650b = true;
            return;
        }
        this.f42650b = false;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z10;
        ContactsActivity contactsActivity = this.f42651c;
        if (contactsActivity.f35474s != null && !contactsActivity.f35477y) {
            if (i11 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i11 != 0 && this.f42649a && (z10 || this.f42650b)) {
                contactsActivity.v = !z10;
                ContactsActivity.c0(contactsActivity);
            }
            this.f42649a = true;
        }
    }
}
