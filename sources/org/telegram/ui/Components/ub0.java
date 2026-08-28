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
public final class ub0 extends Canvas {
    public Canvas f32971a;

    @Override
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f32971a.clipOutPath(path);
        }
        return false;
    }

    @Override
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f32971a.clipOutRect(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final boolean clipPath(Path path) {
        return this.f32971a.clipPath(path);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        return false;
    }

    @Override
    public final void concat(Matrix matrix) {
        this.f32971a.concat(matrix);
    }

    @Override
    public final void disableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32971a.disableZ();
        }
    }

    @Override
    public final void drawARGB(int i9, int i10, int i11, int i12) {
        this.f32971a.drawARGB(i9, i10, i11, i12);
    }

    @Override
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        this.f32971a.drawArc(rectF, f10, f11, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.f32971a.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int i9, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        this.f32971a.drawBitmapMesh(bitmap, i9, i10, fArr, i11, iArr, i12, paint);
    }

    @Override
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        this.f32971a.drawCircle(f10, f11, f12, paint);
    }

    @Override
    public final void drawColor(long j10, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32971a.drawColor(j10, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32971a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override
    public final void drawGlyphs(int[] iArr, int i9, float[] fArr, int i10, int i11, Font font, Paint paint) {
        this.f32971a.drawGlyphs(iArr, i9, fArr, i10, i11, font, paint);
    }

    @Override
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        this.f32971a.drawLine(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawLines(float[] fArr, int i9, int i10, Paint paint) {
        this.f32971a.drawLines(fArr, i9, i10, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        this.f32971a.drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        this.f32971a.drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f32971a.drawPatch(ninePatch, rectF, paint);
        }
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        this.f32971a.drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        this.f32971a.drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoint(float f10, float f11, Paint paint) {
        this.f32971a.drawPoint(f10, f11, paint);
    }

    @Override
    public final void drawPoints(float[] fArr, int i9, int i10, Paint paint) {
        this.f32971a.drawPoints(fArr, i9, i10, paint);
    }

    @Override
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.f32971a.drawPosText(str, fArr, paint);
    }

    @Override
    public final void drawRGB(int i9, int i10, int i11) {
        this.f32971a.drawRGB(i9, i10, i11);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        this.f32971a.drawRect(rect, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32971a.drawRenderNode(renderNode);
        }
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        this.f32971a.drawRoundRect(rectF, f10, f11, paint);
    }

    @Override
    public final void drawText(String str, float f10, float f11, Paint paint) {
        this.f32971a.drawText(str, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArr, int i9, int i10, Path path, float f10, float f11, Paint paint) {
        this.f32971a.drawTextOnPath(cArr, i9, i10, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(char[] cArr, int i9, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f32971a.drawTextRun(cArr, i9, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int i9, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        this.f32971a.drawVertices(vertexMode, i9, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override
    public final void enableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32971a.enableZ();
        }
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        return this.f32971a.getClipBounds(rect);
    }

    @Override
    public final int getDensity() {
        return this.f32971a.getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return this.f32971a.getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return this.f32971a.getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        this.f32971a.getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return this.f32971a.getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return this.f32971a.getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return this.f32971a.getSaveCount();
    }

    @Override
    public final int getWidth() {
        return this.f32971a.getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return this.f32971a.isOpaque();
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f32971a.quickReject(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final void restore() {
        this.f32971a.restore();
    }

    @Override
    public final void restoreToCount(int i9) {
        this.f32971a.restoreToCount(i9);
    }

    @Override
    public final void rotate(float f10) {
        this.f32971a.rotate(f10);
    }

    @Override
    public final int save() {
        return this.f32971a.save();
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        return this.f32971a.saveLayer(f10, f11, f12, f13, paint);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i9, int i10) {
        return this.f32971a.saveLayerAlpha(rectF, i9, i10);
    }

    @Override
    public final void scale(float f10, float f11) {
        this.f32971a.scale(f10, f11);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        this.f32971a.setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int i9) {
        this.f32971a.setDensity(i9);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.f32971a.setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        this.f32971a.setMatrix(matrix);
    }

    @Override
    public final void skew(float f10, float f11) {
        this.f32971a.skew(f10, f11);
    }

    @Override
    public final void translate(float f10, float f11) {
        this.f32971a.translate(f10, f11);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op) {
        return this.f32971a.clipPath(path, op);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        return false;
    }

    @Override
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        this.f32971a.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.f32971a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawLines(float[] fArr, Paint paint) {
        this.f32971a.drawLines(fArr, paint);
    }

    @Override
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        this.f32971a.drawOval(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        this.f32971a.drawPicture(picture);
    }

    @Override
    public final void drawPoints(float[] fArr, Paint paint) {
        this.f32971a.drawPoints(fArr, paint);
    }

    @Override
    public final void drawPosText(char[] cArr, int i9, int i10, float[] fArr, Paint paint) {
        this.f32971a.drawPosText(cArr, i9, i10, fArr, paint);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        this.f32971a.drawRect(rectF, paint);
    }

    @Override
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        this.f32971a.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override
    public final void drawText(String str, int i9, int i10, float f10, float f11, Paint paint) {
        this.f32971a.drawText(str, i9, i10, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        this.f32971a.drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int i9, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f32971a.drawTextRun(measuredText, i9, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.f32971a.saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i9) {
        return this.f32971a.saveLayerAlpha(f10, f11, f12, f13, i9);
    }

    @Override
    public final boolean clipOutRect(int i9, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f32971a.clipOutRect(i9, i10, i11, i12);
        }
        return false;
    }

    @Override
    public final boolean clipRect(int i9, int i10, int i11, int i12) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i9, int i10, float f10, float f11, int i11, int i12, boolean z10, Paint paint) {
        this.f32971a.drawBitmap(iArr, i9, i10, f10, f11, i11, i12, z10, paint);
    }

    @Override
    public final void drawColor(int i9, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32971a.drawColor(i9, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f32971a.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        }
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f32971a.drawPatch(ninePatch, rect, paint);
        }
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        this.f32971a.drawPicture(picture, rect);
    }

    @Override
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        this.f32971a.drawRect(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawText(char[] cArr, int i9, int i10, float f10, float f11, Paint paint) {
        this.f32971a.drawText(cArr, i9, i10, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int i9, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f32971a.drawTextRun(charSequence, i9, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f32971a.quickReject(rectF);
        }
        return false;
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i9) {
        return this.f32971a.saveLayer(f10, f11, f12, f13, paint, i9);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i9) {
        return this.f32971a.saveLayerAlpha(rectF, i9);
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i9, int i10, int i11, int i12, int i13, int i14, boolean z10, Paint paint) {
        this.f32971a.drawBitmap(iArr, i9, i10, i11, i12, i13, i14, z10, paint);
    }

    @Override
    public final void drawText(CharSequence charSequence, int i9, int i10, float f10, float f11, Paint paint) {
        this.f32971a.drawText(charSequence, i9, i10, f10, f11, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int i9) {
        return this.f32971a.saveLayer(rectF, paint, i9);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i9, int i10) {
        return this.f32971a.saveLayerAlpha(f10, f11, f12, f13, i9, i10);
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f32971a.clipOutRect(rectF);
        }
        return false;
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.f32971a.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final void drawColor(int i9) {
        this.f32971a.drawColor(i9);
    }

    @Override
    public final boolean quickReject(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f32971a.quickReject(path);
        }
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        this.f32971a.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override
    public final void drawColor(int i9, PorterDuff.Mode mode) {
        this.f32971a.drawColor(i9, mode);
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f32971a.clipOutRect(rect);
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
            this.f32971a.drawColor(j10);
        }
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.f32971a.quickReject(rectF, edgeType);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.f32971a.quickReject(path, edgeType);
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return this.f32971a.quickReject(f10, f11, f12, f13, edgeType);
    }
}
