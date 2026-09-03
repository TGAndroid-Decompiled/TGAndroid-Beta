package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class jj implements qj {
    public final int f28122a;
    public final ContactsController.Contact f28123b;

    public jj(ContactsController.Contact contact, int i10) {
        this.f28122a = i10;
        this.f28123b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28122a) {
            case 0:
                ContactsController.Contact contact = this.f28123b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return se.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28123b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return se.b.c().b(contact2.phones.get(0));
        }
    }
}
