package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class he1 extends r61 {
    public boolean a2;
    public final ie1 f37478b2;

    public he1(ie1 ie1Var, ie1 ie1Var2, Activity activity) {
        super(ie1Var2, activity, false, null, 3, null);
        this.f37478b2 = ie1Var;
        this.a2 = true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.a2) {
            this.a2 = false;
            this.f37478b2.f37824f.s(null);
        }
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i10;
        int i11;
        long j10;
        ie1 ie1Var = this.f37478b2;
        i10 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
        boolean z4 = false;
        if (!TextUtils.isEmpty(UserConfig.getInstance(i10).defaultTopicIcons)) {
            MediaDataController mediaDataController = ie1Var.getMediaDataController();
            i11 = ((org.telegram.ui.ActionBar.p2) ie1Var).currentAccount;
            TLRPC.TL_messages_stickerSet stickerSetByEmojiOrName = mediaDataController.getStickerSetByEmojiOrName(UserConfig.getInstance(i11).defaultTopicIcons);
            if (stickerSetByEmojiOrName == null) {
                j10 = 0;
            } else {
                j10 = stickerSetByEmojiOrName.set.f20870id;
            }
            if (j10 == MediaDataController.getStickerSetId(document)) {
                z4 = true;
            }
        }
        ie1Var.b0(l10, z4);
    }
}
