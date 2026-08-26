package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.CreateRtmpStreamBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class DialogsActivity$$ExternalSyntheticLambda51 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public DialogsActivity$$ExternalSyntheticLambda51(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.finishPreviewFragment();
                AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda121(dialogsActivity, (MessagesController.DialogFilter) this.f$1, (TLRPC.Dialog) this.f$2, this.f$3, 28), 100L);
                break;
            case 1:
                ((CreateRtmpStreamBottomSheet) this.f$0).lambda$new$11((Context) this.f$1, (ButtonWithCounterView) this.f$2, this.f$3);
                break;
            default:
                BaseFragment baseFragment = (BaseFragment) this.f$2;
                ((BoostViaGiftsBottomSheet) this.f$0).lambda$new$20(this.f$3, (TL_stories.PrepaidGiveaway) this.f$1, baseFragment);
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda51(BoostViaGiftsBottomSheet boostViaGiftsBottomSheet, TL_stories.PrepaidGiveaway prepaidGiveaway, long j, BaseFragment baseFragment) {
        this.$r8$classId = 2;
        this.f$0 = boostViaGiftsBottomSheet;
        this.f$1 = prepaidGiveaway;
        this.f$3 = j;
        this.f$2 = baseFragment;
    }
}
