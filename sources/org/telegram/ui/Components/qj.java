package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class qj implements wj {
    public final int f29768a;
    public final ContactsController.Contact f29769b;

    public qj(ContactsController.Contact contact, int i10) {
        this.f29768a = i10;
        this.f29769b = contact;
    }

    @Override
    public final String run() {
        switch (this.f29768a) {
            case 0:
                ContactsController.Contact contact = this.f29769b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f29769b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return gf.b.c().b(contact2.phones.get(0));
        }
    }
}
