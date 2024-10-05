package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;

public class ContactsEmptyView extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    private int currentAccount;
    private LoadingStickerDrawable drawable;
    private ArrayList imageViews;
    private BackupImageView stickerView;
    private ArrayList textViews;
    private TextView titleTextView;

    public ContactsEmptyView(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ContactsEmptyView.<init>(android.content.Context):void");
    }

    private void setSticker() {
        TLRPC$TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByName("tg_placeholders_android");
        if (stickerSetByName == null) {
            stickerSetByName = MediaDataController.getInstance(this.currentAccount).getStickerSetByEmojiOrName("tg_placeholders_android");
        }
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSetByName;
        if (tLRPC$TL_messages_stickerSet == null || tLRPC$TL_messages_stickerSet.documents.size() < 1) {
            MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, true);
            this.stickerView.setImageDrawable(this.drawable);
        } else {
            this.stickerView.setImage(ImageLocation.getForDocument((TLRPC$Document) tLRPC$TL_messages_stickerSet.documents.get(0)), "130_130", "tgs", this.drawable, tLRPC$TL_messages_stickerSet);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
            setSticker();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSticker();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
    }
}
