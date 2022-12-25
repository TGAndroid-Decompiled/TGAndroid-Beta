package org.telegram.p009ui.Components;

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
    private final ArrayMap<IntSize, Bitmap> bitmaps;
    private final int[] colors;
    private final ArrayMap<View, Disposable> disposables;
    private boolean disposed;
    private final List<Runnable[]> ditheringRunnables;
    private final ArrayMap<IntSize, Boolean> isForExactBounds;

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

        public static Sizes m15of(int i, int i2, int... iArr) {
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
                return m15of(i, i2, new int[0]);
            }
            if (orientation == Orientation.BOTH) {
                return m15of(i, i2, i2, i);
            }
            return (orientation == Orientation.PORTRAIT) == (i < i2) ? m15of(i, i2, new int[0]) : m15of(i2, i, new int[0]);
        }
    }

    public BackgroundGradientDrawable(GradientDrawable.Orientation orientation, int[] iArr) {
        super(orientation, iArr);
        this.bitmaps = new ArrayMap<>();
        this.isForExactBounds = new ArrayMap<>();
        this.disposables = new ArrayMap<>();
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
        Bitmap findBestBitmapForSize = findBestBitmapForSize(bounds.width(), bounds.height());
        if (findBestBitmapForSize != null) {
            canvas.drawBitmap(findBestBitmapForSize, (Rect) null, bounds, this.bitmapPaint);
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
        int width = (int) (bounds.width() * f);
        int height = (int) (bounds.height() * f);
        int size = this.bitmaps.size();
        for (int i = 0; i < size; i++) {
            IntSize keyAt = this.bitmaps.keyAt(i);
            if (keyAt.width == width && keyAt.height == height) {
                Bitmap valueAt = this.bitmaps.valueAt(i);
                if (valueAt != null) {
                    canvas.drawBitmap(valueAt, (Rect) null, bounds, this.bitmapPaint);
                } else {
                    super.draw(canvas);
                }
                return this.disposables.get(view);
            }
        }
        Disposable remove = this.disposables.remove(view);
        if (remove != null) {
            remove.dispose();
        }
        IntSize intSize = new IntSize(width, height);
        this.bitmaps.put(intSize, null);
        this.isForExactBounds.put(intSize, Boolean.TRUE);
        final Disposable startDitheringInternal = startDitheringInternal(new IntSize[]{intSize}, new ListenerAdapter() {
            @Override
            public void onAllSizesReady() {
                view.invalidate();
            }
        }, 0L);
        Disposable put = this.disposables.put(view, new Disposable() {
            @Override
            public final void dispose() {
                BackgroundGradientDrawable.this.lambda$drawExactBoundsSize$0(view, startDitheringInternal);
            }
        });
        super.draw(canvas);
        return put;
    }

    public void lambda$drawExactBoundsSize$0(View view, Disposable disposable) {
        this.disposables.remove(view);
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
        for (int i = 0; i < intSizeArr.length; i++) {
            final IntSize intSize = intSizeArr[i];
            if (intSize.width != 0 && intSize.height != 0) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                final int i2 = i;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        BackgroundGradientDrawable.this.lambda$startDitheringInternal$2(intSize, runnableArr, i2, listenerArr);
                    }
                };
                runnableArr[i] = runnable;
                dispatchQueue.postRunnable(runnable, j);
            }
        }
        return new Disposable() {
            @Override
            public final void dispose() {
                BackgroundGradientDrawable.this.lambda$startDitheringInternal$3(listenerArr, runnableArr, intSizeArr);
            }
        };
    }

    public void lambda$startDitheringInternal$2(final IntSize intSize, final Runnable[] runnableArr, final int i, final Listener[] listenerArr) {
        try {
            final Bitmap createDitheredGradientBitmap = createDitheredGradientBitmap(getOrientation(), this.colors, intSize.width, intSize.height);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BackgroundGradientDrawable.this.lambda$startDitheringInternal$1(runnableArr, createDitheredGradientBitmap, intSize, i, listenerArr);
                }
            });
        } catch (Throwable th) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BackgroundGradientDrawable.this.lambda$startDitheringInternal$1(runnableArr, createDitheredGradientBitmap, intSize, i, listenerArr);
                }
            });
            throw th;
        }
    }

    public void lambda$startDitheringInternal$1(Runnable[] runnableArr, Bitmap bitmap, IntSize intSize, int i, Listener[] listenerArr) {
        if (!this.ditheringRunnables.contains(runnableArr)) {
            if (bitmap != null) {
                bitmap.recycle();
                return;
            }
            return;
        }
        if (bitmap != null) {
            this.bitmaps.put(intSize, bitmap);
        } else {
            this.bitmaps.remove(intSize);
            this.isForExactBounds.remove(intSize);
        }
        runnableArr[i] = null;
        boolean z = true;
        if (runnableArr.length > 1) {
            for (Runnable runnable : runnableArr) {
                if (runnable != null) {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.ditheringRunnables.remove(runnableArr);
        }
        if (listenerArr[0] != null) {
            listenerArr[0].onSizeReady(intSize.width, intSize.height);
            if (z) {
                return;
            }
            listenerArr[0].onAllSizesReady();
            listenerArr[0] = null;
        }
    }

    public void lambda$startDitheringInternal$3(Listener[] listenerArr, Runnable[] runnableArr, IntSize[] intSizeArr) {
        listenerArr[0] = null;
        if (this.ditheringRunnables.contains(runnableArr)) {
            Utilities.globalQueue.cancelRunnables(runnableArr);
            this.ditheringRunnables.remove(runnableArr);
        }
        for (IntSize intSize : intSizeArr) {
            Bitmap remove = this.bitmaps.remove(intSize);
            this.isForExactBounds.remove(intSize);
            if (remove != null) {
                remove.recycle();
            }
        }
    }

    public void dispose() {
        if (this.disposed) {
            return;
        }
        for (int size = this.ditheringRunnables.size() - 1; size >= 0; size--) {
            Utilities.globalQueue.cancelRunnables(this.ditheringRunnables.remove(size));
        }
        for (int size2 = this.bitmaps.size() - 1; size2 >= 0; size2--) {
            Bitmap removeAt = this.bitmaps.removeAt(size2);
            if (removeAt != null) {
                removeAt.recycle();
            }
        }
        this.isForExactBounds.clear();
        this.disposables.clear();
        this.disposed = true;
    }

    private Bitmap findBestBitmapForSize(int i, int i2) {
        Bitmap valueAt;
        Boolean bool;
        int size = this.bitmaps.size();
        Bitmap bitmap = null;
        float f = Float.MAX_VALUE;
        for (int i3 = 0; i3 < size; i3++) {
            IntSize keyAt = this.bitmaps.keyAt(i3);
            float sqrt = (float) Math.sqrt(Math.pow(i - keyAt.width, 2.0d) + Math.pow(i2 - keyAt.height, 2.0d));
            if (sqrt < f && (valueAt = this.bitmaps.valueAt(i3)) != null && ((bool = this.isForExactBounds.get(keyAt)) == null || !bool.booleanValue())) {
                f = sqrt;
                bitmap = valueAt;
            }
        }
        return bitmap;
    }

    public static class C17452 {
        static final int[] f1026x8f1352bc;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            f1026x8f1352bc = iArr;
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1026x8f1352bc[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1026x8f1352bc[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1026x8f1352bc[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1026x8f1352bc[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1026x8f1352bc[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1026x8f1352bc[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static Rect getGradientPoints(GradientDrawable.Orientation orientation, int i, int i2) {
        Rect rect = new Rect();
        switch (C17452.f1026x8f1352bc[orientation.ordinal()]) {
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
        if (i != 0) {
            if (i != 90) {
                if (i != 135) {
                    if (i != 180) {
                        if (i != 225) {
                            if (i != 270) {
                                if (i == 315) {
                                    return GradientDrawable.Orientation.BR_TL;
                                }
                                return GradientDrawable.Orientation.BL_TR;
                            }
                            return GradientDrawable.Orientation.RIGHT_LEFT;
                        }
                        return GradientDrawable.Orientation.TR_BL;
                    }
                    return GradientDrawable.Orientation.TOP_BOTTOM;
                }
                return GradientDrawable.Orientation.TL_BR;
            }
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
        return GradientDrawable.Orientation.BOTTOM_TOP;
    }

    public static BitmapDrawable createDitheredGradientBitmapDrawable(int i, int[] iArr, int i2, int i3) {
        return createDitheredGradientBitmapDrawable(getGradientOrientation(i), iArr, i2, i3);
    }

    public static BitmapDrawable createDitheredGradientBitmapDrawable(GradientDrawable.Orientation orientation, int[] iArr, int i, int i2) {
        return new BitmapDrawable(ApplicationLoader.applicationContext.getResources(), createDitheredGradientBitmap(orientation, iArr, i, i2));
    }

    private static Bitmap createDitheredGradientBitmap(GradientDrawable.Orientation orientation, int[] iArr, int i, int i2) {
        Rect gradientPoints = getGradientPoints(orientation, i, i2);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Utilities.drawDitheredGradient(createBitmap, iArr, gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom);
        return createBitmap;
    }
}
