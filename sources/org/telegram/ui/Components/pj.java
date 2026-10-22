package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class pj implements vj {
    public final int f29324a;
    public final ContactsController.Contact f29325b;

    public pj(ContactsController.Contact contact, int i10) {
        this.f29324a = i10;
        this.f29325b = contact;
    }

    @Override
    public final String run() {
        switch (this.f29324a) {
            case 0:
                ContactsController.Contact contact = this.f29325b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f29325b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact2.phones.get(0));
        }
    }
}
