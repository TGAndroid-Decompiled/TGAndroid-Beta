package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public final class PollAttachedMediaLocation extends PollAttachedMedia {
    public final TLRPC.MessageMedia media;

    public PollAttachedMediaLocation(TLRPC.MessageMedia messageMedia) {
        this.media = messageMedia;
        this.imageReceiver.setRoundRadius(AndroidUtilities.dp(7.0f));
        ImageReceiver imageReceiver = this.imageReceiver;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 38, 38, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) null, 0);
        }
    }

    @Override
    public final void draw(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setImageCoords(0.0f, 0.0f, i, i2);
        imageReceiver.draw(canvas);
    }
}
