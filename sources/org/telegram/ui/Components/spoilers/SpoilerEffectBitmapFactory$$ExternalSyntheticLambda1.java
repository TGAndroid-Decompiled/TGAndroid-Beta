package org.telegram.ui.Components.spoilers;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.PhotoViewer;

public final class SpoilerEffectBitmapFactory$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final SpoilerEffectBitmapFactory f$0;
    public final int f$1;

    public SpoilerEffectBitmapFactory$$ExternalSyntheticLambda1(SpoilerEffectBitmapFactory spoilerEffectBitmapFactory, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = spoilerEffectBitmapFactory;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SpoilerEffectBitmapFactory spoilerEffectBitmapFactory = this.f$0;
                PhotoViewer.AnonymousClass14[] anonymousClass14Arr = spoilerEffectBitmapFactory.bitmapBuffers;
                int i = this.f$1;
                PhotoViewer.AnonymousClass14 anonymousClass14 = anonymousClass14Arr[i];
                int i2 = spoilerEffectBitmapFactory.size;
                if (anonymousClass14 == null) {
                    anonymousClass14Arr[i] = new PhotoViewer.AnonymousClass14(i2);
                }
                Bitmap bitmap = spoilerEffectBitmapFactory.backgroundBitmap;
                if (bitmap == null) {
                    spoilerEffectBitmapFactory.backgroundBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
                    spoilerEffectBitmapFactory.backgroundCanvas = new Canvas(spoilerEffectBitmapFactory.backgroundBitmap);
                } else {
                    bitmap.eraseColor(0);
                }
                spoilerEffectBitmapFactory.doDraw(spoilerEffectBitmapFactory.backgroundCanvas, spoilerEffectBitmapFactory.clipRegionDump);
                Utilities.copyBitmaps(spoilerEffectBitmapFactory.backgroundBitmap, (Bitmap) anonymousClass14Arr[i].blur);
                AndroidUtilities.runOnUIThread(new SpoilerEffectBitmapFactory$$ExternalSyntheticLambda1(spoilerEffectBitmapFactory, i, 1));
                break;
            default:
                SpoilerEffectBitmapFactory spoilerEffectBitmapFactory2 = this.f$0;
                int i3 = this.f$1;
                spoilerEffectBitmapFactory2.currentBitmapBuffer = i3;
                spoilerEffectBitmapFactory2.shaderPaint.setShader((BitmapShader) spoilerEffectBitmapFactory2.bitmapBuffers[i3].this$0);
                spoilerEffectBitmapFactory2.isRunning = false;
                spoilerEffectBitmapFactory2.isDrawnWithClipRegion = true;
                break;
        }
    }
}
