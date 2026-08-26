package org.telegram.ui.Stories.recorder;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.EditTextCell;

public final class StoryLinkSheet$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final StoryLinkSheet f$0;

    public StoryLinkSheet$$ExternalSyntheticLambda1(StoryLinkSheet storyLinkSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = storyLinkSheet;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$7$1$2();
                break;
            case 1:
                this.f$0.processDone$5();
                break;
            default:
                StoryLinkSheet storyLinkSheet = this.f$0;
                if (storyLinkSheet.isShowing()) {
                    EditTextCell editTextCell = storyLinkSheet.urlEditText;
                    editTextCell.editText.requestFocus();
                    AndroidUtilities.showKeyboard(editTextCell.editText);
                    break;
                }
                break;
        }
    }
}
