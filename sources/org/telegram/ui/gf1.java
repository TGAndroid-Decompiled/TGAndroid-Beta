package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class gf1 extends r71 {
    public boolean f36388d2;
    public final hf1 f36389e2;

    public gf1(hf1 hf1Var, hf1 hf1Var2, Activity activity) {
        super(hf1Var2, activity, false, null, 3, null);
        this.f36389e2 = hf1Var;
        this.f36388d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f36388d2) {
            this.f36388d2 = false;
            this.f36389e2.f36783f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        hf1 hf1Var = this.f36389e2;
        i10 = ((org.telegram.ui.ActionBar.m2) hf1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = hf1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.m2) hf1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f19243id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        hf1Var.b0(l4, z10);
    }
}
