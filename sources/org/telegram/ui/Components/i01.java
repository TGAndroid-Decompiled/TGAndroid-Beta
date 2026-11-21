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
public final class i01 extends ImageView {
    public static final org.telegram.ui.Cells.h1 f36099x = new org.telegram.ui.Cells.h1(Float.class, "radius", 3);
    public final Paint f36100a;
    public final Matrix f36101b;
    public RadialGradient f36102c;
    public boolean d;
    public float f36103e;
    public float f36104f;
    public float h;
    public rh0 f36105n;
    public ColorFilter f36106r;
    public final int[] f36107s;
    public final int[] f36108w;

    public i01(Context context) {
        super(context);
        this.f36100a = new Paint(1);
        this.f36101b = new Matrix();
        this.f36107s = new int[2];
        this.f36108w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.o3 o3Var, rh0 rh0Var) {
        Drawable drawable = rh0Var.getDrawable();
        if (drawable != null && rh0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            rh0Var.getImageMatrix().mapRect(rectF);
            rh0Var.getLocationInWindow(iArr);
            rectF.offset(rh0Var.getPaddingLeft() + iArr[0], rh0Var.getPaddingTop() + iArr[1]);
            if (o3Var != null) {
                o3Var.getLocationInWindow(iArr);
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
        this.f36103e = f10;
        this.f36104f = f11;
        this.d = z10;
        RadialGradient radialGradient = this.f36102c;
        Paint paint = this.f36100a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f36102c = radialGradient2;
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
        if (this.f36102c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            rh0 rh0Var = this.f36105n;
            if (rh0Var != null) {
                drawable = rh0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f36105n.isAttachedToWindow()) {
                rh0 rh0Var2 = this.f36105n;
                int[] iArr = this.f36107s;
                rh0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f36108w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f36105n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f36105n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f36105n.getImageMatrix());
                drawable.setColorFilter(this.f36106r);
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
                Matrix matrix = this.f36101b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.f36103e, this.f36104f);
                this.f36102c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f36100a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
