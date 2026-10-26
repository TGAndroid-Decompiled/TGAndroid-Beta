package org.telegram.ui;

import org.telegram.messenger.ContactsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class fs extends org.telegram.ui.ActionBar.j {
    public final js f39441a;

    public fs(js jsVar) {
        this.f39441a = jsVar;
    }

    @Override
    public final void b(int i10) {
        boolean z10;
        int i11;
        int i12;
        js jsVar = this.f39441a;
        if (i10 == -1) {
            jsVar.finishFragment();
        } else if (i10 == 1 && jsVar.f40733b.getText().length() != 0) {
            TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.H));
            TLRPC.UserFull userFull = jsVar.getMessagesController().getUserFull(jsVar.H);
            user.first_name = jsVar.f40733b.getText().toString();
            user.last_name = jsVar.f40734c.getText().toString();
            user.contact = true;
            TLRPC.TL_textWithEntities textWithEntities = jsVar.d.getTextWithEntities();
            jsVar.getMessagesController().putUser(user, false);
            ContactsController contactsController = jsVar.getContactsController();
            if (jsVar.K && jsVar.X) {
                z10 = true;
            } else {
                z10 = false;
            }
            contactsController.addContact(user, textWithEntities, z10);
            i11 = ((org.telegram.ui.ActionBar.r2) jsVar).currentAccount;
            MessagesController.getNotificationsSettings(i11).edit().putInt("dialog_bar_vis3" + jsVar.H, 3).commit();
            jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_NAME));
            jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(jsVar.H));
            if (userFull != null) {
                if (textWithEntities != null && textWithEntities.text.length() > 0) {
                    userFull.flags2 |= 4194304;
                    userFull.note = textWithEntities;
                } else {
                    userFull.flags2 &= -4194305;
                    userFull.note = null;
                }
                i12 = ((org.telegram.ui.ActionBar.r2) jsVar).currentAccount;
                MessagesStorage.getInstance(i12).updateUserInfo(userFull, true);
                jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.userInfoDidLoad, Long.valueOf(userFull.f22177id), userFull);
            }
            jsVar.finishFragment();
            is isVar = jsVar.O;
            if (isVar != null) {
                isVar.a();
            }
        }
    }
}
