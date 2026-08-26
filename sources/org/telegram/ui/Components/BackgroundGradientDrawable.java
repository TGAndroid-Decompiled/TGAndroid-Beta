package org.telegram.ui.Components;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.stripe.android.Stripe;
import java.util.ArrayList;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

public final class BackgroundGradientDrawable extends GradientDrawable {
    public final Paint bitmapPaint;
    public final ArrayMap bitmaps;
    public final int[] colors;
    public final ArrayMap disposables;
    public boolean disposed;
    public final ArrayList ditheringRunnables;
    public final ArrayMap isForExactBounds;

    public abstract class AnonymousClass2 {
        public static final int[] $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation = iArr;
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface Disposable {
        void dispose();
    }

    public BackgroundGradientDrawable(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.bitmaps = new ArrayMap(0);
        this.isForExactBounds = new ArrayMap(0);
        this.disposables = new ArrayMap(0);
        this.ditheringRunnables = new ArrayList();
        Paint paint = new Paint(1);
        this.bitmapPaint = paint;
        this.disposed = false;
        setDither(true);
        this.colors = iArr;
        paint.setDither(true);
    }

    public static BitmapDrawable createDitheredGradientBitmapDrawable(int i, int i2, int i3, int[] iArr) {
        GradientDrawable.Orientation gradientOrientation = getGradientOrientation(i);
        Resources resources = ApplicationLoader.applicationContext.getResources();
        Rect gradientPoints = getGradientPoints(gradientOrientation, i2, i3);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Utilities.drawDitheredGradient(bitmapCreateBitmap, iArr, gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom);
        return new BitmapDrawable(resources, bitmapCreateBitmap);
    }

    public static GradientDrawable.Orientation getGradientOrientation(int i) {
        if (i == 0) {
            return GradientDrawable.Orientation.BOTTOM_TOP;
        }
        if (i == 90) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        if (i == 135) {
            return GradientDrawable.Orientation.TL_BR;
        }
        if (i == 180) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
        if (i == 225) {
            return GradientDrawable.Orientation.TR_BL;
        }
        if (i != 270) {
            return i != 315 ? GradientDrawable.Orientation.BL_TR : GradientDrawable.Orientation.BR_TL;
        }
        return GradientDrawable.Orientation.RIGHT_LEFT;
    }

    public static Rect getGradientPoints(GradientDrawable.Orientation orientation, int i, int i2) {
        Rect rect = new Rect();
        switch (AnonymousClass2.$SwitchMap$android$graphics$drawable$GradientDrawable$Orientation[orientation.ordinal()]) {
            case 1:
                int i3 = i / 2;
                rect.left = i3;
                rect.top = 0;
                rect.right = i3;
                rect.bottom = i2;
                break;
            case 2:
                rect.left = i;
                rect.top = 0;
                rect.right = 0;
                rect.bottom = i2;
                break;
            case 3:
                rect.left = i;
                int i4 = i2 / 2;
                rect.top = i4;
                rect.right = 0;
                rect.bottom = i4;
                break;
            case 4:
                rect.left = i;
                rect.top = i2;
                rect.right = 0;
                rect.bottom = 0;
                break;
            case 5:
                int i5 = i / 2;
                rect.left = i5;
                rect.top = i2;
                rect.right = i5;
                rect.bottom = 0;
                break;
            case 6:
                rect.left = 0;
                rect.top = i2;
                rect.right = i;
                rect.bottom = 0;
                break;
            case 7:
                rect.left = 0;
                int i6 = i2 / 2;
                rect.top = i6;
                rect.right = i;
                rect.bottom = i6;
                break;
            default:
                rect.left = 0;
                rect.top = 0;
                rect.right = i;
                rect.bottom = i2;
                break;
        }
        return rect;
    }

    public final void dispose() {
        if (this.disposed) {
            return;
        }
        for (int size = this.ditheringRunnables.size() - 1; size >= 0; size--) {
            Utilities.globalQueue.cancelRunnables((Runnable[]) this.ditheringRunnables.remove(size));
        }
        for (int i = this.bitmaps.size - 1; i >= 0; i--) {
            Bitmap bitmap = (Bitmap) this.bitmaps.removeAt(i);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.isForExactBounds.clear();
        this.disposables.clear();
        this.disposed = true;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Boolean bool;
        if (this.disposed) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        ArrayMap arrayMap = this.bitmaps;
        int i = arrayMap.size;
        float f = Float.MAX_VALUE;
        Bitmap bitmap2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            IntSize intSize = (IntSize) arrayMap.keyAt(i2);
            float f2 = f;
            float fSqrt = (float) Math.sqrt(Math.pow(iHeight - intSize.height, 2.0d) + Math.pow(iWidth - intSize.width, 2.0d));
            if (fSqrt >= f2 || (bitmap = (Bitmap) arrayMap.valueAt(i2)) == null || ((bool = (Boolean) this.isForExactBounds.get(intSize)) != null && bool.booleanValue())) {
                f = f2;
            } else {
                bitmap2 = bitmap;
                f = fSqrt;
            }
        }
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, bounds, this.bitmapPaint);
        } else {
            super.draw(canvas);
        }
    }

    public final Disposable drawExactBoundsSize(Canvas canvas, final ViewGroup viewGroup) {
        if (this.disposed) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int iWidth = (int) (bounds.width() * 0.5f);
        int iHeight = (int) (bounds.height() * 0.5f);
        ArrayMap arrayMap = this.bitmaps;
        int i = arrayMap.size;
        int i2 = 0;
        while (true) {
            ArrayMap arrayMap2 = this.disposables;
            if (i2 >= i) {
                Disposable disposable = (Disposable) arrayMap2.remove(viewGroup);
                if (disposable != null) {
                    disposable.dispose();
                }
                IntSize intSize = new IntSize(iWidth, iHeight);
                arrayMap.put(intSize, null);
                this.isForExactBounds.put(intSize, Boolean.TRUE);
                final BackgroundGradientDrawable$$ExternalSyntheticLambda1 backgroundGradientDrawable$$ExternalSyntheticLambda1StartDitheringInternal = startDitheringInternal(new IntSize[]{intSize}, new zzms() {
                    @Override
                    public final void onAllSizesReady() {
                        viewGroup.invalidate();
                    }
                }, 0L);
                Disposable disposable2 = (Disposable) arrayMap2.put(viewGroup, new Disposable() {
                    @Override
                    public final void dispose() {
                        this.f$0.disposables.remove(viewGroup);
                        backgroundGradientDrawable$$ExternalSyntheticLambda1StartDitheringInternal.dispose();
                    }
                });
                super.draw(canvas);
                return disposable2;
            }
            IntSize intSize2 = (IntSize) arrayMap.keyAt(i2);
            if (intSize2.width == iWidth && intSize2.height == iHeight) {
                Bitmap bitmap = (Bitmap) arrayMap.valueAt(i2);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.bitmapPaint);
                } else {
                    super.draw(canvas);
                }
                return (Disposable) arrayMap2.get(viewGroup);
            }
            i2++;
        }
    }

    public final void finalize() throws Throwable {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public final void lambda$startDitheringInternal$1(Runnable[] runnableArr, Bitmap bitmap, IntSize intSize, int i, zzms[] zzmsVarArr) {
        ArrayList arrayList = this.ditheringRunnables;
        if (!arrayList.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        ArrayMap arrayMap = this.bitmaps;
        if (bitmap != null) {
            arrayMap.put(intSize, bitmap);
        } else {
            arrayMap.remove(intSize);
            this.isForExactBounds.remove(intSize);
        }
        runnableArr[i] = null;
        boolean z = true;
        if (runnableArr.length <= 1) {
            z = false;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= runnableArr.length) {
                z = false;
                break;
            } else if (runnableArr[i2] != null) {
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            arrayList.remove(runnableArr);
        }
        zzms zzmsVar = zzmsVarArr[0];
        if (zzmsVar != null) {
            zzmsVar.onSizeReady(intSize.width, intSize.height);
            if (z) {
                return;
            }
            zzmsVarArr[0].onAllSizesReady();
            zzmsVarArr[0] = null;
        }
    }

    @Override
    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.bitmapPaint.setAlpha(i);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.bitmapPaint.setColorFilter(colorFilter);
    }

    public final BackgroundGradientDrawable$$ExternalSyntheticLambda1 startDithering(Stripe stripe, zzms zzmsVar, long j) {
        if (!this.disposed) {
            IntSize[] intSizeArr = (IntSize[]) stripe.tokenCreator;
            ArrayList arrayList = new ArrayList(intSizeArr.length);
            for (IntSize intSize : intSizeArr) {
                ArrayMap arrayMap = this.bitmaps;
                if (!arrayMap.containsKey(intSize)) {
                    arrayMap.put(intSize, null);
                    arrayList.add(intSize);
                }
            }
            if (!arrayList.isEmpty()) {
                return startDitheringInternal((IntSize[]) arrayList.toArray(new IntSize[0]), zzmsVar, j);
            }
        }
        return null;
    }

    public final BackgroundGradientDrawable$$ExternalSyntheticLambda1 startDitheringInternal(IntSize[] intSizeArr, zzms zzmsVar, long j) {
        if (intSizeArr.length == 0) {
            return null;
        }
        zzms[] zzmsVarArr = {zzmsVar};
        Runnable[] runnableArr = new Runnable[intSizeArr.length];
        this.ditheringRunnables.add(runnableArr);
        for (int i = 0; i < intSizeArr.length; i++) {
            IntSize intSize = intSizeArr[i];
            if (intSize.width != 0 && intSize.height != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                BackgroundGradientDrawable$$ExternalSyntheticLambda0 backgroundGradientDrawable$$ExternalSyntheticLambda0 = new BackgroundGradientDrawable$$ExternalSyntheticLambda0(this, intSize, runnableArr, i, zzmsVarArr);
                runnableArr[i] = backgroundGradientDrawable$$ExternalSyntheticLambda0;
                dispatchQueue.postRunnable(backgroundGradientDrawable$$ExternalSyntheticLambda0, j);
            }
        }
        return new BackgroundGradientDrawable$$ExternalSyntheticLambda1(this, zzmsVarArr, runnableArr, intSizeArr);
    }

    public static Rect getGradientPoints(int i, int i2, int i3) {
        return getGradientPoints(getGradientOrientation(i), i2, i3);
    }
}
