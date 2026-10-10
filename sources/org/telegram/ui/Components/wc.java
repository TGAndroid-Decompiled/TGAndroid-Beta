package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wc implements Utilities.Callback {
    public final int f32640a = 0;
    public final long f32641b;
    public final int f32642c;
    public final Object d;

    public wc(int i10, tc tcVar, long j3) {
        this.f32642c = i10;
        this.d = tcVar;
        this.f32641b = j3;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f32640a;
        int i11 = this.f32642c;
        long j3 = this.f32641b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                tc tcVar = (tc) obj2;
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
                AndroidUtilities.runOnUIThread(new ea(1, tcVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                return;
            default:
                ((cw0) obj2).getStoriesController().b(i11, j3, (ArrayList) obj);
                return;
        }
    }

    public wc(cw0 cw0Var, long j3, int i10) {
        this.d = cw0Var;
        this.f32641b = j3;
        this.f32642c = i10;
    }
}
