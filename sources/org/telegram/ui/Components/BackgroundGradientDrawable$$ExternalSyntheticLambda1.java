package org.telegram.ui.Components;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import org.telegram.messenger.Utilities;

public final class BackgroundGradientDrawable$$ExternalSyntheticLambda1 implements BackgroundGradientDrawable.Disposable {
    public final BackgroundGradientDrawable f$0;
    public final zzms[] f$1;
    public final Runnable[] f$2;
    public final IntSize[] f$3;

    public BackgroundGradientDrawable$$ExternalSyntheticLambda1(BackgroundGradientDrawable backgroundGradientDrawable, zzms[] zzmsVarArr, Runnable[] runnableArr, IntSize[] intSizeArr) {
        this.f$0 = backgroundGradientDrawable;
        this.f$1 = zzmsVarArr;
        this.f$2 = runnableArr;
        this.f$3 = intSizeArr;
    }

    @Override
    public final void dispose() {
        BackgroundGradientDrawable backgroundGradientDrawable = this.f$0;
        zzms[] zzmsVarArr = this.f$1;
        Runnable[] runnableArr = this.f$2;
        IntSize[] intSizeArr = this.f$3;
        backgroundGradientDrawable.getClass();
        zzmsVarArr[0] = null;
        if (backgroundGradientDrawable.ditheringRunnables.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            backgroundGradientDrawable.ditheringRunnables.remove(runnableArr);
        }
        for (IntSize intSize : intSizeArr) {
            Bitmap bitmap = (Bitmap) backgroundGradientDrawable.bitmaps.remove(intSize);
            backgroundGradientDrawable.isForExactBounds.remove(intSize);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }
}
