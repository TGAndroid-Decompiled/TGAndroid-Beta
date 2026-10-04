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
    public float f28919a = 1.0f;
    public final Paint f28920b = new Paint(1);
    public final Rect f28921c = new Rect();
    public final Path d = new Path();
    public final float f28922e;
    public final float f28923f;
    public final Drawable f28924g;
    public final float h;
    public final oa f28925i;

    public na(oa oaVar, float f7, float f10, Drawable drawable, float f11) {
        this.f28925i = oaVar;
        this.f28922e = f7;
        this.f28923f = f10;
        this.f28924g = drawable;
        this.h = f11;
    }

    @Override
    public final void draw(Canvas canvas) {
        Bitmap b10;
        oa oaVar = this.f28925i;
        ka kaVar = oaVar.f29309a;
        Matrix matrix = oaVar.f29322p;
        Paint paint = null;
        if (kaVar != null && (b10 = kaVar.b()) != null) {
            if (oaVar.f29321o == null || oaVar.f29320n != b10) {
                oaVar.f29320n = b10;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b10, tileMode, tileMode);
                oaVar.f29321o = bitmapShader;
                oaVar.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.f28922e, (-0.0f) - this.f28923f);
            View view = kaVar.f28051b;
            if (view != null) {
                matrix.preScale(view.getWidth() / b10.getWidth(), kaVar.f28051b.getHeight() / b10.getHeight());
            }
            oaVar.f29321o.setLocalMatrix(matrix);
            oaVar.h.setAlpha((int) (this.f28919a * 255.0f));
            paint = oaVar.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.f28924g;
        Paint paint3 = this.f28920b;
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
            Rect rect = this.f28921c;
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
        Drawable drawable = this.f28924g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f28919a = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
