package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;

public final class StarGiftSheet$$ExternalSyntheticLambda175 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final ChatActivity f$1;
    public final long f$2;

    public StarGiftSheet$$ExternalSyntheticLambda175(StarGiftSheet starGiftSheet, ChatActivity chatActivity, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = chatActivity;
        this.f$2 = j;
    }

    @Override
    public final void run() {
        long j = this.f$2;
        ChatActivity chatActivity = this.f$1;
        StarGiftSheet starGiftSheet = this.f$0;
        int i = this.$r8$classId;
        starGiftSheet.getClass();
        switch (i) {
            case 0:
                Bulletin bulletinCreateSimpleBulletin = BulletinFactory.of(chatActivity).createSimpleBulletin(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, starGiftSheet.getGiftName(), DialogObject.getShortName(j))), R.raw.forward);
                bulletinCreateSimpleBulletin.ignoreDetach = true;
                bulletinCreateSimpleBulletin.show();
                break;
            default:
                Bulletin bulletinCreateSimpleBulletin2 = BulletinFactory.of(chatActivity).createSimpleBulletin(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, starGiftSheet.getGiftName(), DialogObject.getShortName(j))), R.raw.forward);
                bulletinCreateSimpleBulletin2.ignoreDetach = true;
                bulletinCreateSimpleBulletin2.show();
                break;
        }
    }
}
