package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class mc implements Utilities.Callback {
    public final int f29024a = 0;
    public final long f29025b;
    public final int f29026c;
    public final Object d;

    public mc(int i10, ic icVar, long j10) {
        this.f29026c = i10;
        this.d = icVar;
        this.f29025b = j10;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f29024a;
        int i11 = this.f29026c;
        long j10 = this.f29025b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                ic icVar = (ic) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i11 == 1) {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
                    } else if (i11 == 2) {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title));
                    } else {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
                    }
                } else {
                    string = LocaleController.getString(R.string.AddEmojiNotFound);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(9, icVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            default:
                ((yu0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
        }
    }

    public mc(yu0 yu0Var, long j10, int i10) {
        this.d = yu0Var;
        this.f29025b = j10;
        this.f29026c = i10;
    }
}
