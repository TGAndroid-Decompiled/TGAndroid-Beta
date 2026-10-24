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
public final class s21 extends ImageView {
    public static final org.telegram.ui.Cells.c1 f30418w = new org.telegram.ui.Cells.c1(Float.class, "radius", 3);
    public final Paint f30419a;
    public final Matrix f30420b;
    public RadialGradient f30421c;
    public boolean d;
    public float e;
    public float f30422f;
    public float h;
    public ak0 f30423n;
    public ColorFilter f30424r;
    public final int[] f30425s;
    public final int[] v;

    public s21(Context context) {
        super(context);
        this.f30419a = new Paint(1);
        this.f30420b = new Matrix();
        this.f30425s = new int[2];
        this.v = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.b4 b4Var, ak0 ak0Var) {
        Drawable drawable = ak0Var.getDrawable();
        if (drawable != null && ak0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            ak0Var.getImageMatrix().mapRect(rectF);
            ak0Var.getLocationInWindow(iArr);
            rectF.offset(ak0Var.getPaddingLeft() + iArr[0], ak0Var.getPaddingTop() + iArr[1]);
            if (b4Var != null) {
                b4Var.getLocationInWindow(iArr);
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
        this.f30422f = f10;
        this.d = z10;
        RadialGradient radialGradient = this.f30421c;
        Paint paint = this.f30419a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f30421c = radialGradient2;
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
        if (this.f30421c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            ak0 ak0Var = this.f30423n;
            if (ak0Var != null) {
                drawable = ak0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f30423n.isAttachedToWindow()) {
                ak0 ak0Var2 = this.f30423n;
                int[] iArr = this.f30425s;
                ak0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.v;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f30423n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f30423n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f30423n.getImageMatrix());
                drawable.setColorFilter(this.f30424r);
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
                Matrix matrix = this.f30420b;
                matrix.setScale(f10, f10);
                matrix.postTranslate(this.e, this.f30422f);
                this.f30421c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f30419a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f7) {
        this.h = f7;
        invalidate();
    }
}
