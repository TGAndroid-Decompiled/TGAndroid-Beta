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
public final class ma extends Drawable {
    public float f28423a = 1.0f;
    public final Paint f28424b = new Paint(1);
    public final Rect f28425c = new Rect();
    public final Path d = new Path();
    public final float f28426e;
    public final float f28427f;
    public final Drawable f28428g;
    public final float h;
    public final na f28429i;

    public ma(na naVar, float f7, float f10, Drawable drawable, float f11) {
        this.f28429i = naVar;
        this.f28426e = f7;
        this.f28427f = f10;
        this.f28428g = drawable;
        this.h = f11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        na naVar = this.f28429i;
        ja jaVar = naVar.f28702a;
        Matrix matrix = naVar.f28715p;
        Paint paint = null;
        if (jaVar != null && (b10 = jaVar.b()) != null) {
            if (naVar.f28714o == null || naVar.f28713n != b10) {
                naVar.f28713n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                naVar.f28714o = bitmapShader;
                naVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f28426e, (-0.0f) - this.f28427f);
            View view = jaVar.f27408b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), jaVar.f27408b.getHeight() / b10.getHeight());
            }
            naVar.f28714o.setLocalMatrix(matrix);
            naVar.h.setAlpha((int) (this.f28423a * 255.0f));
            paint = naVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f28428g;
        Paint paint3 = this.f28424b;
        float f7 = this.h;
        if (paint2 == null && (jaVar == null || !jaVar.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f7 > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
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
            Rect rect = this.f28425c;
            if (jaVar != null && jaVar.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                naVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRect(bounds, paint2);
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f7, f7, paint3);
            return;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF4 = AndroidUtilities.rectTmp;
            rectF4.set(bounds);
            if (jaVar != null && jaVar.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                naVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f7, f7, paint2);
            }
        } else if (jaVar != null && jaVar.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            naVar.b(canvas, false);
            canvas.restore();
        } else {
            canvas.drawRect(bounds, paint2);
        }
        paint3.setColor(1711276032);
        if (i10 > 0) {
            RectF rectF5 = AndroidUtilities.rectTmp;
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
        Drawable drawable = this.f28428g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28423a = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
