package org.telegram.ui.Stars;

import android.app.Activity;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.TwoStepVerificationActivity;

public final class BotStarsActivity$$ExternalSyntheticLambda24 implements Runnable {
    public final int $r8$classId = 1;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final boolean f$4;
    public final long f$5;
    public final TLObject f$6;

    public BotStarsActivity$$ExternalSyntheticLambda24(TopicsTabsView topicsTabsView, boolean z, ActionBarMenuSubItem actionBarMenuSubItem, ItemOptions itemOptions, long j, TLRPC.User user, TLRPC.Chat chat) {
        this.f$0 = topicsTabsView;
        this.f$4 = z;
        this.f$1 = actionBarMenuSubItem;
        this.f$2 = itemOptions;
        this.f$5 = j;
        this.f$3 = user;
        this.f$6 = chat;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((BotStarsActivity) this.f$0).lambda$initWithdraw$23((TLRPC.TL_error) this.f$1, (TwoStepVerificationActivity) this.f$2, (Activity) this.f$3, this.f$4, this.f$5, this.f$6);
                break;
            default:
                ((TopicsTabsView) this.f$0).lambda$onTabLongClick$9(this.f$4, (ActionBarMenuSubItem) this.f$1, (ItemOptions) this.f$2, this.f$5, (TLRPC.User) this.f$3, (TLRPC.Chat) this.f$6);
                break;
        }
    }

    public BotStarsActivity$$ExternalSyntheticLambda24(BotStarsActivity botStarsActivity, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z, long j, TLObject tLObject) {
        this.f$0 = botStarsActivity;
        this.f$1 = tL_error;
        this.f$2 = twoStepVerificationActivity;
        this.f$3 = activity;
        this.f$4 = z;
        this.f$5 = j;
        this.f$6 = tLObject;
    }
}
