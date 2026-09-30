package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class tj implements zj {
    public final int f28539a;
    public final ContactsController.Contact f28540b;

    public tj(ContactsController.Contact contact, int i10) {
        this.f28539a = i10;
        this.f28540b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28539a) {
            case 0:
                ContactsController.Contact contact = this.f28540b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28540b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
