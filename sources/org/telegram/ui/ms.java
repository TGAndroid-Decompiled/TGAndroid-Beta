package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ms extends org.telegram.ui.ActionBar.j {
    public final qs f38750a;

    public ms(qs qsVar) {
        this.f38750a = qsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        qs qsVar = this.f38750a;
        if (i10 == -1) {
            qsVar.finishFragment();
        } else if (i10 == 1 && qsVar.f39803b.getText().length() != 0) {
            TLRPC.User user = qsVar.getMessagesController().getUser(Long.valueOf(qsVar.H));
            TLRPC.UserFull userFull = qsVar.getMessagesController().getUserFull(qsVar.H);
            user.first_name = qsVar.f39803b.getText().toString();
            user.last_name = qsVar.f39804c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = qsVar.d.getTextWithEntities();
            qsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = qsVar.getContactsController();
            if (qsVar.K && qsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.n2) qsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + qsVar.H, 3).commit();
            qsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            qsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(qsVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.n2) qsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                qsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f20185id), userFull);
            }
            qsVar.finishFragment();
            ps psVar = qsVar.O;
            if (psVar != null) {
                psVar.a();
            }
        }
    }
}
