package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;

public final class cj implements jj {

    public final int f27467a;

    public final ContactsController.Contact f27468b;

    public cj(ContactsController.Contact contact, int i10) {
        this.f27467a = i10;
        this.f27468b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27467a) {
            case 0:
                ContactsController.Contact contact = this.f27468b;
                return contact.phones.isEmpty() ? "" : oe.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27468b;
                return contact2.phones.isEmpty() ? "" : oe.b.c().b(contact2.phones.get(0));
        }
    }
}
