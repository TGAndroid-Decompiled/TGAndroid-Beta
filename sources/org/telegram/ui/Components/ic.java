package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ic implements Utilities.Callback {

    public final int f29329a = 0;

    public final long f29330b;

    public final int f29331c;
    public final Object d;

    public ic(int i10, ec ecVar, long j10) {
        this.f29331c = i10;
        this.d = ecVar;
        this.f29330b = j10;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f29329a;
        int i11 = this.f29331c;
        long j10 = this.f29330b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ec ecVar = (ec) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet == null || (stickerSet = tL_messages_stickerSet.set) == null) {
                    string = LocaleController.getString(R.string.AddEmojiNotFound);
                } else if (i11 == 1) {
                    string = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
                } else {
                    string = i11 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(5, ecVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                break;
            default:
                ((hu0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                break;
        }
    }

    public ic(hu0 hu0Var, long j10, int i10) {
        this.d = hu0Var;
        this.f29330b = j10;
        this.f29331c = i10;
    }
}
