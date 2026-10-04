package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class tj implements zj {
    public final int f31069a;
    public final ContactsController.Contact f31070b;

    public tj(ContactsController.Contact contact, int i10) {
        this.f31069a = i10;
        this.f31070b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31069a) {
            case 0:
                ContactsController.Contact contact = this.f31070b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31070b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
