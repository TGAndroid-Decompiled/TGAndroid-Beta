package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BulletinFactory;

public final class LaunchActivity$$ExternalSyntheticLambda175 implements Runnable {
    public final int $r8$classId;
    public final ChatActivity f$0;
    public final long f$1;
    public final TLRPC.Chat f$2;

    public LaunchActivity$$ExternalSyntheticLambda175(ChatActivity chatActivity, long j, TLRPC.Chat chat, int i) {
        this.$r8$classId = i;
        this.f$0 = chatActivity;
        this.f$1 = j;
        this.f$2 = chat;
    }

    @Override
    public final void run() {
        TLRPC.Chat chat = this.f$2;
        long j = this.f$1;
        ChatActivity chatActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                BulletinFactory.of(chatActivity).createSimpleBulletin(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, chat.title)), R.raw.stars_send).show(true);
                break;
            default:
                BulletinFactory.of(chatActivity).createSimpleBulletin(LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, chat.title)), R.raw.stars_send).show(true);
                break;
        }
    }
}
