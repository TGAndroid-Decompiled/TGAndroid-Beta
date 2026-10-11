package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class uj implements ak {
    public final int f31617a;
    public final ContactsController.Contact f31618b;

    public uj(ContactsController.Contact contact, int i10) {
        this.f31617a = i10;
        this.f31618b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31617a) {
            case 0:
                ContactsController.Contact contact = this.f31618b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return hf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31618b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return hf.b.c().b(contact2.phones.get(0));
        }
    }
}
