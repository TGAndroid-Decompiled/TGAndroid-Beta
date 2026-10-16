package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class rj implements xj {
    public final int f28552a;
    public final ContactsController.Contact f28553b;

    public rj(ContactsController.Contact contact, int i10) {
        this.f28552a = i10;
        this.f28553b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28552a) {
            case 0:
                ContactsController.Contact contact = this.f28553b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28553b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact2.phones.get(0));
        }
    }
}
