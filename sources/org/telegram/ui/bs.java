package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class bs extends org.telegram.ui.ActionBar.j {
    public final fs f35739a;

    public bs(fs fsVar) {
        this.f35739a = fsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        fs fsVar = this.f35739a;
        if (i10 == -1) {
            fsVar.finishFragment();
        } else if (i10 == 1 && fsVar.f37067b.getText().length() != 0) {
            TLRPC.User user = fsVar.getMessagesController().getUser(Long.valueOf(fsVar.H));
            TLRPC.UserFull userFull = fsVar.getMessagesController().getUserFull(fsVar.H);
            user.first_name = fsVar.f37067b.getText().toString();
            user.last_name = fsVar.f37068c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = fsVar.d.getTextWithEntities();
            fsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = fsVar.getContactsController();
            if (fsVar.K && fsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.n2) fsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + fsVar.H, 3).commit();
            fsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            fsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(fsVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.n2) fsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                fsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f20423id), userFull);
            }
            fsVar.finishFragment();
            es esVar = fsVar.O;
            if (esVar != null) {
                esVar.c();
            }
        }
    }
}
