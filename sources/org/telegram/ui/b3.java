package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class b3 {
    public long f36614a;
    public Bitmap f36615b;

    public static b3 a(VideoPlayerHolderBase videoPlayerHolderBase, a3 a3Var) {
        ?? obj = new Object();
        obj.f36614a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = a3Var.f36350n;
            TextureView textureView2 = a3Var.f36350n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap createBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, createBitmap);
                    surface.release();
                    obj.f36615b = createBitmap;
                    return obj;
                }
                obj.f36615b = textureView2.getBitmap();
            }
        }
        return obj;
    }
}
