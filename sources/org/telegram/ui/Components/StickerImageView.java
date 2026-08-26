package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;

public final class StickerImageView extends BackupImageView implements NotificationCenter.NotificationCenterDelegate {
    public final int currentAccount;
    public int stickerNum;
    public String stickerPackName;

    public StickerImageView(Context context, int i) {
        super(context);
        this.stickerPackName = "tg_placeholders_android";
        this.currentAccount = i;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.diceStickersDidLoad) {
            if (this.stickerPackName.equals((String) objArr[0])) {
                setSticker$2$1();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSticker$2$1();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public final void setSticker$2$1() {
        TLRPC.Document document;
        int i = this.currentAccount;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i).getStickerSetByName(this.stickerPackName);
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i).getStickerSetByEmojiOrName(this.stickerPackName);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i2 = this.stickerNum;
            if (size > i2) {
                document = tL_messages_stickerSet.documents.get(i2);
            } else {
                document = null;
            }
        } else {
            document = null;
        }
        SvgHelper.SvgDrawable svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, Theme.key_emptyListPlaceholder, 0.2f) : null;
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        if (document != null) {
            setImage(ImageLocation.getForDocument(document), "130_130", null, null, svgThumb, "tgs", 0, tL_messages_stickerSet);
        } else {
            this.imageReceiver.clearImage();
            MediaDataController.getInstance(i).loadStickersByEmojiOrName(this.stickerPackName, false, tL_messages_stickerSet == null);
        }
    }

    public void setStickerNum(int i) {
        if (this.stickerNum != i) {
            this.stickerNum = i;
            setSticker$2$1();
        }
    }

    public void setStickerPackName(String str) {
        this.stickerPackName = str;
    }
}
