package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class a3 {
    public long f35254a;
    public Bitmap f35255b;

    public static a3 a(VideoPlayerHolderBase videoPlayerHolderBase, z2 z2Var) {
        ?? obj = new Object();
        obj.f35254a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = z2Var.f43606n;
            TextureView textureView2 = z2Var.f43606n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f35255b = createBitmap;
                    return obj;
                }
                obj.f35255b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
