package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class os extends org.telegram.ui.ActionBar.j {
    public final ss f39331a;

    public os(ss ssVar) {
        this.f39331a = ssVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        ss ssVar = this.f39331a;
        if (i10 == -1) {
            ssVar.finishFragment();
        } else if (i10 == 1 && ssVar.f40538b.getText().length() != 0) {
            TLRPC.User user = ssVar.getMessagesController().getUser(Long.valueOf(ssVar.H));
            TLRPC.UserFull userFull = ssVar.getMessagesController().getUserFull(ssVar.H);
            user.first_name = ssVar.f40538b.getText().toString();
            user.last_name = ssVar.f40539c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = ssVar.d.getTextWithEntities();
            ssVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = ssVar.getContactsController();
            if (ssVar.K && ssVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.n2) ssVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + ssVar.H, 3).commit();
            ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ssVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.n2) ssVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                ssVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f20044id), userFull);
            }
            ssVar.finishFragment();
            rs rsVar = ssVar.O;
            if (rsVar != null) {
                rsVar.c();
            }
        }
    }
}
