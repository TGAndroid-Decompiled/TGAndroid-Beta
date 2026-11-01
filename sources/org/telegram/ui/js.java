package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class js extends org.telegram.ui.ActionBar.k {
    public final ns f38536a;

    public js(ns nsVar) {
        this.f38536a = nsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        ns nsVar = this.f38536a;
        if (i10 == -1) {
            nsVar.finishFragment();
        } else if (i10 == 1 && nsVar.f39963b.getText().length() != 0) {
            TLRPC.User Z1 = nsVar.getMessagesController().Z1(Long.valueOf(nsVar.H));
            TLRPC.UserFull a2 = nsVar.getMessagesController().a2(nsVar.H);
            Z1.first_name = nsVar.f39963b.getText().toString();
            Z1.last_name = nsVar.f39964c.getText().toString();
            Z1.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = nsVar.d.getTextWithEntities();
            nsVar.getMessagesController().U3(Z1, false, false);
            org.telegram.messenger.i5 contactsController = nsVar.getContactsController();
            if (nsVar.K && nsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.getClass();
            TLRPC.TL_contacts_addContact tL_contacts_addContact = new TLRPC.TL_contacts_addContact();
            tL_contacts_addContact.f19836id = contactsController.getMessagesController().p1(Z1);
            tL_contacts_addContact.first_name = Z1.first_name;
            tL_contacts_addContact.last_name = Z1.last_name;
            String str = Z1.phone;
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
            contactsController.getConnectionsManager().sendRequest(tL_contacts_addContact, new org.telegram.messenger.v4(1, contactsController, Z1), 6);
            i11 = ((org.telegram.ui.ActionBar.k2) nsVar).currentAccount;
            org.telegram.messenger.wp.r1(i11).e7.edit().putInt("dialog_bar_vis3" + nsVar.H, 3).commit();
            nsVar.getNotificationCenter().k(org.telegram.messenger.at.f14772r, 1);
            nsVar.getNotificationCenter().k(org.telegram.messenger.at.Q0, Long.valueOf(nsVar.H));
            if (a2 != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    a2.flags2 |= 4194304;
                    a2.note = textWithEntities;
                } else {
                    a2.flags2 &= -4194305;
                    a2.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.k2) nsVar).currentAccount;
                org.telegram.messenger.is.a0(i12).j2(a2, true);
                nsVar.getNotificationCenter().k(org.telegram.messenger.at.E0, Long.valueOf(a2.f19944id), a2);
            }
            nsVar.finishFragment();
            ms msVar = nsVar.O;
            if (msVar != null) {
                msVar.a();
            }
        }
    }
}
