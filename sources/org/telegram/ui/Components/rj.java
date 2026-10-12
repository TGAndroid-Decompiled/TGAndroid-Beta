package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class rj implements xj {
    public final int f28852a;
    public final ContactsController.Contact f28853b;

    public rj(ContactsController.Contact contact, int i10) {
        this.f28852a = i10;
        this.f28853b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28852a) {
            case 0:
                ContactsController.Contact contact = this.f28853b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28853b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact2.phones.get(0));
        }
    }
}
