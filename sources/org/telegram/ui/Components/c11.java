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
public final class c11 extends ImageView {
    public static final org.telegram.ui.Cells.g1 f24970x = new org.telegram.ui.Cells.g1(Float.class, "radius", 3);
    public final Paint f24971a;
    public final Matrix f24972b;
    public RadialGradient f24973c;
    public boolean d;
    public float e;
    public float f24974f;
    public float h;
    public fi0 f24975n;
    public ColorFilter f24976r;
    public final int[] f24977s;
    public final int[] f24978w;

    public c11(Context context) {
        super(context);
        this.f24971a = new Paint(1);
        this.f24972b = new Matrix();
        this.f24977s = new int[2];
        this.f24978w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.s3 s3Var, fi0 fi0Var) {
        Drawable drawable = fi0Var.getDrawable();
        if (drawable != null && fi0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            fi0Var.getImageMatrix().mapRect(rectF);
            fi0Var.getLocationInWindow(iArr);
            rectF.offset(fi0Var.getPaddingLeft() + iArr[0], fi0Var.getPaddingTop() + iArr[1]);
            if (s3Var != null) {
                s3Var.getLocationInWindow(iArr);
                rectF.offset(-iArr[0], -iArr[1]);
            }
            int max = Math.max(1, ((int) Math.floor(rectF.left)) - 1);
            int min = Math.min(bitmap.getWidth(), ((int) Math.ceil(rectF.right)) + 1);
            int max2 = Math.max(0, ((int) Math.floor(rectF.top)) - 1);
            int min2 = Math.min(bitmap.getHeight(), ((int) Math.ceil(rectF.bottom)) + 1);
            if (max < min && max2 < min2) {
                int i10 = min - max;
                int[] iArr2 = new int[i10];
                for (int i11 = max2; i11 < min2; i11++) {
                    Arrays.fill(iArr2, bitmap.getPixel(max - 1, i11));
                    bitmap.setPixels(iArr2, 0, i10, max, i11, i10, 1);
                }
            }
        }
    }

    public final void b(float f7, float f10, boolean z10) {
        PorterDuff.Mode mode;
        this.e = f7;
        this.f24974f = f10;
        this.d = z10;
        RadialGradient radialGradient = this.f24973c;
        Paint paint = this.f24971a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f24973c = radialGradient2;
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
        if (this.f24973c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            fi0 fi0Var = this.f24975n;
            if (fi0Var != null) {
                drawable = fi0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f24975n.isAttachedToWindow()) {
                fi0 fi0Var2 = this.f24975n;
                int[] iArr = this.f24977s;
                fi0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f24978w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f24975n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f24975n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f24975n.getImageMatrix());
                drawable.setColorFilter(this.f24976r);
                drawable.draw(canvas);
                drawable.setColorFilter(colorFilter);
                canvas.restore();
                if ((drawable instanceof Animatable) && ((Animatable) drawable).isRunning()) {
                    invalidate();
                }
            }
            float f7 = this.h;
            if (f7 >= 1.0f) {
                float f10 = f7 / 100.0f;
                Matrix matrix = this.f24972b;
                matrix.setScale(f10, f10);
                matrix.postTranslate(this.e, this.f24974f);
                this.f24973c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f24971a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f7) {
        this.h = f7;
        invalidate();
    }
}
