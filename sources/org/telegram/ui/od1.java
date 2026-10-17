package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class od1 extends z51 {
    public boolean f39752d2;
    public final pd1 f39753e2;

    public od1(pd1 pd1Var, pd1 pd1Var2, Activity activity) {
        super(pd1Var2, activity, false, null, 3, null);
        this.f39753e2 = pd1Var;
        this.f39752d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f39752d2) {
            this.f39752d2 = false;
            this.f39753e2.f40083f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        pd1 pd1Var = this.f39753e2;
        i10 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = pd1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.n2) pd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f20299id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        pd1Var.b0(l4, z10);
    }
}
