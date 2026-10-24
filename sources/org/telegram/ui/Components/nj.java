package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class nj implements tj {
    public final int f28939a;
    public final ContactsController.Contact f28940b;

    public nj(ContactsController.Contact contact, int i10) {
        this.f28939a = i10;
        this.f28940b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28939a) {
            case 0:
                ContactsController.Contact contact = this.f28940b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28940b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return jf.b.c().b(contact2.phones.get(0));
        }
    }
}
