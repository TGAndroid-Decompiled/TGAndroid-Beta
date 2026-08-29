package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class pc implements Utilities.Callback {
    public final int f31641a = 0;
    public final long f31642b;
    public final int f31643c;
    public final Object d;

    public pc(int i10, mc mcVar, long j10) {
        this.f31643c = i10;
        this.d = mcVar;
        this.f31642b = j10;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f31641a;
        int i11 = this.f31643c;
        long j10 = this.f31642b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                mc mcVar = (mc) obj2;
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
                AndroidUtilities.runOnUIThread(new z2(2, mcVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            default:
                ((qu0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
        }
    }

    public pc(qu0 qu0Var, long j10, int i10) {
        this.d = qu0Var;
        this.f31642b = j10;
        this.f31643c = i10;
    }
}
