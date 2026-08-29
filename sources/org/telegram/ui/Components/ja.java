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
public final class ja extends Drawable {
    public float f29629a = 1.0f;
    public final Paint f29630b = new Paint(1);
    public final Rect f29631c = new Rect();
    public final Path d = new Path();
    public final float f29632e;
    public final float f29633f;
    public final Drawable f29634g;
    public final float h;
    public final ka f29635i;

    public ja(ka kaVar, float f9, float f10, Drawable drawable, float f11) {
        this.f29635i = kaVar;
        this.f29632e = f9;
        this.f29633f = f10;
        this.f29634g = drawable;
        this.h = f11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        ka kaVar = this.f29635i;
        ga gaVar = kaVar.f29976a;
        Matrix matrix = kaVar.f29989p;
        Paint paint = null;
        if (gaVar != null && (b10 = gaVar.b()) != null) {
            if (kaVar.f29988o == null || kaVar.f29987n != b10) {
                kaVar.f29987n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                kaVar.f29988o = bitmapShader;
                kaVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f29632e, (-0.0f) - this.f29633f);
            View view = gaVar.f28849b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), gaVar.f28849b.getHeight() / b10.getHeight());
            }
            kaVar.f29988o.setLocalMatrix(matrix);
            kaVar.h.setAlpha((int) (this.f29629a * 255.0f));
            paint = kaVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f29634g;
        Paint paint3 = this.f29630b;
        float f9 = this.h;
        if (paint2 == null && (gaVar == null || !gaVar.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f9 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(bounds);
                canvas.drawRoundRect(rectF, f9, f9, paint3);
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
            Rect rect = this.f29631c;
            if (gaVar != null && gaVar.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f9, f9, Path.Direction.CW);
                canvas.clipPath(path);
                kaVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRect(bounds, paint2);
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f9, f9, paint3);
            return;
        }
        int i10 = (f9 > 0.0f ? 1 : (f9 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(bounds);
            if (gaVar != null && gaVar.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f9, f9, Path.Direction.CW);
                canvas.clipPath(path);
                kaVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f9, f9, paint2);
            }
        } else if (gaVar != null && gaVar.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            kaVar.b(canvas, false);
            canvas.restore();
        } else {
            canvas.drawRect(bounds, paint2);
        }
        paint3.setColor(1711276032);
        if (i10 > 0) {
            RectF rectF5 = AndroidUtilities.rectTmp;
            rectF5.set(bounds);
            canvas.drawRoundRect(rectF5, f9, f9, paint3);
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
        Drawable drawable = this.f29634g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29629a = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
