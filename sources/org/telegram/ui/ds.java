package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ds extends org.telegram.ui.ActionBar.k {
    public final hs f37625a;

    public ds(hs hsVar) {
        this.f37625a = hsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        hs hsVar = this.f37625a;
        if (i10 == -1) {
            hsVar.finishFragment();
        } else if (i10 == 1 && hsVar.f39004b.getText().length() != 0) {
            TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
            TLRPC.UserFull userFull = hsVar.getMessagesController().getUserFull(hsVar.D);
            user.first_name = hsVar.f39004b.getText().toString();
            user.last_name = hsVar.f39005c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = hsVar.d.getTextWithEntities();
            hsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = hsVar.getContactsController();
            if (hsVar.G && hsVar.T) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.o2) hsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + hsVar.D, 3).commit();
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(hsVar.D));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.o2) hsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f22540id), userFull);
            }
            hsVar.finishFragment();
            gs gsVar = hsVar.K;
            if (gsVar != null) {
                gsVar.b();
            }
        }
    }
}
