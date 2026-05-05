package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public class PollAttachedMediaGallery extends PollAttachedMedia {
    public final MediaController.PhotoEntry photoEntry;
    public final SendMessagesHelper.SendingMediaInfo sendingMediaInfo;

    public PollAttachedMediaGallery(SendMessagesHelper.SendingMediaInfo sendingMediaInfo) {
        this.sendingMediaInfo = sendingMediaInfo;
        this.photoEntry = sendingMediaInfo.originalPhotoEntry;
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        setupImageReceiver(this.imageReceiver);
    }

    private void setupImageReceiver(ImageReceiver imageReceiver) {
        ImageLocation forPath;
        imageReceiver.setOrientation(0, true);
        MediaController.PhotoEntry photoEntry = this.photoEntry;
        String str = photoEntry.coverPath;
        if (str != null) {
            forPath = ImageLocation.getForPath(str);
        } else {
            String str2 = photoEntry.thumbPath;
            if (str2 != null) {
                forPath = ImageLocation.getForPath(str2);
            } else if (photoEntry.path != null) {
                if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    forPath = ImageLocation.getForPath("vthumb://" + this.photoEntry.imageId + ":" + this.photoEntry.path);
                } else {
                    forPath = ImageLocation.getForPath("thumb://" + this.photoEntry.imageId + ":" + this.photoEntry.path);
                    MediaController.PhotoEntry photoEntry2 = this.photoEntry;
                    imageReceiver.setOrientation(photoEntry2.orientation, photoEntry2.invert, true);
                }
            } else {
                imageReceiver.clearImage();
                forPath = null;
            }
        }
        ImageLocation imageLocation = forPath;
        if (imageLocation != null) {
            imageReceiver.setImage(imageLocation, null, null, null, null, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    @Override
    protected void draw(Canvas canvas, int i, int i2) {
        this.imageReceiver.setImageCoords(0.0f, 0.0f, i, i2);
        this.imageReceiver.draw(canvas);
    }
}
