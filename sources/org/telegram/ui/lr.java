package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class lr extends org.telegram.ui.ActionBar.j {
    public final pr f47669a;

    public lr(pr prVar) {
        this.f47669a = prVar;
    }

    @Override
    public final void b(int i7) {
        boolean z9;
        int i10;
        int i11;
        pr prVar = this.f47669a;
        if (i7 == -1) {
            prVar.finishFragment();
        } else if (i7 == 1 && prVar.f48788b.getText().length() != 0) {
            TLRPC.User a22 = prVar.getMessagesController().a2(Long.valueOf(prVar.H));
            TLRPC.UserFull b22 = prVar.getMessagesController().b2(prVar.H);
            a22.first_name = prVar.f48788b.getText().toString();
            a22.last_name = prVar.f48789c.getText().toString();
            a22.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = prVar.d.getTextWithEntities();
            prVar.getMessagesController().X3(a22, false, false);
            org.telegram.messenger.g5 contactsController = prVar.getContactsController();
            if (prVar.K && prVar.X) {
                z9 = true;
            } else {
                z9 = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.f26998id = contactsController.getMessagesController().q1(a22);
            tL_contacts_addContact.first_name = a22.first_name;
            tL_contacts_addContact.last_name = a22.last_name;
            String str = a22.phone;
            tL_contacts_addContact.phone = str;
            tL_contacts_addContact.add_phone_privacy_exception = z9;
            if (str == null) {
                tL_contacts_addContact.phone = "";
            } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
                tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
            }
            if (textWithEntities != null) {
                tL_contacts_addContact.flags |= 2;
                tL_contacts_addContact.note = textWithEntities;
            }
            contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new org.telegram.messenger.r4(1, contactsController, a22), 6);
            i10 = ((org.telegram.ui.ActionBar.f2) prVar).currentAccount;
            org.telegram.messenger.qp.s1(i10).f24764d7.edit().putInt("dialog_bar_vis3" + prVar.H, 3).commit();
            prVar.getNotificationCenter().k(org.telegram.messenger.qs.f25063r, 1);
            prVar.getNotificationCenter().k(org.telegram.messenger.qs.Q0, Long.valueOf(prVar.H));
            if (b22 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    b22.flags2 |= 4194304;
                    b22.note = textWithEntities;
                } else {
                    b22.flags2 &= -4194305;
                    b22.note = null;
                }
                i11 = ((org.telegram.ui.ActionBar.f2) prVar).currentAccount;
                org.telegram.messenger.yr.a0(i11).j2(b22, true);
                prVar.getNotificationCenter().k(org.telegram.messenger.qs.E0, Long.valueOf(b22.f27106id), b22);
            }
            prVar.finishFragment();
            or orVar = prVar.O;
            if (orVar != null) {
                orVar.a();
            }
        }
    }
}
