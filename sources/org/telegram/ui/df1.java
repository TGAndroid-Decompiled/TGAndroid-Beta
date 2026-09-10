package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class df1 extends l71 {
    public boolean f31896d2;
    public final ef1 f31897e2;

    public df1(ef1 ef1Var, ef1 ef1Var2, Activity activity) {
        super(ef1Var2, activity, false, null, 3, null);
        this.f31897e2 = ef1Var;
        this.f31896d2 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f31896d2) {
            this.f31896d2 = false;
            this.f31897e2.f32179f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l4, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j3;
        ef1 ef1Var = this.f31897e2;
        i10 = ((org.telegram.ui.ActionBar.p2) ef1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = ef1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.p2) ef1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j3 = 0;
            } else {
                j3 = stickerSetByEmojiOrName.set.f17222id;
            }
            if (j3 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        ef1Var.b0(l4, z10);
    }
}
