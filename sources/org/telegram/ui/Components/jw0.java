package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;

public final class jw0 extends n9 implements NotificationCenter.NotificationCenterDelegate {
    public final int C;
    public int D;
    public String E;

    public jw0(Context context, int i10) {
        super(context);
        this.E = "tg_placeholders_android";
        this.C = i10;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.diceStickersDidLoad) {
            if (this.E.equals((String) objArr[0])) {
                t();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
        NotificationCenter.getInstance(this.C).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.C).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    public void setStickerNum(int i10) {
        if (this.D != i10) {
            this.D = i10;
            t();
        }
    }

    public void setStickerPackName(String str) {
        this.E = str;
    }

    public final void t() {
        TLRPC.Document document;
        int i10 = this.C;
        TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByName(this.E);
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(i10).getStickerSetByEmojiOrName(this.E);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
        if (tL_messages_stickerSet != null) {
            int size = tL_messages_stickerSet.documents.size();
            int i11 = this.D;
            if (size > i11) {
                document = tL_messages_stickerSet.documents.get(i11);
            } else {
                document = null;
            }
        } else {
            document = null;
        }
        SvgHelper.SvgDrawable svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.g6.f23037c7, 0.2f) : null;
        if (svgThumb != null) {
            svgThumb.overrideWidthAndHeight(512, 512);
        }
        if (document != null) {
            i(ImageLocation.getForDocument(document), "130_130", "tgs", svgThumb, tL_messages_stickerSet);
        } else {
            this.f30898a.clearImage();
            MediaDataController.getInstance(i10).loadStickersByEmojiOrName(this.E, false, tL_messages_stickerSet == null);
        }
    }
}
