package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class pj implements vj {
    public final int f31627a;
    public final ContactsController.Contact f31628b;

    public pj(ContactsController.Contact contact, int i10) {
        this.f31627a = i10;
        this.f31628b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31627a) {
            case 0:
                ContactsController.Contact contact = this.f31628b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return kf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31628b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return kf.b.c().b(contact2.phones.get(0));
        }
    }
}
