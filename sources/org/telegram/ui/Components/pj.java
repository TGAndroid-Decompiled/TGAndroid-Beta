package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class pj implements vj {
    public final int f31574a;
    public final ContactsController.Contact f31575b;

    public pj(ContactsController.Contact contact, int i10) {
        this.f31574a = i10;
        this.f31575b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31574a) {
            case 0:
                ContactsController.Contact contact = this.f31575b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return kf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31575b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return kf.b.c().b(contact2.phones.get(0));
        }
    }
}
