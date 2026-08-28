package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class kc implements Utilities.Callback {
    public final int f30050a = 0;
    public final long f30051b;
    public final int f30052c;
    public final Object d;

    public kc(int i9, gc gcVar, long j10) {
        this.f30052c = i9;
        this.d = gcVar;
        this.f30051b = j10;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i9 = this.f30050a;
        int i10 = this.f30052c;
        long j10 = this.f30051b;
        Object obj2 = this.d;
        switch (i9) {
            case 0:
                gc gcVar = (gc) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                    if (i10 == 1) {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
                    } else if (i10 == 2) {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title));
                    } else {
                        string = AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
                    }
                } else {
                    string = LocaleController.getString(R.string.AddEmojiNotFound);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(5, gcVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            default:
                ((eu0) obj2).getStoriesController().b(i10, j10, (ArrayList) obj);
                return;
        }
    }

    public kc(eu0 eu0Var, long j10, int i9) {
        this.d = eu0Var;
        this.f30051b = j10;
        this.f30052c = i9;
    }
}
