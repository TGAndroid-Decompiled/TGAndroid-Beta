package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ea extends Drawable {
    public float f24542a = 1.0f;
    public final Paint f24543b = new Paint(1);
    public final Rect f24544c = new Rect();
    public final Path d = new Path();
    public final float e;
    public final float f24545f;
    public final Drawable f24546g;
    public final float h;
    public final fa f24547i;

    public ea(fa faVar, float f10, float f11, Drawable drawable, float f12) {
        this.f24547i = faVar;
        this.e = f10;
        this.f24545f = f11;
        this.f24546g = drawable;
        this.h = f12;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        fa faVar = this.f24547i;
        ba baVar = faVar.f24827a;
        Matrix matrix = faVar.f24839p;
        Paint paint = null;
        if (baVar != null && (b10 = baVar.b()) != null) {
            if (faVar.f24838o == null || faVar.f24837n != b10) {
                faVar.f24837n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                faVar.f24838o = bitmapShader;
                faVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f24545f);
            View view = baVar.f23608b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), baVar.f23608b.getHeight() / b10.getHeight());
            }
            faVar.f24838o.setLocalMatrix(matrix);
            faVar.h.setAlpha((int) (this.f24542a * 255.0f));
            paint = faVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f24546g;
        Paint paint3 = this.f24543b;
        float f10 = this.h;
        if (paint2 == null && (baVar == null || !baVar.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f10 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(bounds);
                canvas.drawRoundRect(rectF, f10, f10, paint3);
                return;
            }
            canvas.drawRect(bounds, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.f24544c;
            if (baVar != null && baVar.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                faVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRect(bounds, paint2);
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f10, f10, paint3);
            return;
        }
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(bounds);
            if (baVar != null && baVar.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                faVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f10, f10, paint2);
            }
        } else if (baVar != null && baVar.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            faVar.b(canvas, false);
            canvas.restore();
        } else {
            canvas.drawRect(bounds, paint2);
        }
        paint3.setColor(1711276032);
        if (i10 > 0) {
            RectF rectF5 = AndroidUtilities.rectTmp;
            rectF5.set(bounds);
            canvas.drawRoundRect(rectF5, f10, f10, paint3);
            return;
        }
        canvas.drawRect(bounds, paint3);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f24546g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f24542a = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
