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
    public static final org.telegram.ui.Cells.g1 f40117x = new org.telegram.ui.Cells.g1(Float.class, "radius", 3);
    public final Paint f40118a;
    public final Matrix f40119b;
    public RadialGradient f40120c;
    public boolean d;
    public float f40121e;
    public float f40122f;
    public float h;
    public ch0 f40123n;
    public ColorFilter f40124r;
    public final int[] f40125s;
    public final int[] f40126w;

    public wz0(Context context) {
        super(context);
        this.f40118a = new Paint(1);
        this.f40119b = new Matrix();
        this.f40125s = new int[2];
        this.f40126w = new int[2];
    }

    public static void a(Bitmap bitmap, org.telegram.ui.ActionBar.n3 n3Var, ch0 ch0Var) {
        Drawable drawable = ch0Var.getDrawable();
        if (drawable != null && ch0Var.isAttachedToWindow() && bitmap.isMutable()) {
            int[] iArr = new int[2];
            RectF rectF = new RectF(drawable.getBounds());
            ch0Var.getImageMatrix().mapRect(rectF);
            ch0Var.getLocationInWindow(iArr);
            rectF.offset(ch0Var.getPaddingLeft() + iArr[0], ch0Var.getPaddingTop() + iArr[1]);
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
        this.f40121e = f10;
        this.f40122f = f11;
        this.d = z9;
        RadialGradient radialGradient = this.f40120c;
        Paint paint = this.f40118a;
        if (radialGradient == null) {
            RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 100.0f, new int[]{-16777216, -16777216, 0}, new float[]{0.0f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.f40120c = radialGradient2;
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
        if (this.f40120c == null) {
            super.onDraw(canvas);
        } else if (this.h < 1.0f && !this.d) {
        } else {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
            super.onDraw(canvas);
            ch0 ch0Var = this.f40123n;
            if (ch0Var != null) {
                drawable = ch0Var.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable != null && this.f40123n.isAttachedToWindow()) {
                ch0 ch0Var2 = this.f40123n;
                int[] iArr = this.f40125s;
                ch0Var2.getLocationInWindow(iArr);
                int[] iArr2 = this.f40126w;
                getLocationInWindow(iArr2);
                ColorFilter colorFilter = drawable.getColorFilter();
                canvas.save();
                canvas.translate(this.f40123n.getPaddingLeft() + (iArr[0] - iArr2[0]), this.f40123n.getPaddingTop() + (iArr[1] - iArr2[1]));
                canvas.concat(this.f40123n.getImageMatrix());
                drawable.setColorFilter(this.f40124r);
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
                Matrix matrix = this.f40119b;
                matrix.setScale(f11, f11);
                matrix.postTranslate(this.f40121e, this.f40122f);
                this.f40120c.setLocalMatrix(matrix);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f40118a);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void setRadius(float f10) {
        this.h = f10;
        invalidate();
    }
}
