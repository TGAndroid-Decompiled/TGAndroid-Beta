package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class rj implements xj {
    public final int f27978a;
    public final ContactsController.Contact f27979b;

    public rj(ContactsController.Contact contact, int i10) {
        this.f27978a = i10;
        this.f27979b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27978a) {
            case 0:
                ContactsController.Contact contact = this.f27979b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27979b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
