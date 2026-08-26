package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.core.app.ActivityCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.QrActivity;

public final class SizeNotifierFrameLayout$BlurBackgroundTask$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final ActivityCompat.AnonymousClass1 f$0;

    public SizeNotifierFrameLayout$BlurBackgroundTask$$ExternalSyntheticLambda0(ActivityCompat.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run() {
        int i = 1;
        ActivityCompat.AnonymousClass1 anonymousClass1 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                SizeNotifierFrameLayout sizeNotifierFrameLayout = (SizeNotifierFrameLayout) anonymousClass1.val$activity;
                if (!sizeNotifierFrameLayout.blurIsRunning) {
                    SizeNotifierFrameLayout.BlurBitmap blurBitmap = (SizeNotifierFrameLayout.BlurBitmap) anonymousClass1.val$permissionsArray;
                    if (blurBitmap != null) {
                        blurBitmap.topBitmap.recycle();
                    }
                    sizeNotifierFrameLayout.blurGeneratingTuskIsRunning = false;
                } else {
                    SizeNotifierFrameLayout.BlurBitmap blurBitmap2 = sizeNotifierFrameLayout.currentBitmap;
                    sizeNotifierFrameLayout.prevBitmap = blurBitmap2;
                    Paint paint = sizeNotifierFrameLayout.blurPaintTop2;
                    Paint paint2 = sizeNotifierFrameLayout.blurPaintTop;
                    paint.setShader(paint2.getShader());
                    sizeNotifierFrameLayout.blurPaintBottom2.setShader(sizeNotifierFrameLayout.blurPaintBottom.getShader());
                    Bitmap bitmap = ((SizeNotifierFrameLayout.BlurBitmap) anonymousClass1.val$permissionsArray).topBitmap;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
                    ((SizeNotifierFrameLayout.BlurBitmap) anonymousClass1.val$permissionsArray).getClass();
                    ValueAnimator valueAnimator = sizeNotifierFrameLayout.blurCrossfade;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    sizeNotifierFrameLayout.blurCrossfadeProgress = 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    sizeNotifierFrameLayout.blurCrossfade = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(anonymousClass1, 21));
                    sizeNotifierFrameLayout.blurCrossfade.addListener(new QrActivity.AnonymousClass4(i, anonymousClass1, blurBitmap2));
                    sizeNotifierFrameLayout.blurCrossfade.setDuration(50L);
                    sizeNotifierFrameLayout.blurCrossfade.start();
                    sizeNotifierFrameLayout.invalidateBlurredViews();
                    sizeNotifierFrameLayout.currentBitmap = (SizeNotifierFrameLayout.BlurBitmap) anonymousClass1.val$permissionsArray;
                    AndroidUtilities.runOnUIThread(new SizeNotifierFrameLayout$BlurBackgroundTask$$ExternalSyntheticLambda0(anonymousClass1, i), 16L);
                }
                break;
            default:
                SizeNotifierFrameLayout sizeNotifierFrameLayout2 = (SizeNotifierFrameLayout) anonymousClass1.val$activity;
                sizeNotifierFrameLayout2.blurGeneratingTuskIsRunning = false;
                sizeNotifierFrameLayout2.startBlur();
                break;
        }
    }
}
