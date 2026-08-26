package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class ChannelColorActivity$$ExternalSyntheticLambda12 implements Utilities.Callback3 {
    public final ChannelColorActivity f$0;
    public final int f$1;
    public final View f$2;

    public ChannelColorActivity$$ExternalSyntheticLambda12(ChannelColorActivity channelColorActivity, int i, View view) {
        this.f$0 = channelColorActivity;
        this.f$1 = i;
        this.f$2 = view;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        Long l = (Long) obj;
        Integer num = (Integer) obj2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj3;
        ChannelColorActivity channelColorActivity = this.f$0;
        int i = channelColorActivity.replyEmojiRow;
        int i2 = this.f$1;
        if (i2 == i) {
            channelColorActivity.selectedReplyEmoji = l.longValue();
            channelColorActivity.updateMessagesPreview(true);
        } else if (i2 == channelColorActivity.profileEmojiRow) {
            channelColorActivity.selectedProfileEmoji = l.longValue();
            channelColorActivity.updateProfilePreview();
        } else if (i2 == channelColorActivity.statusEmojiRow) {
            if (l.longValue() == 0) {
                channelColorActivity.selectedStatusEmoji = null;
            } else if (tL_starGiftUnique != null) {
                TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift = MessagesController.emojiStatusCollectibleFromGift(tL_starGiftUnique);
                if (num != null) {
                    tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift.flags |= 1;
                    tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift.until = num.intValue();
                }
                channelColorActivity.selectedStatusEmoji = tL_emojiStatusCollectibleEmojiStatusCollectibleFromGift;
                channelColorActivity.selectedProfileColor = -1;
                channelColorActivity.selectedProfileEmoji = 0L;
            } else {
                TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
                tL_emojiStatus.document_id = l.longValue();
                if (num != null) {
                    tL_emojiStatus.flags |= 1;
                    tL_emojiStatus.until = num.intValue();
                }
                channelColorActivity.selectedStatusEmoji = tL_emojiStatus;
            }
            channelColorActivity.updateProfilePreview();
        }
        channelColorActivity.updateButton(true);
        ((ChannelColorActivity.EmojiCell) this.f$2).setEmoji(l.longValue(), tL_starGiftUnique != null, true);
        channelColorActivity.updateColors(true);
    }
}
