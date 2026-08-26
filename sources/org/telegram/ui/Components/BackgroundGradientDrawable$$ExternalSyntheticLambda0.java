package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda9;

public final class BackgroundGradientDrawable$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId = 0;
    public final BackgroundGradientDrawable f$0;
    public final IntSize f$1;
    public final Runnable[] f$2;
    public final int f$3;
    public final zzms[] f$4;

    public BackgroundGradientDrawable$$ExternalSyntheticLambda0(BackgroundGradientDrawable backgroundGradientDrawable, IntSize intSize, Runnable[] runnableArr, int i, zzms[] zzmsVarArr) {
        this.f$0 = backgroundGradientDrawable;
        this.f$1 = intSize;
        this.f$2 = runnableArr;
        this.f$3 = i;
        this.f$4 = zzmsVarArr;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                IntSize intSize = this.f$1;
                Runnable[] runnableArr = this.f$2;
                int i = this.f$3;
                zzms[] zzmsVarArr = this.f$4;
                BackgroundGradientDrawable backgroundGradientDrawable = this.f$0;
                backgroundGradientDrawable.getClass();
                try {
                    GradientDrawable.Orientation orientation = backgroundGradientDrawable.getOrientation();
                    int[] iArr = backgroundGradientDrawable.colors;
                    int i2 = intSize.width;
                    int i3 = intSize.height;
                    Rect gradientPoints = BackgroundGradientDrawable.getGradientPoints(orientation, i2, i3);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    Utilities.drawDitheredGradient(bitmapCreateBitmap, iArr, gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom);
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda9(backgroundGradientDrawable, runnableArr, bitmapCreateBitmap, intSize, i, zzmsVarArr, 8));
                    return;
                } catch (Throwable th) {
                    AndroidUtilities.runOnUIThread(new BackgroundGradientDrawable$$ExternalSyntheticLambda0(backgroundGradientDrawable, runnableArr, intSize, i, zzmsVarArr));
                    throw th;
                }
            default:
                this.f$0.lambda$startDitheringInternal$1(this.f$2, null, this.f$1, this.f$3, this.f$4);
                return;
        }
    }

    public BackgroundGradientDrawable$$ExternalSyntheticLambda0(BackgroundGradientDrawable backgroundGradientDrawable, Runnable[] runnableArr, IntSize intSize, int i, zzms[] zzmsVarArr) {
        this.f$0 = backgroundGradientDrawable;
        this.f$2 = runnableArr;
        this.f$1 = intSize;
        this.f$3 = i;
        this.f$4 = zzmsVarArr;
    }
}
