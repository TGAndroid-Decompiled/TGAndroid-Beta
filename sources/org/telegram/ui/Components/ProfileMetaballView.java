package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.DispatchQueue;

public abstract class ProfileMetaballView extends View {
    public static final DispatchQueue profileBlurQueue = new DispatchQueue("profileBlurQueue");

    public final class BlurBitmapHolder {
        public final Bitmap bitmap;
        public final Canvas canvas;
        public boolean destroyed;
        public boolean destroying;
        public boolean hasContent;
        public boolean isBusy;

        public BlurBitmapHolder(BlurBitmapHolder blurBitmapHolder) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(blurBitmapHolder.bitmap.getWidth(), blurBitmapHolder.bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            this.canvas = new Canvas(bitmapCreateBitmap);
        }

        public BlurBitmapHolder(int i, int i2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.bitmap = bitmapCreateBitmap;
            this.canvas = new Canvas(bitmapCreateBitmap);
        }
    }
}
