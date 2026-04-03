package org.telegram.ui.Components;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class EightPatchDrawable extends Drawable {
    private final android.graphics.Rect dstBC;
    private final android.graphics.Rect dstBL;
    private final android.graphics.Rect dstBR;
    private final android.graphics.Rect dstML;
    private final android.graphics.Rect dstMR;
    private final android.graphics.Rect dstTC;
    private final android.graphics.Rect dstTL;
    private final android.graphics.Rect dstTR;
    private ColorFilter explicitColorFilter;
    private boolean geometryValid;
    private boolean mutated;
    private final android.graphics.Rect srcBC;
    private final android.graphics.Rect srcBL;
    private final android.graphics.Rect srcBR;
    private final android.graphics.Rect srcML;
    private final android.graphics.Rect srcMR;
    private final android.graphics.Rect srcTC;
    private final android.graphics.Rect srcTL;
    private final android.graphics.Rect srcTR;
    private EightPatchState state;
    private PorterDuffColorFilter tintFilter;

    public EightPatchDrawable(Bitmap bitmap, byte[] bArr, android.graphics.Rect rect, String str) {
        this(null, bitmap, bArr, rect, str);
    }

    public EightPatchDrawable(Resources resources, Bitmap bitmap, byte[] bArr, android.graphics.Rect rect, String str) {
        this.srcTL = new android.graphics.Rect();
        this.srcTC = new android.graphics.Rect();
        this.srcTR = new android.graphics.Rect();
        this.srcML = new android.graphics.Rect();
        this.srcMR = new android.graphics.Rect();
        this.srcBL = new android.graphics.Rect();
        this.srcBC = new android.graphics.Rect();
        this.srcBR = new android.graphics.Rect();
        this.dstTL = new android.graphics.Rect();
        this.dstTC = new android.graphics.Rect();
        this.dstTR = new android.graphics.Rect();
        this.dstML = new android.graphics.Rect();
        this.dstMR = new android.graphics.Rect();
        this.dstBL = new android.graphics.Rect();
        this.dstBC = new android.graphics.Rect();
        this.dstBR = new android.graphics.Rect();
        this.state = new EightPatchState(resources, bitmap, bArr, rect, str);
        updateLocalState();
        rebuildSourcePatches();
        rebuildDestPatches(getBounds());
    }

    private EightPatchDrawable(EightPatchState eightPatchState) {
        this.srcTL = new android.graphics.Rect();
        this.srcTC = new android.graphics.Rect();
        this.srcTR = new android.graphics.Rect();
        this.srcML = new android.graphics.Rect();
        this.srcMR = new android.graphics.Rect();
        this.srcBL = new android.graphics.Rect();
        this.srcBC = new android.graphics.Rect();
        this.srcBR = new android.graphics.Rect();
        this.dstTL = new android.graphics.Rect();
        this.dstTC = new android.graphics.Rect();
        this.dstTR = new android.graphics.Rect();
        this.dstML = new android.graphics.Rect();
        this.dstMR = new android.graphics.Rect();
        this.dstBL = new android.graphics.Rect();
        this.dstBC = new android.graphics.Rect();
        this.dstBR = new android.graphics.Rect();
        this.state = new EightPatchState(eightPatchState);
        updateLocalState();
        rebuildSourcePatches();
        rebuildDestPatches(getBounds());
    }

    private void updateLocalState() {
        EightPatchState eightPatchState = this.state;
        this.tintFilter = createTintFilter(eightPatchState.tint, eightPatchState.tintMode);
        this.geometryValid = false;
    }

    private void rebuildSourcePatches() {
        this.geometryValid = false;
        EightPatchState eightPatchState = this.state;
        Bitmap bitmap = eightPatchState.bitmap;
        ChunkInfo chunkInfo = eightPatchState.chunkInfo;
        if (bitmap == null || bitmap.isRecycled() || chunkInfo == null) {
            clearDst();
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = chunkInfo.xDivs;
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = chunkInfo.yDivs;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        this.srcTL.set(0, 0, i, i3);
        this.srcTC.set(i, 0, i2, i3);
        this.srcTR.set(i2, 0, width, i3);
        this.srcML.set(0, i3, i, i4);
        this.srcMR.set(i2, i3, width, i4);
        this.srcBL.set(0, i4, i, height);
        this.srcBC.set(i, i4, i2, height);
        this.srcBR.set(i2, i4, width, height);
    }

    @Override
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        rebuildDestPatches(rect);
    }

    private void rebuildDestPatches(android.graphics.Rect rect) {
        this.geometryValid = false;
        EightPatchState eightPatchState = this.state;
        Bitmap bitmap = eightPatchState.bitmap;
        ChunkInfo chunkInfo = eightPatchState.chunkInfo;
        if (bitmap == null || bitmap.isRecycled() || chunkInfo == null || rect.isEmpty()) {
            clearDst();
            return;
        }
        float densityScale = getDensityScale();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = chunkInfo.xDivs;
        int i = iArr[0];
        int i2 = iArr[1];
        int[] iArr2 = chunkInfo.yDivs;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        int iRound = Math.round(i * densityScale);
        int iRound2 = Math.round((i2 - i) * densityScale);
        int iRound3 = Math.round((width - i2) * densityScale);
        int iRound4 = Math.round(i3 * densityScale);
        int iRound5 = Math.round((i4 - i3) * densityScale);
        int iRound6 = Math.round((height - i4) * densityScale);
        Axis axisComputeAxis = computeAxis(rect.left, rect.width(), iRound, iRound2, iRound3);
        Axis axisComputeAxis2 = computeAxis(rect.top, rect.height(), iRound4, iRound5, iRound6);
        int i5 = axisComputeAxis.p0;
        int i6 = axisComputeAxis.p1;
        int i7 = axisComputeAxis.p2;
        int i8 = axisComputeAxis.p3;
        int i9 = axisComputeAxis2.p0;
        int i10 = axisComputeAxis2.p1;
        int i11 = axisComputeAxis2.p2;
        int i12 = axisComputeAxis2.p3;
        this.dstTL.set(i5, i9, i6, i10);
        this.dstTC.set(i6, i9, i7, i10);
        this.dstTR.set(i7, i9, i8, i10);
        this.dstML.set(i5, i10, i6, i11);
        this.dstMR.set(i7, i10, i8, i11);
        this.dstBL.set(i5, i11, i6, i12);
        this.dstBC.set(i6, i11, i7, i12);
        this.dstBR.set(i7, i11, i8, i12);
        this.geometryValid = true;
    }

    private static Axis computeAxis(int i, int i2, int i3, int i4, int i5) {
        int iRound;
        int i6 = i3 + i4 + i5;
        int i7 = i5 + i3;
        if (i2 <= 0 || i6 <= 0) {
            i3 = 0;
            iRound = 0;
        } else if (i2 >= i7) {
            iRound = i2 - i7;
        } else {
            float f = i2 / i6;
            i3 = Math.round(i3 * f);
            iRound = Math.round(i4 * f);
        }
        Axis axis = new Axis();
        axis.p0 = i;
        int i8 = i3 + i;
        axis.p1 = i8;
        axis.p2 = i8 + iRound;
        axis.p3 = i + i2;
        return axis;
    }

    private void clearDst() {
        this.dstTL.setEmpty();
        this.dstTC.setEmpty();
        this.dstTR.setEmpty();
        this.dstML.setEmpty();
        this.dstMR.setEmpty();
        this.dstBL.setEmpty();
        this.dstBC.setEmpty();
        this.dstBR.setEmpty();
    }

    @Override
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (!this.geometryValid || (bitmap = this.state.bitmap) == null || bitmap.isRecycled()) {
            return;
        }
        Paint paint = this.state.paint;
        int alpha = paint.getAlpha();
        ColorFilter colorFilter = paint.getColorFilter();
        int i = (this.state.alpha * alpha) / 255;
        if (i != alpha) {
            paint.setAlpha(i);
        }
        ColorFilter colorFilter2 = this.explicitColorFilter;
        if (colorFilter2 == null) {
            colorFilter2 = this.tintFilter;
        }
        if (colorFilter != colorFilter2) {
            paint.setColorFilter(colorFilter2);
        }
        drawPatch(canvas, bitmap, this.srcTL, this.dstTL, paint);
        drawPatch(canvas, bitmap, this.srcTC, this.dstTC, paint);
        drawPatch(canvas, bitmap, this.srcTR, this.dstTR, paint);
        drawPatch(canvas, bitmap, this.srcML, this.dstML, paint);
        drawPatch(canvas, bitmap, this.srcMR, this.dstMR, paint);
        drawPatch(canvas, bitmap, this.srcBL, this.dstBL, paint);
        drawPatch(canvas, bitmap, this.srcBC, this.dstBC, paint);
        drawPatch(canvas, bitmap, this.srcBR, this.dstBR, paint);
        if (colorFilter != colorFilter2) {
            paint.setColorFilter(colorFilter);
        }
        if (i != alpha) {
            paint.setAlpha(alpha);
        }
    }

    private static void drawPatch(Canvas canvas, Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, Paint paint) {
        if (rect.isEmpty() || rect2.isEmpty()) {
            return;
        }
        canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public void setAlpha(int i) {
        int iClamp255 = clamp255(i);
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.alpha != iClamp255) {
            eightPatchState.alpha = iClamp255;
            invalidateSelf();
        }
    }

    @Override
    public int getAlpha() {
        return this.state.alpha;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.explicitColorFilter != colorFilter) {
            this.explicitColorFilter = colorFilter;
            invalidateSelf();
        }
    }

    @Override
    public ColorFilter getColorFilter() {
        return this.explicitColorFilter;
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.tint != colorStateList) {
            eightPatchState.tint = colorStateList;
            this.tintFilter = createTintFilter(colorStateList, eightPatchState.tintMode);
            invalidateSelf();
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.tintMode != mode) {
            eightPatchState.tintMode = mode;
            this.tintFilter = createTintFilter(eightPatchState.tint, mode);
            invalidateSelf();
        }
    }

    @Override
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.state.tint;
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        EightPatchState eightPatchState = this.state;
        PorterDuffColorFilter porterDuffColorFilterCreateTintFilter = createTintFilter(eightPatchState.tint, eightPatchState.tintMode);
        if (sameTintFilter(this.tintFilter, porterDuffColorFilterCreateTintFilter)) {
            return false;
        }
        this.tintFilter = porterDuffColorFilterCreateTintFilter;
        invalidateSelf();
        return true;
    }

    @Override
    public boolean isStateful() {
        ColorStateList colorStateList = this.state.tint;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override
    public int getOpacity() {
        EightPatchState eightPatchState = this.state;
        Bitmap bitmap = eightPatchState.bitmap;
        if (bitmap == null) {
            return -2;
        }
        return (eightPatchState.alpha < 255 || bitmap.hasAlpha() || this.state.paint.getAlpha() < 255) ? -3 : -1;
    }

    @Override
    public boolean getPadding(android.graphics.Rect rect) {
        android.graphics.Rect rect2 = this.state.padding;
        if (rect2 != null) {
            rect.set(rect2);
            return (rect.bottom | ((rect.left | rect.top) | rect.right)) != 0;
        }
        rect.setEmpty();
        return false;
    }

    @Override
    public int getIntrinsicWidth() {
        Bitmap bitmap = this.state.bitmap;
        if (bitmap != null) {
            return scaleFromSourceDensity(bitmap.getWidth());
        }
        return -1;
    }

    @Override
    public int getIntrinsicHeight() {
        Bitmap bitmap = this.state.bitmap;
        if (bitmap != null) {
            return scaleFromSourceDensity(bitmap.getHeight());
        }
        return -1;
    }

    @Override
    public int getMinimumWidth() {
        return getIntrinsicWidth();
    }

    @Override
    public int getMinimumHeight() {
        return getIntrinsicHeight();
    }

    @Override
    public void setFilterBitmap(boolean z) {
        if (this.state.paint.isFilterBitmap() != z) {
            this.state.paint.setFilterBitmap(z);
            invalidateSelf();
        }
    }

    @Override
    public boolean isFilterBitmap() {
        return this.state.paint.isFilterBitmap();
    }

    @Override
    public void setDither(boolean z) {
        if (this.state.paint.isDither() != z) {
            this.state.paint.setDither(z);
            invalidateSelf();
        }
    }

    public void setTargetDensity(DisplayMetrics displayMetrics) {
        setTargetDensity(displayMetrics.densityDpi);
    }

    public void setTargetDensity(int i) {
        if (i == 0) {
            i = 160;
        }
        EightPatchState eightPatchState = this.state;
        if (eightPatchState.targetDensity != i) {
            eightPatchState.targetDensity = i;
            rebuildDestPatches(getBounds());
            invalidateSelf();
        }
    }

    @Override
    public Drawable.ConstantState getConstantState() {
        this.state.changingConfigurations = getChangingConfigurations();
        return this.state;
    }

    @Override
    public Drawable mutate() {
        if (!this.mutated && super.mutate() == this) {
            this.state = new EightPatchState(this.state);
            this.mutated = true;
        }
        return this;
    }

    @Override
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.state.changingConfigurations;
    }

    private float getDensityScale() {
        EightPatchState eightPatchState = this.state;
        int i = eightPatchState.sourceDensity;
        if (i == 0) {
            i = 160;
        }
        return (eightPatchState.targetDensity != 0 ? r0 : 160) / i;
    }

    private int scaleFromSourceDensity(int i) {
        return Math.round(i * getDensityScale());
    }

    private PorterDuffColorFilter createTintFilter(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), colorStateList.getDefaultColor()), mode);
    }

    private static boolean sameTintFilter(PorterDuffColorFilter porterDuffColorFilter, PorterDuffColorFilter porterDuffColorFilter2) {
        if (porterDuffColorFilter == porterDuffColorFilter2) {
            return true;
        }
        if (porterDuffColorFilter == null || porterDuffColorFilter2 == null) {
            return false;
        }
        return porterDuffColorFilter.equals(porterDuffColorFilter2);
    }

    private static int clamp255(int i) {
        return Math.max(0, Math.min(255, i));
    }

    private static final class Axis {
        int p0;
        int p1;
        int p2;
        int p3;

        private Axis() {
        }
    }

    private static final class ChunkInfo {
        final android.graphics.Rect padding;
        final int[] xDivs;
        final int[] yDivs;

        ChunkInfo(int[] iArr, int[] iArr2, android.graphics.Rect rect) {
            this.xDivs = iArr;
            this.yDivs = iArr2;
            this.padding = rect;
        }

        static ChunkInfo parse(byte[] bArr, android.graphics.Rect rect, int i, int i2) {
            if (NinePatch.isNinePatchChunk(bArr) && bArr.length >= 32) {
                try {
                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder());
                    if (byteBufferOrder.get() == 0) {
                        return null;
                    }
                    int i3 = byteBufferOrder.get() & 255;
                    int i4 = byteBufferOrder.get() & 255;
                    int i5 = byteBufferOrder.get() & 255;
                    if (i3 != 2 || i4 != 2) {
                        throw new IllegalArgumentException("EightPatchDrawable supports only 3x3 nine-patch");
                    }
                    byteBufferOrder.getInt();
                    byteBufferOrder.getInt();
                    int i6 = byteBufferOrder.getInt();
                    int i7 = byteBufferOrder.getInt();
                    int i8 = byteBufferOrder.getInt();
                    int i9 = byteBufferOrder.getInt();
                    byteBufferOrder.getInt();
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    iArr[0] = EightPatchDrawable.clamp(byteBufferOrder.getInt(), 0, i);
                    iArr[1] = EightPatchDrawable.clamp(byteBufferOrder.getInt(), iArr[0], i);
                    iArr2[0] = EightPatchDrawable.clamp(byteBufferOrder.getInt(), 0, i2);
                    iArr2[1] = EightPatchDrawable.clamp(byteBufferOrder.getInt(), iArr2[0], i2);
                    for (int i10 = 0; i10 < i5 && byteBufferOrder.remaining() >= 4; i10++) {
                        byteBufferOrder.getInt();
                    }
                    android.graphics.Rect rect2 = new android.graphics.Rect(i6, i8, i7, i9);
                    if (rect != null) {
                        rect2 = new android.graphics.Rect(rect);
                    }
                    return new ChunkInfo(iArr, iArr2, rect2);
                } catch (Throwable unused) {
                }
            }
            return null;
        }
    }

    static final class EightPatchState extends Drawable.ConstantState {
        int alpha;
        final Bitmap bitmap;
        int changingConfigurations;
        final byte[] chunk;
        final ChunkInfo chunkInfo;
        final android.graphics.Rect padding;
        final Paint paint;
        int sourceDensity;
        final String srcName;
        int targetDensity;
        ColorStateList tint;
        PorterDuff.Mode tintMode;

        EightPatchState(Resources resources, Bitmap bitmap, byte[] bArr, android.graphics.Rect rect, String str) {
            this.alpha = 255;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            this.bitmap = bitmap;
            byte[] bArr2 = (byte[]) bArr.clone();
            this.chunk = bArr2;
            this.srcName = str;
            android.graphics.Rect rect2 = rect != null ? new android.graphics.Rect(rect) : null;
            this.padding = rect2;
            this.chunkInfo = ChunkInfo.parse(bArr2, rect2, bitmap.getWidth(), bitmap.getHeight());
            Paint paint = new Paint();
            this.paint = paint;
            paint.setFilterBitmap(true);
            paint.setDither(true);
            int density = bitmap.getDensity() != 0 ? bitmap.getDensity() : 160;
            this.sourceDensity = density;
            this.targetDensity = resources != null ? resources.getDisplayMetrics().densityDpi : density;
        }

        EightPatchState(EightPatchState eightPatchState) {
            this.alpha = 255;
            this.tintMode = PorterDuff.Mode.SRC_IN;
            Bitmap bitmap = eightPatchState.bitmap;
            this.bitmap = bitmap;
            byte[] bArr = (byte[]) eightPatchState.chunk.clone();
            this.chunk = bArr;
            this.srcName = eightPatchState.srcName;
            android.graphics.Rect rect = eightPatchState.padding != null ? new android.graphics.Rect(eightPatchState.padding) : null;
            this.padding = rect;
            this.chunkInfo = ChunkInfo.parse(bArr, rect, bitmap.getWidth(), bitmap.getHeight());
            this.paint = new Paint(eightPatchState.paint);
            this.sourceDensity = eightPatchState.sourceDensity;
            this.targetDensity = eightPatchState.targetDensity;
            this.alpha = eightPatchState.alpha;
            this.changingConfigurations = eightPatchState.changingConfigurations;
            this.tint = eightPatchState.tint;
            this.tintMode = eightPatchState.tintMode;
        }

        @Override
        public Drawable newDrawable() {
            return new EightPatchDrawable(this);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            EightPatchDrawable eightPatchDrawable = new EightPatchDrawable(this);
            if (resources != null) {
                eightPatchDrawable.setTargetDensity(resources.getDisplayMetrics());
            }
            return eightPatchDrawable;
        }

        @Override
        public int getChangingConfigurations() {
            return this.changingConfigurations;
        }
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }
}
