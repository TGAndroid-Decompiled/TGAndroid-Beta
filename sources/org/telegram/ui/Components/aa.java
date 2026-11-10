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
public final class aa extends Drawable {
    public float f31803a = 1.0f;
    public final Paint f31804b = new Paint(1);
    public final Rect f31805c = new Rect();
    public final Path d = new Path();
    public final float f31806e;
    public final float f31807f;
    public final Drawable f31808g;
    public final float h;
    public final ba f31809i;

    public aa(ba baVar, float f10, float f11, Drawable drawable, float f12) {
        this.f31809i = baVar;
        this.f31806e = f10;
        this.f31807f = f11;
        this.f31808g = drawable;
        this.h = f12;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        ba baVar = this.f31809i;
        x9 x9Var = baVar.f32174a;
        Matrix matrix = baVar.f32187p;
        Paint paint = null;
        if (x9Var != null && (b10 = x9Var.b()) != null) {
            if (baVar.f32186o == null || baVar.f32185n != b10) {
                baVar.f32185n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                baVar.f32186o = bitmapShader;
                baVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f31806e, (-0.0f) - this.f31807f);
            View view = x9Var.f40259b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), x9Var.f40259b.getHeight() / b10.getHeight());
            }
            baVar.f32186o.setLocalMatrix(matrix);
            baVar.h.setAlpha((int) (this.f31803a * 255.0f));
            paint = baVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f31808g;
        Paint paint3 = this.f31804b;
        float f10 = this.h;
        if (paint2 == null && (x9Var == null || !x9Var.c())) {
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
            Rect rect = this.f31805c;
            if (x9Var != null && x9Var.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                baVar.b(canvas, false);
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
            if (x9Var != null && x9Var.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                baVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f10, f10, paint2);
            }
        } else if (x9Var != null && x9Var.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            baVar.b(canvas, false);
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
        Drawable drawable = this.f31808g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f31803a = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
