package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ls extends org.telegram.ui.ActionBar.j {
    public final ps f35914a;

    public ls(ps psVar) {
        this.f35914a = psVar;
    }

    @Override
    public final void b(int i10) {
        boolean z4;
        int i11;
        int i12;
        ps psVar = this.f35914a;
        if (i10 == -1) {
            psVar.finishFragment();
        } else if (i10 == 1 && psVar.f37220b.getText().length() != 0) {
            TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
            TLRPC.UserFull userFull = psVar.getMessagesController().getUserFull(psVar.E);
            user.first_name = psVar.f37220b.getText().toString();
            user.last_name = psVar.f37221c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = psVar.d.getTextWithEntities();
            psVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = psVar.getContactsController();
            if (psVar.H && psVar.U) {
                z4 = true;
            } else {
                z4 = false;
            }
            contactsController.addContact(user, textWithEntities, z4);
            i11 = ((org.telegram.ui.ActionBar.p2) psVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + psVar.E, 3).commit();
            psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(psVar.E));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.p2) psVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f19307id), userFull);
            }
            psVar.finishFragment();
            os osVar = psVar.L;
            if (osVar != null) {
                osVar.a();
            }
        }
    }
}
