package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class hh0 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final org.telegram.ui.Components.p9 f34871a;
    public final int f34872b;

    public hh0(Context context) {
        super(context);
        this.f34872b = UserConfig.selectedAccount;
        setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
        setOrientation(1);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f34871a = p9Var;
        addView(p9Var, k7.b6.t(104, 104, 49, 0, 2, 0, 0));
    }

    public final void a() {
        boolean z4;
        int i10 = this.f34872b;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.documents.size() >= 4) {
            TLRPC.Document document = tL_messages_stickerSet.documents.get(3);
            this.f34871a.i(ImageLocation.getForDocument(document), "104_104", "tgs", DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f19852a7, 1.0f), tL_messages_stickerSet);
            return;
        }
        MediaDataController mediaDataController = MediaDataController.getInstance(i10);
        if (tL_messages_stickerSet == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        mediaDataController.loadStickersByEmojiOrName("tg_placeholders_android", false, z4);
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
        NotificationCenter.getInstance(this.f34872b).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.f34872b).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }
}
