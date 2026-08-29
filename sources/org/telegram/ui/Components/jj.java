package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class jj implements qj {
    public final int f29670a;
    public final ContactsController.Contact f29671b;

    public jj(ContactsController.Contact contact, int i10) {
        this.f29670a = i10;
        this.f29671b = contact;
    }

    @Override
    public final String run() {
        switch (this.f29670a) {
            case 0:
                ContactsController.Contact contact = this.f29671b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return qe.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f29671b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return qe.b.c().b(contact2.phones.get(0));
        }
    }
}
