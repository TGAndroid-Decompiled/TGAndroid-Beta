package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public final class PollAttachedMediaSticker extends PollAttachedMedia {
    public final boolean isEmoji;
    public final Object parent;
    public final TLRPC.Document sticker;

    public PollAttachedMediaSticker(TLRPC.Document document, Object obj) {
        this.sticker = document;
        this.parent = obj;
        this.isEmoji = MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.imageReceiver;
        boolean z = MessageObject.isStickerDocument(document) || MessageObject.isVideoSticker(document);
        MessageObject.isAnimatedStickerDocument(document, true);
        imageReceiver.setImage(ImageLocation.getForDocument(document), "38_38", DocumentObject.getSvgThumb(document, Theme.key_chat_serviceBackground, 1.0f), document.size, z ? "webp" : null, obj, 0);
    }

    @Override
    public final void draw(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(0.0f, 0.0f, i, i2);
        imageReceiver.draw(canvas);
    }
}
