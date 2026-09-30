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
public final class na extends Drawable {
    public float f26640a = 1.0f;
    public final Paint f26641b = new Paint(1);
    public final Rect f26642c = new Rect();
    public final Path d = new Path();
    public final float e;
    public final float f26643f;
    public final Drawable f26644g;
    public final float h;
    public final oa f26645i;

    public na(oa oaVar, float f7, float f10, Drawable drawable, float f11) {
        this.f26645i = oaVar;
        this.e = f7;
        this.f26643f = f10;
        this.f26644g = drawable;
        this.h = f11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        oa oaVar = this.f26645i;
        ka kaVar = oaVar.f27030a;
        Matrix matrix = oaVar.f27042p;
        Paint paint = null;
        if (kaVar != null && (b10 = kaVar.b()) != null) {
            if (oaVar.f27041o == null || oaVar.f27040n != b10) {
                oaVar.f27040n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                oaVar.f27041o = bitmapShader;
                oaVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f26643f);
            View view = kaVar.f25720b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), kaVar.f25720b.getHeight() / b10.getHeight());
            }
            oaVar.f27041o.setLocalMatrix(matrix);
            oaVar.h.setAlpha((int) (this.f26640a * 255.0f));
            paint = oaVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f26644g;
        Paint paint3 = this.f26641b;
        float f7 = this.h;
        if (paint2 == null && (kaVar == null || !kaVar.c())) {
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
            Rect rect = this.f26642c;
            if (kaVar != null && kaVar.c()) {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                oaVar.b(canvas, false);
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
            if (kaVar != null && kaVar.c()) {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f7, f7, Path.Direction.CW);
                canvas.clipPath(path);
                oaVar.b(canvas, false);
                canvas.restore();
            } else {
                canvas.drawRoundRect(rectF4, f7, f7, paint2);
            }
        } else if (kaVar != null && kaVar.c()) {
            canvas.save();
            canvas.clipRect(bounds);
            oaVar.b(canvas, false);
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
        Drawable drawable = this.f26644g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f26640a = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
