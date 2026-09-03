package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import android.os.Build;
public final class qc0 extends Canvas {
    public Canvas f28143a;

    @Override
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28143a.clipOutPath(path);
        }
        return false;
    }

    @Override
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28143a.clipOutRect(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final boolean clipPath(Path path) {
        return this.f28143a.clipPath(path);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        return false;
    }

    @Override
    public final void concat(Matrix matrix) {
        this.f28143a.concat(matrix);
    }

    @Override
    public final void disableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.disableZ();
        }
    }

    @Override
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        this.f28143a.drawARGB(i10, i11, i12, i13);
    }

    @Override
    public final void drawArc(RectF rectF, float f10, float f11, boolean z4, Paint paint) {
        this.f28143a.drawArc(rectF, f10, f11, z4, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.f28143a.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        this.f28143a.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    @Override
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        this.f28143a.drawCircle(f10, f11, f12, paint);
    }

    @Override
    public final void drawColor(long j10, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.drawColor(j10, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        this.f28143a.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    @Override
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        this.f28143a.drawLine(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        this.f28143a.drawLines(fArr, i10, i11, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        this.f28143a.drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        this.f28143a.drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f28143a.drawPatch(ninePatch, rectF, paint);
        }
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        this.f28143a.drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        this.f28143a.drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoint(float f10, float f11, Paint paint) {
        this.f28143a.drawPoint(f10, f11, paint);
    }

    @Override
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        this.f28143a.drawPoints(fArr, i10, i11, paint);
    }

    @Override
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.f28143a.drawPosText(str, fArr, paint);
    }

    @Override
    public final void drawRGB(int i10, int i11, int i12) {
        this.f28143a.drawRGB(i10, i11, i12);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        this.f28143a.drawRect(rect, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.drawRenderNode(renderNode);
        }
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        this.f28143a.drawRoundRect(rectF, f10, f11, paint);
    }

    @Override
    public final void drawText(String str, float f10, float f11, Paint paint) {
        this.f28143a.drawText(str, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f10, float f11, Paint paint) {
        this.f28143a.drawTextOnPath(cArr, i10, i11, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f10, float f11, boolean z4, Paint paint) {
        this.f28143a.drawTextRun(cArr, i10, i11, i12, i13, f10, f11, z4, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        this.f28143a.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
    }

    @Override
    public final void enableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.enableZ();
        }
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        return this.f28143a.getClipBounds(rect);
    }

    @Override
    public final int getDensity() {
        return this.f28143a.getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return this.f28143a.getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return this.f28143a.getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        this.f28143a.getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return this.f28143a.getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return this.f28143a.getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return this.f28143a.getSaveCount();
    }

    @Override
    public final int getWidth() {
        return this.f28143a.getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return this.f28143a.isOpaque();
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f28143a.quickReject(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final void restore() {
        this.f28143a.restore();
    }

    @Override
    public final void restoreToCount(int i10) {
        this.f28143a.restoreToCount(i10);
    }

    @Override
    public final void rotate(float f10) {
        this.f28143a.rotate(f10);
    }

    @Override
    public final int save() {
        return this.f28143a.save();
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        return this.f28143a.saveLayer(f10, f11, f12, f13, paint);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        return this.f28143a.saveLayerAlpha(rectF, i10, i11);
    }

    @Override
    public final void scale(float f10, float f11) {
        this.f28143a.scale(f10, f11);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        this.f28143a.setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int i10) {
        this.f28143a.setDensity(i10);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.f28143a.setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        this.f28143a.setMatrix(matrix);
    }

    @Override
    public final void skew(float f10, float f11) {
        this.f28143a.skew(f10, f11);
    }

    @Override
    public final void translate(float f10, float f11) {
        this.f28143a.translate(f10, f11);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op) {
        return this.f28143a.clipPath(path, op);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        return false;
    }

    @Override
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z4, Paint paint) {
        this.f28143a.drawArc(f10, f11, f12, f13, f14, f15, z4, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.f28143a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawLines(float[] fArr, Paint paint) {
        this.f28143a.drawLines(fArr, paint);
    }

    @Override
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        this.f28143a.drawOval(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        this.f28143a.drawPicture(picture);
    }

    @Override
    public final void drawPoints(float[] fArr, Paint paint) {
        this.f28143a.drawPoints(fArr, paint);
    }

    @Override
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        this.f28143a.drawPosText(cArr, i10, i11, fArr, paint);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        this.f28143a.drawRect(rectF, paint);
    }

    @Override
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        this.f28143a.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override
    public final void drawText(String str, int i10, int i11, float f10, float f11, Paint paint) {
        this.f28143a.drawText(str, i10, i11, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        this.f28143a.drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f10, float f11, boolean z4, Paint paint) {
        this.f28143a.drawTextRun(measuredText, i10, i11, i12, i13, f10, f11, z4, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.f28143a.saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10) {
        return this.f28143a.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    @Override
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28143a.clipOutRect(i10, i11, i12, i13);
        }
        return false;
    }

    @Override
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i10, int i11, float f10, float f11, int i12, int i13, boolean z4, Paint paint) {
        this.f28143a.drawBitmap(iArr, i10, i11, f10, f11, i12, i13, z4, paint);
    }

    @Override
    public final void drawColor(int i10, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.drawColor(i10, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        }
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f28143a.drawPatch(ninePatch, rect, paint);
        }
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        this.f28143a.drawPicture(picture, rect);
    }

    @Override
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        this.f28143a.drawRect(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawText(char[] cArr, int i10, int i11, float f10, float f11, Paint paint) {
        this.f28143a.drawText(cArr, i10, i11, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f10, float f11, boolean z4, Paint paint) {
        this.f28143a.drawTextRun(charSequence, i10, i11, i12, i13, f10, f11, z4, paint);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f28143a.quickReject(rectF);
        }
        return false;
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i10) {
        return this.f28143a.saveLayer(f10, f11, f12, f13, paint, i10);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i10) {
        return this.f28143a.saveLayerAlpha(rectF, i10);
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z4, Paint paint) {
        this.f28143a.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z4, paint);
    }

    @Override
    public final void drawText(CharSequence charSequence, int i10, int i11, float f10, float f11, Paint paint) {
        this.f28143a.drawText(charSequence, i10, i11, f10, f11, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        return this.f28143a.saveLayer(rectF, paint, i10);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i10, int i11) {
        return this.f28143a.saveLayerAlpha(f10, f11, f12, f13, i10, i11);
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28143a.clipOutRect(rectF);
        }
        return false;
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.f28143a.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final void drawColor(int i10) {
        this.f28143a.drawColor(i10);
    }

    @Override
    public final boolean quickReject(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f28143a.quickReject(path);
        }
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        this.f28143a.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        this.f28143a.drawColor(i10, mode);
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f28143a.clipOutRect(rect);
        }
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return false;
    }

    @Override
    public final void drawColor(long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28143a.drawColor(j10);
        }
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.f28143a.quickReject(rectF, edgeType);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.f28143a.quickReject(path, edgeType);
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return this.f28143a.quickReject(f10, f11, f12, f13, edgeType);
    }
}
