package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class qj implements wj {
    public final int f27586a;
    public final ContactsController.Contact f27587b;

    public qj(ContactsController.Contact contact, int i10) {
        this.f27586a = i10;
        this.f27587b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27586a) {
            case 0:
                ContactsController.Contact contact = this.f27587b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27587b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
