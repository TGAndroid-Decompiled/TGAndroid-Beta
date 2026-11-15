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
public final class zz0 extends ImageView {
    public static final org.telegram.ui.Cells.g1 f42522x = new org.telegram.ui.Cells.g1(Float.class, "radius", 3);
    public final Paint f42523a;
    public final Matrix f42524b;
    public RadialGradient f42525c;
    public boolean d;
    public float f42526e;
    public float f42527f;
    public float h;
    public fh0 f42528n;
    public ColorFilter f42529r;
    public final int[] f42530s;
    public final int[] f42531w;

    public zz0(Context context) {
        super(context);
        this.f42523a = new Paint(1);
        this.f42524b = new Matrix();
        this.f42530s = new int[2];
        this.f42531w = new int[2];
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
                int i7 = min - max;
                int[] iArr2 = new int[i7];
                for (int i10 = max2; i10 < min2; i10++) {
                    Arrays.fill(iArr2, bitmap.getPixel(max - 1, i10));
                    bitmap.setPixels(iArr2, 0, i7, max, i10, i7, 1);
                }
            }
        }
    }

    public final void b(float f10, float f11, boolean z10) {
        PorterDuff.Mode mode;
        this.f42526e = f10;
        this.f42527f = f11;
        this.d = z10;
        RadialGradient radialGradient = this.f42525c;
        Paint paint = this.f42523a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f42525c = radialGradient2;
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
        if (this.f42525c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            fh0 fh0Var = this.f42528n;
            if (fh0Var != null) {
                drawable = fh0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f42528n.isAttachedToWindow()) {
                fh0 fh0Var2 = this.f42528n;
                int[] iArr = this.f42530s;
                fh0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f42531w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f42528n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f42528n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f42528n.getImageMatrix());
                drawable.setColorFilter(this.f42529r);
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
                Matrix matrix = this.f42524b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.f42526e, this.f42527f);
                this.f42525c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f42523a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
