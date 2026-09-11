package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tc implements Utilities.Callback {
    public final int f30587a = 0;
    public final long f30588b;
    public final int f30589c;
    public final Object d;

    public tc(int i10, qc qcVar, long j3) {
        this.f30589c = i10;
        this.d = qcVar;
        this.f30588b = j3;
    }

    @Override
    public final void run(Object obj) {
        Object string;
        TLRPC.StickerSet stickerSet;
        int i10 = this.f30587a;
        int i11 = this.f30589c;
        long j3 = this.f30588b;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                qc qcVar = (qc) obj2;
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.fh(29, qcVar, string), Math.max(1L, 750 - (System.currentTimeMillis() - j3)));
                return;
            default:
                ((xu0) obj2).getStoriesController().b(i11, j3, (ArrayList) obj);
                return;
        }
    }

    public tc(xu0 xu0Var, long j3, int i10) {
        this.d = xu0Var;
        this.f30588b = j3;
        this.f30589c = i10;
    }
}
