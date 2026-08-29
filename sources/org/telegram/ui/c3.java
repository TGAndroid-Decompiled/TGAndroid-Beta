package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class c3 {
    public long f36977a;
    public Bitmap f36978b;

    public static c3 a(VideoPlayerHolderBase videoPlayerHolderBase, b3 b3Var) {
        ?? obj = new Object();
        obj.f36977a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = b3Var.f36667n;
            TextureView textureView2 = b3Var.f36667n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f36978b = createBitmap;
                    return obj;
                }
                obj.f36978b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
