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
public final class mc0 extends Canvas {
    public Canvas f26162a;

    @Override
    public final boolean clipOutPath(Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f26162a.clipOutPath(path);
        }
        return false;
    }

    @Override
    public final boolean clipOutRect(float f7, float f10, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f26162a.clipOutRect(f7, f10, f11, f12);
        }
        return false;
    }

    @Override
    public final boolean clipPath(Path path) {
        return this.f26162a.clipPath(path);
    }

    @Override
    public final boolean clipRect(float f7, float f10, float f11, float f12) {
        return false;
    }

    @Override
    public final void concat(Matrix matrix) {
        this.f26162a.concat(matrix);
    }

    @Override
    public final void disableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26162a.disableZ();
        }
    }

    @Override
    public final void drawARGB(int i10, int i11, int i12, int i13) {
        this.f26162a.drawARGB(i10, i11, i12, i13);
    }

    @Override
    public final void drawArc(RectF rectF, float f7, float f10, boolean z10, Paint paint) {
        this.f26162a.drawArc(rectF, f7, f10, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.f26162a.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public final void drawBitmapMesh(Bitmap bitmap, int i10, int i11, float[] fArr, int i12, int[] iArr, int i13, Paint paint) {
        this.f26162a.drawBitmapMesh(bitmap, i10, i11, fArr, i12, iArr, i13, paint);
    }

    @Override
    public final void drawCircle(float f7, float f10, float f11, Paint paint) {
        this.f26162a.drawCircle(f7, f10, f11, paint);
    }

    @Override
    public final void drawColor(long j3, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26162a.drawColor(j3, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26162a.drawDoubleRoundRect(rectF, fArr, rectF2, fArr2, paint);
        }
    }

    @Override
    public final void drawGlyphs(int[] iArr, int i10, float[] fArr, int i11, int i12, Font font, Paint paint) {
        this.f26162a.drawGlyphs(iArr, i10, fArr, i11, i12, font, paint);
    }

    @Override
    public final void drawLine(float f7, float f10, float f11, float f12, Paint paint) {
        this.f26162a.drawLine(f7, f10, f11, f12, paint);
    }

    @Override
    public final void drawLines(float[] fArr, int i10, int i11, Paint paint) {
        this.f26162a.drawLines(fArr, i10, i11, paint);
    }

    @Override
    public final void drawOval(RectF rectF, Paint paint) {
        this.f26162a.drawOval(rectF, paint);
    }

    @Override
    public final void drawPaint(Paint paint) {
        this.f26162a.drawPaint(paint);
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f26162a.drawPatch(ninePatch, rectF, paint);
        }
    }

    @Override
    public final void drawPath(Path path, Paint paint) {
        this.f26162a.drawPath(path, paint);
    }

    @Override
    public final void drawPicture(Picture picture, RectF rectF) {
        this.f26162a.drawPicture(picture, rectF);
    }

    @Override
    public final void drawPoint(float f7, float f10, Paint paint) {
        this.f26162a.drawPoint(f7, f10, paint);
    }

    @Override
    public final void drawPoints(float[] fArr, int i10, int i11, Paint paint) {
        this.f26162a.drawPoints(fArr, i10, i11, paint);
    }

    @Override
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        this.f26162a.drawPosText(str, fArr, paint);
    }

    @Override
    public final void drawRGB(int i10, int i11, int i12) {
        this.f26162a.drawRGB(i10, i11, i12);
    }

    @Override
    public final void drawRect(Rect rect, Paint paint) {
        this.f26162a.drawRect(rect, paint);
    }

    @Override
    public final void drawRenderNode(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26162a.drawRenderNode(renderNode);
        }
    }

    @Override
    public final void drawRoundRect(RectF rectF, float f7, float f10, Paint paint) {
        this.f26162a.drawRoundRect(rectF, f7, f10, paint);
    }

    @Override
    public final void drawText(String str, float f7, float f10, Paint paint) {
        this.f26162a.drawText(str, f7, f10, paint);
    }

    @Override
    public final void drawTextOnPath(char[] cArr, int i10, int i11, Path path, float f7, float f10, Paint paint) {
        this.f26162a.drawTextOnPath(cArr, i10, i11, path, f7, f10, paint);
    }

    @Override
    public final void drawTextRun(char[] cArr, int i10, int i11, int i12, int i13, float f7, float f10, boolean z10, Paint paint) {
        this.f26162a.drawTextRun(cArr, i10, i11, i12, i13, f7, f10, z10, paint);
    }

    @Override
    public final void drawVertices(Canvas.VertexMode vertexMode, int i10, float[] fArr, int i11, float[] fArr2, int i12, int[] iArr, int i13, short[] sArr, int i14, int i15, Paint paint) {
        this.f26162a.drawVertices(vertexMode, i10, fArr, i11, fArr2, i12, iArr, i13, sArr, i14, i15, paint);
    }

    @Override
    public final void enableZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26162a.enableZ();
        }
    }

    @Override
    public final boolean getClipBounds(Rect rect) {
        return this.f26162a.getClipBounds(rect);
    }

    @Override
    public final int getDensity() {
        return this.f26162a.getDensity();
    }

    @Override
    public final DrawFilter getDrawFilter() {
        return this.f26162a.getDrawFilter();
    }

    @Override
    public final int getHeight() {
        return this.f26162a.getHeight();
    }

    @Override
    public final void getMatrix(Matrix matrix) {
        this.f26162a.getMatrix(matrix);
    }

    @Override
    public final int getMaximumBitmapHeight() {
        return this.f26162a.getMaximumBitmapHeight();
    }

    @Override
    public final int getMaximumBitmapWidth() {
        return this.f26162a.getMaximumBitmapWidth();
    }

    @Override
    public final int getSaveCount() {
        return this.f26162a.getSaveCount();
    }

    @Override
    public final int getWidth() {
        return this.f26162a.getWidth();
    }

    @Override
    public final boolean isOpaque() {
        return this.f26162a.isOpaque();
    }

    @Override
    public final boolean quickReject(float f7, float f10, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f26162a.quickReject(f7, f10, f11, f12);
        }
        return false;
    }

    @Override
    public final void restore() {
        this.f26162a.restore();
    }

    @Override
    public final void restoreToCount(int i10) {
        this.f26162a.restoreToCount(i10);
    }

    @Override
    public final void rotate(float f7) {
        this.f26162a.rotate(f7);
    }

    @Override
    public final int save() {
        return this.f26162a.save();
    }

    @Override
    public final int saveLayer(float f7, float f10, float f11, float f12, Paint paint) {
        return this.f26162a.saveLayer(f7, f10, f11, f12, paint);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i10, int i11) {
        return this.f26162a.saveLayerAlpha(rectF, i10, i11);
    }

    @Override
    public final void scale(float f7, float f10) {
        this.f26162a.scale(f7, f10);
    }

    @Override
    public final void setBitmap(Bitmap bitmap) {
        this.f26162a.setBitmap(bitmap);
    }

    @Override
    public final void setDensity(int i10) {
        this.f26162a.setDensity(i10);
    }

    @Override
    public final void setDrawFilter(DrawFilter drawFilter) {
        this.f26162a.setDrawFilter(drawFilter);
    }

    @Override
    public final void setMatrix(Matrix matrix) {
        this.f26162a.setMatrix(matrix);
    }

    @Override
    public final void skew(float f7, float f10) {
        this.f26162a.skew(f7, f10);
    }

    @Override
    public final void translate(float f7, float f10) {
        this.f26162a.translate(f7, f10);
    }

    @Override
    public final boolean clipPath(Path path, Region.Op op) {
        return this.f26162a.clipPath(path, op);
    }

    @Override
    public final boolean clipRect(float f7, float f10, float f11, float f12, Region.Op op) {
        return false;
    }

    @Override
    public final void drawArc(float f7, float f10, float f11, float f12, float f13, float f14, boolean z10, Paint paint) {
        this.f26162a.drawArc(f7, f10, f11, f12, f13, f14, z10, paint);
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.f26162a.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public final void drawLines(float[] fArr, Paint paint) {
        this.f26162a.drawLines(fArr, paint);
    }

    @Override
    public final void drawOval(float f7, float f10, float f11, float f12, Paint paint) {
        this.f26162a.drawOval(f7, f10, f11, f12, paint);
    }

    @Override
    public final void drawPicture(Picture picture) {
        this.f26162a.drawPicture(picture);
    }

    @Override
    public final void drawPoints(float[] fArr, Paint paint) {
        this.f26162a.drawPoints(fArr, paint);
    }

    @Override
    public final void drawPosText(char[] cArr, int i10, int i11, float[] fArr, Paint paint) {
        this.f26162a.drawPosText(cArr, i10, i11, fArr, paint);
    }

    @Override
    public final void drawRect(RectF rectF, Paint paint) {
        this.f26162a.drawRect(rectF, paint);
    }

    @Override
    public final void drawRoundRect(float f7, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        this.f26162a.drawRoundRect(f7, f10, f11, f12, f13, f14, paint);
    }

    @Override
    public final void drawText(String str, int i10, int i11, float f7, float f10, Paint paint) {
        this.f26162a.drawText(str, i10, i11, f7, f10, paint);
    }

    @Override
    public final void drawTextOnPath(String str, Path path, float f7, float f10, Paint paint) {
        this.f26162a.drawTextOnPath(str, path, f7, f10, paint);
    }

    @Override
    public final void drawTextRun(MeasuredText measuredText, int i10, int i11, int i12, int i13, float f7, float f10, boolean z10, Paint paint) {
        this.f26162a.drawTextRun(measuredText, i10, i11, i12, i13, f7, f10, z10, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint) {
        return this.f26162a.saveLayer(rectF, paint);
    }

    @Override
    public final int saveLayerAlpha(float f7, float f10, float f11, float f12, int i10) {
        return this.f26162a.saveLayerAlpha(f7, f10, f11, f12, i10);
    }

    @Override
    public final boolean clipOutRect(int i10, int i11, int i12, int i13) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f26162a.clipOutRect(i10, i11, i12, i13);
        }
        return false;
    }

    @Override
    public final boolean clipRect(int i10, int i11, int i12, int i13) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i10, int i11, float f7, float f10, int i12, int i13, boolean z10, Paint paint) {
        this.f26162a.drawBitmap(iArr, i10, i11, f7, f10, i12, i13, z10, paint);
    }

    @Override
    public final void drawColor(int i10, BlendMode blendMode) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26162a.drawColor(i10, blendMode);
        }
    }

    @Override
    public final void drawDoubleRoundRect(RectF rectF, float f7, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f26162a.drawDoubleRoundRect(rectF, f7, f10, rectF2, f11, f12, paint);
        }
    }

    @Override
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f26162a.drawPatch(ninePatch, rect, paint);
        }
    }

    @Override
    public final void drawPicture(Picture picture, Rect rect) {
        this.f26162a.drawPicture(picture, rect);
    }

    @Override
    public final void drawRect(float f7, float f10, float f11, float f12, Paint paint) {
        this.f26162a.drawRect(f7, f10, f11, f12, paint);
    }

    @Override
    public final void drawText(char[] cArr, int i10, int i11, float f7, float f10, Paint paint) {
        this.f26162a.drawText(cArr, i10, i11, f7, f10, paint);
    }

    @Override
    public final void drawTextRun(CharSequence charSequence, int i10, int i11, int i12, int i13, float f7, float f10, boolean z10, Paint paint) {
        this.f26162a.drawTextRun(charSequence, i10, i11, i12, i13, f7, f10, z10, paint);
    }

    @Override
    public final boolean quickReject(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f26162a.quickReject(rectF);
        }
        return false;
    }

    @Override
    public final int saveLayer(float f7, float f10, float f11, float f12, Paint paint, int i10) {
        return this.f26162a.saveLayer(f7, f10, f11, f12, paint, i10);
    }

    @Override
    public final int saveLayerAlpha(RectF rectF, int i10) {
        return this.f26162a.saveLayerAlpha(rectF, i10);
    }

    @Override
    public final boolean clipRect(Rect rect) {
        return false;
    }

    @Override
    public final void drawBitmap(int[] iArr, int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, Paint paint) {
        this.f26162a.drawBitmap(iArr, i10, i11, i12, i13, i14, i15, z10, paint);
    }

    @Override
    public final void drawText(CharSequence charSequence, int i10, int i11, float f7, float f10, Paint paint) {
        this.f26162a.drawText(charSequence, i10, i11, f7, f10, paint);
    }

    @Override
    public final int saveLayer(RectF rectF, Paint paint, int i10) {
        return this.f26162a.saveLayer(rectF, paint, i10);
    }

    @Override
    public final int saveLayerAlpha(float f7, float f10, float f11, float f12, int i10, int i11) {
        return this.f26162a.saveLayerAlpha(f7, f10, f11, f12, i10, i11);
    }

    @Override
    public final boolean clipOutRect(RectF rectF) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f26162a.clipOutRect(rectF);
        }
        return false;
    }

    @Override
    public final boolean clipRect(Rect rect, Region.Op op) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.f26162a.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public final void drawColor(int i10) {
        this.f26162a.drawColor(i10);
    }

    @Override
    public final boolean quickReject(Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.f26162a.quickReject(path);
        }
        return false;
    }

    @Override
    public final boolean clipRect(RectF rectF) {
        return false;
    }

    @Override
    public final void drawBitmap(Bitmap bitmap, float f7, float f10, Paint paint) {
        this.f26162a.drawBitmap(bitmap, f7, f10, paint);
    }

    @Override
    public final void drawColor(int i10, PorterDuff.Mode mode) {
        this.f26162a.drawColor(i10, mode);
    }

    @Override
    public final boolean clipOutRect(Rect rect) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f26162a.clipOutRect(rect);
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
            this.f26162a.drawColor(j3);
        }
    }

    @Override
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return this.f26162a.quickReject(rectF, edgeType);
    }

    @Override
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return this.f26162a.quickReject(path, edgeType);
    }

    @Override
    public final boolean quickReject(float f7, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        return this.f26162a.quickReject(f7, f10, f11, f12, edgeType);
    }
}
