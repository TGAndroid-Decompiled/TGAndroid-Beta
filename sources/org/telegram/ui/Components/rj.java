package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class rj implements xj {
    public final int f27970a;
    public final ContactsController.Contact f27971b;

    public rj(ContactsController.Contact contact, int i10) {
        this.f27970a = i10;
        this.f27971b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27970a) {
            case 0:
                ContactsController.Contact contact = this.f27971b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27971b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
