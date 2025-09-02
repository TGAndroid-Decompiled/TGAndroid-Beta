package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.DispatchQueue;

public abstract class ProfileMetaballView extends View {
    public static final DispatchQueue profileBlurQueue = new DispatchQueue("profileBlurQueue");

    public static class BlurBitmapHolder {
        Bitmap bitmap;
        Canvas canvas;
        boolean destroyed;
        boolean destroying;
        boolean hasContent;
        boolean isBusy;
        int key = 0;

        public BlurBitmapHolder(BlurBitmapHolder blurBitmapHolder) {
            this.bitmap = Bitmap.createBitmap(blurBitmapHolder.bitmap.getWidth(), blurBitmapHolder.bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            this.canvas = new Canvas(this.bitmap);
        }

        public BlurBitmapHolder(int i, int i2) {
            this.bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            this.canvas = new Canvas(this.bitmap);
        }

        public void clear() {
            if (this.destroyed) {
                return;
            }
            this.hasContent = false;
            this.bitmap.eraseColor(0);
        }

        public void ready() {
            this.hasContent = true;
            this.key++;
        }

        public boolean canUse(int i, int i2) {
            return !this.destroyed && this.bitmap.getWidth() == i && this.bitmap.getHeight() == i2;
        }

        public boolean canUse(BlurBitmapHolder blurBitmapHolder) {
            return !this.destroyed && this.bitmap.getWidth() == blurBitmapHolder.bitmap.getWidth() && this.bitmap.getHeight() == blurBitmapHolder.bitmap.getHeight();
        }

        public void recycle() {
            this.destroying = true;
            if (this.isBusy) {
                return;
            }
            this.destroyed = true;
            this.bitmap.recycle();
        }

        public void lock() {
            this.isBusy = true;
        }

        public void unlock() {
            this.isBusy = false;
            if (this.destroyed || !this.destroying) {
                return;
            }
            this.destroyed = true;
            this.bitmap.recycle();
        }
    }
}
