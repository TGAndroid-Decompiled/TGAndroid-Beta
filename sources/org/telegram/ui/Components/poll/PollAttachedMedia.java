package org.telegram.ui.Components.poll;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

public abstract class PollAttachedMedia {
    public final ImageReceiver imageReceiver = new ImageReceiver();

    public void attach(View view) {
        ImageReceiver imageReceiver = this.imageReceiver;
        imageReceiver.setParentView(view);
        imageReceiver.onAttachedToWindow();
    }

    public void detach() {
        this.imageReceiver.onDetachedFromWindow();
    }

    public abstract void draw(Canvas canvas, int i, int i2);
}
