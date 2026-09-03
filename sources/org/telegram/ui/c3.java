package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class c3 {
    public long f33006a;
    public Bitmap f33007b;

    public static c3 a(VideoPlayerHolderBase videoPlayerHolderBase, b3 b3Var) {
        ?? obj = new Object();
        obj.f33006a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = b3Var.f32713n;
            TextureView textureView2 = b3Var.f32713n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f33007b = createBitmap;
                    return obj;
                }
                obj.f33007b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
