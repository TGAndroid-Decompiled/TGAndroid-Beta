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
public final class ea extends Drawable {
    public float f34674a = 1.0f;
    public final Paint f34675b = new Paint(1);
    public final Rect f34676c = new Rect();
    public final Path d = new Path();
    public final float f34677e;
    public final float f34678f;
    public final Drawable f34679g;
    public final float h;
    public final fa f34680i;

    public ea(fa faVar, float f10, float f11, Drawable drawable, float f12) {
        this.f34680i = faVar;
        this.f34677e = f10;
        this.f34678f = f11;
        this.f34679g = drawable;
        this.h = f12;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        fa faVar = this.f34680i;
        ba baVar = faVar.f35064a;
        Matrix matrix = faVar.f35077p;
        Paint paint = null;
        if (baVar != null && (b10 = baVar.b()) != null) {
            if (faVar.f35076o == null || faVar.f35075n != b10) {
                faVar.f35075n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                faVar.f35076o = bitmapShader;
                faVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f34677e, (-0.0f) - this.f34678f);
            View view = baVar.f33708b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), baVar.f33708b.getHeight() / b10.getHeight());
            }
            faVar.f35076o.setLocalMatrix(matrix);
            faVar.h.setAlpha((int) (this.f34674a * 255.0f));
            paint = faVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f34679g;
        Paint paint3 = this.f34675b;
        float f10 = this.h;
        if (paint2 == null && (baVar == null || !baVar.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f10 > 0.0f) {
                RectF rectF = org.telegram.messenger.g0.P;
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
            Rect rect = this.f34676c;
            if (baVar != null && baVar.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = org.telegram.messenger.g0.P;
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
            RectF rectF3 = org.telegram.messenger.g0.P;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f10, f10, paint3);
            return;
        }
        int i7 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i7 > 0) {
            RectF rectF4 = org.telegram.messenger.g0.P;
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
        if (i7 > 0) {
            RectF rectF5 = org.telegram.messenger.g0.P;
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
        Drawable drawable = this.f34679g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f34674a = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
