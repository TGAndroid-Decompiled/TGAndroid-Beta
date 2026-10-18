package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class pj implements vj {
    public final int f29316a;
    public final ContactsController.Contact f29317b;

    public pj(ContactsController.Contact contact, int i10) {
        this.f29316a = i10;
        this.f29317b = contact;
    }

    @Override
    public final String run() {
        switch (this.f29316a) {
            case 0:
                ContactsController.Contact contact = this.f29317b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f29317b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact2.phones.get(0));
        }
    }
}
