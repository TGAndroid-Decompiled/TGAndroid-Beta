package org.telegram.ui.Stories;

import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Stories.recorder.HintView2;

public final class DialogStoriesCell$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final DialogStoriesCell f$0;

    public DialogStoriesCell$$ExternalSyntheticLambda10(DialogStoriesCell dialogStoriesCell, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogStoriesCell;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.checkLoadMore();
                break;
            case 1:
                this.f$0.updateItems(true, false);
                break;
            default:
                DialogStoriesCell dialogStoriesCell = this.f$0;
                HintView2 hintView2 = dialogStoriesCell.premiumHint;
                if (hintView2 != null) {
                    hintView2.hide(true);
                }
                dialogStoriesCell.fragment.presentFragment(new PremiumPreviewFragment(0, "stories"));
                break;
        }
    }
}
