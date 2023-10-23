package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
public class NoClipCanvas extends Canvas {
    public Canvas canvas;

    @Override
    public boolean clipRect(float f, float f2, float f3, float f4) {
        return false;
    }

    @Override
    public int save() {
        return this.canvas.save();
    }

    @Override
    public void translate(float f, float f2) {
        this.canvas.translate(f, f2);
    }

    @Override
    public void scale(float f, float f2) {
        this.canvas.scale(f, f2);
    }

    @Override
    public void rotate(float f) {
        this.canvas.rotate(f);
    }

    @Override
    public void restore() {
        this.canvas.restore();
    }

    @Override
    public void restoreToCount(int i) {
        this.canvas.restoreToCount(i);
    }

    @Override
    public int getSaveCount() {
        return this.canvas.getSaveCount();
    }

    @Override
    public void drawPath(Path path, Paint paint) {
        this.canvas.drawPath(path, paint);
    }

    @Override
    public void drawText(String str, float f, float f2, Paint paint) {
        this.canvas.drawText(str, f, f2, paint);
    }

    @Override
    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        this.canvas.drawText(str, i, i2, f, f2, paint);
    }

    @Override
    public void drawText(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
        this.canvas.drawText(cArr, i, i2, f, f2, paint);
    }

    @Override
    public void drawTextOnPath(char[] cArr, int i, int i2, Path path, float f, float f2, Paint paint) {
        this.canvas.drawTextOnPath(cArr, i, i2, path, f, f2, paint);
    }

    @Override
    public void drawText(CharSequence charSequence, int i, int i2, float f, float f2, Paint paint) {
        this.canvas.drawText(charSequence, i, i2, f, f2, paint);
    }

    @Override
    public void drawRect(android.graphics.Rect rect, Paint paint) {
        this.canvas.drawRect(rect, paint);
    }

    @Override
    public void drawRect(RectF rectF, Paint paint) {
        this.canvas.drawRect(rectF, paint);
    }

    @Override
    public void drawCircle(float f, float f2, float f3, Paint paint) {
        this.canvas.drawCircle(f, f2, f3, paint);
    }

    @Override
    public void drawRect(float f, float f2, float f3, float f4, Paint paint) {
        this.canvas.drawRect(f, f2, f3, f4, paint);
    }

    @Override
    public void drawRoundRect(RectF rectF, float f, float f2, Paint paint) {
        this.canvas.drawRoundRect(rectF, f, f2, paint);
    }

    @Override
    public void drawRoundRect(float f, float f2, float f3, float f4, float f5, float f6, Paint paint) {
        this.canvas.drawRoundRect(f, f2, f3, f4, f5, f6, paint);
    }

    @Override
    public void drawTextRun(char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override
    public void drawTextRun(MeasuredText measuredText, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.canvas.drawTextRun(measuredText, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override
    public void drawTextRun(CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        this.canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    @Override
    public void drawTextOnPath(String str, Path path, float f, float f2, Paint paint) {
        this.canvas.drawTextOnPath(str, path, f, f2, paint);
    }

    @Override
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.canvas.drawBitmap(bitmap, matrix, paint);
    }

    @Override
    public void drawBitmap(Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, Paint paint) {
        this.canvas.drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override
    public void drawBitmap(int[] iArr, int i, int i2, float f, float f2, int i3, int i4, boolean z, Paint paint) {
        this.canvas.drawBitmap(iArr, i, i2, f, f2, i3, i4, z, paint);
    }

    @Override
    public void drawBitmap(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z, Paint paint) {
        this.canvas.drawBitmap(iArr, i, i2, i3, i4, i5, i6, z, paint);
    }

    @Override
    public void drawArc(RectF rectF, float f, float f2, boolean z, Paint paint) {
        this.canvas.drawArc(rectF, f, f2, z, paint);
    }

    @Override
    public void drawLine(float f, float f2, float f3, float f4, Paint paint) {
        this.canvas.drawLine(f, f2, f3, f4, paint);
    }

    @Override
    public void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i2, float[] fArr2, int i3, int[] iArr, int i4, short[] sArr, int i5, int i6, Paint paint) {
        this.canvas.drawVertices(vertexMode, i, fArr, i2, fArr2, i3, iArr, i4, sArr, i5, i6, paint);
    }

    @Override
    public void drawBitmap(Bitmap bitmap, android.graphics.Rect rect, RectF rectF, Paint paint) {
        this.canvas.drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override
    public void drawBitmap(Bitmap bitmap, float f, float f2, Paint paint) {
        this.canvas.drawBitmap(bitmap, f, f2, paint);
    }

    @Override
    public void drawBitmapMesh(Bitmap bitmap, int i, int i2, float[] fArr, int i3, int[] iArr, int i4, Paint paint) {
        this.canvas.drawBitmapMesh(bitmap, i, i2, fArr, i3, iArr, i4, paint);
    }

    @Override
    public void drawGlyphs(int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        this.canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    @Override
    public void setBitmap(Bitmap bitmap) {
        this.canvas.setBitmap(bitmap);
    }

    @Override
    public int getMaximumBitmapWidth() {
        return this.canvas.getMaximumBitmapWidth();
    }

    @Override
    public void setMatrix(Matrix matrix) {
        this.canvas.setMatrix(matrix);
    }

    @Override
    public int getMaximumBitmapHeight() {
        return this.canvas.getMaximumBitmapHeight();
    }

    @Override
    public boolean getClipBounds(android.graphics.Rect rect) {
        return this.canvas.getClipBounds(rect);
    }

    @Override
    public void getMatrix(Matrix matrix) {
        this.canvas.getMatrix(matrix);
    }

    @Override
    public int getWidth() {
        return this.canvas.getWidth();
    }

    @Override
    public int getHeight() {
        return this.canvas.getHeight();
    }

    @Override
    public boolean quickReject(float f, float f2, float f3, float f4, Canvas.EdgeType edgeType) {
        return this.canvas.quickReject(f, f2, f3, f4, edgeType);
    }
}
