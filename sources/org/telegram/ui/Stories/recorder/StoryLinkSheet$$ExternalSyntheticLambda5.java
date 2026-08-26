package org.telegram.ui.Stories.recorder;

import android.view.View;

public final class StoryLinkSheet$$ExternalSyntheticLambda5 implements View.OnClickListener {
    public final int $r8$classId;
    public final StoryLinkSheet f$0;

    public StoryLinkSheet$$ExternalSyntheticLambda5(StoryLinkSheet storyLinkSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = storyLinkSheet;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$5();
                break;
            default:
                this.f$0.closePreview();
                break;
        }
    }
}
