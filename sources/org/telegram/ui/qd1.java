package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class qd1 extends b61 {
    public boolean Z1;
    public final rd1 a2;

    public qd1(rd1 rd1Var, rd1 rd1Var2, Activity activity) {
        super(rd1Var2, activity, false, null, 3, null);
        this.a2 = rd1Var;
        this.Z1 = true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.Z1) {
            this.Z1 = false;
            this.a2.f42373f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i9;
        int i10;
        long j10;
        rd1 rd1Var = this.a2;
        i9 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
        boolean z10 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i9).defaultTopicIcons)) {
            MediaDataController mediaDataController = rd1Var.getMediaDataController();
            i10 = ((org.telegram.ui.ActionBar.o2) rd1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i10).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f22407id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z10 = true;
            }
        }
        rd1Var.a0(l10, z10);
    }
}
