package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class qj implements wj {
    public final int f27580a;
    public final ContactsController.Contact f27581b;

    public qj(ContactsController.Contact contact, int i10) {
        this.f27580a = i10;
        this.f27581b = contact;
    }

    @Override
    public final String run() {
        switch (this.f27580a) {
            case 0:
                ContactsController.Contact contact = this.f27581b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f27581b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
