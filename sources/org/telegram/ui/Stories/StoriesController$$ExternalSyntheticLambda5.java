package org.telegram.ui.Stories;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.TwoStepVerificationActivity;

public final class StoriesController$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final boolean f$1;
    public final Object f$2;
    public final boolean f$3;

    public StoriesController$$ExternalSyntheticLambda5(StoriesController storiesController, boolean z, TL_stories.TL_stories_getAllStories tL_stories_getAllStories, boolean z2) {
        this.f$0 = storiesController;
        this.f$1 = z;
        this.f$2 = tL_stories_getAllStories;
        this.f$3 = z2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.getClass();
                AndroidUtilities.runOnUIThread(new StoriesStorage$$ExternalSyntheticLambda10(storiesController, this.f$1, (TL_stories.TL_stories_getAllStories) this.f$2, tLObject, this.f$3));
                break;
            default:
                ((TwoStepVerificationActivity) this.f$0).lambda$loadPasswordInfo$19(this.f$1, this.f$3, (Runnable) this.f$2, tLObject, tL_error);
                break;
        }
    }

    public StoriesController$$ExternalSyntheticLambda5(TwoStepVerificationActivity twoStepVerificationActivity, boolean z, boolean z2, Runnable runnable) {
        this.f$0 = twoStepVerificationActivity;
        this.f$1 = z;
        this.f$3 = z2;
        this.f$2 = runnable;
    }
}
