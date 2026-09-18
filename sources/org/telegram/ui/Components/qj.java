package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class qj implements wj {
    public final int f27621a;
    public final ContactsController.Contact f27622b;

    public qj(ContactsController.Contact contact, int i10) {
        this.f27621a = i10;
        this.f27622b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27621a) {
            case 0:
                ContactsController.Contact contact = this.f27622b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27622b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
