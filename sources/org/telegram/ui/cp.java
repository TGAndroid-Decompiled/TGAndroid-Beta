package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class cp extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {

    public org.telegram.ui.Components.n9 f37123a;

    public org.telegram.ui.Components.v80 f37124b;

    public int f37125c;

    public final void a() {
        org.telegram.ui.Components.n9 n9Var = this.f37123a;
        int i10 = this.f37125c;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            n9Var.i(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f37124b, tL_messages_stickerSet);
        } else {
            MediaDataController.getInstance(i10).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            n9Var.setImageDrawable(this.f37124b);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            a();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        NotificationCenter.getInstance(this.f37125c).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f37125c).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }
}
