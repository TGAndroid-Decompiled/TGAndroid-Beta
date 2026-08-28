package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class gj implements nj {
    public final int f28780a;
    public final ContactsController.Contact f28781b;

    public gj(ContactsController.Contact contact, int i9) {
        this.f28780a = i9;
        this.f28781b = contact;
    }

    @Override
    public final String run() {
        switch (this.f28780a) {
            case 0:
                ContactsController.Contact contact = this.f28781b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return ne.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f28781b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return ne.b.c().b(contact2.phones.get(0));
        }
    }
}
