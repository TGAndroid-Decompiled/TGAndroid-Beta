package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public class PollAttachedMediaSticker extends PollAttachedMedia {
    public final boolean isEmoji;
    public final Object parent;
    public final TLRPC.Document sticker;

    @Override
    protected void drawOverlay(Canvas canvas, int i, int i2) {
    }

    public PollAttachedMediaSticker(TLRPC.Document document, Object obj) {
        this.sticker = document;
        this.parent = obj;
        this.isEmoji = MessageObject.isAnimatedEmoji(document);
    }

    @Override
    protected void setupImageReceiver(ImageReceiver imageReceiver) {
        boolean z = MessageObject.isStickerDocument(this.sticker) || MessageObject.isVideoSticker(this.sticker);
        MessageObject.isAnimatedStickerDocument(this.sticker, true);
        imageReceiver.setImage(ImageLocation.getForDocument(this.sticker), "38_38", DocumentObject.getSvgThumb(this.sticker, Theme.key_chat_serviceBackground, 1.0f), this.sticker.size, z ? "webp" : null, this.parent, 0);
    }
}
