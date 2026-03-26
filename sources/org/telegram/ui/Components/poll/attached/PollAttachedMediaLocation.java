package org.telegram.ui.Components.poll.attached;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.poll.PollAttachedMedia;

public class PollAttachedMediaLocation extends PollAttachedMedia {
    public final TLRPC.MessageMedia media;

    @Override
    protected void drawOverlay(Canvas canvas, int i, int i2) {
    }

    public PollAttachedMediaLocation(TLRPC.MessageMedia messageMedia) {
        this.media = messageMedia;
    }

    @Override
    protected void setupImageReceiver(ImageReceiver imageReceiver) {
        TLRPC.GeoPoint geoPoint = this.media.geo;
        if (geoPoint == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 38, 38, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) null, 0);
        }
    }
}
