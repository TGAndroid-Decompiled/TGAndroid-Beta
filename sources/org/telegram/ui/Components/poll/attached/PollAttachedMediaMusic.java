package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public class PollAttachedMediaMusic extends PollAttachedMedia {
    public final MessageObject messageObject;
    private final RadialProgress2 radialProgress;

    public PollAttachedMediaMusic(MessageObject messageObject) {
        this.messageObject = messageObject;
        RadialProgress2 radialProgress2 = new RadialProgress2(null);
        this.radialProgress = radialProgress2;
        TLRPC.Document document = messageObject.getDocument();
        if (MessageObject.isDocumentHasThumb(document)) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
            radialProgress2.setImageOverlay(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = MessageObject.getArtworkUrl(document, true);
            if (!TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.setImageOverlay(artworkUrl);
            } else {
                radialProgress2.setImageOverlay(null, null, null);
            }
        }
        radialProgress2.setColorKeys(Theme.key_chat_inLoader, Theme.key_chat_inLoaderSelected, Theme.key_chat_inMediaIcon, Theme.key_chat_inMediaIconSelected);
    }

    @Override
    public void attach(View view) {
        super.attach(view);
        this.radialProgress.setParent(view);
        this.radialProgress.onAttachedToWindow();
        this.radialProgress.setIcon(0, false, false);
    }

    @Override
    public void detach() {
        super.detach();
        this.radialProgress.onDetachedFromWindow();
    }

    @Override
    protected void draw(Canvas canvas, int i, int i2) {
        this.radialProgress.setCircleRadius(i / 2);
        this.radialProgress.setProgressRect(0, 0, i, i2);
        this.radialProgress.draw(canvas);
    }
}
