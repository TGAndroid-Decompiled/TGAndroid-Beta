package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class rj implements xj {
    public final int f27979a;
    public final ContactsController.Contact f27980b;

    public rj(ContactsController.Contact contact, int i10) {
        this.f27979a = i10;
        this.f27980b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27979a) {
            case 0:
                ContactsController.Contact contact = this.f27980b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27980b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
