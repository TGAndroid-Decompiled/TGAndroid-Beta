package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class js extends org.telegram.ui.ActionBar.j {
    public final ns f35481a;

    public js(ns nsVar) {
        this.f35481a = nsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z4;
        int i11;
        int i12;
        ns nsVar = this.f35481a;
        if (i10 == -1) {
            nsVar.finishFragment();
        } else if (i10 == 1 && nsVar.f36716b.getText().length() != 0) {
            TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.E));
            TLRPC.UserFull userFull = nsVar.getMessagesController().getUserFull(nsVar.E);
            user.first_name = nsVar.f36716b.getText().toString();
            user.last_name = nsVar.f36717c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = nsVar.d.getTextWithEntities();
            nsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = nsVar.getContactsController();
            if (nsVar.H && nsVar.U) {
                z4 = true;
            } else {
                z4 = false;
            }
            contactsController.addContact(user, textWithEntities, z4);
            i11 = ((org.telegram.ui.ActionBar.p2) nsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + nsVar.E, 3).commit();
            nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(nsVar.E));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.p2) nsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f19332id), userFull);
            }
            nsVar.finishFragment();
            ms msVar = nsVar.L;
            if (msVar != null) {
                msVar.a();
            }
        }
    }
}
