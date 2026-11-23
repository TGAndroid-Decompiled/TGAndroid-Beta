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
public final class jb0 extends Canvas {
    public Canvas f36371a;

    @Override
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f36371a.clipOutPath(path);
        }
        return false;
    }

    @Override
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f36371a.clipOutRect(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final boolean clipPath(Path path) {
        return this.f36371a.clipPath(path);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        return false;
    }

    @Override
    public final void concat(Matrix matrix) {
        this.f36371a.concat(matrix);
    }

    @Override
    public final void disableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.disableZ();
        }
    }

    @Override
    public final void drawARGB(int i7, int i10, int i11, int i12) {
        this.f36371a.drawARGB(i7, i10, i11, i12);
    }

    @Override
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        this.f36371a.drawArc(rectF, f10, f11, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.f36371a.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int i7, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        this.f36371a.drawBitmapMesh(bitmap, i7, i10, fArr, i11, iArr, i12, paint);
    }

    @Override
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        this.f36371a.drawCircle(f10, f11, f12, paint);
    }

    @Override
    public final void drawColor(long j3, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.drawColor(j3, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override
    public final void drawGlyphs(int[] iArr, int i7, float[] fArr, int i10, int i11, Font font, Paint paint) {
        this.f36371a.drawGlyphs(iArr, i7, fArr, i10, i11, font, paint);
    }

    @Override
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        this.f36371a.drawLine(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawLines(float[] fArr, int i7, int i10, Paint paint) {
        this.f36371a.drawLines(fArr, i7, i10, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        this.f36371a.drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        this.f36371a.drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f36371a.drawPatch(ninePatch, rectF, paint);
        }
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        this.f36371a.drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        this.f36371a.drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoint(float f10, float f11, Paint paint) {
        this.f36371a.drawPoint(f10, f11, paint);
    }

    @Override
    public final void drawPoints(float[] fArr, int i7, int i10, Paint paint) {
        this.f36371a.drawPoints(fArr, i7, i10, paint);
    }

    @Override
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.f36371a.drawPosText(str, fArr, paint);
    }

    @Override
    public final void drawRGB(int i7, int i10, int i11) {
        this.f36371a.drawRGB(i7, i10, i11);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        this.f36371a.drawRect(rect, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.drawRenderNode(renderNode);
        }
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        this.f36371a.drawRoundRect(rectF, f10, f11, paint);
    }

    @Override
    public final void drawText(String str, float f10, float f11, Paint paint) {
        this.f36371a.drawText(str, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArr, int i7, int i10, Path path, float f10, float f11, Paint paint) {
        this.f36371a.drawTextOnPath(cArr, i7, i10, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(char[] cArr, int i7, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f36371a.drawTextRun(cArr, i7, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int i7, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        this.f36371a.drawVertices(vertexMode, i7, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override
    public final void enableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.enableZ();
        }
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        return this.f36371a.getClipBounds(rect);
    }

    @Override
    public final int getDensity() {
        return this.f36371a.getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return this.f36371a.getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return this.f36371a.getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        this.f36371a.getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return this.f36371a.getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return this.f36371a.getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return this.f36371a.getSaveCount();
    }

    @Override
    public final int getWidth() {
        return this.f36371a.getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return this.f36371a.isOpaque();
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f36371a.quickReject(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final void restore() {
        this.f36371a.restore();
    }

    @Override
    public final void restoreToCount(int i7) {
        this.f36371a.restoreToCount(i7);
    }

    @Override
    public final void rotate(float f10) {
        this.f36371a.rotate(f10);
    }

    @Override
    public final int save() {
        return this.f36371a.save();
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        return this.f36371a.saveLayer(f10, f11, f12, f13, paint);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i7, int i10) {
        return this.f36371a.saveLayerAlpha(rectF, i7, i10);
    }

    @Override
    public final void scale(float f10, float f11) {
        this.f36371a.scale(f10, f11);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        this.f36371a.setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int i7) {
        this.f36371a.setDensity(i7);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.f36371a.setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        this.f36371a.setMatrix(matrix);
    }

    @Override
    public final void skew(float f10, float f11) {
        this.f36371a.skew(f10, f11);
    }

    @Override
    public final void translate(float f10, float f11) {
        this.f36371a.translate(f10, f11);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op) {
        return this.f36371a.clipPath(path, op);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        return false;
    }

    @Override
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        this.f36371a.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.f36371a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawLines(float[] fArr, Paint paint) {
        this.f36371a.drawLines(fArr, paint);
    }

    @Override
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        this.f36371a.drawOval(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        this.f36371a.drawPicture(picture);
    }

    @Override
    public final void drawPoints(float[] fArr, Paint paint) {
        this.f36371a.drawPoints(fArr, paint);
    }

    @Override
    public final void drawPosText(char[] cArr, int i7, int i10, float[] fArr, Paint paint) {
        this.f36371a.drawPosText(cArr, i7, i10, fArr, paint);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        this.f36371a.drawRect(rectF, paint);
    }

    @Override
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        this.f36371a.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override
    public final void drawText(String str, int i7, int i10, float f10, float f11, Paint paint) {
        this.f36371a.drawText(str, i7, i10, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        this.f36371a.drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int i7, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f36371a.drawTextRun(measuredText, i7, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.f36371a.saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i7) {
        return this.f36371a.saveLayerAlpha(f10, f11, f12, f13, i7);
    }

    @Override
    public final boolean clipOutRect(int i7, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f36371a.clipOutRect(i7, i10, i11, i12);
        }
        return false;
    }

    @Override
    public final boolean clipRect(int i7, int i10, int i11, int i12) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i7, int i10, float f10, float f11, int i11, int i12, boolean z10, Paint paint) {
        this.f36371a.drawBitmap(iArr, i7, i10, f10, f11, i11, i12, z10, paint);
    }

    @Override
    public final void drawColor(int i7, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.drawColor(i7, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        }
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f36371a.drawPatch(ninePatch, rect, paint);
        }
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        this.f36371a.drawPicture(picture, rect);
    }

    @Override
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        this.f36371a.drawRect(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawText(char[] cArr, int i7, int i10, float f10, float f11, Paint paint) {
        this.f36371a.drawText(cArr, i7, i10, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int i7, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f36371a.drawTextRun(charSequence, i7, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f36371a.quickReject(rectF);
        }
        return false;
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i7) {
        return this.f36371a.saveLayer(f10, f11, f12, f13, paint, i7);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i7) {
        return this.f36371a.saveLayerAlpha(rectF, i7);
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i7, int i10, int i11, int i12, int i13, int i14, boolean z10, Paint paint) {
        this.f36371a.drawBitmap(iArr, i7, i10, i11, i12, i13, i14, z10, paint);
    }

    @Override
    public final void drawText(CharSequence charSequence, int i7, int i10, float f10, float f11, Paint paint) {
        this.f36371a.drawText(charSequence, i7, i10, f10, f11, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int i7) {
        return this.f36371a.saveLayer(rectF, paint, i7);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i7, int i10) {
        return this.f36371a.saveLayerAlpha(f10, f11, f12, f13, i7, i10);
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f36371a.clipOutRect(rectF);
        }
        return false;
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.f36371a.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final void drawColor(int i7) {
        this.f36371a.drawColor(i7);
    }

    @Override
    public final boolean quickReject(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f36371a.quickReject(path);
        }
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        this.f36371a.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override
    public final void drawColor(int i7, PorterDuff.Mode mode) {
        this.f36371a.drawColor(i7, mode);
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f36371a.clipOutRect(rect);
        }
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return false;
    }

    @Override
    public final void drawColor(long j3) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f36371a.drawColor(j3);
        }
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.f36371a.quickReject(rectF, edgeType);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.f36371a.quickReject(path, edgeType);
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return this.f36371a.quickReject(f10, f11, f12, f13, edgeType);
    }
}
