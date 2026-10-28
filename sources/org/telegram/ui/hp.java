package org.telegram.ui;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class hp extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.y9 f39946a;
    public org.telegram.ui.Components.ga0 f39947b;
    public int f39948c;

    public final void a() {
        boolean z10;
        org.telegram.ui.Components.y9 y9Var = this.f39946a;
        int i10 = this.f39948c;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 3) {
            y9Var.i(ImageLocation.getForDocument(tL_messages_stickerSet.documents.get(2)), "104_104", "tgs", this.f39947b, tL_messages_stickerSet);
            return;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        if (tL_messages_stickerSet == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z10);
        y9Var.setImageDrawable(this.f39947b);
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
        NotificationCenter.getInstance(this.f39948c).addWeakObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f39948c).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }
}
