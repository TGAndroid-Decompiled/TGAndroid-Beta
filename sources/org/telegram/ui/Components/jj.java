package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class jj implements qj {
    public final int f28135a;
    public final ContactsController.Contact f28136b;

    public jj(ContactsController.Contact contact, int i10) {
        this.f28135a = i10;
        this.f28136b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28135a) {
            case 0:
                ContactsController.Contact contact = this.f28136b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return se.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28136b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return se.b.c().b(contact2.phones.get(0));
        }
    }
}
