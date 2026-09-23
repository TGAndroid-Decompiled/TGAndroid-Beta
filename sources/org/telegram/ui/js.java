package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class js extends org.telegram.ui.ActionBar.j {
    public final ns f34504a;

    public js(ns nsVar) {
        this.f34504a = nsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        ns nsVar = this.f34504a;
        if (i10 == -1) {
            nsVar.finishFragment();
        } else if (i10 == 1 && nsVar.f35587b.getText().length() != 0) {
            TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
            TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.H);
            user.first_name = nsVar.f35587b.getText().toString();
            user.last_name = nsVar.f35588c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = nsVar.d.getTextWithEntities();
            nsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = nsVar.getContactsController();
            if (nsVar.K && nsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.n2) nsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + nsVar.H, 3).commit();
            nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(nsVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.n2) nsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f18231id), userFull);
            }
            nsVar.finishFragment();
            ms msVar = nsVar.O;
            if (msVar != null) {
                msVar.b();
            }
        }
    }
}
