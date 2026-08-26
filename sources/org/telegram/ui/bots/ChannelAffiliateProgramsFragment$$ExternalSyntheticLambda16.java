package org.telegram.ui.bots;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda3;

public final class ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;

    public ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((long[]) this.f$0)[0] = this.f$1;
                ((WearAuthSheet$$ExternalSyntheticLambda3) this.f$2).run();
                break;
            case 1:
                StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation = (StoriesUtilities.UserStoriesLoadOperation) this.f$0;
                userStoriesLoadOperation.getClass();
                ((View) this.f$2).invalidate();
                MessagesController.getInstance(userStoriesLoadOperation.currentAccount).getStoriesController().setLoading(this.f$1, false);
                break;
            default:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                page.getClass();
                page.selectChat(this.f$1, ((TLRPC.ChatFull) this.f$2).participants);
                break;
        }
    }

    public ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16(StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation, View view, long j) {
        this.$r8$classId = 1;
        this.f$0 = userStoriesLoadOperation;
        this.f$2 = view;
        this.f$1 = j;
    }
}
