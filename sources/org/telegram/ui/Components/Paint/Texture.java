package org.telegram.ui.Components.Paint;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.telegram.ui.Components.Size;
public class Texture {
    private Bitmap bitmap;
    private int texture;

    public Texture(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public void cleanResources(boolean z) {
        Bitmap bitmap;
        int i = this.texture;
        if (i == 0) {
            return;
        }
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
        this.texture = 0;
        if (!z || (bitmap = this.bitmap) == null || bitmap.isRecycled()) {
            return;
        }
        this.bitmap.recycle();
    }

    public int texture() {
        int i = this.texture;
        if (i != 0) {
            return i;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || bitmap.isRecycled()) {
            return 0;
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        this.texture = i2;
        GLES20.glBindTexture(3553, i2);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int width = this.bitmap.getWidth();
        int height = this.bitmap.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        this.bitmap.getPixels(iArr2, 0, width, 0, 0, width, height);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = iArr2[i4];
            iArr2[i4] = ((i5 >> 16) & 255) | (i5 & (-16711936)) | ((i5 & 255) << 16);
        }
        GLES20.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, IntBuffer.wrap(iArr2));
        if (!this.bitmap.isRecycled() && Build.VERSION.SDK_INT <= 28) {
            int pixel = this.bitmap.getPixel(0, 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
            allocateDirect.putInt(((pixel >> 16) & 255) | (pixel & (-16711936)) | ((pixel & 255) << 16)).position(0);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, 1, 1, 6408, 5121, allocateDirect);
        }
        Utils.HasGLError();
        return this.texture;
    }

    public static int generateTexture(Size size) {
        return generateTexture((int) size.width, (int) size.height);
    }

    public static int generateTexture(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i3 = iArr[0];
        GLES20.glBindTexture(3553, i3);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        return i3;
    }
}
