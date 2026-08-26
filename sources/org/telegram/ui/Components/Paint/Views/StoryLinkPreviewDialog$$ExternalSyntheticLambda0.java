package org.telegram.ui.Components.Paint.Views;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public final class StoryLinkPreviewDialog$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final StoryLinkPreviewDialog f$0;

    public StoryLinkPreviewDialog$$ExternalSyntheticLambda0(StoryLinkPreviewDialog storyLinkPreviewDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = storyLinkPreviewDialog;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismiss$6();
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this.f$0, 0));
                break;
            case 2:
                this.f$0.dismiss();
                break;
            default:
                StoryLinkPreviewDialog storyLinkPreviewDialog = this.f$0;
                VoIPFragment$$ExternalSyntheticLambda7 voIPFragment$$ExternalSyntheticLambda7 = storyLinkPreviewDialog.whenDone;
                if (voIPFragment$$ExternalSyntheticLambda7 != null) {
                    voIPFragment$$ExternalSyntheticLambda7.run(null);
                    storyLinkPreviewDialog.whenDone = null;
                }
                storyLinkPreviewDialog.dismiss();
                break;
        }
    }
}
