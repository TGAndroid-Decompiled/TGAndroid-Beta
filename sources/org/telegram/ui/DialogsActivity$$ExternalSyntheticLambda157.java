package org.telegram.ui;

import android.graphics.Point;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public final class DialogsActivity$$ExternalSyntheticLambda157 implements Runnable {
    public final int $r8$classId = 0;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final TLObject f$1;
    public final long f$2;
    public final boolean f$3;
    public final TLObject f$4;
    public final boolean f$5;

    public DialogsActivity$$ExternalSyntheticLambda157(DialogsActivity dialogsActivity, TLRPC.Chat chat, long j, boolean z, TLRPC.User user, boolean z2) {
        this.f$0 = dialogsActivity;
        this.f$1 = chat;
        this.f$2 = j;
        this.f$3 = z;
        this.f$4 = user;
        this.f$5 = z2;
    }

    @Override
    public final void run() {
        TLObject tLObject = this.f$1;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f$0;
        TLObject tLObject2 = this.f$4;
        switch (this.$r8$classId) {
            case 0:
                ((DialogsActivity) notificationCenterDelegate).lambda$didReceivedNotification$121((TLRPC.Chat) tLObject, this.f$2, this.f$3, (TLRPC.User) tLObject2, this.f$5);
                break;
            default:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) tLObject2;
                StoryRecorder storyRecorder = (StoryRecorder) notificationCenterDelegate;
                boolean z = this.f$3;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) tLObject;
                long j = this.f$2;
                if (!z) {
                    storyRecorder.getClass();
                    LivePlayer.recording = new LivePlayer(storyRecorder.activity, storyRecorder.currentAccount, storyItem, j, storyItem.id, z, inputGroupCall, true, this.f$5);
                }
                StoryRecorder.SourceView sourceView = storyRecorder.fromSourceView;
                if (sourceView != null) {
                    sourceView.show(false);
                }
                storyRecorder.fromSourceView = null;
                storyRecorder.openType = 0;
                RectF rectF = storyRecorder.fromRect;
                Point point = AndroidUtilities.displaySize;
                rectF.set(0.0f, 0.0f, point.x, point.y);
                storyRecorder.fromRounding = AndroidUtilities.dp(8.0f);
                storyRecorder.close(true);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                storyItem.dialogId = j;
                storyItem.justUploaded = true;
                safeLastFragment.getOrCreateStoryViewer().open(UserConfig.selectedAccount, storyRecorder.activity, storyItem, (StoriesListPlaceProvider) null);
                NotificationCenter.getInstance(storyRecorder.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(inputGroupCall.id));
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda157(StoryRecorder storyRecorder, boolean z, TL_stories.StoryItem storyItem, long j, TLRPC.InputGroupCall inputGroupCall, boolean z2) {
        this.f$0 = storyRecorder;
        this.f$3 = z;
        this.f$1 = storyItem;
        this.f$2 = j;
        this.f$4 = inputGroupCall;
        this.f$5 = z2;
    }
}
