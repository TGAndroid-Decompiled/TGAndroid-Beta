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
public final class v9 extends Drawable {
    public float f31197a = 1.0f;
    public final Paint f31198b = new Paint(1);
    public final Rect f31199c = new Rect();
    public final Path d = new Path();
    public final float e;
    public final float f31200f;
    public final Drawable f31201g;
    public final float h;
    public final w9 f31202i;

    public v9(w9 w9Var, float f7, float f10, Drawable drawable, float f11) {
        this.f31202i = w9Var;
        this.e = f7;
        this.f31200f = f10;
        this.f31201g = drawable;
        this.h = f11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        w9 w9Var = this.f31202i;
        s9 s9Var = w9Var.f32108a;
        Matrix matrix = w9Var.f32120p;
        Paint paint = null;
        if (s9Var != null && (b10 = s9Var.b()) != null) {
            if (w9Var.f32119o == null || w9Var.f32118n != b10) {
                w9Var.f32118n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                w9Var.f32119o = bitmapShader;
                w9Var.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f31200f);
            View view = s9Var.f30194b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), s9Var.f30194b.getHeight() / b10.getHeight());
            }
            w9Var.f32119o.setLocalMatrix(matrix);
            w9Var.h.setAlpha((int) (this.f31197a * 255.0f));
            paint = w9Var.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f31201g;
        Paint paint3 = this.f31198b;
        float f7 = this.h;
        if (paint2 == null && (s9Var == null || !s9Var.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f7 > 0.0f) {
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(bounds);
                canvas.drawRoundRect(rectF, f7, f7, paint3);
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
            Rect rect = this.f31199c;
            if (s9Var != null && s9Var.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = org.telegram.messenger.i0.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                w9Var.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRect(bounds, paint2);
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = org.telegram.messenger.i0.P;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f7, f7, paint3);
            return;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF4 = org.telegram.messenger.i0.P;
            rectF4.set(bounds);
            if (s9Var != null && s9Var.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                w9Var.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f7, f7, paint2);
            }
        } else if (s9Var != null && s9Var.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            w9Var.b(canvas, false);
            canvas.restore();
        } else {
            canvas.drawRect(bounds, paint2);
        }
        paint3.setColor(1711276032);
        if (i10 > 0) {
            RectF rectF5 = org.telegram.messenger.i0.P;
            rectF5.set(bounds);
            canvas.drawRoundRect(rectF5, f7, f7, paint3);
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
        Drawable drawable = this.f31201g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f31197a = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
