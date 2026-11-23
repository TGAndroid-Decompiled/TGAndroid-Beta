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
public final class fa extends Drawable {
    public float f35187a = 1.0f;
    public final Paint f35188b = new Paint(1);
    public final Rect f35189c = new Rect();
    public final Path d = new Path();
    public final float f35190e;
    public final float f35191f;
    public final Drawable f35192g;
    public final float h;
    public final ga f35193i;

    public fa(ga gaVar, float f10, float f11, Drawable drawable, float f12) {
        this.f35193i = gaVar;
        this.f35190e = f10;
        this.f35191f = f11;
        this.f35192g = drawable;
        this.h = f12;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        ga gaVar = this.f35193i;
        ca caVar = gaVar.f35487a;
        Matrix matrix = gaVar.f35500p;
        Paint paint = null;
        if (caVar != null && (b10 = caVar.b()) != null) {
            if (gaVar.f35499o == null || gaVar.f35498n != b10) {
                gaVar.f35498n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                gaVar.f35499o = bitmapShader;
                gaVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f35190e, (-0.0f) - this.f35191f);
            View view = caVar.f34126b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), caVar.f34126b.getHeight() / b10.getHeight());
            }
            gaVar.f35499o.setLocalMatrix(matrix);
            gaVar.h.setAlpha((int) (this.f35187a * 255.0f));
            paint = gaVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f35192g;
        Paint paint3 = this.f35188b;
        float f10 = this.h;
        if (paint2 == null && (caVar == null || !caVar.c())) {
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
            Rect rect = this.f35189c;
            if (caVar != null && caVar.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                gaVar.b(canvas, false);
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
            if (caVar != null && caVar.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f10, f10, Path.Direction.CW);
                canvas.clipPath(path);
                gaVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f10, f10, paint2);
            }
        } else if (caVar != null && caVar.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            gaVar.b(canvas, false);
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
        Drawable drawable = this.f35192g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i7) {
        this.f35187a = i7 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
