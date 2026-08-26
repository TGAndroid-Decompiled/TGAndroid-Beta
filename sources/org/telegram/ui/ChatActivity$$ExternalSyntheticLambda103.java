package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.utils.FBool;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.TopicsTabsView;

public final class ChatActivity$$ExternalSyntheticLambda103 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final long f$1;

    public ChatActivity$$ExternalSyntheticLambda103(long j, ChatActivity chatActivity) {
        this.$r8$classId = 1;
        this.f$1 = j;
        this.f$0 = chatActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onFragmentCreate$14(this.f$1);
                break;
            case 1:
                this.f$0.presentFragment(new ProfileActivity(FBool.m(this.f$1, "user_id"), null));
                break;
            case 2:
                this.f$0.getMessagesController().loadFullChat(this.f$1, 0, true);
                break;
            case 3:
                ChatActivity chatActivity = this.f$0;
                LongSparseIntArray longSparseIntArray = chatActivity.clearingHistoryArr;
                long j = this.f$1;
                longSparseIntArray.put(j, 0);
                TopicsTabsView topicsTabsView = chatActivity.topicsTabs;
                if (topicsTabsView != null) {
                    topicsTabsView.setAllTopicsHidden(false);
                }
                if (j == chatActivity.threadMessageId) {
                    chatActivity.chatAdapter.notifyDataSetChanged(false);
                }
                break;
            case 4:
                ChatActivity chatActivity2 = this.f$0;
                chatActivity2.getClass();
                chatActivity2.presentFragment(ChatActivity.of(this.f$1));
                break;
            case 5:
                ChatActivity chatActivity3 = this.f$0;
                chatActivity3.getClass();
                chatActivity3.presentFragment(ProfileActivity.of(this.f$1));
                break;
            case 6:
                ChatActivity chatActivity4 = this.f$0;
                Bulletin bulletinCreateForwardedBulletin = BulletinFactory.createForwardedBulletin(chatActivity4.getParentActivity(), chatActivity4, null, 1, this.f$1, 1, chatActivity4.getThemedColor(Theme.key_undo_background), chatActivity4.getThemedColor(Theme.key_undo_infoColor), 5000, true, null);
                bulletinCreateForwardedBulletin.allowBlurAnimation = true;
                bulletinCreateForwardedBulletin.show(true);
                break;
            default:
                BulletinFactory.of(this.f$0).createSimpleBulletin(LocaleController.getString(R.string.StarsGiveawaySentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) this.f$1)), R.raw.stars_topup).show(true);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda103(ChatActivity chatActivity, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = j;
    }
}
