package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class sj implements yj {
    public final int f28287a;
    public final ContactsController.Contact f28288b;

    public sj(ContactsController.Contact contact, int i10) {
        this.f28287a = i10;
        this.f28288b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28287a) {
            case 0:
                ContactsController.Contact contact = this.f28288b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28288b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
