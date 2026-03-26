package org.telegram.ui.Components.poll;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;

public abstract class PollAttachedMedia {
    protected abstract void drawOverlay(Canvas canvas, int i, int i2);

    protected abstract void setupImageReceiver(ImageReceiver imageReceiver);
}
