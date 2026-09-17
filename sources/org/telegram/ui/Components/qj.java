package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class qj implements wj {
    public final int f27322a;
    public final ContactsController.Contact f27323b;

    public qj(ContactsController.Contact contact, int i10) {
        this.f27322a = i10;
        this.f27323b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27322a) {
            case 0:
                ContactsController.Contact contact = this.f27323b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27323b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
