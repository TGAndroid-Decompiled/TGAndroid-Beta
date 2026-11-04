package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hr extends org.telegram.ui.ActionBar.j {
    public final lr f45966a;

    public hr(lr lrVar) {
        this.f45966a = lrVar;
    }

    @Override
    public final void b(int i3) {
        boolean z10;
        int i10;
        int i11;
        lr lrVar = this.f45966a;
        if (i3 == -1) {
            lrVar.finishFragment();
        } else if (i3 == 1 && lrVar.f47416b.getText().length() != 0) {
            TLRPC.User a22 = lrVar.getMessagesController().a2(Long.valueOf(lrVar.I));
            TLRPC.UserFull b22 = lrVar.getMessagesController().b2(lrVar.I);
            a22.first_name = lrVar.f47416b.getText().toString();
            a22.last_name = lrVar.f47417c.getText().toString();
            a22.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = lrVar.d.getTextWithEntities();
            lrVar.getMessagesController().X3(a22, false, false);
            org.telegram.messenger.g5 contactsController = lrVar.getContactsController();
            if (lrVar.L && lrVar.Y) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.f27043id = contactsController.getMessagesController().q1(a22);
            tL_contacts_addContact.first_name = a22.first_name;
            tL_contacts_addContact.last_name = a22.last_name;
            String str = a22.phone;
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
            contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new org.telegram.messenger.s4(1, contactsController, a22), 6);
            i10 = ((org.telegram.ui.ActionBar.d2) lrVar).currentAccount;
            org.telegram.messenger.hp.s1(i10).f22989d7.edit().putInt("dialog_bar_vis3" + lrVar.I, 3).commit();
            lrVar.getNotificationCenter().k(org.telegram.messenger.hs.f23292r, 1);
            lrVar.getNotificationCenter().k(org.telegram.messenger.hs.Q0, Long.valueOf(lrVar.I));
            if (b22 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    b22.flags2 |= 4194304;
                    b22.note = textWithEntities;
                } else {
                    b22.flags2 &= -4194305;
                    b22.note = null;
                }
                i11 = ((org.telegram.ui.ActionBar.d2) lrVar).currentAccount;
                org.telegram.messenger.qr.a0(i11).j2(b22, true);
                lrVar.getNotificationCenter().k(org.telegram.messenger.hs.E0, Long.valueOf(b22.f27151id), b22);
            }
            lrVar.finishFragment();
            kr krVar = lrVar.P;
            if (krVar != null) {
                krVar.a();
            }
        }
    }
}
