package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class hj implements oj {
    public final int f25428a;
    public final ContactsController.Contact f25429b;

    public hj(ContactsController.Contact contact, int i10) {
        this.f25428a = i10;
        this.f25429b = contact;
    }

    @Override
    public final String run() {
        switch (this.f25428a) {
            case 0:
                ContactsController.Contact contact = this.f25429b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return se.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f25429b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return se.b.c().b(contact2.phones.get(0));
        }
    }
}
