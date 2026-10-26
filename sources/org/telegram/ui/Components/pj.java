package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class pj implements vj {
    public final int f31576a;
    public final ContactsController.Contact f31577b;

    public pj(ContactsController.Contact contact, int i10) {
        this.f31576a = i10;
        this.f31577b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31576a) {
            case 0:
                ContactsController.Contact contact = this.f31577b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return kf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31577b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return kf.b.c().b(contact2.phones.get(0));
        }
    }
}
