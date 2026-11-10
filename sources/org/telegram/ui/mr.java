package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mr extends org.telegram.ui.ActionBar.k {
    public final qr f48044a;

    public mr(qr qrVar) {
        this.f48044a = qrVar;
    }

    @Override
    public final void b(int i7) {
        boolean z9;
        int i10;
        int i11;
        qr qrVar = this.f48044a;
        if (i7 == -1) {
            qrVar.finishFragment();
        } else if (i7 == 1 && qrVar.f49133b.getText().length() != 0) {
            TLRPC.User a22 = qrVar.getMessagesController().a2(Long.valueOf(qrVar.H));
            TLRPC.UserFull b22 = qrVar.getMessagesController().b2(qrVar.H);
            a22.first_name = qrVar.f49133b.getText().toString();
            a22.last_name = qrVar.f49134c.getText().toString();
            a22.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = qrVar.d.getTextWithEntities();
            qrVar.getMessagesController().X3(a22, false, false);
            org.telegram.messenger.g5 contactsController = qrVar.getContactsController();
            if (qrVar.K && qrVar.X) {
                z9 = true;
            } else {
                z9 = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.f27002id = contactsController.getMessagesController().q1(a22);
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
            i10 = ((org.telegram.ui.ActionBar.f2) qrVar).currentAccount;
            org.telegram.messenger.qp.s1(i10).f24768d7.edit().putInt("dialog_bar_vis3" + qrVar.H, 3).commit();
            qrVar.getNotificationCenter().k(org.telegram.messenger.qs.f25067r, 1);
            qrVar.getNotificationCenter().k(org.telegram.messenger.qs.Q0, Long.valueOf(qrVar.H));
            if (b22 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    b22.flags2 |= 4194304;
                    b22.note = textWithEntities;
                } else {
                    b22.flags2 &= -4194305;
                    b22.note = null;
                }
                i11 = ((org.telegram.ui.ActionBar.f2) qrVar).currentAccount;
                org.telegram.messenger.yr.a0(i11).j2(b22, true);
                qrVar.getNotificationCenter().k(org.telegram.messenger.qs.E0, Long.valueOf(b22.f27110id), b22);
            }
            qrVar.finishFragment();
            pr prVar = qrVar.O;
            if (prVar != null) {
                prVar.a();
            }
        }
    }
}
