package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.video.VideoPlayerHolderBase;

public final class c3 {

    public long f36926a;

    public Bitmap f36927b;

    public static c3 a(VideoPlayerHolderBase videoPlayerHolderBase, b3 b3Var) {
        c3 c3Var = new c3();
        c3Var.f36926a = videoPlayerHolderBase.getCurrentPosition();
        if (videoPlayerHolderBase.firstFrameRendered) {
            TextureView textureView = b3Var.f36687n;
            TextureView textureView2 = b3Var.f36687n;
            if (textureView != null && textureView.getSurfaceTexture() != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Surface surface = new Surface(textureView2.getSurfaceTexture());
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(textureView2.getMeasuredWidth(), textureView2.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(surface, bitmapCreateBitmap);
                    surface.release();
                    c3Var.f36927b = bitmapCreateBitmap;
                    return c3Var;
                }
                c3Var.f36927b = textureView2.getBitmap();
            }
        }
        return c3Var;
    }
}
