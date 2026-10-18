package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class pj implements vj {
    public final int f29323a;
    public final ContactsController.Contact f29324b;

    public pj(ContactsController.Contact contact, int i10) {
        this.f29323a = i10;
        this.f29324b = contact;
    }

    @Override
    public final String run() {
        switch (this.f29323a) {
            case 0:
                ContactsController.Contact contact = this.f29324b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f29324b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact2.phones.get(0));
        }
    }
}
