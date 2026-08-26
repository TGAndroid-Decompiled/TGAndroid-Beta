package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public final class PollAttachedMediaGallery extends PollAttachedMedia {
    public final MediaController.PhotoEntry photoEntry;
    public final SendMessagesHelper.SendingMediaInfo sendingMediaInfo;

    public PollAttachedMediaGallery(SendMessagesHelper.SendingMediaInfo sendingMediaInfo) {
        ImageLocation forPath;
        ImageLocation imageLocation;
        this.sendingMediaInfo = sendingMediaInfo;
        MediaController.PhotoEntry photoEntry = sendingMediaInfo.originalPhotoEntry;
        this.photoEntry = photoEntry;
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setOrientation(0, true);
        String str = photoEntry.coverPath;
        if (str != null) {
            forPath = ImageLocation.getForPath(str);
        } else {
            String str2 = photoEntry.thumbPath;
            if (str2 != null) {
                forPath = ImageLocation.getForPath(str2);
            } else {
                if (photoEntry.path != null) {
                    if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                        ImageLocation forPath2 = ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path);
                        imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                        imageLocation = forPath2;
                    } else {
                        forPath = ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path);
                    }
                    if (imageLocation != null) {
                        imageReceiver.setImage(imageLocation, null, null, null, null, 0);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
                imageReceiver.clearImage();
                forPath = null;
            }
        }
        imageLocation = forPath;
        if (imageLocation != null) {
            imageReceiver.setImage(imageLocation, null, null, null, null, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    @Override
    public final void draw(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(0.0f, 0.0f, i, i2);
        imageReceiver.draw(canvas);
    }
}
