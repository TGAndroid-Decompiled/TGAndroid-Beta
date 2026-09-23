package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class rj implements xj {
    public final int f27646a;
    public final ContactsController.Contact f27647b;

    public rj(ContactsController.Contact contact, int i10) {
        this.f27646a = i10;
        this.f27647b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27646a) {
            case 0:
                ContactsController.Contact contact = this.f27647b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27647b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
