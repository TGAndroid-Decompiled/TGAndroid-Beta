package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class uj implements ak {
    public final int f31512a;
    public final ContactsController.Contact f31513b;

    public uj(ContactsController.Contact contact, int i10) {
        this.f31512a = i10;
        this.f31513b = contact;
    }

    @Override
    public final String run() {
        switch (this.f31512a) {
            case 0:
                ContactsController.Contact contact = this.f31513b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return hf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f31513b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return hf.b.c().b(contact2.phones.get(0));
        }
    }
}
