package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class pj implements vj {
    public final int f29321a;
    public final ContactsController.Contact f29322b;

    public pj(ContactsController.Contact contact, int i10) {
        this.f29321a = i10;
        this.f29322b = contact;
    }

    @Override
    public final String run() {
        switch (this.f29321a) {
            case 0:
                ContactsController.Contact contact = this.f29322b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f29322b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact2.phones.get(0));
        }
    }
}
