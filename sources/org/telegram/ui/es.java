package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class es extends org.telegram.ui.ActionBar.j {
    public final is f38019a;

    public es(is isVar) {
        this.f38019a = isVar;
    }

    @Override
    public final void b(int i9) {
        boolean z10;
        int i10;
        int i11;
        is isVar = this.f38019a;
        if (i9 == -1) {
            isVar.finishFragment();
        } else if (i9 == 1 && isVar.f39270b.getText().length() != 0) {
            TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
            TLRPC.UserFull userFull = isVar.getMessagesController().getUserFull(isVar.D);
            user.first_name = isVar.f39270b.getText().toString();
            user.last_name = isVar.f39271c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = isVar.d.getTextWithEntities();
            isVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = isVar.getContactsController();
            if (isVar.G && isVar.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i10 = ((org.telegram.ui.ActionBar.o2) isVar).currentAccount;
            MessagesController.getNotificationsSettings(i10).edit().putInt("dialog_bar_vis3" + isVar.D, 3).commit();
            isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(isVar.D));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i11 = ((org.telegram.ui.ActionBar.o2) isVar).currentAccount;
                MessagesStorage.getInstance(i11).updateUserInfo(userFull, true);
                isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f22528id), userFull);
            }
            isVar.finishFragment();
            hs hsVar = isVar.K;
            if (hsVar != null) {
                hsVar.c();
            }
        }
    }
}
