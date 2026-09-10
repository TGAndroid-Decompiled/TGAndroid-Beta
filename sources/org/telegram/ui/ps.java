package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class ps extends org.telegram.ui.ActionBar.k {
    public final ts f35898a;

    public ps(ts tsVar) {
        this.f35898a = tsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        ts tsVar = this.f35898a;
        if (i10 == -1) {
            tsVar.finishFragment();
        } else if (i10 == 1 && tsVar.f37001b.getText().length() != 0) {
            TLRPC.User user = tsVar.getMessagesController().getUser(Long.valueOf(tsVar.H));
            TLRPC.UserFull userFull = tsVar.getMessagesController().getUserFull(tsVar.H);
            user.first_name = tsVar.f37001b.getText().toString();
            user.last_name = tsVar.f37002c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = tsVar.d.getTextWithEntities();
            tsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = tsVar.getContactsController();
            if (tsVar.K && tsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.p2) tsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + tsVar.H, 3).commit();
            tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(tsVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.p2) tsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                tsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f17343id), userFull);
            }
            tsVar.finishFragment();
            ss ssVar = tsVar.O;
            if (ssVar != null) {
                ssVar.b();
            }
        }
    }
}
