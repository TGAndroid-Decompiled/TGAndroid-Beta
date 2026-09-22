package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class qj implements wj {
    public final int f27359a;
    public final ContactsController.Contact f27360b;

    public qj(ContactsController.Contact contact, int i10) {
        this.f27359a = i10;
        this.f27360b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27359a) {
            case 0:
                ContactsController.Contact contact = this.f27360b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27360b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
