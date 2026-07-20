package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import java.util.Arrays;

public class AnimatedFileBuffer {
    public final Bitmap bitmap;
    public final int height;
    public boolean opaque;
    private final BitmapShader[] shader = new BitmapShader[3];
    public int time;
    public final int width;

    private AnimatedFileBuffer(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
    }

    public BitmapShader getShader(int i) {
        BitmapShader[] bitmapShaderArr = this.shader;
        if (bitmapShaderArr[i] == null) {
            Bitmap bitmap = this.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            bitmapShaderArr[i] = new BitmapShader(bitmap, tileMode, tileMode);
        }
        return this.shader[i];
    }

    public static AnimatedFileBuffer of(int i, int i2) {
        return new AnimatedFileBuffer(Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888));
    }

    public static AnimatedFileBuffer of(Bitmap bitmap) {
        return new AnimatedFileBuffer(bitmap);
    }

    public void recycle() {
        this.bitmap.recycle();
        Arrays.fill(this.shader, (Object) null);
    }
}
