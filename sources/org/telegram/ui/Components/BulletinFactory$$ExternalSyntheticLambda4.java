package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;

public final class BulletinFactory$$ExternalSyntheticLambda4 implements Utilities.Callback {
    public final int $r8$classId = 0;
    public final int f$0;
    public final Object f$1;
    public final long f$2;

    public BulletinFactory$$ExternalSyntheticLambda4(int i, Bulletin bulletin, long j) {
        this.f$0 = i;
        this.f$1 = bulletin;
        this.f$2 = j;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i = this.f$0;
        long j = this.f$2;
        Object obj2 = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
                    string = LocaleController.getString(R.string.AddEmojiNotFound);
                } else if (i == 1) {
                    string = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
                } else {
                    string = i == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
                }
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(18, (Bulletin) obj2, string), Math.max(1L, 750 - (System.currentTimeMillis() - j)));
                break;
            default:
                ((SharedMediaLayout) obj2).lambda$openAddStoriesToAlbumSheet$72(i, j, (ArrayList) obj);
                break;
        }
    }

    public BulletinFactory$$ExternalSyntheticLambda4(SharedMediaLayout sharedMediaLayout, long j, int i) {
        this.f$1 = sharedMediaLayout;
        this.f$2 = j;
        this.f$0 = i;
    }
}
