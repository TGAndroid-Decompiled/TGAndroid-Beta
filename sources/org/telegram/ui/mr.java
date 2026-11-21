package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mr extends org.telegram.ui.ActionBar.j {
    public final qr f49960a;

    public mr(qr qrVar) {
        this.f49960a = qrVar;
    }

    @Override
    public final void b(int i7) {
        boolean z10;
        int i10;
        int i11;
        qr qrVar = this.f49960a;
        if (i7 == -1) {
            qrVar.finishFragment();
        } else if (i7 == 1 && qrVar.f51333b.getText().length() != 0) {
            TLRPC.User c22 = qrVar.getMessagesController().c2(Long.valueOf(qrVar.I));
            TLRPC.UserFull d2 = qrVar.getMessagesController().d2(qrVar.I);
            c22.first_name = qrVar.f51333b.getText().toString();
            c22.last_name = qrVar.f51334c.getText().toString();
            c22.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = qrVar.d.getTextWithEntities();
            qrVar.getMessagesController().e4(c22, false, false);
            org.telegram.messenger.i5 contactsController = qrVar.getContactsController();
            if (qrVar.L && qrVar.Y) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.f28473id = contactsController.getMessagesController().s1(c22);
            tL_contacts_addContact.first_name = c22.first_name;
            tL_contacts_addContact.last_name = c22.last_name;
            String str = c22.phone;
            tL_contacts_addContact.phone = str;
            tL_contacts_addContact.add_phone_privacy_exception = z10;
            if (str == null) {
                tL_contacts_addContact.phone = "";
            } else if (str.length() > 0 && !tL_contacts_addContact.phone.startsWith("+")) {
                tL_contacts_addContact.phone = "+" + tL_contacts_addContact.phone;
            }
            if (textWithEntities != null) {
                tL_contacts_addContact.flags |= 2;
                tL_contacts_addContact.note = textWithEntities;
            }
            contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new org.telegram.messenger.t4(1, contactsController, c22), 6);
            i10 = ((org.telegram.ui.ActionBar.g2) qrVar).currentAccount;
            org.telegram.messenger.mp.u1(i10).f25686g7.edit().putInt("dialog_bar_vis3" + qrVar.I, 3).commit();
            qrVar.getNotificationCenter().k(org.telegram.messenger.ks.f25205r, 1);
            qrVar.getNotificationCenter().k(org.telegram.messenger.ks.Q0, Long.valueOf(qrVar.I));
            if (d2 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    d2.flags2 |= 4194304;
                    d2.note = textWithEntities;
                } else {
                    d2.flags2 &= -4194305;
                    d2.note = null;
                }
                i11 = ((org.telegram.ui.ActionBar.g2) qrVar).currentAccount;
                org.telegram.messenger.tr.a0(i11).j2(d2, true);
                qrVar.getNotificationCenter().k(org.telegram.messenger.ks.E0, Long.valueOf(d2.f28581id), d2);
            }
            qrVar.finishFragment();
            pr prVar = qrVar.P;
            if (prVar != null) {
                prVar.a();
            }
        }
    }
}
