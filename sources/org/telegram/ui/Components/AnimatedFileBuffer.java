package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;

public final class AnimatedFileBuffer {
    public final Bitmap bitmap;
    public final int height;
    public boolean opaque;
    public final BitmapShader[] shader = new BitmapShader[3];
    public int time;
    public final int width;

    public AnimatedFileBuffer(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
    }
}
