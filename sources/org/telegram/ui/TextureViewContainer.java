package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.TextureView;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;

public class TextureViewContainer extends FrameLayout {
    boolean firstFrameRendered;
    ImageReceiver imageReceiver;
    TextureView textureView;

    public TextureViewContainer(Context context) {
        super(context);
        this.imageReceiver = new ImageReceiver(this);
        TextureView textureView = new TextureView(context);
        this.textureView = textureView;
        addView(textureView);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (!this.firstFrameRendered) {
            this.imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.imageReceiver.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.imageReceiver.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.imageReceiver.onDetachedFromWindow();
    }
}
