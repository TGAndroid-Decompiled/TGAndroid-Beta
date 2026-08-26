package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Bulletin;

public final class StarGiftSheet$$ExternalSyntheticLambda19 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final String f$1;

    public StarGiftSheet$$ExternalSyntheticLambda19(StarGiftSheet starGiftSheet, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$set$80(this.f$1);
                break;
            case 1:
                this.f$0.lambda$releasedByText$49(this.f$1);
                break;
            case 2:
                this.f$0.lambda$doUpgrade$130(this.f$1);
                break;
            case 3:
                this.f$0.lambda$set$81(this.f$1);
                break;
            case 4:
                this.f$0.lambda$set$46(this.f$1);
                break;
            case 5:
                this.f$0.lambda$set$47(this.f$1);
                break;
            case 6:
                this.f$0.lambda$set$94(this.f$1);
                break;
            case 7:
                this.f$0.lambda$set$95(this.f$1);
                break;
            default:
                StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.addToClipboard(this.f$1);
                Bulletin bulletinCreateCopyLinkBulletin = starGiftSheet.getBulletinFactory().createCopyLinkBulletin(false);
                bulletinCreateCopyLinkBulletin.ignoreDetach = true;
                bulletinCreateCopyLinkBulletin.show();
                break;
        }
    }
}
