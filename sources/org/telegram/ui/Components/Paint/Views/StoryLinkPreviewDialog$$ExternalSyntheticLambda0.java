package org.telegram.ui.Components.Paint.Views;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.recorder.HintView2$$ExternalSyntheticLambda0;

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
                AndroidUtilities.runOnUIThread(new StoryLinkPreviewDialog$$ExternalSyntheticLambda0(this.f$0, 3));
                break;
            case 1:
                this.f$0.dismiss();
                break;
            case 2:
                StoryLinkPreviewDialog storyLinkPreviewDialog = this.f$0;
                HintView2$$ExternalSyntheticLambda0 hintView2$$ExternalSyntheticLambda0 = storyLinkPreviewDialog.whenDone;
                if (hintView2$$ExternalSyntheticLambda0 != null) {
                    hintView2$$ExternalSyntheticLambda0.run(null);
                    storyLinkPreviewDialog.whenDone = null;
                }
                storyLinkPreviewDialog.dismiss();
                break;
            default:
                this.f$0.lambda$dismiss$6();
                break;
        }
    }
}
