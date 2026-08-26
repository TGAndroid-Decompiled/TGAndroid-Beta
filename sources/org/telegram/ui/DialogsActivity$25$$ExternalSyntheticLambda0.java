package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.MediaActivity;

public final class DialogsActivity$25$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final DialogsActivity.AnonymousClass25 f$0;

    public DialogsActivity$25$$ExternalSyntheticLambda0(DialogsActivity.AnonymousClass25 anonymousClass25, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass25;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity.this.dialogStoriesCell.openStoryRecorder(0L);
                break;
            case 1:
                DialogsActivity.AnonymousClass25 anonymousClass25 = this.f$0;
                Bundle bundle = new Bundle();
                DialogsActivity dialogsActivity = DialogsActivity.this;
                bundle.putLong("dialog_id", UserConfig.getInstance(((BaseFragment) dialogsActivity).currentAccount).getClientUserId());
                bundle.putInt("type", 1);
                bundle.putInt("start_from", 9);
                dialogsActivity.presentFragment(new MediaActivity(bundle, null));
                break;
            case 2:
                DialogsActivity.AnonymousClass25 anonymousClass26 = this.f$0;
                Bundle bundle2 = new Bundle();
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                bundle2.putLong("dialog_id", UserConfig.getInstance(((BaseFragment) dialogsActivity2).currentAccount).getClientUserId());
                bundle2.putInt("type", 1);
                dialogsActivity2.presentFragment(new MediaActivity(bundle2, null));
                break;
            default:
                DialogsActivity dialogsActivity3 = DialogsActivity.this;
                if (dialogsActivity3.hasOnlySlefStories && dialogsActivity3.getMessagesController().getStoriesController().hasOnlySelfStories()) {
                    dialogsActivity3.dialogStoriesCell.openSelfStories();
                } else {
                    dialogsActivity3.scrollToTop(true, true);
                }
                break;
        }
    }
}
