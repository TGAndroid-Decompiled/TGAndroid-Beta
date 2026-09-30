package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class uc implements Utilities.Callback {
    public final int f28825a = 0;
    public final long f28826b;
    public final int f28827c;
    public final Object d;

    public uc(int i10, rc rcVar, long j3) {
        this.f28827c = i10;
        this.d = rcVar;
        this.f28826b = j3;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f28825a;
        int i11 = this.f28827c;
        long j3 = this.f28826b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                rc rcVar = (rc) obj2;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(28, rcVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                return;
            default:
                ((mv0) obj2).getStoriesController().b(i11, j3, (ArrayList) obj);
                return;
        }
    }

    public uc(mv0 mv0Var, long j3, int i10) {
        this.d = mv0Var;
        this.f28826b = j3;
        this.f28827c = i10;
    }
}
