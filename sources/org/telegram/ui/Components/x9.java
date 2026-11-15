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
public final class x9 extends Drawable {
    public float f41620a = 1.0f;
    public final Paint f41621b = new Paint(1);
    public final Rect f41622c = new Rect();
    public final Path d = new Path();
    public final float f41623e;
    public final float f41624f;
    public final Drawable f41625g;
    public final float h;
    public final y9 f41626i;

    public x9(y9 y9Var, float f10, float f11, Drawable drawable, float f12) {
        this.f41626i = y9Var;
        this.f41623e = f10;
        this.f41624f = f11;
        this.f41625g = drawable;
        this.h = f12;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        y9 y9Var = this.f41626i;
        u9 u9Var = y9Var.f41942a;
        Matrix matrix = y9Var.f41955p;
        Paint paint = null;
        if (u9Var != null && (b10 = u9Var.b()) != null) {
            if (y9Var.f41954o == null || y9Var.f41953n != b10) {
                y9Var.f41953n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                y9Var.f41954o = bitmapShader;
                y9Var.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f41623e, (-0.0f) - this.f41624f);
            View view = u9Var.f39967b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), u9Var.f39967b.getHeight() / b10.getHeight());
            }
            y9Var.f41954o.setLocalMatrix(matrix);
            y9Var.h.setAlpha((int) (this.f41620a * 255.0f));
            paint = y9Var.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f41625g;
        Paint paint3 = this.f41621b;
        float f10 = this.h;
        if (paint2 == null && (u9Var == null || !u9Var.c())) {
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
            Rect rect = this.f41622c;
            if (u9Var != null && u9Var.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                y9Var.b(canvas, false);
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
            if (u9Var != null && u9Var.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                y9Var.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f10, f10, paint2);
            }
        } else if (u9Var != null && u9Var.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            y9Var.b(canvas, false);
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
        Drawable drawable = this.f41625g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f41620a = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
