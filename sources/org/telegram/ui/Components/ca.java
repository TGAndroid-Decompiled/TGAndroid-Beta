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

public final class ca extends Drawable {

    public float f27384a = 1.0f;

    public final Paint f27385b = new Paint(1);

    public final Rect f27386c = new Rect();
    public final Path d = new Path();

    public final float f27387e;

    public final float f27388f;

    public final Drawable f27389g;
    public final float h;

    public final da f27390i;

    public ca(da daVar, float f10, float f11, Drawable drawable, float f12) {
        this.f27390i = daVar;
        this.f27387e = f10;
        this.f27388f = f11;
        this.f27389g = drawable;
        this.h = f12;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap bitmapB;
        da daVar = this.f27390i;
        z9 z9Var = daVar.f27683a;
        Matrix matrix = daVar.f27696p;
        Paint paint = null;
        if (z9Var != null && (bitmapB = z9Var.b()) != null) {
            if (daVar.f27695o == null || daVar.f27694n != bitmapB) {
                daVar.f27694n = bitmapB;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmapB, tileMode, tileMode);
                daVar.f27695o = bitmapShader;
                daVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f27387e, (-0.0f) - this.f27388f);
            View view = z9Var.f35203b;
            if (view != null) {
                matrix.preScale(view.getWidth() / bitmapB.getWidth(), z9Var.f35203b.getHeight() / bitmapB.getHeight());
            }
            daVar.f27695o.setLocalMatrix(matrix);
            daVar.h.setAlpha((int) (this.f27384a * 255.0f));
            paint = daVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f27389g;
        Paint paint3 = this.f27385b;
        float f10 = this.h;
        if (paint2 == null && (z9Var == null || !z9Var.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f10 <= 0.0f) {
                canvas.drawRect(bounds, paint3);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, f10, f10, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, 255, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.f27386c;
            if (z9Var == null || !z9Var.c()) {
                canvas.drawRect(bounds, paint2);
            } else {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                daVar.b(canvas, false);
                canvas.restore();
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f10, f10, paint3);
            return;
        }
        if (f10 > 0.0f) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(bounds);
            if (z9Var == null || !z9Var.c()) {
                canvas.drawRoundRect(rectF4, f10, f10, paint2);
            } else {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                daVar.b(canvas, false);
                canvas.restore();
            }
        } else if (z9Var == null || !z9Var.c()) {
            canvas.drawRect(bounds, paint2);
        } else {
            canvas.save();
            canvas.clipRect(bounds);
            daVar.b(canvas, false);
            canvas.restore();
        }
        paint3.setColor(1711276032);
        if (f10 <= 0.0f) {
            canvas.drawRect(bounds, paint3);
            return;
        }
        RectF rectF5 = AndroidUtilities.rectTmp;
        rectF5.set(bounds);
        canvas.drawRoundRect(rectF5, f10, f10, paint3);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f27389g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f27384a = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
