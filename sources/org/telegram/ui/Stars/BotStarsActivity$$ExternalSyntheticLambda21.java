package org.telegram.ui.Stars;

import android.app.Activity;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.TwoStepVerificationActivity;

public final class BotStarsActivity$$ExternalSyntheticLambda21 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final boolean f$3;
    public final long f$4;

    public BotStarsActivity$$ExternalSyntheticLambda21(BotStarsActivity botStarsActivity, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j) {
        this.f$0 = botStarsActivity;
        this.f$1 = twoStepVerificationActivity;
        this.f$2 = activity;
        this.f$3 = z;
        this.f$4 = j;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                BotStarsActivity botStarsActivity = (BotStarsActivity) this.f$0;
                botStarsActivity.getClass();
                AndroidUtilities.runOnUIThread(new BotStarsActivity$$ExternalSyntheticLambda24(botStarsActivity, tL_error, (TwoStepVerificationActivity) this.f$1, (Activity) this.f$2, this.f$3, this.f$4, tLObject));
                break;
            default:
                StoriesController storiesController = (StoriesController) this.f$0;
                storiesController.getClass();
                AndroidUtilities.runOnUIThread(new BotStarsActivity$$ExternalSyntheticLambda27(storiesController, tL_error, this.f$3, this.f$4, (Consumer) this.f$1, (Theme.ResourcesProvider) this.f$2));
                break;
        }
    }

    public BotStarsActivity$$ExternalSyntheticLambda21(StoriesController storiesController, boolean z, long j, Consumer consumer, Theme.ResourcesProvider resourcesProvider) {
        this.f$0 = storiesController;
        this.f$3 = z;
        this.f$4 = j;
        this.f$1 = consumer;
        this.f$2 = resourcesProvider;
    }
}
