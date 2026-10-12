package org.telegram.ui.Components;

import org.telegram.messenger.ContactsController;
public final class wj implements ck {
    public final int f32423a;
    public final ContactsController.Contact f32424b;

    public wj(ContactsController.Contact contact, int i10) {
        this.f32423a = i10;
        this.f32424b = contact;
    }

    @Override
    public final String run() {
        switch (this.f32423a) {
            case 0:
                ContactsController.Contact contact = this.f32424b;
                if (contact.phones.isEmpty()) {
                    return "";
                }
                return hf.b.c().b(contact.phones.get(0));
            default:
                ContactsController.Contact contact2 = this.f32424b;
                if (contact2.phones.isEmpty()) {
                    return "";
                }
                return hf.b.c().b(contact2.phones.get(0));
        }
    }
}
