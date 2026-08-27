package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class fs extends org.telegram.ui.ActionBar.j {

    public final js f38199a;

    public fs(js jsVar) {
        this.f38199a = jsVar;
    }

    @Override
    public final void b(int i10) {
        js jsVar = this.f38199a;
        if (i10 == -1) {
            jsVar.finishFragment();
            return;
        }
        if (i10 != 1 || jsVar.f39484b.getText().length() == 0) {
            return;
        }
        TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
        TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.D);
        user.first_name = jsVar.f39484b.getText().toString();
        user.last_name = jsVar.f39485c.getText().toString();
        user.contact = true;
        TLRPC.TL_textWithEntities textWithEntities = jsVar.d.getTextWithEntities();
        jsVar.getMessagesController().putUser(user, false);
        jsVar.getContactsController().addContact(user, textWithEntities, jsVar.G && jsVar.T);
        MessagesController.getNotificationsSettings(((org.telegram.ui.ActionBar.n2) jsVar).currentAccount).edit().putInt("dialog_bar_vis3" + jsVar.D, 3).commit();
        jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
        jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(jsVar.D));
        if (userFull != null) {
            if (textWithEntities == null || textWithEntities.text.length() <= 0) {
                userFull.flags2 &= -4194305;
                userFull.note = null;
            } else {
                userFull.flags2 |= 4194304;
                userFull.note = textWithEntities;
            }
            MessagesStorage.getInstance(((org.telegram.ui.ActionBar.n2) jsVar).currentAccount).updateUserInfo(userFull, true);
            jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f22528id), userFull);
        }
        jsVar.finishFragment();
        is isVar = jsVar.K;
        if (isVar != null) {
            isVar.c();
        }
    }
}
