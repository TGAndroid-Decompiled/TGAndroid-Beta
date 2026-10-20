package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class md1 extends x51 {
    public boolean f39219d2;
    public final nd1 f39220e2;

    public md1(nd1 nd1Var, nd1 nd1Var2, Activity activity) {
        super(nd1Var2, activity, false, null, 3, null);
        this.f39220e2 = nd1Var;
        this.f39219d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f39219d2) {
            this.f39219d2 = false;
            this.f39220e2.f39544f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        nd1 nd1Var = this.f39220e2;
        i10 = ((org.telegram.ui.ActionBar.n2) nd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = nd1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.n2) nd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f20303id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        nd1Var.b0(l4, z10);
    }
}
