package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ks extends org.telegram.ui.ActionBar.j {
    public final os f38510a;

    public ks(os osVar) {
        this.f38510a = osVar;
    }

    @Override
    public final void b(int i10) {
        boolean z4;
        int i11;
        int i12;
        os osVar = this.f38510a;
        if (i10 == -1) {
            osVar.finishFragment();
        } else if (i10 == 1 && osVar.f39826b.getText().length() != 0) {
            TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
            TLRPC.UserFull userFull = osVar.getMessagesController().getUserFull(osVar.E);
            user.first_name = osVar.f39826b.getText().toString();
            user.last_name = osVar.f39827c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = osVar.d.getTextWithEntities();
            osVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = osVar.getContactsController();
            if (osVar.H && osVar.U) {
                z4 = true;
            } else {
                z4 = false;
            }
            contactsController.addContact(user, textWithEntities, z4);
            i11 = ((org.telegram.ui.ActionBar.p2) osVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + osVar.E, 3).commit();
            osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(osVar.E));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.p2) osVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f20991id), userFull);
            }
            osVar.finishFragment();
            ns nsVar = osVar.L;
            if (nsVar != null) {
                nsVar.a();
            }
        }
    }
}
