package org.telegram.ui;

import android.app.Activity;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.BulletinFactory;

public final class ReportBottomSheet$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final Activity f$1;
    public final Theme.ResourcesProvider f$2;
    public final MessageObject f$3;

    public ReportBottomSheet$$ExternalSyntheticLambda16(ChatActivity chatActivity, Activity activity, Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = activity;
        this.f$2 = resourcesProvider;
        this.f$3 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = this.f$0;
                BulletinFactory.of(chatActivity).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ActivityCompat$$ExternalSyntheticLambda0(this.f$1, 2), this.f$2)).show();
                MessageObject messageObject = this.f$3;
                chatActivity.removeFromSponsored(messageObject);
                chatActivity.removeMessageWithThanos(messageObject);
                break;
            case 1:
                ChatActivity chatActivity2 = this.f$0;
                BulletinFactory.of(chatActivity2).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ActivityCompat$$ExternalSyntheticLambda0(this.f$1, 1), this.f$2)).show();
                MessageObject messageObject2 = this.f$3;
                chatActivity2.removeFromSponsored(messageObject2);
                chatActivity2.removeMessageWithThanos(messageObject2);
                break;
            default:
                ChatActivity chatActivity3 = this.f$0;
                BulletinFactory.of(chatActivity3).createAdReportedBulletin(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.AdReported), -1, 2, new ActivityCompat$$ExternalSyntheticLambda0(this.f$1, 5), this.f$2)).show();
                MessageObject messageObject3 = this.f$3;
                chatActivity3.removeFromSponsored(messageObject3);
                chatActivity3.removeMessageWithThanos(messageObject3);
                break;
        }
    }
}
