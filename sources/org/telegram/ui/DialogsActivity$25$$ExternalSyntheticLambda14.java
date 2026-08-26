package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.DialogStoriesCell;

public final class DialogsActivity$25$$ExternalSyntheticLambda14 {
    public final int $r8$classId;
    public final DialogsActivity.AnonymousClass25 f$0;
    public final View f$1;

    public DialogsActivity$25$$ExternalSyntheticLambda14(DialogsActivity.AnonymousClass25 anonymousClass25, View view, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass25;
        this.f$1 = view;
    }

    public final void onButtonClicked(boolean z) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.AnonymousClass25 anonymousClass25 = this.f$0;
                View view = this.f$1;
                if (view instanceof DialogStoriesCell.StoryCell) {
                    DialogsActivity.this.dialogStoriesCell.openStoryForCell((DialogStoriesCell.StoryCell) view, false);
                    if (z) {
                        AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(12), 500L);
                    }
                }
                break;
            default:
                DialogsActivity.AnonymousClass25 anonymousClass26 = this.f$0;
                View view2 = this.f$1;
                if (view2 instanceof DialogStoriesCell.StoryCell) {
                    DialogsActivity.this.dialogStoriesCell.openStoryForCell((DialogStoriesCell.StoryCell) view2, false);
                    if (z) {
                        AndroidUtilities.runOnUIThread(new QrActivity$5$$ExternalSyntheticLambda1(12), 500L);
                    }
                }
                break;
        }
    }
}
