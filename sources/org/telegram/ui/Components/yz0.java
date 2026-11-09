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
public final class yz0 extends ImageView {
    public static final org.telegram.ui.Cells.g1 f40844x = new org.telegram.ui.Cells.g1(Float.class, "radius", 3);
    public final Paint f40845a;
    public final Matrix f40846b;
    public RadialGradient f40847c;
    public boolean d;
    public float f40848e;
    public float f40849f;
    public float h;
    public dh0 f40850n;
    public ColorFilter f40851r;
    public final int[] f40852s;
    public final int[] f40853w;

    public yz0(Context context) {
        super(context);
        this.f40845a = new Paint(1);
        this.f40846b = new Matrix();
        this.f40852s = new int[2];
        this.f40853w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.n3 n3Var, dh0 dh0Var) {
        Drawable drawable = dh0Var.getDrawable();
        if (drawable != null && dh0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            dh0Var.getImageMatrix().mapRect(rectF);
            dh0Var.getLocationInWindow(iArr);
            rectF.offset(dh0Var.getPaddingLeft() + iArr[0], dh0Var.getPaddingTop() + iArr[1]);
            if (n3Var != null) {
                n3Var.getLocationInWindow(iArr);
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

    public final void b(float f10, float f11, boolean z9) {
        PorterDuff.Mode mode;
        this.f40848e = f10;
        this.f40849f = f11;
        this.d = z9;
        RadialGradient radialGradient = this.f40847c;
        Paint paint = this.f40845a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f40847c = radialGradient2;
            paint.setShader(radialGradient2);
        }
        if (z9) {
            mode = PorterDuff.Mode.DST_OUT;
        } else {
            mode = PorterDuff.Mode.DST_IN;
        }
        paint.setXfermode(new PorterDuffXfermode(mode));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        if (this.f40847c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            dh0 dh0Var = this.f40850n;
            if (dh0Var != null) {
                drawable = dh0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f40850n.isAttachedToWindow()) {
                dh0 dh0Var2 = this.f40850n;
                int[] iArr = this.f40852s;
                dh0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f40853w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f40850n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f40850n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f40850n.getImageMatrix());
                drawable.setColorFilter(this.f40851r);
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
                Matrix matrix = this.f40846b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.f40848e, this.f40849f);
                this.f40847c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f40845a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
