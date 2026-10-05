package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class tj implements zj {
    public final int f31162a;
    public final ContactsController.Contact f31163b;

    public tj(ContactsController.Contact contact, int i10) {
        this.f31162a = i10;
        this.f31163b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31162a) {
            case 0:
                ContactsController.Contact contact = this.f31163b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31163b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
