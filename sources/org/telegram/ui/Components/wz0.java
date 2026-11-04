package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Arrays;
public final class wz0 extends ImageView {
    public static final org.telegram.ui.Cells.g1 f40173x = new org.telegram.ui.Cells.g1(Float.class, "radius", 3);
    public final Paint f40174a;
    public final Matrix f40175b;
    public RadialGradient f40176c;
    public boolean d;
    public float f40177e;
    public float f40178f;
    public float h;
    public fh0 f40179n;
    public ColorFilter f40180r;
    public final int[] f40181s;
    public final int[] f40182w;

    public wz0(Context context) {
        super(context);
        this.f40174a = new Paint(1);
        this.f40175b = new Matrix();
        this.f40181s = new int[2];
        this.f40182w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.l3 l3Var, fh0 fh0Var) {
        Drawable drawable = fh0Var.getDrawable();
        if (drawable != null && fh0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            fh0Var.getImageMatrix().mapRect(rectF);
            fh0Var.getLocationInWindow(iArr);
            rectF.offset(fh0Var.getPaddingLeft() + iArr[0], fh0Var.getPaddingTop() + iArr[1]);
            if (l3Var != null) {
                l3Var.getLocationInWindow(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
            }
            int max = Math.max(1, ((int) Math.floor(rectF.left)) - 1);
            int min = Math.min(bitmap.getWidth(), ((int) Math.ceil(rectF.right)) + 1);
            int max2 = Math.max(0, ((int) Math.floor(rectF.top)) - 1);
            int min2 = Math.min(bitmap.getHeight(), ((int) Math.ceil(rectF.bottom)) + 1);
            if (max < min && max2 < min2) {
                int i3 = min - max;
                int[] iArr2 = new int[i3];
                for (int i10 = max2; i10 < min2; i10++) {
                    Arrays.fill(iArr2, bitmap.getPixel(max - 1, i10));
                    bitmap.setPixels(iArr2, 0, i3, max, i10, i3, 1);
                }
            }
        }
    }

    public final void b(float f10, float f11, boolean z10) {
        PorterDuff.Mode mode;
        this.f40177e = f10;
        this.f40178f = f11;
        this.d = z10;
        RadialGradient radialGradient = this.f40176c;
        Paint paint = this.f40174a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f40176c = radialGradient2;
            paint.setShader(radialGradient2);
        }
        if (z10) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f40176c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            fh0 fh0Var = this.f40179n;
            if (fh0Var != null) {
                drawable = fh0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f40179n.isAttachedToWindow()) {
                fh0 fh0Var2 = this.f40179n;
                int[] iArr = this.f40181s;
                fh0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f40182w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f40179n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f40179n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f40179n.getImageMatrix());
                drawable.setColorFilter(this.f40180r);
                drawable.draw(canvas);
                drawable.setColorFilter(colorFilter);
                canvas.restore();
                if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
                    invalidate();
                }
            }
            float f10 = this.h;
            if (f10 >= 1.0f) {
                float f11 = f10 / 100.0f;
                Matrix matrix = this.f40175b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.f40177e, this.f40178f);
                this.f40176c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f40174a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
