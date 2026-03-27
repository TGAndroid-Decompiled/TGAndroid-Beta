package org.telegram.ui.Components.poll;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;

public abstract class PollAttachedMedia {
    protected final ImageReceiver imageReceiver = new ImageReceiver();

    protected abstract void draw(Canvas canvas, int i, int i2);

    public void attach(View view) {
        this.imageReceiver.setParentView(view);
        this.imageReceiver.onAttachedToWindow();
    }

    public void detach() {
        this.imageReceiver.onDetachedFromWindow();
    }
}
