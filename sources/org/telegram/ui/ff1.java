package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ff1 extends r71 {
    public boolean f35523d2;
    public final gf1 f35524e2;

    public ff1(gf1 gf1Var, gf1 gf1Var2, Activity activity) {
        super(gf1Var2, activity, false, null, 3, null);
        this.f35524e2 = gf1Var;
        this.f35523d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f35523d2) {
            this.f35523d2 = false;
            this.f35524e2.f36183f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        gf1 gf1Var = this.f35524e2;
        i10 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = gf1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.m2) gf1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f18943id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        gf1Var.b0(l4, z10);
    }
}
