package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class a3 {
    public long f35002a;
    public Bitmap f35003b;

    public static a3 a(VideoPlayerHolderBase videoPlayerHolderBase, z2 z2Var) {
        ?? obj = new Object();
        obj.f35002a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = z2Var.f43773n;
            TextureView textureView2 = z2Var.f43773n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f35003b = createBitmap;
                    return obj;
                }
                obj.f35003b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
