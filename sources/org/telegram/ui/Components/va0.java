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
public final class va0 extends Canvas {
    public Canvas f39057a;

    @Override
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f39057a.clipOutPath(path);
        }
        return false;
    }

    @Override
    public final boolean clipOutRect(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f39057a.clipOutRect(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final boolean clipPath(Path path) {
        return this.f39057a.clipPath(path);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13) {
        return false;
    }

    @Override
    public final void concat(Matrix matrix) {
        this.f39057a.concat(matrix);
    }

    @Override
    public final void disableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39057a.disableZ();
        }
    }

    @Override
    public final void drawARGB(int i3, int i10, int i11, int i12) {
        this.f39057a.drawARGB(i3, i10, i11, i12);
    }

    @Override
    public final void drawArc(RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        this.f39057a.drawArc(rectF, f10, f11, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.f39057a.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int i3, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        this.f39057a.drawBitmapMesh(bitmap, i3, i10, fArr, i11, iArr, i12, paint);
    }

    @Override
    public final void drawCircle(float f10, float f11, float f12, Paint paint) {
        this.f39057a.drawCircle(f10, f11, f12, paint);
    }

    @Override
    public final void drawColor(long j10, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39057a.drawColor(j10, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39057a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override
    public final void drawGlyphs(int[] iArr, int i3, float[] fArr, int i10, int i11, Font font, Paint paint) {
        this.f39057a.drawGlyphs(iArr, i3, fArr, i10, i11, font, paint);
    }

    @Override
    public final void drawLine(float f10, float f11, float f12, float f13, Paint paint) {
        this.f39057a.drawLine(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawLines(float[] fArr, int i3, int i10, Paint paint) {
        this.f39057a.drawLines(fArr, i3, i10, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        this.f39057a.drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        this.f39057a.drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f39057a.drawPatch(ninePatch, rectF, paint);
        }
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        this.f39057a.drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        this.f39057a.drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoint(float f10, float f11, Paint paint) {
        this.f39057a.drawPoint(f10, f11, paint);
    }

    @Override
    public final void drawPoints(float[] fArr, int i3, int i10, Paint paint) {
        this.f39057a.drawPoints(fArr, i3, i10, paint);
    }

    @Override
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.f39057a.drawPosText(str, fArr, paint);
    }

    @Override
    public final void drawRGB(int i3, int i10, int i11) {
        this.f39057a.drawRGB(i3, i10, i11);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        this.f39057a.drawRect(rect, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39057a.drawRenderNode(renderNode);
        }
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f10, float f11, Paint paint) {
        this.f39057a.drawRoundRect(rectF, f10, f11, paint);
    }

    @Override
    public final void drawText(String str, float f10, float f11, Paint paint) {
        this.f39057a.drawText(str, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArr, int i3, int i10, Path path, float f10, float f11, Paint paint) {
        this.f39057a.drawTextOnPath(cArr, i3, i10, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(char[] cArr, int i3, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f39057a.drawTextRun(cArr, i3, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int i3, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        this.f39057a.drawVertices(vertexMode, i3, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override
    public final void enableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39057a.enableZ();
        }
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        return this.f39057a.getClipBounds(rect);
    }

    @Override
    public final int getDensity() {
        return this.f39057a.getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return this.f39057a.getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return this.f39057a.getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        this.f39057a.getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return this.f39057a.getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return this.f39057a.getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return this.f39057a.getSaveCount();
    }

    @Override
    public final int getWidth() {
        return this.f39057a.getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return this.f39057a.isOpaque();
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f39057a.quickReject(f10, f11, f12, f13);
        }
        return false;
    }

    @Override
    public final void restore() {
        this.f39057a.restore();
    }

    @Override
    public final void restoreToCount(int i3) {
        this.f39057a.restoreToCount(i3);
    }

    @Override
    public final void rotate(float f10) {
        this.f39057a.rotate(f10);
    }

    @Override
    public final int save() {
        return this.f39057a.save();
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint) {
        return this.f39057a.saveLayer(f10, f11, f12, f13, paint);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i3, int i10) {
        return this.f39057a.saveLayerAlpha(rectF, i3, i10);
    }

    @Override
    public final void scale(float f10, float f11) {
        this.f39057a.scale(f10, f11);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        this.f39057a.setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int i3) {
        this.f39057a.setDensity(i3);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.f39057a.setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        this.f39057a.setMatrix(matrix);
    }

    @Override
    public final void skew(float f10, float f11) {
        this.f39057a.skew(f10, f11);
    }

    @Override
    public final void translate(float f10, float f11) {
        this.f39057a.translate(f10, f11);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op) {
        return this.f39057a.clipPath(path, op);
    }

    @Override
    public final boolean clipRect(float f10, float f11, float f12, float f13, Region.Op op) {
        return false;
    }

    @Override
    public final void drawArc(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, Paint paint) {
        this.f39057a.drawArc(f10, f11, f12, f13, f14, f15, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.f39057a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawLines(float[] fArr, Paint paint) {
        this.f39057a.drawLines(fArr, paint);
    }

    @Override
    public final void drawOval(float f10, float f11, float f12, float f13, Paint paint) {
        this.f39057a.drawOval(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        this.f39057a.drawPicture(picture);
    }

    @Override
    public final void drawPoints(float[] fArr, Paint paint) {
        this.f39057a.drawPoints(fArr, paint);
    }

    @Override
    public final void drawPosText(char[] cArr, int i3, int i10, float[] fArr, Paint paint) {
        this.f39057a.drawPosText(cArr, i3, i10, fArr, paint);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        this.f39057a.drawRect(rectF, paint);
    }

    @Override
    public final void drawRoundRect(float f10, float f11, float f12, float f13, float f14, float f15, Paint paint) {
        this.f39057a.drawRoundRect(f10, f11, f12, f13, f14, f15, paint);
    }

    @Override
    public final void drawText(String str, int i3, int i10, float f10, float f11, Paint paint) {
        this.f39057a.drawText(str, i3, i10, f10, f11, paint);
    }

    @Override
    public final void drawTextOnPath(String str, Path path, float f10, float f11, Paint paint) {
        this.f39057a.drawTextOnPath(str, path, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int i3, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f39057a.drawTextRun(measuredText, i3, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.f39057a.saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i3) {
        return this.f39057a.saveLayerAlpha(f10, f11, f12, f13, i3);
    }

    @Override
    public final boolean clipOutRect(int i3, int i10, int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f39057a.clipOutRect(i3, i10, i11, i12);
        }
        return false;
    }

    @Override
    public final boolean clipRect(int i3, int i10, int i11, int i12) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i3, int i10, float f10, float f11, int i11, int i12, boolean z10, Paint paint) {
        this.f39057a.drawBitmap(iArr, i3, i10, f10, f11, i11, i12, z10, paint);
    }

    @Override
    public final void drawColor(int i3, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39057a.drawColor(i3, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f10, float f11, RectF rectF2, float f12, float f13, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f39057a.drawDoubleRoundRect(rectF, f10, f11, rectF2, f12, f13, paint);
        }
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f39057a.drawPatch(ninePatch, rect, paint);
        }
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        this.f39057a.drawPicture(picture, rect);
    }

    @Override
    public final void drawRect(float f10, float f11, float f12, float f13, Paint paint) {
        this.f39057a.drawRect(f10, f11, f12, f13, paint);
    }

    @Override
    public final void drawText(char[] cArr, int i3, int i10, float f10, float f11, Paint paint) {
        this.f39057a.drawText(cArr, i3, i10, f10, f11, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int i3, int i10, int i11, int i12, float f10, float f11, boolean z10, Paint paint) {
        this.f39057a.drawTextRun(charSequence, i3, i10, i11, i12, f10, f11, z10, paint);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f39057a.quickReject(rectF);
        }
        return false;
    }

    @Override
    public final int saveLayer(float f10, float f11, float f12, float f13, Paint paint, int i3) {
        return this.f39057a.saveLayer(f10, f11, f12, f13, paint, i3);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i3) {
        return this.f39057a.saveLayerAlpha(rectF, i3);
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i3, int i10, int i11, int i12, int i13, int i14, boolean z10, Paint paint) {
        this.f39057a.drawBitmap(iArr, i3, i10, i11, i12, i13, i14, z10, paint);
    }

    @Override
    public final void drawText(CharSequence charSequence, int i3, int i10, float f10, float f11, Paint paint) {
        this.f39057a.drawText(charSequence, i3, i10, f10, f11, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int i3) {
        return this.f39057a.saveLayer(rectF, paint, i3);
    }

    @Override
    public final int saveLayerAlpha(float f10, float f11, float f12, float f13, int i3, int i10) {
        return this.f39057a.saveLayerAlpha(f10, f11, f12, f13, i3, i10);
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f39057a.clipOutRect(rectF);
        }
        return false;
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.f39057a.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final void drawColor(int i3) {
        this.f39057a.drawColor(i3);
    }

    @Override
    public final boolean quickReject(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f39057a.quickReject(path);
        }
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f10, float f11, Paint paint) {
        this.f39057a.drawBitmap(bitmap, f10, f11, paint);
    }

    @Override
    public final void drawColor(int i3, PorterDuff.Mode mode) {
        this.f39057a.drawColor(i3, mode);
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f39057a.clipOutRect(rect);
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
            this.f39057a.drawColor(j10);
        }
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.f39057a.quickReject(rectF, edgeType);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.f39057a.quickReject(path, edgeType);
    }

    @Override
    public final boolean quickReject(float f10, float f11, float f12, float f13, Canvas.EdgeType edgeType) {
        return this.f39057a.quickReject(f10, f11, f12, f13, edgeType);
    }
}
