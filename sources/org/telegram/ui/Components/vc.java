package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class vc implements Utilities.Callback {
    public final int f29615a = 0;
    public final long f29616b;
    public final int f29617c;
    public final Object d;

    public vc(int i10, sc scVar, long j10) {
        this.f29617c = i10;
        this.d = scVar;
        this.f29616b = j10;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f29615a;
        int i11 = this.f29617c;
        long j10 = this.f29616b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                sc scVar = (sc) obj2;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.vp(7, scVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j10)));
                return;
            default:
                ((xv0) obj2).getStoriesController().b(i11, j10, (ArrayList) obj);
                return;
        }
    }

    public vc(xv0 xv0Var, long j10, int i10) {
        this.d = xv0Var;
        this.f29616b = j10;
        this.f29617c = i10;
    }
}
