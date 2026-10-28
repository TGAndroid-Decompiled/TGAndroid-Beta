package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class hs extends org.telegram.ui.ActionBar.j {
    public final ls f39956a;

    public hs(ls lsVar) {
        this.f39956a = lsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        ls lsVar = this.f39956a;
        if (i10 == -1) {
            lsVar.finishFragment();
        } else if (i10 == 1 && lsVar.f41248b.getText().length() != 0) {
            TLRPC.User user = lsVar.getMessagesController().getUser(Long.valueOf(lsVar.H));
            TLRPC.UserFull userFull = lsVar.getMessagesController().getUserFull(lsVar.H);
            user.first_name = lsVar.f41248b.getText().toString();
            user.last_name = lsVar.f41249c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = lsVar.d.getTextWithEntities();
            lsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = lsVar.getContactsController();
            if (lsVar.K && lsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.r2) lsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + lsVar.H, 3).commit();
            lsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            lsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(lsVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.r2) lsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                lsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f22178id), userFull);
            }
            lsVar.finishFragment();
            ks ksVar = lsVar.O;
            if (ksVar != null) {
                ksVar.a();
            }
        }
    }
}
