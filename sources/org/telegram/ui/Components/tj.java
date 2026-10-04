package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class tj implements zj {
    public final int f31068a;
    public final ContactsController.Contact f31069b;

    public tj(ContactsController.Contact contact, int i10) {
        this.f31068a = i10;
        this.f31069b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31068a) {
            case 0:
                ContactsController.Contact contact = this.f31069b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31069b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
