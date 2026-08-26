package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public final class PollAttachedMediaMusic extends PollAttachedMedia {
    public final MessageObject messageObject;
    public final RadialProgress2 radialProgress;

    public PollAttachedMediaMusic(MessageObject messageObject) {
        this.messageObject = messageObject;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.radialProgress = radialProgress2;
        TLRPC.Document document = messageObject.getDocument();
        if (MessageObject.isDocumentHasThumb(document)) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(22.0f), true, null, false);
            radialProgress2.setImageOverlay(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(44.0f), true, closestPhotoSizeWithSize, true), closestPhotoSizeWithSize, document, messageObject);
        } else {
            String artworkUrl = MessageObject.getArtworkUrl(document, true);
            if (TextUtils.isEmpty(artworkUrl)) {
                radialProgress2.setImageOverlay(null, null, null);
            } else {
                radialProgress2.setImageOverlay(artworkUrl);
            }
        }
        int i = Theme.key_chat_inLoader;
        int i2 = Theme.key_chat_inLoaderSelected;
        int i3 = Theme.key_chat_inMediaIcon;
        int i4 = Theme.key_chat_inMediaIconSelected;
        radialProgress2.circleColorKey = i;
        radialProgress2.circlePressedColorKey = i2;
        radialProgress2.iconColorKey = i3;
        radialProgress2.iconPressedColorKey = i4;
    }

    @Override
    public final void attach(View view) {
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setParent(view);
        radialProgress2.overlayImageView.onAttachedToWindow();
        radialProgress2.setIcon(0, false, false);
    }

    @Override
    public final void detach() {
        this.imageReceiver.onDetachedFromWindow();
        this.radialProgress.overlayImageView.onDetachedFromWindow();
    }

    @Override
    public final void draw(Canvas canvas, int i, int i2) {
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setCircleRadius(i / 2);
        radialProgress2.setProgressRect(0, 0, i, i2);
        radialProgress2.draw(canvas);
    }
}
