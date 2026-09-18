package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class qj implements wj {
    public final int f27325a;
    public final ContactsController.Contact f27326b;

    public qj(ContactsController.Contact contact, int i10) {
        this.f27325a = i10;
        this.f27326b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27325a) {
            case 0:
                ContactsController.Contact contact = this.f27326b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27326b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
