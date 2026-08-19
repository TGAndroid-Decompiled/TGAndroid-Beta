package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import androidx.collection.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Utilities;

public class BackgroundGradientDrawable extends GradientDrawable {
    private final Paint bitmapPaint;
    private final ArrayMap bitmaps;
    private final int[] colors;
    private final ArrayMap disposables;
    private boolean disposed;
    private final List ditheringRunnables;
    private final ArrayMap isForExactBounds;

    public interface Disposable {
        void dispose();
    }

    public interface Listener {
        void onAllSizesReady();

        void onSizeReady(int i, int i2);
    }

    public static class ListenerAdapter implements Listener {
        @Override
        public void onAllSizesReady() {
        }

        @Override
        public void onSizeReady(int i, int i2) {
        }
    }

    public static class Sizes {
        private final IntSize[] arr;

        public enum Orientation {
            PORTRAIT,
            LANDSCAPE,
            BOTH
        }

        private Sizes(int i, int i2, int... iArr) {
            IntSize[] intSizeArr = new IntSize[(iArr.length / 2) + 1];
            this.arr = intSizeArr;
            IntSize intSize = new IntSize(i, i2);
            int i3 = 0;
            intSizeArr[0] = intSize;
            while (i3 < iArr.length / 2) {
                int i4 = i3 + 1;
                int i5 = i3 * 2;
                this.arr[i4] = new IntSize(iArr[i5], iArr[i5 + 1]);
                i3 = i4;
            }
        }

        public static Sizes of(int i, int i2, int... iArr) {
            return new Sizes(i, i2, iArr);
        }

        public static Sizes ofDeviceScreen() {
            return ofDeviceScreen(0.5f);
        }

        public static Sizes ofDeviceScreen(float f) {
            return ofDeviceScreen(f, Orientation.BOTH);
        }

        public static Sizes ofDeviceScreen(Orientation orientation) {
            return ofDeviceScreen(0.5f, orientation);
        }

        public static Sizes ofDeviceScreen(float f, Orientation orientation) {
            Point point = AndroidUtilities.displaySize;
            int i = (int) (point.x * f);
            int i2 = (int) (point.y * f);
            if (i == i2) {
                return of(i, i2, new int[0]);
            }
            if (orientation == Orientation.BOTH) {
                return of(i, i2, i2, i);
            }
            return (orientation == Orientation.PORTRAIT) == (i < i2) ? of(i, i2, new int[0]) : of(i2, i, new int[0]);
        }
    }

    public BackgroundGradientDrawable(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.bitmaps = new ArrayMap();
        this.isForExactBounds = new ArrayMap();
        this.disposables = new ArrayMap();
        this.ditheringRunnables = new ArrayList();
        Paint paint = new Paint(1);
        this.bitmapPaint = paint;
        this.disposed = false;
        setDither(true);
        this.colors = iArr;
        paint.setDither(true);
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.disposed) {
            super.draw(canvas);
            return;
        }
        Rect bounds = getBounds();
        Bitmap bitmapFindBestBitmapForSize = findBestBitmapForSize(bounds.width(), bounds.height());
        if (bitmapFindBestBitmapForSize != null) {
            canvas.drawBitmap(bitmapFindBestBitmapForSize, (Rect) null, bounds, this.bitmapPaint);
        } else {
            super.draw(canvas);
        }
    }

    public Disposable drawExactBoundsSize(Canvas canvas, View view) {
        return drawExactBoundsSize(canvas, view, 0.5f);
    }

    public Disposable drawExactBoundsSize(Canvas canvas, final View view, float f) {
        if (this.disposed) {
            super.draw(canvas);
            return null;
        }
        Rect bounds = getBounds();
        int iWidth = (int) (bounds.width() * f);
        int iHeight = (int) (bounds.height() * f);
        int size = this.bitmaps.size();
        for (int i = 0; i < size; i++) {
            IntSize intSize = (IntSize) this.bitmaps.keyAt(i);
            if (intSize.width == iWidth && intSize.height == iHeight) {
                Bitmap bitmap = (Bitmap) this.bitmaps.valueAt(i);
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, (Rect) null, bounds, this.bitmapPaint);
                } else {
                    super.draw(canvas);
                }
                return (Disposable) this.disposables.get(view);
            }
        }
        Disposable disposable = (Disposable) this.disposables.remove(view);
        if (disposable != null) {
            disposable.dispose();
        }
        IntSize intSize2 = new IntSize(iWidth, iHeight);
        this.bitmaps.put(intSize2, null);
        this.isForExactBounds.put(intSize2, Boolean.TRUE);
        final Disposable disposableStartDitheringInternal = startDitheringInternal(new IntSize[]{intSize2}, new ListenerAdapter() {
            @Override
            public void onAllSizesReady() {
                view.invalidate();
            }
        }, 0L);
        Disposable disposable2 = (Disposable) this.disposables.put(view, new Disposable() {
            @Override
            public final void dispose() {
                BackgroundGradientDrawable.$r8$lambda$2cyWd59DAvfgw9om12PRg4UQLcw(this.f$0, view, disposableStartDitheringInternal);
            }
        });
        super.draw(canvas);
        return disposable2;
    }

    public static void $r8$lambda$2cyWd59DAvfgw9om12PRg4UQLcw(BackgroundGradientDrawable backgroundGradientDrawable, View view, Disposable disposable) {
        backgroundGradientDrawable.disposables.remove(view);
        disposable.dispose();
    }

    @Override
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.bitmapPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.bitmapPaint.setColorFilter(colorFilter);
    }

    public int[] getColorsList() {
        return this.colors;
    }

    protected void finalize() throws Throwable {
        try {
            dispose();
        } finally {
            super.finalize();
        }
    }

    public Disposable startDithering(Sizes sizes, Listener listener) {
        return startDithering(sizes, listener, 0L);
    }

    public Disposable startDithering(Sizes sizes, Listener listener, long j) {
        if (this.disposed) {
            return null;
        }
        ArrayList arrayList = new ArrayList(sizes.arr.length);
        for (int i = 0; i < sizes.arr.length; i++) {
            IntSize intSize = sizes.arr[i];
            if (!this.bitmaps.containsKey(intSize)) {
                this.bitmaps.put(intSize, null);
                arrayList.add(intSize);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return startDitheringInternal((IntSize[]) arrayList.toArray(new IntSize[0]), listener, j);
    }

    private Disposable startDitheringInternal(final IntSize[] intSizeArr, Listener listener, long j) {
        if (intSizeArr.length == 0) {
            return null;
        }
        final Listener[] listenerArr = {listener};
        final Runnable[] runnableArr = new Runnable[intSizeArr.length];
        this.ditheringRunnables.add(runnableArr);
        for (final int i = 0; i < intSizeArr.length; i++) {
            final IntSize intSize = intSizeArr[i];
            if (intSize.width != 0 && intSize.height != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        BackgroundGradientDrawable.$r8$lambda$toMy1EfFCGbl_JwZ8KupPdjTsdY(this.f$0, intSize, runnableArr, i, listenerArr);
                    }
                };
                runnableArr[i] = runnable;
                dispatchQueue.postRunnable(runnable, j);
            }
        }
        return new Disposable() {
            @Override
            public final void dispose() {
                BackgroundGradientDrawable.$r8$lambda$gGMCWSb4JJsTZd_i7Lpr14rK_YM(this.f$0, listenerArr, runnableArr, intSizeArr);
            }
        };
    }

    public static void $r8$lambda$toMy1EfFCGbl_JwZ8KupPdjTsdY(final BackgroundGradientDrawable backgroundGradientDrawable, final IntSize intSize, final Runnable[] runnableArr, final int i, final Listener[] listenerArr) {
        backgroundGradientDrawable.getClass();
        try {
            final Bitmap bitmapCreateDitheredGradientBitmap = createDitheredGradientBitmap(backgroundGradientDrawable.getOrientation(), backgroundGradientDrawable.colors, intSize.width, intSize.height);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    BackgroundGradientDrawable.m2043$r8$lambda$qMFTH1bibwNIf3Ut0Pbft0cNf0(this.f$0, runnableArr, bitmapCreateDitheredGradientBitmap, intSize, i, listenerArr);
                }
            };
        } finally {
            final Bitmap bitmap = null;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BackgroundGradientDrawable.m2043$r8$lambda$qMFTH1bibwNIf3Ut0Pbft0cNf0(this.f$0, runnableArr, bitmap, intSize, i, listenerArr);
                }
            });
        }
    }

    public static void m2043$r8$lambda$qMFTH1bibwNIf3Ut0Pbft0cNf0(BackgroundGradientDrawable backgroundGradientDrawable, Runnable[] runnableArr, Bitmap bitmap, IntSize intSize, int i, Listener[] listenerArr) {
        if (!backgroundGradientDrawable.ditheringRunnables.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            backgroundGradientDrawable.bitmaps.put(intSize, bitmap);
        } else {
            backgroundGradientDrawable.bitmaps.remove(intSize);
            backgroundGradientDrawable.isForExactBounds.remove(intSize);
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
            backgroundGradientDrawable.ditheringRunnables.remove(runnableArr);
        }
        Listener listener = listenerArr[0];
        if (listener != null) {
            listener.onSizeReady(intSize.width, intSize.height);
            if (z) {
                return;
            }
            listenerArr[0].onAllSizesReady();
            listenerArr[0] = null;
        }
    }

    public static void $r8$lambda$gGMCWSb4JJsTZd_i7Lpr14rK_YM(BackgroundGradientDrawable backgroundGradientDrawable, Listener[] listenerArr, Runnable[] runnableArr, IntSize[] intSizeArr) {
        backgroundGradientDrawable.getClass();
        listenerArr[0] = null;
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

    public void dispose() {
        if (this.disposed) {
            return;
        }
        for (int size = this.ditheringRunnables.size() - 1; size >= 0; size--) {
            Utilities.globalQueue.cancelRunnables((Runnable[]) this.ditheringRunnables.remove(size));
        }
        for (int size2 = this.bitmaps.size() - 1; size2 >= 0; size2--) {
            Bitmap bitmap = (Bitmap) this.bitmaps.removeAt(size2);
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        this.isForExactBounds.clear();
        this.disposables.clear();
        this.disposed = true;
    }

    private Bitmap findBestBitmapForSize(int i, int i2) {
        Bitmap bitmap;
        Boolean bool;
        int size = this.bitmaps.size();
        Bitmap bitmap2 = null;
        float f = Float.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            IntSize intSize = (IntSize) this.bitmaps.keyAt(i3);
            float fSqrt = (float) Math.sqrt(Math.pow(i - intSize.width, 2.0d) + Math.pow(i2 - intSize.height, 2.0d));
            if (fSqrt < f && (bitmap = (Bitmap) this.bitmaps.valueAt(i3)) != null && ((bool = (Boolean) this.isForExactBounds.get(intSize)) == null || !bool.booleanValue())) {
                f = fSqrt;
                bitmap2 = bitmap;
            }
        }
        return bitmap2;
    }

    static class AnonymousClass2 {
        static final int[] $SwitchMap$android$graphics$drawable$GradientDrawable$Orientation;

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

    public static Rect getGradientPoints(int i, int i2, int i3) {
        return getGradientPoints(getGradientOrientation(i), i2, i3);
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
        if (i == 270) {
            return GradientDrawable.Orientation.RIGHT_LEFT;
        }
        if (i == 315) {
            return GradientDrawable.Orientation.BR_TL;
        }
        return GradientDrawable.Orientation.BL_TR;
    }

    public static BitmapDrawable createDitheredGradientBitmapDrawable(int i, int[] iArr, int i2, int i3) {
        return createDitheredGradientBitmapDrawable(getGradientOrientation(i), iArr, i2, i3);
    }

    public static BitmapDrawable createDitheredGradientBitmapDrawable(GradientDrawable.Orientation orientation, int[] iArr, int i, int i2) {
        return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createDitheredGradientBitmap(orientation, iArr, i, i2));
    }

    private static Bitmap createDitheredGradientBitmap(GradientDrawable.Orientation orientation, int[] iArr, int i, int i2) {
        Rect gradientPoints = getGradientPoints(orientation, i, i2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Utilities.drawDitheredGradient(bitmapCreateBitmap, iArr, gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom);
        return bitmapCreateBitmap;
    }
}
