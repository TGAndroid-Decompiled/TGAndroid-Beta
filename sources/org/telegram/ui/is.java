package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class is extends org.telegram.ui.ActionBar.j {
    public final ms f34575a;

    public is(ms msVar) {
        this.f34575a = msVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        ms msVar = this.f34575a;
        if (i10 == -1) {
            msVar.finishFragment();
        } else if (i10 == 1 && msVar.f35654b.getText().length() != 0) {
            TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
            TLRPC.UserFull userFull = msVar.getMessagesController().getUserFull(msVar.H);
            user.first_name = msVar.f35654b.getText().toString();
            user.last_name = msVar.f35655c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = msVar.d.getTextWithEntities();
            msVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = msVar.getContactsController();
            if (msVar.K && msVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.m2) msVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + msVar.H, 3).commit();
            msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(msVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.m2) msVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f18484id), userFull);
            }
            msVar.finishFragment();
            ls lsVar = msVar.O;
            if (lsVar != null) {
                lsVar.b();
            }
        }
    }
}
